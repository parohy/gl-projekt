/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glprojekt;

import glprojekt.gui.Add_employee;
import glprojekt.gui.Delete_employee;
<<<<<<< HEAD
import glprojekt.gui.Login;
=======
import glprojekt.gui.Main_screen;
>>>>>>> de0e90ca65ef172f0bfee7534f5334b623242829
import glprojekt.gui.Update_employee_1;

/**
 *
 * @author tomas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
<<<<<<< HEAD
       /*Add_employee employ = new Add_employee();
          employ.setVisible(true);*/
          
                 
      Login login = new Login();
      login.setVisible(true);
=======
      /* Add_employee_1 employ = new Add_employee_1();
          employ.setVisible(true);*/
>>>>>>> de0e90ca65ef172f0bfee7534f5334b623242829
       
      /*Delete_employee delete = new Delete_employee();
       delete.setVisible(true);
     
       /*Update_employee_1 update = new Update_employee_1();
     update.setVisible(true);*/
      
      Main_screen screen = new Main_screen();
      screen.setVisible(true);
       
          
        
    }
    
}