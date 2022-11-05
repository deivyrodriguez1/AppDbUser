package com.example.userform;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class DbList extends AppCompatActivity {

    RecyclerView miVistaRecicladora;
    UserDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_db_list);

        miVistaRecicladora = findViewById(R.id.listaUsuarios);
        db = UserDatabase.getDatabase(this);

        Bundle misDatos = getIntent().getExtras();
        User miUsuario = new User();
        miUsuario.nombre = misDatos.getString("nombre");
        miUsuario.apellido = misDatos.getString("apellido");
        miUsuario.peso = Float.parseFloat(misDatos.getString("peso"));



        //Cargar los datos empleando el DAO
        //Tenemos que crear un nuevo hilo de ejecución

        new Thread(
                ()->{
                    db.userDao().insertarUsuario(miUsuario);
                }
        ).start();


    }
}