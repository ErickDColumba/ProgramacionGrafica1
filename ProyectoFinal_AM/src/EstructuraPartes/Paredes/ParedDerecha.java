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
public class ParedDerecha {
    
    
    GL gl;
    float r,g,b;

    public ParedDerecha(GL gl, float r, float g, float b) {
        this.gl = gl;
        this.r = r;
        this.g = g;
        this.b = b;
    }
    
    
    
    public void dibujarDerecha (){
        gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.789902f,0.000000f,-0.606049f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.275225f,0.000000f,-1.802367f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.275225f,0.250000f,-1.802367f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.789902f,0.250000f,-0.606049f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.275225f,0.000000f,-1.802367f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.107287f,0.000000f,-1.802367f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.107287f,0.250000f,-1.802367f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.275225f,0.250000f,-1.802367f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.107287f,0.250000f,-0.840493f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.107287f,0.000000f,-0.840493f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.107287f,0.000000f,-1.802367f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.107287f,0.250000f,-1.802367f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.119481f,0.250000f,-0.840493f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.119481f,0.250000f,-1.802367f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.119481f,0.000000f,-1.802367f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.119481f,0.000000f,-0.840493f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.107287f,0.250000f,-0.840493f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.107287f,0.250000f,-1.802367f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.119481f,0.250000f,-1.802367f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.119481f,0.250000f,-0.840493f);
gl.glEnd();

    }
}
