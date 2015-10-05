package com.vratsasoftware.tito.sqliteapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import java.sql.SQLException;

/**
 * Created by Tito on 5.10.2015 г..
 */
public class DBPref extends DBHelper {

    public DBPref(Context context) throws SQLException {
        super(context);
    }

    public void addRecord(String val) {
            ContentValues cv = new ContentValues();
            cv.put("val", val);
            this.db.insert("preferences", null, cv);

    }

    public Cursor getVals() {

        return this.db.query("preferences", new String[]{"val"},null, null, null, null, null);
    }
}
