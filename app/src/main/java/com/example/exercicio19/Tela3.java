package com.example.exercicio19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela3 extends AppCompatActivity {
    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);
        button1 = findViewById(R.id.btnProximaTela);
        button2 = findViewById(R.id.btnTelaAnterior);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirTela5();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirTela1();
            }
        });
    }

    public void abrirTela5(){
        Intent intent = new Intent(this, Tela5.class);
        startActivity(intent);
    }

    public void abrirTela1(){
        Intent intent = new Intent(this, Tela1.class);
        startActivity(intent);
    }
}
