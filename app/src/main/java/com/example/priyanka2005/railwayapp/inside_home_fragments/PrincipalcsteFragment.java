package com.example.priyanka2005.railwayapp.inside_home_fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.priyanka2005.railwayapp.R;

public class PrincipalcsteFragment extends Fragment {
    private WebView webView;
    public PrincipalcsteFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.inside_home_principalcste,container,false );
        return view;



    }
}
