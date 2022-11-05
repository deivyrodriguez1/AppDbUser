package com.example.userform;

import android.view.View;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserView extends RecyclerView.ViewHolder {

    TextView nombre;

    //Contructor
    public UserView(@NonNull View itemView) {
        super(itemView);

        nombre = itemView.findViewById(R.id.nombre);
    }
}
