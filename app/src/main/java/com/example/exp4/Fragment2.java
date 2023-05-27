package com.example.exp4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.exp4.R;

public class Fragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanced){
        View view = inflater.inflate(R.layout.activity_fragment2,container,false);

        TextView T1,T2;
        T1 = view.findViewById(R.id.txt1);
        T2 = view.findViewById(R.id.txt2);
        Bundle bundle = this.getArguments();
        if(bundle!=null)
        {
            String name = bundle.getString("name");
            String number = bundle.getString("number");
            T1.setText(name);
            T2.setText(number);
        }
        return view;
    }
}
