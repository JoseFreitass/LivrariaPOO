/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import livrariapoo.Author;


/**
 *
 * @author josef
 */
public class DaoAuthor {
    
    Conexao x = new Conexao();
    
    public void Lista(){
        
        
        String query = "select * from livraria.author";
        
        
        try{
            x.conectar();
            PreparedStatement prep = x.getConexao().prepareStatement(query);

            ResultSet result = prep.executeQuery();
            
            System.out.println("id - nome");
            
            while(result.next()){
                System.out.println(result.getInt("Auid")+" - " + result.getString("nome"));
            } 

        }catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public Author seleciona(int id){
        
        String query = "select * from livraria.author where AuId = ?";
        
        
        try{
            x.conectar();
            PreparedStatement prep = x.getConexao().prepareStatement(query);
            
            prep.setInt(1, id);

            ResultSet result = prep.executeQuery();
            
            
            if (result.next()){
                System.out.println(result.getInt("Auid")+" - " + result.getString("nome"));
                
                Author author = new Author(result.getInt("AuId"), result.getString("nome"));
                
                return author;
            } 

        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }   
    
}
