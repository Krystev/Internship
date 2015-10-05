package com.vratsasoftware.tito.sqliteapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.sql.SQLException;

/**
 * Created by Tito on 5.10.2015 г..
 */
public class DBHelper extends SQLiteOpenHelper {
    static final String DB_NAME = "mydb";
    static final int DB_CURRENT_VERSION = 1;
    protected SQLiteDatabase db;
    public DBHelper(Context context) throws SQLException {
        super(context, DB_NAME, null, DB_CURRENT_VERSION);
        open();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table preferences (_id integer primary key autoincrement," + "val text not null);");
        Log.d("D1", "Create DB");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void open() throws SQLException {
        db = getWritableDatabase();
    }

    public void close() {
        db.close();
    }
}
