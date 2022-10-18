package com.example.appcadastro;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class TerceiraActivity extends AppCompatActivity {


    Button salvar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira);

        salvar = findViewById(R.id.salvar);

    }

    public Button getSalvar() {
        return salvar;
    }

    public void setSalvar(Button salvar) {
        this.salvar = salvar;
    }
}