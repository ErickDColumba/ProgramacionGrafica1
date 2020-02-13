/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Muebles;

import BasicPrimitives.*;
import com.sun.opengl.util.GLUT;
import javax.media.opengl.GL;

/**
 *
 * @author EDCP
 */
public class Caja {
    
   
    GL gl;
   
  
    float r,g,b;
    float x,y,z;

    public Caja(GL gl, float r, float g, float b) {
        this.gl = gl;
       
        this.r = r;
        this.g = g;
        this.b = b;
    }
  
    
    
    
    public void dibujarCaja (float tamaño){
       
        GLUT glut=new GLUT();
        gl.glColor3f(r,g,b );
        glut.glutSolidCube(tamaño);
        gl.glLineWidth(6);
        gl.glColor3f(r-0.1f, g-0.1f,b-0.1f);
        glut.glutWireCube(tamaño);
        
    }
    
    
}
