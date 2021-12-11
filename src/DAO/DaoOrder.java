/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import livrariapoo.order;

/**
 *
 * @author josef
 */
public class DaoOrder {

    Conexao x = new Conexao();
    
    
      
      
    public void gravar(order order) {

        x.conectar();

        String query = "INSERT INTO livraria.order (Boid, quantidade, fk_usId) "
                     + "VALUES (?, ?, ?)";

        try {

            PreparedStatement prep = x.getConexao().prepareStatement(
                    query
            );
            prep.setInt(1, order.getBook().getBoid());
            prep.setInt(2, order.getBook().getquantidade());
            prep.setInt(3, order.getUser().getUsId());
            prep.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DaoOrder.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    

    public void Lista() {

        String query = "select * from livraria.order";

        try {
            x.conectar();
            PreparedStatement prep = x.getConexao().prepareStatement(query);

            ResultSet result = prep.executeQuery();

            System.out.println("id - nome");

            while (result.next()) {
                System.out.println(result.getInt("Orid") + " - " + result.getInt("name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public order seleciona(int id) {

        String query = "select * from livraria.order where Orid = ?";

        try {
            x.conectar();
            PreparedStatement prep = x.getConexao().prepareStatement(query);

            prep.setInt(1, id);

            ResultSet result = prep.executeQuery();

            if (result.next()) {
                System.out.println(result.getInt("Orid") + " - " + result.getString("name"));

                order order = new order();
                
                order.setOrid(result.getInt("Orid"));
                
                order.setfk_kusId(result.getInt("fk_kusId"));
                return order;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
