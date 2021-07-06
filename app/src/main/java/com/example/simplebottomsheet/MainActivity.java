package com.example.simplebottomsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {

Button showModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindView();
        showModel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  View view=getLayoutInflater().inflate(this,R.layout.bottom_sheet,false);
                BottomSheetDialog dialog=new BottomSheetDialog(MainActivity.this);
                 dialog.setContentView(R.layout.bottom_sheet);
                LinearLayout biafra=dialog.findViewById(R.id.biafra);
                biafra.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),"You clicked on Biafra",Toast.LENGTH_SHORT).show();
                    }
                });
                dialog.show();
            }
        });
    }

    public void bindView(){
        showModel=findViewById(R.id.showModal);
    }
}