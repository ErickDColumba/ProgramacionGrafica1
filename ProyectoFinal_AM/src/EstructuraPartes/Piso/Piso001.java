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
public class Piso001 {
    
    /*Clase que Dibuja un semi cerculo parte el piso */
    GL gl;
    float r,g,b;

    public Piso001(GL gl, float r, float g, float b) {
        this.gl = gl;
        this.r = r;
        this.g = g;
        this.b = b;
    }
   
    
    
    
    public void  dibujar (){
        
   
    gl.glBegin(gl.GL_TRIANGLE_FAN); 
   
         gl.glColor3f(r-0.1f, g-0.1f, b-0.1f);gl.glVertex3f ( -0.980785f, 0.000000f, -0.195090f);
        gl.glColor3f(r, g, b); gl.glVertex3f ( -0.923880f, 0.000000f, -0.382683f);
         gl.glColor3f(r-0.1f, g-0.1f, b-0.1f);gl.glVertex3f (-0.831470f, 0.000000f, -0.555570f);
        gl.glColor3f(r, g, b); gl.glVertex3f ( -0.707107f, 0.000000f, -0.707107f);
        gl.glColor3f(r-0.1f, g-0.1f, b-0.1f); gl.glVertex3f ( -0.555570f, 0.000000f, -0.831470f);
        gl.glColor3f(r, g, b); gl.glVertex3f ( -0.382683f, 0.000000f, -0.923880f);
         gl.glColor3f(r-0.1f, g-0.1f, b-0.1f);gl.glVertex3f ( -0.195090f, 0.000000f, -0.980785f);
         gl.glColor3f(r, g, b);gl.glVertex3f ( -0.000000f, 0.000000f, -1.000000f);
         gl.glColor3f(r-0.1f, g-0.1f, b-0.1f);gl.glVertex3f ( 0.195090f, 0.000000f, -0.980785f);
         gl.glColor3f(r, g, b);gl.glVertex3f (  0.382683f, 0.000000f, -0.923880f);
         gl.glColor3f(r-0.1f, g-0.1f, b-0.1f);gl.glVertex3f ( 0.555570f, 0.000000f, -0.831470f);
        gl.glColor3f(r, g, b);gl.glVertex3f ( 0.707107f, 0.000000f, -0.707107f);
         gl.glColor3f(r-0.1f, g-0.1f, b-0.1f);gl.glVertex3f ( 0.831470f, 0.000000f, -0.555570f);
         gl.glColor3f(r, g, b);gl.glVertex3f ( 0.923880f, 0.000000f, -0.382683f);
        gl.glColor3f(r-0.1f, g-0.1f, b-0.1f);gl.glVertex3f ( 0.980785f, 0.000000f, -0.195090f); 

    gl.glEnd();
    
    
    
    }
    
    
    
    public void dibujaralreves (){
    
        gl.glColor3f(r, g, b);

        gl.glPushMatrix();
            gl.glRotated(180, 0, 1, 0);
            dibujar();
        gl.glPopMatrix();

    
    }
    
    
    
}
