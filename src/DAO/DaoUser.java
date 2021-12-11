/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import livrariapoo.User;

/**
 *
 * @author josef
 */
public class DaoUser {

    Conexao x = new Conexao();

    public void Lista() {

        String query = "select * from livraria.user";

        try {
            x.conectar();
            PreparedStatement prep = x.getConexao().prepareStatement(query);

            ResultSet result = prep.executeQuery();

            System.out.println("id - nome");

            while (result.next()) {
                System.out.println(result.getInt("UsId") + " - " + result.getString("name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public User seleciona(int id) {

        String query = "select * from livraria.user where UsId = ?";

        try {
            x.conectar();
            PreparedStatement prep = x.getConexao().prepareStatement(query);

            prep.setInt(1, id);

            ResultSet result = prep.executeQuery();

            if (result.next()) {
                System.out.println(result.getInt("UsId") + " - " + result.getString("name"));

                User user = new User(result.getInt("UsId"), result.getString("Type"), result.getString("name"));

                return user;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
