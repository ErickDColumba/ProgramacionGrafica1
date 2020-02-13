/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Muebles;

import BasicPrimitives.*;
import javax.media.opengl.GL;

/**
 *
 * @author EDCP
 */

/*Clase que dibuja una mesa */
public class Mesas {
 
    GL gl;
  
    Cilindro cil;
    Toro tor;
    
    

    public Mesas(GL gl) {
        this.gl = gl;
        this.cil= new Cilindro(gl,0.5f,0.5f,10,10,0.6f,0.3f,0.3f);
        this.tor = new Toro(gl,0.5f,1,10,10,0.1f,0.1f,0.6f);       
    }
    
    
    public void dibujarMesa (){
        gl.glPushMatrix();
            
            cil.dibujar();
        gl.glPopMatrix();
        
        gl.glPushMatrix();
            gl.glRotated(90, 1, 0, 0);
            gl.glScaled(0.5, 0.5, 0.25);
            tor.dibujar();
        gl.glPopMatrix();
    
    }
    
    
    
    
    
}
