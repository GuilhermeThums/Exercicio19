package com.example.exercicio19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.btnImpares);
        button2 = findViewById(R.id.btnPares);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                abrirTela1();
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                abrirTela2();
        }
        });
    }

    public void abrirTela1(){
        Intent intent = new Intent(this, Tela1.class);
        startActivity(intent);
    }

    public void abrirTela2(){
        Intent intent = new Intent(this, Tela2.class);
        startActivity(intent);
    }

    public void onClick(View view){
        finish();
        System.exit(0);
    }
}
