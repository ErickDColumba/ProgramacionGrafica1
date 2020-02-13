/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructuraPartes.Piso;

import javax.media.opengl.GL;

/**
 *
 * @author EDCP
 */
public class Piso002 {
    
    
    /*Clase que dibuja un rectangulo central en el piso de nave */
    
    GL gl;
    float r,g,b;

    public Piso002(GL gl, float r, float g, float b) {
        this.gl = gl;
        this.r = r;
        this.g = g;
        this.b = b;
    
    }
    
    
    
    public void dibujar (){
    
    
   
    gl.glBegin(gl.GL_POLYGON); 
   
        gl.glColor3f(r-0.1f, g-0.1f, b-0.1f);gl.glVertex3f(-0.746462f, 0.000000f,-0.195090f);
       gl.glColor3f(r, g, b);gl.glVertex3f(-0.746462f, 0.000000f, 0.195090f);  
        gl.glColor3f(r-0.1f, g-0.1f, b-0.1f);gl.glVertex3f( 0.746462f, 0.000000f, 0.195090f);      
      gl.glColor3f(r, g, b); gl.glVertex3f(0.746462f, 0.000000f, -0.195090f);
  

    gl.glEnd();
    
    
    }
}
