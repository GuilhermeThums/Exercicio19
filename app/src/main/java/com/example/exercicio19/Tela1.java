package com.example.exercicio19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela1 extends AppCompatActivity {
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);
        button1 = findViewById(R.id.btnProximaTela);
        button2 = findViewById(R.id.btnTelaAnterior);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                abrirTela3();
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                abrirMainActivity();
            }
        });

    }

    public void abrirTela3(){
        Intent intent = new Intent(this, Tela3.class);
        startActivity(intent);
    }
    public void abrirMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
