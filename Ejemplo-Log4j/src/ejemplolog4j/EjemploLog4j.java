/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolog4j;

import java.io.File;
import org.apache.log4j.PropertyConfigurator;

/**
 *
 * @author march
 */
public class EjemploLog4j {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File log4jfile = new File("./src/Log4j/log4j.properties");
        PropertyConfigurator.configure(log4jfile.getAbsolutePath());
        Conexion c1 = new Conexion();
        c1.conectar(0);
        c1.conectar(-1);
        c1.conectar(1);
    }
    
}
