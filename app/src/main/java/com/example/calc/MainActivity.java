package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView tv1;
    public TextView tv2;
    private String operacion1;
    private String operacion2;
    private String operario;
    private float resultado;

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

        b14.setOnClickListener(v -> {
            operacion2 = tv1.getText().toString();
            operacion2 = operacion2 + "1";
            tv1.setText(operacion2);
        });

        b9.setOnClickListener(v -> {
            operacion2 = tv1.getText().toString();
            operacion2 = operacion2 + "2";
            tv1.setText(operacion2);
        });

        b10.setOnClickListener(v -> {
            operacion2 = tv1.getText().toString();
            operacion2 = operacion2 + "3";
            tv1.setText(operacion2);
        });

        b13.setOnClickListener(v -> {
            operacion2 = tv1.getText().toString();
            operacion2 = operacion2 + "4";
            tv1.setText(operacion2);
        });

        b7.setOnClickListener(v -> {
            operacion2 = tv1.getText().toString();
            operacion2 = operacion2 + "5";
            tv1.setText(operacion2);
        });

        b8.setOnClickListener(v -> {
            operacion2 = tv1.getText().toString();
            operacion2 = operacion2 + "6";
            tv1.setText(operacion2);
        });

        b4.setOnClickListener(v -> {
            operacion2 = tv1.getText().toString();
            operacion2 = operacion2 + "7";
            tv1.setText(operacion2);
        });

        b5.setOnClickListener(v -> {
            operacion2 = tv1.getText().toString();
            operacion2 = operacion2 + "8";
            tv1.setText(operacion2);
        });

        b6.setOnClickListener(v -> {
            operacion2 = tv1.getText().toString();
            operacion2 = operacion2 + "9";
            tv1.setText(operacion2);
        });

        b11.setOnClickListener(v -> {
            operacion2 = tv1.getText().toString();
            operacion2 = operacion2 + "0";
            tv1.setText(operacion2);
        });

        b18.setOnClickListener(v -> {
            if(tv1.getText().toString().length() != 0){
                operacion1 = tv1.getText().toString();
                operario = "+";
                tv1.setText("");
                tv2.setText(operacion2.concat(" + "));
            }
        });

        b17.setOnClickListener(v -> {
            operacion1 = tv1.getText().toString();
            operario = "-";
            tv1.setText("");
            tv2.setText(operacion2.concat(" - "));
        });

        b3.setOnClickListener(v -> {
            if(tv1.getText().toString().length() != 0){
                operacion1 = tv1.getText().toString();
                operario = "*";

                tv1.setText("");
                tv2.setText(operacion2.concat(" x "));
            }
        });

        b2.setOnClickListener(v -> {
            if(tv1.getText().toString().length() != 0){
                operacion1 = tv1.getText().toString();
                operario = "/";

                tv1.setText("");
                tv2.setText(operacion2.concat(" ÷ "));
            }
        });

        b15.setOnClickListener(v -> {
            if(tv1.getText().toString().length() != 0) {
                operacion1 = tv1.getText().toString();
                operario = "%";

                tv1.setText("");
                tv2.setText(operacion2.concat(" % "));
            }
        });

        b12.setOnClickListener(v -> {
            if(tv1.getText().toString().length() == 0){
                tv1.setText("0.");
            }
            if(!tv1.getText().toString().contains(".")){
                operacion2 = tv1.getText().toString();
                operacion2 = operacion2 + ".";
                tv1.setText(operacion2);
            }
        });

        b16.setOnClickListener(v -> {
            if(tv1.getText().toString().length() != 0){
                operacion2 = tv1.getText().toString();
                operacion2 = operacion2.substring(0,operacion2.length()-1);
                tv1.setText(operacion2);
            }
        });

        b1.setOnClickListener(v -> {
            operacion1 = "";
            operacion2 = "";
            operario = "";
            resultado = 0;

            tv1.setText("");
            tv2.setText("");
        });

        b19.setOnClickListener(v -> {
            if(tv1.getText().toString().length() == 0 || tv2.getText().toString().length() == 0){
                String error = "Error";
                tv2.setText(error);
            }else{
                if(operario.equals("+")){
                    resultado = Float.parseFloat(operacion1)  + Float.parseFloat(operacion2);
                    tv2.setText(operacion1.concat(" + ").concat(operacion2).concat(" = "));
                }
                if(operario.equals("-")){
                    resultado = Float.parseFloat(operacion1)  - Float.parseFloat(operacion2);
                    tv2.setText(operacion1.concat(" - ").concat(operacion2).concat(" = "));
                }
                if(operario.equals("*")){
                    resultado = Float.parseFloat(operacion1)  * Float.parseFloat(operacion2);
                    tv2.setText(operacion1.concat(" x ").concat(operacion2).concat(" = "));
                }
                if(operario.equals("/")){
                    resultado = Float.parseFloat(operacion1)  / Float.parseFloat(operacion2);
                    tv2.setText(operacion1.concat(" ÷ ").concat(operacion2).concat(" = "));
                }
                if(operario.equals("%")){
                    resultado = (Float.parseFloat(operacion1)  * Float.parseFloat(operacion2) / 100);
                    tv2.setText(operacion1.concat(" % ").concat(operacion2).concat(" = "));
                }
                tv1.setText(String.valueOf(resultado));
            }
        });
    }
}