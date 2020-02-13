/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructuraPartes.Paredes;

import javax.media.opengl.GL;

/**
 *
 * @author EDCP
 */
public class ParedIzquierda {
    /*Clase que dibuja las paredes de la parte frontal izqueirda y derecha  */
    
     GL gl;
    float r,g,b;

    public ParedIzquierda(GL gl, float r, float g, float b) {
        this.gl = gl;
        this.r = r;
        this.g = g;
        this.b = b;
    }
    
    public void dibujarIzquierda(){
        
gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.266381f,0.000000f,-1.802367f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.098442f,0.000000f,-1.802367f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.098442f,0.250000f,-1.802367f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.266380f,0.250000f,-1.802367f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.772007f,-0.000000f,-0.627085f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.266380f,0.000000f,-1.802367f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.266380f,0.250000f,-1.802367f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.772007f,0.250000f,-0.627085f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.098442f,0.000000f,-1.802367f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.098442f,0.250000f,-1.802367f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.098442f,0.250000f,-0.852064f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.098442f,0.000000f,-0.852064f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.086249f,0.000000f,-1.802367f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.086249f,0.000000f,-0.852064f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.086249f,0.250000f,-0.852064f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.086249f,0.250000f,-1.802367f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.098442f,0.250000f,-0.852064f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.098442f,0.250000f,-1.802367f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.086249f,0.250000f,-1.802367f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.086249f,0.250000f,-0.852064f);
gl.glEnd();
    
    
    }
    

    
}
