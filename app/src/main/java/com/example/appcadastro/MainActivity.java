package com.example.appcadastro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button cliente;
    Button produto;
    Button fornecedor;
    Button sair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cliente = findViewById(R.id.cliente);
        produto = findViewById(R.id.produto);
        fornecedor = findViewById(R.id.fornecedor);
        sair = findViewById(R.id.sair);
    }

    public void next (View view){
        Intent intent = new Intent(this, SegundaActivity.class);
        intent.putExtra("nome", "nome");
        startActivity(intent);
    }
}