package com.example.priyanka2005.railwayapp.listview_gen_fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.priyanka2005.railwayapp.R;
import com.example.priyanka2005.railwayapp.utils.Constants;
import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.File;
import java.io.IOException;

public class HOER1 extends Fragment {


    public HOER1() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.gen_hoer_1,container,false);

        //vikas u need to replicate the below 4 lines and should edit 3rd line accordingly and add webview also to others.
        WebView webView = (WebView)view.findViewById( R.id.webview );
        webView.getSettings().setJavaScriptEnabled( true );
        String pdf = new Constants().url_gen_hoer1;
        webView.loadUrl("http://drive.google.com/viewerng/viewer?embedded=false&url=" + pdf);
        webView.goBack();
        return view;
    }

}
