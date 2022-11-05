package com.example.userform;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserView> {

    private List<User> users;

    //Cuando creen el adaptador tienen que pasar el listado de usuarios don el que va a trabajar
    public UserAdapter(List<User> users){
        this.users = users;
    }

    @NonNull
    @Override
    public UserView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //Colocar cada dato se la lista en un "cajon desde la plantilla userView
        Context ctx = parent.getContext();

        LayoutInflater creadorVistas = LayoutInflater.from(ctx);
        View cajonUsuarios = creadorVistas.inflate(R.layout.userview, parent, false);

        UserView unCajon = new UserView(cajonUsuarios);
        return unCajon;
    }

    @Override
    public void onBindViewHolder(@NonNull UserView holder, int position) {

        //Obtener un usuario desde la lista de usuarios
        User miUsuario = users.get(position);

        //Asociar a el TextView para mostrarlo
        TextView dato = holder.nombre;
        dato.setText(miUsuario.nombre);
    }

    @Override
    public int getItemCount() {
        if (users == null)
            return 0;
        else
            return users.size();
    }
}
