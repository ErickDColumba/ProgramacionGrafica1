/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicPrimitives;


import com.sun.opengl.util.GLUT;
import javax.media.opengl.GL;

/**
 *
 * @author EDCP
 */
public class Esfera {

     GL gl;
     float size;
     int xe,ye; 
      float r,g,b;
      float x,y,z;

    public Esfera(GL gl, float size, int xe, int ye, float r, float g, float b, float x, float y, float z) {
        this.gl = gl;
        this.size = size;
        this.xe = xe;
        this.ye = ye;
        this.r = r;
        this.g = g;
        this.b = b;
        this.x = x;
        this.y = y;
        this.z = z;
    }
   
   
   
    public void dibujar() {
        
        GLUT glut=new GLUT();
        gl.glColor3f(r, g, b);
        gl.glTranslated(x, y, z);
        glut.glutSolidSphere(size,xe,ye);
        
    }
   
 
    
    
    
}
