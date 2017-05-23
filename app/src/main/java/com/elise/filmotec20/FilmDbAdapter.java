package com.elise.filmotec20;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Breno on 22/05/2017.
 *
 * Cette classe elle est similaire a la classe Adapter du filmotec3
 */

public class FilmDbAdapter {

    public static final String KEY_TITRE = "titre"; //Ici on doit metre le nom de colonne
    public static final String KEY_ANNEE = "annee"; // pareil

    private static final String TAG = "CountriesDbAdapter";
    private DatabaseHelper monAuxiliaireBdD; // Auxiliaire de BdD créé en bas du code
    private SQLiteDatabase maBdD; //

    private static String DB_Path = "app/src/main/assets/"; // nouveau Chemin du fichier
    private static String DB_Name = "filmotec.sql";

    private final Context monContexte; //Regler cette erreur en completeant


    private static final String DATABASE_NAME = "World";
    private static final String SQLITE_TABLE = "Country";
    private static final int DATABASE_VERSION = 1;

    private static class DatabaseHelper extends SQLiteOpenHelper {


        DatabaseHelper(Context context) {

            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        }

        private boolean checkDatabase() {
            SQLiteDatabase checkDB = null;
            try {
                String myPath = DB_Path + DB_Name;
                checkDB = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READWRITE);
            } catch (SQLiteException e) {
                // Il faut ajouter un message pour debbuger
            }
            if (checkDB != null) checkDB.close();
            return checkDB != null ? true : false;
        }

    }

}

