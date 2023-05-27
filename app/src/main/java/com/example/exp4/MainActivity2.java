package com.example.exp4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity2 extends AppCompatActivity {
    Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        bt1 = findViewById(R.id.button1);
        bt1.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            Intent i = getIntent();

            String name = i.getStringExtra("name");
            String number = i.getStringExtra("number");
            bundle.putString("name",name);
            bundle.putString("number",number);

            Fragment2 fraginfo = new Fragment2();
            fraginfo.setArguments(bundle);
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.MainLayout1,fraginfo);
            fragmentTransaction.commit();

        });
    }

}
