package com.example.lucascamilopamiiapiibimii.datamodel;

public class ClienteDataModel {

    public static final String TABELA = "cliente";
    public static final String ID     = "id";
    public static final String NOME   = "nome";
    public static final String EMAIL  = "email";
    public static final String CEP  = "cep";
    public static final String CIDADE  = "cidade";
    public static final String ENDERECO  = "email";
    public static final String TELEFONE  = "email";
    public static String queryCriarTabela = "";

    public static String criarTabela(){
        queryCriarTabela += "CREATE TABLE IF NOT EXISTS" + TABELA + ")";
        queryCriarTabela += ID + "INTEGER PRIAMRY KEY AUTOINCREMENT,";
        queryCriarTabela += NOME + "TEXT";
        queryCriarTabela += EMAIL + "TEXT";
        queryCriarTabela += CEP + "TEXT";
        queryCriarTabela += CIDADE + "TEXT";
        queryCriarTabela += ENDERECO + "TEXT";
        queryCriarTabela += TELEFONE + "TEXT";
                queryCriarTabela += ")";

        return queryCriarTabela;
    }
}
