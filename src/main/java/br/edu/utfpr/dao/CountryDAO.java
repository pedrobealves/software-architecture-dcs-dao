package br.edu.utfpr.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class CountryDAO {

    private static final String DEFAULT_URL = "jdbc:derby:memory:database;create=true";

    public CountryDAO() {
        try (Connection conn = DriverManager.getConnection(DEFAULT_URL)) {

            conn.createStatement().executeUpdate(
                    "CREATE TABLE pais (" +
                            "id int NOT NULL GENERATED ALWAYS AS IDENTITY CONSTRAINT id_pais_pk PRIMARY KEY," +
                            "nome varchar(255)," +
                            "sigla varchar(3)," +
                            "codigoTelefone int)");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
