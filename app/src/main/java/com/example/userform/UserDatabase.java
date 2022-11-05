package com.example.userform;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

@Database(entities = {User.class}, version = 1)
public abstract class UserDatabase extends RoomDatabase {


    private static volatile UserDatabase INSTANCE;

    public static UserDatabase getDatabase(Context ctx){

        //Conexion Base de Datos
        INSTANCE = androidx.room.Room.databaseBuilder(ctx.getApplicationContext(), UserDatabase.class, "usuarios").build();
        return INSTANCE;
    }

    //Declarar los DAO que necesites

    public abstract UserDAO userDao();

}
