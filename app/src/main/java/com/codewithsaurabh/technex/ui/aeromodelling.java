package com.codewithsaurabh.technex.ui;

import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codewithsaurabh.technex.CopsDialog1;
import com.codewithsaurabh.technex.R;

public class aeromodelling extends Fragment {

    private AeromodellingViewModel mViewModel;
    private static int SPLASH_TIME_OUT=2000;

    public static aeromodelling newInstance() {
        return new aeromodelling();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.aeromodelling_fragment, container, false);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(AeromodellingViewModel.class);
        // TODO: Use the ViewModel
    }

    }

