package br.edu.utfpr.dao;

import br.edu.utfpr.dto.ClientDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientDAO {

    public ClientDAO(){
        try (Connection conn = DriverManager.getConnection("jdbc:derby:memory:database;create=true")) {
            conn.createStatement().executeUpdate(
                    "CREATE TABLE cliente (" +
                            "id int NOT NULL GENERATED ALWAYS AS IDENTITY CONSTRAINT id_cliente_pk PRIMARY KEY," +
                            "nome varchar(255)," +
                            "telefone varchar(30)," +
                            "idade int," +
                            "limiteCredito double," +
                            "id_pais int)");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void create(ClientDTO client){

    }

    public ClientDTO read(int id){

        return null;
    }


    public void update(int id){

    }

    public void delete(int id){

    }


    public List<ClientDTO> getAll(){

        return null;
    }
}
