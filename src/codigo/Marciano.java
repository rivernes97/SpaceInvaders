/*
 * Clase para el marciano  
 */
package codigo;

import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author xp
 */
public class Marciano {
    public Image imagen = null ;
    public Image imagen2 = null ;
    public int x=0;
    public int y =0;
   
    private int AnchoPantalla;
    public boolean direccion = false ;//si es false se mueve a la izquierda  
    
    public Marciano(int _anchoPantalla){
        try {
            imagen =ImageIO.read(getClass().getResource("/imagenes/marcianito1.png"));
             imagen2 =ImageIO.read(getClass().getResource("/imagenes/marcianito2.png"));
        }      
        catch (IOException ramon){
            
        }
        AnchoPantalla = _anchoPantalla;
    }

 
    public void mueve(){
        if (direccion) {
            
        
        if(x < AnchoPantalla - imagen.getWidth(null) && direccion == true){
            x++;
        }
    
    }
        else {
            if(x > 0){
                x--;
            }
        }
    }
}

    
    

