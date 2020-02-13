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
public class Asiento {
    GL gl;
    Cubo cu;
    Toro tor;
    

    public Asiento (GL gl) {
        this.gl = gl;
        this.cu = new Cubo (gl,1,0.3f,0.3f,0.3f);
        this.tor = new Toro(gl,0.5f,1,10,10,0.3f,0.3f,0.3f);
        
    }
    
    
    public void dibujarAsiento (){
        gl.glPushMatrix();
        gl.glScaled(0.5,1, 0.5);
            cu.dibujar();
            
        gl.glPopMatrix();
        
        gl.glPushMatrix();
        gl.glTranslated(0, 0.5, 0);
            gl.glRotated(90, 1, 0, 0);
            gl.glScaled(0.5, 0.5, 0.25);
            tor.dibujar();
        gl.glPopMatrix();
    
    }
    
    
    
}
