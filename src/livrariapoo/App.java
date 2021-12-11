package livrariapoo;

import BLL.Venda;
import DAO.DaoBook;
import DAO.DaoOrder;
import DAO.DaoUser;
import java.util.Scanner;





public class App {
    public static void main(String[] args) throws Exception {
     
        Scanner leitura = new Scanner(System.in);
        
        DaoBook daobook = new DaoBook();
        
        DaoUser userdao = new DaoUser();
        

        User user = null;
        
        book book = null;
        
        
        do{
            
            System.out.println("Selecione o livre que deseja: ");

            daobook.Lista();

            int idbook = leitura.nextInt();

            book = daobook.seleciona(idbook);
        }while(book == null);
        
        
  
        
        do{
            
            System.out.println("Selecione o user que deseja: ");

            userdao.Lista();

            int iduser = leitura.nextInt();

            user  = userdao.seleciona(iduser);
        }while(user == null);
        
        
    
        DaoOrder daoorder = new DaoOrder();        
        
        Venda venda = new Venda();
        
        venda.efetuarvenda (5, book, user);
        
    }
}

