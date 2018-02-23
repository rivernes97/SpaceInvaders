/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author xp
 */
public class Nave {
    public Image imagen = null ;
    public int x=0;
    public int y =0;
    private boolean pulsadoIzquierda = false;
    private boolean pulsadoDerecho = false;
    
    public Nave(){
        try {
            imagen =ImageIO.read(getClass().getResource("/imagenes/nave.png"));
            
        }      
        catch (IOException ramon){
            
        }
    }

    public boolean isPulsadoIzquierda() {
        return pulsadoIzquierda;
    }

    public void setPulsadoIzquierda(boolean pulsadoIzquierda) {
        this.pulsadoIzquierda = pulsadoIzquierda;
    }

    public boolean isPulsadoDerecho() {
        return pulsadoDerecho;
    }

    public void setPulsadoDerecho(boolean pulsadoDerecho) {
        this.pulsadoDerecho = pulsadoDerecho;
    }
    
    public void mueve(){
        if(pulsadoIzquierda && x>0){
        x--;
    }
    }
    //T5ODO falta mover al lado derecho 
    
    
    
}
