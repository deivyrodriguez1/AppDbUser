package com.example.userform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText nombre;
    EditText apellido;
    EditText peso;
    Button insertar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.nombre);
        apellido = findViewById(R.id.apellido);
        peso = findViewById(R.id.peso);
        insertar = findViewById(R.id.insertar);

        insertar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent(this, DbList.class);
        intent.putExtra("nombre", nombre.getText().toString());
        intent.putExtra("apellido", apellido.getText().toString());
        intent.putExtra("peso", peso.getText().toString());
        startActivity(intent);

    }
}