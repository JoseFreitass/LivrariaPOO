/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAO.DaoBook;
import DAO.DaoOrder;
import livrariapoo.User;
import livrariapoo.book;
import livrariapoo.order;


/**
 *
 * @author josef
 */
public class Venda {
    
    public void efetuarvenda(int quantidade, book book, User user){
      
       DaoOrder x = new DaoOrder(); 
       
       DaoBook y = new DaoBook();
       
       order z = new order();
       
       z.setBook(book);
       z.setUser(user);
       
       
       
       if(z.getBook().getquantidade() > 0 ){
           
           
           try {
                             
                z.getBook().setquantidade(z.getBook().getquantidade() - quantidade);
                              
                y.update(z.getBook());


                x.gravar(z);

            } catch (Exception e) {
                e.printStackTrace();
            }
           
           
       }
       
       
       
    }
    
    
}
