package net.unesc.controledegastos.database.model;

public class Usuario {

    public static final String TABELA = "usuario";

    public static final String COLUNA_ID = "_id";
    public static final String COLUNA_NOME = "nome";
    public static final String COLUNA_EMAIL = "email";
    public static final String COLUNA_SENHA = "senha";

    private Integer _id;
    private String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String email, String senha){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public static final String CREATE_TABLE =
            "create table " + TABELA
            + " ( "
            + COLUNA_ID + " integer not null primary key autoincrement, "
            + COLUNA_NOME + " text not null, "
            + COLUNA_EMAIL + " text not null, "
            + COLUNA_SENHA + " text not null "
            + ");";

    public static final String DROP_TABLE =
            "drop table if exists " + TABELA + ";";

    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
