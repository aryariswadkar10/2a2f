package com.example.exp4;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import com.example.exp4.R;

public class Fragment1 extends Fragment {

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanced){
        View view =inflater.inflate(R.layout.activity_fragment1,container,false);
        EditText txt1,txt2;
        Button bt1;
        txt1 = view.findViewById(R.id.txt1);
        txt2 = view.findViewById(R.id.txt2);
        bt1 = view.findViewById(R.id.button);

        bt1.setOnClickListener(view1 -> {

            String name = txt1.getText().toString();
            String number = txt2.getText().toString();
            Intent i = new Intent(getActivity(),MainActivity2.class);
            i.putExtra("name",name);
            i.putExtra("number",number);
            startActivity(i);
        });
        return view;
    }
}
