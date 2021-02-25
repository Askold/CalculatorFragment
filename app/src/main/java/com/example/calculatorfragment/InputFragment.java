package com.example.calculatorfragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class InputFragment extends Fragment implements View.OnClickListener{


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_input, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button button1 = (Button) getView().findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) getView().findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) getView().findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) getView().findViewById(R.id.button4);
        button4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        EditText first_number = (EditText) getView().findViewById(R.id.first_number);
        EditText second_number = (EditText) getView().findViewById(R.id.second_number);
        Double first_numberValue = Double.parseDouble(first_number.getText().toString());
        Double second_numberValue = Double.parseDouble(second_number.getText().toString());


        Double result = 0.0;
        switch (v.getId()){
            case R.id.button1:
                result = first_numberValue + second_numberValue;
                break;
            case R.id.button2:
                result = first_numberValue - second_numberValue;
                break;
            case R.id.button3:
                result = first_numberValue * second_numberValue;
                break;
            case R.id.button4:
                result = first_numberValue / second_numberValue;
                break;

        }
        ResultFragment fragment = (ResultFragment) getFragmentManager().findFragmentById(R.id.fragment_detail);
        if (fragment != null && fragment.isInLayout()) {
            fragment.setMessage(result.toString());
        } else {
            Intent intent = new Intent(getActivity().getApplicationContext(), ResultActivity.class);
            intent.putExtra("value", result.toString());
            startActivity(intent);
        }
    }
}