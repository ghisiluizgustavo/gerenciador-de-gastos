package net.unesc.controledegastos.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import net.unesc.controledegastos.database.model.Usuario;

public class DBOpenHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NOME = "banco.db";
    private static final int DATABASE_VERSAO = 1;

    public DBOpenHelper(Context context) {
        super(context, DATABASE_NOME, null, DATABASE_VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(Usuario.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(Usuario.DROP_TABLE);
        sqLiteDatabase.execSQL(Usuario.CREATE_TABLE);
    }
}
