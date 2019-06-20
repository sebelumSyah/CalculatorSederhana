package com.example.calculatorsederhana;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button tombol1,tombol2,tombol3,tombol4,tombol5,tombol6,tombol7,
            tombol8,tombol9,tombol0,tombolmin,tombolplus,
            tomboleq,tombolKoma,tombolkali,tombolbagi,clear,tomboldel;
    TextView textHasil;

    private static double nilaisekarang=0.0;
    private static double nilai =0.0;
    private static String status ="";

    private static final String STATE_RESULT = "state_result";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tombol1=findViewById(R.id.tombol1);
        tombol1.setOnClickListener(this);

        tombol2=findViewById(R.id.tombol2);
        tombol2.setOnClickListener(this);

        tombol3=findViewById(R.id.tombol3);
        tombol3.setOnClickListener(this);

        tombol4=findViewById(R.id.tombol4);
        tombol4.setOnClickListener(this);

        tombol5=findViewById(R.id.tombol5);
        tombol5.setOnClickListener(this);

        tombol6=findViewById(R.id.tombol6);
        tombol6.setOnClickListener(this);

        tombol7=findViewById(R.id.tombol7);
        tombol7.setOnClickListener(this);

        tombol8=findViewById(R.id.tombol8);
        tombol8.setOnClickListener(this);

        tombol9=findViewById(R.id.tombol9);
        tombol9.setOnClickListener(this);

        tombol0=findViewById(R.id.tombol0);
        tombol0.setOnClickListener(this);

        tombolplus=findViewById(R.id.tombolplus);
        tombolplus.setOnClickListener(this);

        tombolmin=findViewById(R.id.tombolmin);
        tombolmin.setOnClickListener(this);

        tombolkali=findViewById(R.id.tombolkali);
        tombolkali.setOnClickListener(this);

        tombolbagi=findViewById(R.id.tombolbagi);
        tombolbagi.setOnClickListener(this);

        tomboleq=findViewById(R.id.tomboleq);
        tomboleq.setOnClickListener(this);

        tombolKoma=findViewById(R.id.tombolKoma);
        tombolKoma.setOnClickListener(this);

        clear=findViewById(R.id.clear);
        clear.setOnClickListener(this);

        tomboldel=findViewById(R.id.tomboldel);
        tomboldel.setOnClickListener(this);

        textHasil=findViewById(R.id.textHasil);



    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.tombol1 :
                    textHasil.setText(textHasil.getText().toString().trim()+"1");
                break;
            case R.id.tombol2:
                    textHasil.setText(textHasil.getText().toString().trim()+"2");
                    break;
            case R.id.tombol3:
                    textHasil.setText(textHasil.getText().toString().trim()+"3");
                    break;
            case R.id.tombol4:
                    textHasil.setText(textHasil.getText().toString().trim()+"4");
                break;
            case R.id.tombol5:
                    textHasil.setText(textHasil.getText().toString().trim()+"5");
                break;
            case R.id.tombol6:
                    textHasil.setText(textHasil.getText().toString().trim()+"6");
                break;
            case R.id.tombol7:
                    textHasil.setText(textHasil.getText().toString().trim()+"7");
                break;
            case R.id.tombol8:
                    textHasil.setText(textHasil.getText().toString().trim()+"8");
                break;
            case R.id.tombol9:
                    textHasil.setText(textHasil.getText().toString().trim()+"9");
                break;
            case R.id.tombol0:
                    textHasil.setText(textHasil.getText().toString().trim()+"0");
                break;
            case R.id.tombolKoma:
                    textHasil.setText(textHasil.getText().toString().trim()+".");
                break;
            case R.id.tombolplus:
                nilaisekarang=Double.parseDouble(textHasil.getText().toString());
                status="+";
                textHasil.setText("");
                break;
            case R.id.tombolmin:
                nilaisekarang=Double.parseDouble(textHasil.getText().toString());
                status="-";
                textHasil.setText("");
                break;
            case R.id.tombolkali:
                status="x";
                nilaisekarang=Double.parseDouble(textHasil.getText().toString());
                textHasil.setText("");
                break;
            case R.id.tombolbagi:
                status=":";
                nilaisekarang=Double.parseDouble(textHasil.getText().toString());
                textHasil.setText("");
                break;
            case R.id.tomboleq:
                if(nilai!=0 || nilaisekarang!=0) {
                    if (status.equals("+")) {
                        nilai = nilaisekarang + Double.parseDouble(textHasil.getText().toString());
                    } else if (status.equals("-")) {
                        nilai = nilaisekarang - Double.parseDouble(textHasil.getText().toString());
                    } else if (status.equals("x")) {
                        nilai = nilaisekarang * Double.parseDouble(textHasil.getText().toString());
                    } else if (status.equals(":")) {
                        nilai = nilaisekarang / Double.parseDouble(textHasil.getText().toString());
                    }
                }
                else{

                }
                    int bul = (int) nilai;
                    if (bul == nilai) {
                        textHasil.setText(String.valueOf((int) nilai));
                    } else {
                        textHasil.setText(String.valueOf(nilai));
                    }
                break;
            case R.id.clear:
                textHasil.setText("");
                nilai=0;
                nilaisekarang=0;
                break;
            case R.id.tomboldel:
                int a=textHasil.getText().length()-1;
                StringBuilder back= new StringBuilder(textHasil.getText().toString());
                back.deleteCharAt(a);
                String hasil=back.toString();
                textHasil.setText(hasil);
                break;


        }
    }
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(STATE_RESULT, textHasil.getText().toString());
    }
}
