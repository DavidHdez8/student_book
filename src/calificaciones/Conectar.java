package calificaciones;

import java.sql.Connection;
import java.sql.DriverManager;

class Conectar {
    Connection conectar = null;
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jbdc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/calificaciones", "root", "");
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return conectar;
    }
}