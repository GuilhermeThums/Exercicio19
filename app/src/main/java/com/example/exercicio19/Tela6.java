package com.example.exercicio19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela6 extends AppCompatActivity {
    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela6);
        button1 = findViewById(R.id.btnTelaPrincipal);
        button2 = findViewById(R.id.btnTelaAnterior);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirMainActivity();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirTela4();
            }
        });
    }

    public void abrirMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void abrirTela4(){
        Intent intent = new Intent(this, Tela4.class);
        startActivity(intent);
    }
}
