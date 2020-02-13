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
public class Toro {
    GL gl;
    float rinterno,rextrerno;
    int xt,yt;
    float r,g,b;
    

    public Toro(GL gl, float rinterno, float rextrerno, int xt, int yt, float r, float g, float b) {
        this.gl = gl;
        this.rinterno = rinterno;
        this.rextrerno = rextrerno;
        this.xt = xt;
        this.yt = yt;
        this.r = r;
        this.g = g;
        this.b = b;
       
    }
    
    public void dibujar (){
        
        GLUT glut = new GLUT();
        gl.glColor3f(r, g, b);
        glut.glutSolidTorus(rinterno, rextrerno, xt, yt);
        /*gl.glColor3f(0, 0, 0);
        glut.glutWireTorus(rinterno, rinterno, xt, yt);*/
        
        
    }
}
