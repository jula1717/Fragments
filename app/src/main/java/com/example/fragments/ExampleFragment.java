package com.example.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ExampleFragment extends Fragment {

    public static final String textArg ="TEXT_ARG";
    public static final String numberArg = "NUMBER_ARG";

    private String text;
    private int number;

    public static ExampleFragment newInstance(String text, int number){
        ExampleFragment exampleFragment = new ExampleFragment();
        Bundle args = new Bundle();
        args.putString(textArg,text);
        args.putInt(numberArg,number);
        exampleFragment.setArguments(args);
        return exampleFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.examle_fragment,container,false);
        TextView textView = v.findViewById(R.id.txtFragment);
        if(getArguments()!=null){
            text = getArguments().getString(textArg);
            number = getArguments().getInt(numberArg);
            textView.setText(text+" "+number);
        }

        return v;
    }
}
