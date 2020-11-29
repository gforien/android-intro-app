package com.example.tutorial;

import android.app.slice.Slice;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;

import com.github.appintro.SlidePolicy;


public class CustomSlidePolicyFragment extends Fragment implements SlidePolicy {

    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated( View view,  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public boolean isPolicyRespected() {
        return false;
    }

    @Override
    public void onUserIllegallyRequestedNextPage() {

    }
}