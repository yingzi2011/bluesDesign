package com.rollingalgo.sqlite;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.rollingalgo.MyApplication;

/**
 * Created by qishoudong on 2016/11/11.
 */

public class MySqliteHelper extends SQLiteOpenHelper {

    private final static String APP_DB_NAME = "rolling.db";
    private final static int APP_DB_VERSION = 1;
    //table 名
    private static final String APP_DB_TABLE_NAME = "rolling_algo";

    public static String APP_CREATE_TABLE = "CREATE TABLE IF NOT EXISTS " + APP_DB_TABLE_NAME + "(id is not key)"+   ";";

    public MySqliteHelper() {
        super(MyApplication.getApplication(), APP_DB_NAME, null, APP_DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
