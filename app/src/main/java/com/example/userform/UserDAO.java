package com.example.userform;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface UserDAO {

    @Insert
    void insertarUsuario(User miUsuario);

    @Query("Select * From user")
    List<User> obtenerTodos();

    @Query("Select * From user Where uid = :id")
    User obtenerUsuario(int id);

    @Update
    void actualizarUsuario(User miUsuario);
}
