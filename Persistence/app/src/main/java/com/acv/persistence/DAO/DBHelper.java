package com.acv.persistence.DAO;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.acv.persistence.MinhaAplicacao;
import com.acv.persistence.model.Livro;

/**
 * Created by vinicius.castro on 12/12/2016.
 */

public class DBHelper extends SQLiteOpenHelper {

    public static String NOME_BANCO = "livros.db";
    public static int VERSAO_BANCO = 1;

    public DBHelper(Context context) {
        super(context, NOME_BANCO, null, VERSAO_BANCO);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(LivroDAO.createTable());
        seed();
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    private void seed() {
        LivroDAO livroDAO = new LivroDAO();
        Livro livro = new Livro();
        livro.setAutor("a1");
        livro.setEditora("e1");
        livro.setTitulo("t1");
        livroDAO.insereDado(livro);

        Livro livro2 = new Livro();
        livro.setAutor("a2");
        livro.setEditora("e2");
        livro.setTitulo("t2");
        livroDAO.insereDado(livro2);
    }
}
