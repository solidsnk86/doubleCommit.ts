
package test;
import accesodatos.*;

public class TestIntefaces {

    public static void main(String[] args) {
        IAccesoDatos mysql = new ImplementacionMySql();
        IAccesoDatos oracle = new ImplementacionOracle();
        mysql.listar();
        oracle.listar();
        System.out.println("Chingadera");
    }
    
}
