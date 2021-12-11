/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import livrariapoo.book;

/**
 *
 * @author josef
 */
public class DaoBook {

    Conexao x = new Conexao();
    
    public void update(book book){
        x.conectar();

        try {
            String query = "UPDATE livraria.book "
                    + "SET name=?, fk_auId=?, fk_puId=?, quantidade=?, numPags=? WHERE Boid=?";
            PreparedStatement prep = x.getConexao().prepareStatement(query);

            prep.setInt(6, book.getBoid());
            prep.setString(1, book.getname());
            prep.setInt(2, book.getfk_auId());
            prep.setInt(3, book.getfk_puId());
            prep.setInt(4, book.getquantidade());
            prep.setInt(5, book.getnumPags());
            prep.execute();
            
            
            x.getConexao().commit();
            x.getConexao().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

    public void Lista() {

        String query = "select * from livraria.book";

        try {
            x.conectar();
            PreparedStatement prep = x.getConexao().prepareStatement(query);

            ResultSet result = prep.executeQuery();

            System.out.println("id - nome");

            while (result.next()) {
                System.out.println(result.getInt("Boid") + " - " + result.getString("name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public book seleciona(int id) {

        String query = "select * from livraria.book where Boid = ?";

        try {
            x.conectar();
            PreparedStatement prep = x.getConexao().prepareStatement(query);

            prep.setInt(1, id);

            ResultSet result = prep.executeQuery();

            if (result.next()) {
                System.out.println(result.getInt("Boid") + " - " + result.getString("name"));

                       
                book book = new book(result.getInt("Boid"), result.getInt("fk_puId"), 
                result.getInt("fk_auId"), result.getString("name"), result.getInt("numPags"), result.getInt("quantidade"));

                
                
                return book;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
