package com.example.exercicio19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela5 extends AppCompatActivity {
    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela5);
        button1 = findViewById(R.id.btnTelaPrincipal);
        button2 = findViewById(R.id.btnTelaAnterior);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirTelaPrincipal();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirTela3();
            }
        });
    }

    public void abrirTelaPrincipal(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void abrirTela3(){
        Intent intent = new Intent(this, Tela3.class);
        startActivity(intent);
    }
}
