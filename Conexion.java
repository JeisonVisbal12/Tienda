package tienda;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexion {
    Connection cn = null;
    public Connection cargar(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-643P9E1:1433;DatabaseName = Inventario; user =sa"
                    + ";password=ANDREAyandres31");

           JOptionPane.showMessageDialog(null,"Conectado.","conectado",JOptionPane.INFORMATION_MESSAGE); 

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"error.","error",JOptionPane.INFORMATION_MESSAGE); 
        } 
    return cn;
   }
}