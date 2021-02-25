package com.example.calculatorfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ResultFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.result_fragment, container, false);
        return view;
    }

    public void setMessage(String item){
        TextView message = (TextView) getView().findViewById(R.id.message);
        message.setText(item);
    }

}
