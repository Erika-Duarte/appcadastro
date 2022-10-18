package com.example.appcadastro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SegundaActivity extends AppCompatActivity {

    Button cadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        cadastro = findViewById(R.id.cadastro);

    }

    public void proximo(View view) {
        Intent intent = new Intent(this, TerceiraActivity.class);
        intent.putExtra("nome", "nome");
        startActivity(intent);
    }
}