/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicPrimitives;

import com.sun.opengl.util.GLUT;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

/**
 *
 * @author EDCP
 */
public class Cilindro {
    GL gl ;
    float radio , altura;
    int xc,yc;
    float r,g,b;
 

    public Cilindro(GL gl, float radio, float altura, int xc, int yc, float r, float g, float b) {
        this.gl = gl;
        this.radio = radio;
        this.altura = altura;
        this.xc = xc;
        this.yc = yc;
        this.r = r;
        this.g = g;
        this.b = b;
     
    }

   
    
    public void dibujar (){
    
        GLUT glut = new GLUT();
        gl.glColor3f(r, g, b);
        gl.glRotated(90, 1, 0, 0);
        glut.glutSolidCylinder(radio,altura , xc, yc);
      //  gl.glColor3f(0, 0, 0);
        //glut.glutWireCylinder(radio, altura, xc, yc);

    }
    
    
}
