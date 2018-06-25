package com.example.priyanka2005.railwayapp.listview_tele_fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.priyanka2005.railwayapp.R;
import com.github.barteksc.pdfviewer.PDFView;

public class Pa5 extends Fragment {
    public Pa5() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.tele_pa_5,container,false );
        PDFView pdfView= (PDFView) view.findViewById(R.id.pas5);
        pdfView.fromAsset("tele_pas5.pdf").load();
        return view;
    }
}
