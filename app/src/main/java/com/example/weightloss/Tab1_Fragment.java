package com.example.weightloss;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.weightloss.R;

public class Tab1_Fragment extends Fragment {
    private static final String TAG = "Tab1_Fragment";
    Button btnTest1;

    //    @Nullable
//    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1_fragment, container, false);
////        btnTest1=view.findViewById(R.id.button);
////
////        btnTest1.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                Toast.makeText(getActivity(), "clicked", Toast.LENGTH_SHORT).show();
////            }
////        });
////
        return view;
    }

}
