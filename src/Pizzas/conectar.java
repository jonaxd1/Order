
package Pizzas;
import java.sql.Connection;
import java.sql.DriverManager;
public class conectar {
    Connection conectar=null;
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost/pizzeria","root","");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return conectar;
    }
}
