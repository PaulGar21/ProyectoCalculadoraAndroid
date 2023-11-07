package com.example.aplicacioncalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private float num1, num2;
    private String operador;
    private String cadenanumeros = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textRes = findViewById(R.id.textres);


        Button button1 = findViewById(R.id.button13);
        Button button2 = findViewById(R.id.button14);
        Button button3 = findViewById(R.id.button15);
        Button button4 = findViewById(R.id.button9);
        Button button5 = findViewById(R.id.button10);
        Button button6 = findViewById(R.id.button11);
        Button button7 = findViewById(R.id.button5);
        Button button8 = findViewById(R.id.button6);
        Button button9 = findViewById(R.id.button7);
        Button button0 = findViewById(R.id.button18);
        Button buttondelete = findViewById(R.id.button1);
        Button buttonsuma = findViewById(R.id.button16);
        Button buttonresultado = findViewById(R.id.button20);
        Button buttonresta = findViewById(R.id.button12);
        Button buttonmultiplicacion = findViewById(R.id.button8);
        Button buttondivision = findViewById(R.id.button4);
        Button buttonpunto = findViewById(R.id.button19);
        Button buttonelevar = findViewById(R.id.button3);
        Button buttonmm = findViewById(R.id.button17);
        Button buttondel = findViewById(R.id.button2);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textRes.setText(textRes.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textRes.setText(textRes.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textRes.setText(textRes.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textRes.setText(textRes.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textRes.setText(textRes.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textRes.setText(textRes.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textRes.setText(textRes.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textRes.setText(textRes.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textRes.setText(textRes.getText()+"9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textRes.setText(textRes.getText()+"0");
            }
        });
        buttondelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textRes.setText("");
            }
        });
        
        buttonsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 =Float.parseFloat((String) textRes.getText());
                operador= "+";
                textRes.setText("");
            }
        });
        buttonresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 =Float.parseFloat((String) textRes.getText());
                operador= "-";
                textRes.setText("");
            }
        });
        buttonmultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 =Float.parseFloat((String) textRes.getText());
                operador= "X";
                textRes.setText("");
            }
        });
        buttondivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 =Float.parseFloat((String) textRes.getText());
                operador= "/";
                textRes.setText("");
            }
        });
        buttonpunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    textRes.setText(textRes.getText()+".");

            }
        });
        buttonmm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textRes.setText(textRes.getText()+"(-");
            }
        });

        buttonelevar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 =Float.parseFloat((String) textRes.getText());
                operador= "^";
                textRes.setText("");
            }
        });

        buttonresultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num2 =Float.parseFloat((String) textRes.getText());
                switch (operador){
                    case "+":textRes.setText(scero(num1+num2));
                    break;
                    case "-":textRes.setText(scero(num1-num2));
                    break;
                    case "X":textRes.setText(scero(num1*num2));
                    break;
                    case "/":textRes.setText(scero(num1/num2));
                    break;
                    case "^":textRes.setText(scero(num1*num2));
                    break;
                    case "(-":textRes.setText(scero(-num1));
                    break;
                }
            }
        });
    }
    public String scero(float resultado){
        String retorno = "";
        retorno = Float.toString(resultado);
        if(resultado%1==0){
            retorno = retorno.substring(0,retorno.length()-2);
        }
        return retorno;
    }

}





