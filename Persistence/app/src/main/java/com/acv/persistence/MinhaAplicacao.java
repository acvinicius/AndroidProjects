package com.acv.persistence;

import android.app.Application;
import android.content.Context;

import com.acv.persistence.DAO.DBHelper;
import com.acv.persistence.DAO.DatabaseManager;
import com.facebook.stetho.Stetho;

/**
 * Created by vinicius.castro on 12/12/2016.
 */

//inicializa antes da aplicação, bom para inserir dados mais pesados.
public class MinhaAplicacao extends Application {

    private static Context context;

    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
        MinhaAplicacao.context = getApplicationContext();
        DatabaseManager.initializeInstance(new DBHelper(context));
    }

    public static Context getAppContext() {
        return MinhaAplicacao.context;
    }

}
