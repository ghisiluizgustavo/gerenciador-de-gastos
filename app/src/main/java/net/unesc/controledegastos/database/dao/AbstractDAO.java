package net.unesc.controledegastos.database.dao;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import net.unesc.controledegastos.database.DBOpenHelper;

public abstract class AbstractDAO {

    protected SQLiteDatabase db;
    protected DBOpenHelper dbOpenHelper;

    protected final void Open() {
        db = dbOpenHelper.getWritableDatabase();
    }

    protected final void Close() {
        dbOpenHelper.close();
    }
}
