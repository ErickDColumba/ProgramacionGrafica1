/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicPrimitives;
import com.sun.opengl.util.GLUT;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;


/**
 *
 * @author EDCP
 */
public class Cubo{

     
    public  GL gl;
    public  float size;
    public float r,g,b;
   

    public Cubo(GL gl, float size, float r, float g, float b) {
        this.gl = gl;
        this.size = size;
        this.r = r;
        this.g = g;
        this.b = b;
        
    }

    public void dibujar() {
        
        GLUT glut=new GLUT();
        gl.glColor3f(r, g, b);
        glut.glutSolidCube(size);
        gl.glColor3f(r-0.1f, g-0.1f,b-0.1f);
        glut.glutWireCube(size);
        
    }
    
   

   
}