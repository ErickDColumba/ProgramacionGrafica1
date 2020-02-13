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
public class Piso003 {
    /*Clase que Dibunja la parte delantera derecha de la nave*/
    GL gl;
    float r,g,b;
    Piso001 piso;

    public Piso003(GL gl, float r, float g, float b) {
        this.gl = gl;
        this.r = r;
        this.g = g;
        this.b = b;
       
    
    }
    
    //Dibuja el lado izquierdo de la parte delantera
    public void  dibujarIzquierda (){
   
    
    gl.glBegin(gl.GL_POLYGON); 
       
      gl.glColor3f(r-0.1f, g-0.1f, b-0.1f); gl.glVertex3f(0.811628f, 0.000000f, -0.534992f);    
       gl.glColor3f(r, g, b); gl.glVertex3f(0.098442f, 0.000000f, -0.534992f);
      gl.glColor3f(r-0.1f, g-0.1f, b-0.1f); gl.glVertex3f(0.098442f, 0.000000f, -1.802367f);
     gl.glColor3f(r, g, b);   gl.glVertex3f(0.266381f, 0.000000f, -1.802367f); 

    gl.glEnd();
    
    }
    
  //Dibuja el lado derecho de la parte delantera
    public void diujarDerecha (){
        

        gl.glBegin(gl.GL_POLYGON); 

          gl.glColor3f(r-0.1f, g-0.1f, b-0.1f); gl.glVertex3f(-0.107287f, 0.000000f, -1.802367f);
         gl.glColor3f(r, g, b);  gl.glVertex3f(-0.107287f, 0.000000f, -0.534992f);
          gl.glColor3f(r-0.1f, g-0.1f, b-0.1f); gl.glVertex3f( -0.820473f, 0.000000f, -0.534992f);     
         gl.glColor3f(r, g, b);  gl.glVertex3f(-0.275225f, 0.000000f, -1.802367f);

         gl.glEnd();  
    }
    
   
    
    
    
    
    
    
}
  
    

