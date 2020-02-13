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
public class Cono {
    GL gl;
    float h,l;
    float r,g,b;
    

    public Cono(GL gl, float h, float l, float r, float g, float b) {
        this.gl = gl;
        this.h = h;
        this.l = l;
        this.r = r;
        this.g = g;
        this.b = b;
       
    }
    
  public void diujar (){
   
        GLUT glut=new GLUT();     
        gl.glColor3f(r, g,b);        
        glut.glutSolidCone(1, 1, 50, 50);
        
  }
    
    
}
