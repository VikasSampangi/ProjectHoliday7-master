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

public class Qc7 extends Fragment {
    public Qc7() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.tele_qc_7, container,false );
        PDFView pdfView= (PDFView) view.findViewById(R.id.qc7);
        pdfView.fromAsset("tele_qc7.pdf").load();
        return view;
    }
}
