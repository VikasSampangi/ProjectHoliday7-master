package com.example.priyanka2005.railwayapp.listview_gen_fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.priyanka2005.railwayapp.R;
import com.github.barteksc.pdfviewer.PDFView;

public class Setup12 extends Fragment {
    public Setup12() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.gen_setup_12,container,false);
        PDFView pdfView= (PDFView) view.findViewById(R.id.os12);
        pdfView.fromAsset("gen_os12.pdf").load();
        return view;
    }
}
