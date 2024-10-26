/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolog4j;

import java.net.URL;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 *
 * @author march
 */
public class Conexion {
    
    static  Logger log =Logger.getLogger(Conexion.class);
//    URL url = Conexion.class.getResource("Log4j.properties");
    
    public void conectar(int num){
        
//        PropertyConfigurator.configure(url);
        
        if(num == 0){
            //conexion fue exiosa
            log.info("La conexion fue exitosa");
        }else if(num < 0){
            //warning un error puede suceder durante la conexion
            log.warn("Posiblemente suceda un error");
        }else{
            //error fatal 
            log.fatal("Ocurrio un error fatal");
        }
        
//        for (int i = 0; i < 90000; i++) {
//            log.fatal("numero"+i);
//            i=i++;
//        }
    }
}
