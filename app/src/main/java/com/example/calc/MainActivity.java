package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView tv1;
    public TextView tv2;
    private String operacion1;
    private String operacion2;
    private String operario;
    private double resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);
        Button b3 = findViewById(R.id.b3);
        Button b4 = findViewById(R.id.b4);
        Button b5 = findViewById(R.id.b5);
        Button b6 = findViewById(R.id.b6);
        Button b7 = findViewById(R.id.b7);
        Button b8 = findViewById(R.id.b8);
        Button b9 = findViewById(R.id.b9);
        Button b10 = findViewById(R.id.b10);
        Button b11 = findViewById(R.id.b11);
        Button b12 = findViewById(R.id.b12);
        Button b13 = findViewById(R.id.b13);
        Button b14 = findViewById(R.id.b14);
        Button b15 = findViewById(R.id.b15);
        Button b16 = findViewById(R.id.b16);
        Button b17 = findViewById(R.id.b17);
        Button b18 = findViewById(R.id.b18);
        Button b19 = findViewById(R.id.b19);

        b14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                operacion2 = tv1.getText().toString();
                operacion2 = operacion2 + "1";
                tv1.setText(operacion2);
            }
        });

        b9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                operacion2 = tv1.getText().toString();
                operacion2 = operacion2 + "2";
                tv1.setText(operacion2);
            }
        });

        b10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                operacion2 = tv1.getText().toString();
                operacion2 = operacion2 + "3";
                tv1.setText(operacion2);
            }
        });
        b13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                operacion2 = tv1.getText().toString();
                operacion2 = operacion2 + "4";
                tv1.setText(operacion2);
            }
        });

        b7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                operacion2 = tv1.getText().toString();
                operacion2 = operacion2 + "5";
                tv1.setText(operacion2);
            }
        });

        b8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                operacion2 = tv1.getText().toString();
                operacion2 = operacion2 + "6";
                tv1.setText(operacion2);
            }
        });

        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                operacion2 = tv1.getText().toString();
                operacion2 = operacion2 + "7";
                tv1.setText(operacion2);
            }
        });

        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                operacion2 = tv1.getText().toString();
                operacion2 = operacion2 + "8";
                tv1.setText(operacion2);
            }
        });

        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                operacion2 = tv1.getText().toString();
                operacion2 = operacion2 + "9";
                tv1.setText(operacion2);
            }
        });

        b11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                operacion2 = tv1.getText().toString();
                operacion2 = operacion2 + "0";
                tv1.setText(operacion2);
            }
        });

        b18.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                operacion1 = tv1.getText().toString();
                operario = "+";

                tv1.setText("");
                tv2.setText(operacion2 + "+");
            }
        });

        b17.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                operacion1 = tv1.getText().toString();
                operario = "-";

                tv1.setText("");
                tv2.setText(operacion2 + "-");
            }
        });

        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                operacion1 = tv1.getText().toString();
                operario = "*";

                tv1.setText("");
                tv2.setText(operacion2 + "*");
            }
        });

        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                operacion1 = tv1.getText().toString();
                operario = "/";

                tv1.setText("");
                tv2.setText(operacion2 + "/");
            }
        });

        b15.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                operacion1 = tv1.getText().toString();
                operario = "%";

                tv1.setText("");
                tv2.setText(operacion2 + "%");
            }
        });

        b12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                operacion2 = tv1.getText().toString();
                operacion2 = operacion2 + ".";
                tv1.setText(operacion2);
            }
        });

        b16.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                operacion2 = tv1.getText().toString();
                operacion2 = operacion2.substring(0,operacion2.length()-1);
                tv1.setText(operacion2);
            }
        });

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                operacion1 = tv1.getText().toString();
                operacion1 = "";
                operacion2 = "";
                operario = "";

                tv1.setText(operacion1);
                tv2.setText("");
            }
        });

        b19.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){


                if(operario.equals("+")){
                    resultado = Double.parseDouble(operacion1)  + Double.parseDouble(operacion2);

                }
                if(operario.equals("-")){
                    resultado = Double.parseDouble(operacion1)  - Double.parseDouble(operacion2);

                }
                if(operario.equals("*")){
                    resultado = Double.parseDouble(operacion1)  * Double.parseDouble(operacion2);

                }
                if(operario.equals("/")){
                    resultado = Double.parseDouble(operacion1)  / Double.parseDouble(operacion2);

                }
                if(operario.equals("%")){
                    resultado = Double.parseDouble(operacion1)  % Double.parseDouble(operacion2);

                }
                tv2.setText(String.valueOf(resultado));
            }
        });
    }
}