package com.example.exercicio19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela4 extends AppCompatActivity {
    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela4);
        button1 = findViewById(R.id.btnProximaTela);
        button2 = findViewById(R.id.btnTelaAnterior);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirTela6();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirTela2();
            }
        });
    }

    public void abrirTela6(){
        Intent intent = new Intent(this, Tela6.class);
        startActivity(intent);
    }
    public void abrirTela2(){
        Intent intent = new Intent(this, Tela2.class);
        startActivity(intent);
    }
}
