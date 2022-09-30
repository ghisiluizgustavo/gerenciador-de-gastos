package net.unesc.controledegastos.database.dao;

import android.content.ContentValues;
import android.content.Context;

import net.unesc.controledegastos.database.DBOpenHelper;
import net.unesc.controledegastos.database.model.Usuario;

public class UsuarioDAO extends AbstractDAO{

    private final String[] colunas = {
            Usuario.COLUNA_ID,
            Usuario.COLUNA_NOME,
            Usuario.COLUNA_EMAIL,
            Usuario.COLUNA_SENHA
    };

    public UsuarioDAO(Context context){
        dbOpenHelper = new DBOpenHelper(context);
    }

    public long insert(Usuario usuario){
        long rowAffect = 0;

        try{
            Open();

            ContentValues values = new ContentValues();
            values.put(Usuario.COLUNA_NOME, usuario.getNome());
            values.put(Usuario.COLUNA_EMAIL, usuario.getEmail());
            values.put(Usuario.COLUNA_SENHA, usuario.getSenha());

            rowAffect = db.insert(Usuario.TABELA, null, values);

        } finally {
            Close();
        }
        return rowAffect;
    }
}
