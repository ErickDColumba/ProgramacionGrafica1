/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructuraPartes.Techo;

import javax.media.opengl.GL;

/**
 *
 * @author EDCP
 */
public class Techo003 {
    
    /*Clase que Dibunja la parte delantera derecha de la nave*/
    GL gl;
    float r,g,b;

    public Techo003(GL gl, float r, float g, float b) {
        this.gl = gl;
        this.r = r;
        this.g = g;
        this.b = b;
    }

    //Dibuja el lado Izquiedode la parte delantera  del techo
    public void  dibujarTecho01 (){
        gl.glColor3f(r, g, b);
    gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.133664f,0.250000f,0.277556f);
  gl.glVertex3f (0.240854f,0.306092f,0.192075f);
  gl.glVertex3f (0.240854f,0.250000f,0.192075f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.133664f,0.250000f,-0.277556f);
  gl.glVertex3f (-0.240854f,0.306092f,-0.192075f);
  gl.glVertex3f (-0.240854f,0.250000f,-0.192075f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.240854f,0.250000f,0.192075f);
  gl.glVertex3f (0.300340f,0.306092f,0.068551f);
  gl.glVertex3f (0.300340f,0.250000f,0.068551f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.240854f,0.250000f,-0.192075f);
  gl.glVertex3f (-0.300340f,0.306092f,-0.068551f);
  gl.glVertex3f (-0.300340f,0.250000f,-0.068551f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.300340f,0.250000f,0.068551f);
  gl.glVertex3f (0.300340f,0.306092f,-0.068551f);
  gl.glVertex3f (0.300340f,0.250000f,-0.068551f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.300340f,0.250000f,-0.068551f);
  gl.glVertex3f (-0.300340f,0.306092f,0.068551f);
  gl.glVertex3f (-0.300340f,0.250000f,0.068551f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.300340f,0.250000f,-0.068551f);
  gl.glVertex3f (0.240854f,0.306092f,-0.192075f);
  gl.glVertex3f (0.240854f,0.250000f,-0.192075f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.300340f,0.250000f,0.068551f);
  gl.glVertex3f (-0.240854f,0.306092f,0.192075f);
  gl.glVertex3f (-0.240854f,0.250000f,0.192075f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.240854f,0.250000f,-0.192075f);
  gl.glVertex3f (0.133664f,0.306092f,-0.277556f);
  gl.glVertex3f (0.133664f,0.250000f,-0.277556f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.240854f,0.250000f,0.192075f);
  gl.glVertex3f (-0.133664f,0.306092f,0.277556f);
  gl.glVertex3f (-0.133664f,0.250000f,0.277556f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.133664f,0.250000f,-0.277556f);
  gl.glVertex3f (0.000000f,0.306092f,-0.308064f);
  gl.glVertex3f (0.000000f,0.250000f,-0.308064f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.133664f,0.250000f,0.277556f);
  gl.glVertex3f (-0.000000f,0.306092f,0.308064f);
  gl.glVertex3f (-0.000000f,0.250000f,0.308064f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.000000f,0.250000f,0.308064f);
  gl.glVertex3f (0.133664f,0.306092f,0.277556f);
  gl.glVertex3f (0.133664f,0.250000f,0.277556f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.000000f,0.250000f,-0.308064f);
  gl.glVertex3f (-0.133664f,0.306092f,-0.277556f);
  gl.glVertex3f (-0.133664f,0.250000f,-0.277556f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.300340f,0.306092f,-0.068551f);
  gl.glVertex3f (0.190646f,0.306092f,-0.152035f);
  gl.glVertex3f (0.240854f,0.306092f,-0.192075f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.300340f,0.306092f,0.068551f);
  gl.glVertex3f (-0.190646f,0.306092f,0.152035f);
  gl.glVertex3f (-0.240854f,0.306092f,0.192075f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.240854f,0.306092f,-0.192075f);
  gl.glVertex3f (0.105800f,0.306092f,-0.219697f);
  gl.glVertex3f (0.133664f,0.306092f,-0.277556f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.240854f,0.306092f,0.192075f);
  gl.glVertex3f (-0.105800f,0.306092f,0.219697f);
  gl.glVertex3f (-0.133664f,0.306092f,0.277556f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.133664f,0.306092f,-0.277556f);
  gl.glVertex3f (-0.000000f,0.306092f,-0.243845f);
  gl.glVertex3f (0.000000f,0.306092f,-0.308064f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.133664f,0.306092f,0.277556f);
  gl.glVertex3f (-0.000000f,0.306092f,0.243845f);
  gl.glVertex3f (-0.000000f,0.306092f,0.308064f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.000000f,0.306092f,0.308064f);
  gl.glVertex3f (0.105800f,0.306092f,0.219697f);
  gl.glVertex3f (0.133664f,0.306092f,0.277556f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.133664f,0.306092f,-0.277556f);
  gl.glVertex3f (-0.000000f,0.306092f,-0.243845f);
  gl.glVertex3f (-0.105800f,0.306092f,-0.219697f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.133664f,0.306092f,0.277556f);
  gl.glVertex3f (0.190646f,0.306092f,0.152035f);
  gl.glVertex3f (0.240854f,0.306092f,0.192075f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.240854f,0.306092f,-0.192075f);
  gl.glVertex3f (-0.105800f,0.306092f,-0.219697f);
  gl.glVertex3f (-0.190646f,0.306092f,-0.152035f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.240854f,0.306092f,0.192075f);
  gl.glVertex3f (0.237731f,0.306092f,0.054261f);
  gl.glVertex3f (0.300340f,0.306092f,0.068551f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.300340f,0.306092f,-0.068551f);
  gl.glVertex3f (-0.190646f,0.306092f,-0.152035f);
  gl.glVertex3f (-0.237731f,0.306092f,-0.054261f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.300340f,0.306092f,0.068551f);
  gl.glVertex3f (0.237731f,0.306092f,-0.054261f);
  gl.glVertex3f (0.300340f,0.306092f,-0.068551f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.300340f,0.306092f,0.068551f);
  gl.glVertex3f (-0.237731f,0.306092f,-0.054261f);
  gl.glVertex3f (-0.237731f,0.306092f,0.054261f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.133664f,0.250000f,0.277556f);
  gl.glVertex3f (0.133664f,0.306092f,0.277556f);
  gl.glVertex3f (0.240854f,0.306092f,0.192075f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.133664f,0.250000f,-0.277556f);
  gl.glVertex3f (-0.133664f,0.306092f,-0.277556f);
  gl.glVertex3f (-0.240854f,0.306092f,-0.192075f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.240854f,0.250000f,0.192075f);
  gl.glVertex3f (0.240854f,0.306092f,0.192075f);
  gl.glVertex3f (0.300340f,0.306092f,0.068551f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.240854f,0.250000f,-0.192075f);
  gl.glVertex3f (-0.240854f,0.306092f,-0.192075f);
  gl.glVertex3f (-0.300340f,0.306092f,-0.068551f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.300340f,0.250000f,0.068551f);
  gl.glVertex3f (0.300340f,0.306092f,0.068551f);
  gl.glVertex3f (0.300340f,0.306092f,-0.068551f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.300340f,0.250000f,-0.068551f);
  gl.glVertex3f (-0.300340f,0.306092f,-0.068551f);
  gl.glVertex3f (-0.300340f,0.306092f,0.068551f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.300340f,0.250000f,-0.068551f);
  gl.glVertex3f (0.300340f,0.306092f,-0.068551f);
  gl.glVertex3f (0.240854f,0.306092f,-0.192075f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.300340f,0.250000f,0.068551f);
  gl.glVertex3f (-0.300340f,0.306092f,0.068551f);
  gl.glVertex3f (-0.240854f,0.306092f,0.192075f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.240854f,0.250000f,-0.192075f);
  gl.glVertex3f (0.240854f,0.306092f,-0.192075f);
  gl.glVertex3f (0.133664f,0.306092f,-0.277556f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.240854f,0.250000f,0.192075f);
  gl.glVertex3f (-0.240854f,0.306092f,0.192075f);
  gl.glVertex3f (-0.133664f,0.306092f,0.277556f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.133664f,0.250000f,-0.277556f);
  gl.glVertex3f (0.133664f,0.306092f,-0.277556f);
  gl.glVertex3f (0.000000f,0.306092f,-0.308064f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.133664f,0.250000f,0.277556f);
  gl.glVertex3f (-0.133664f,0.306092f,0.277556f);
  gl.glVertex3f (-0.000000f,0.306092f,0.308064f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.000000f,0.250000f,0.308064f);
  gl.glVertex3f (-0.000000f,0.306092f,0.308064f);
  gl.glVertex3f (0.133664f,0.306092f,0.277556f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.000000f,0.250000f,-0.308064f);
  gl.glVertex3f (0.000000f,0.306092f,-0.308064f);
  gl.glVertex3f (-0.133664f,0.306092f,-0.277556f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.300340f,0.306092f,-0.068551f);
  gl.glVertex3f (0.237731f,0.306092f,-0.054261f);
  gl.glVertex3f (0.190646f,0.306092f,-0.152035f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.300340f,0.306092f,0.068551f);
  gl.glVertex3f (-0.237731f,0.306092f,0.054261f);
  gl.glVertex3f (-0.190646f,0.306092f,0.152035f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.240854f,0.306092f,-0.192075f);
  gl.glVertex3f (0.190646f,0.306092f,-0.152035f);
  gl.glVertex3f (0.105800f,0.306092f,-0.219697f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.240854f,0.306092f,0.192075f);
  gl.glVertex3f (-0.190646f,0.306092f,0.152035f);
  gl.glVertex3f (-0.105800f,0.306092f,0.219697f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.133664f,0.306092f,-0.277556f);
  gl.glVertex3f (0.105800f,0.306092f,-0.219697f);
  gl.glVertex3f (-0.000000f,0.306092f,-0.243845f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.133664f,0.306092f,0.277556f);
  gl.glVertex3f (-0.105800f,0.306092f,0.219697f);
  gl.glVertex3f (-0.000000f,0.306092f,0.243845f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.000000f,0.306092f,0.308064f);
  gl.glVertex3f (-0.000000f,0.306092f,0.243845f);
  gl.glVertex3f (0.105800f,0.306092f,0.219697f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.133664f,0.306092f,-0.277556f);
  gl.glVertex3f (0.000000f,0.306092f,-0.308064f);
  gl.glVertex3f (-0.000000f,0.306092f,-0.243845f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.133664f,0.306092f,0.277556f);
  gl.glVertex3f (0.105800f,0.306092f,0.219697f);
  gl.glVertex3f (0.190646f,0.306092f,0.152035f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.240854f,0.306092f,-0.192075f);
  gl.glVertex3f (-0.133664f,0.306092f,-0.277556f);
  gl.glVertex3f (-0.105800f,0.306092f,-0.219697f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.240854f,0.306092f,0.192075f);
  gl.glVertex3f (0.190646f,0.306092f,0.152035f);
  gl.glVertex3f (0.237731f,0.306092f,0.054261f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.300340f,0.306092f,-0.068551f);
  gl.glVertex3f (-0.240854f,0.306092f,-0.192075f);
  gl.glVertex3f (-0.190646f,0.306092f,-0.152035f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.300340f,0.306092f,0.068551f);
  gl.glVertex3f (0.237731f,0.306092f,0.054261f);
  gl.glVertex3f (0.237731f,0.306092f,-0.054261f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.300340f,0.306092f,0.068551f);
  gl.glVertex3f (-0.300340f,0.306092f,-0.068551f);
  gl.glVertex3f (-0.237731f,0.306092f,-0.054261f);
gl.glEnd();



    }
    
    
      //Dibuja el lado Izquiedode la parte delantera  del techo
    public void  dibujarTecho02 (){
        gl.glColor3f(r-0.1f, g-0.1f, b-0.1f);
        
          gl.glVertex3f (-0.190646f,0.306092f,0.152035f);
  gl.glVertex3f (-0.105800f,0.354442f,0.219697f);
  gl.glVertex3f (-0.105800f,0.306092f,0.219697f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.190646f,0.354442f,-0.152035f);
  gl.glVertex3f (0.105800f,0.354442f,0.219697f);
  gl.glVertex3f (-0.237731f,0.354442f,0.054261f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.105800f,0.306092f,-0.219697f);
  gl.glVertex3f (-0.000000f,0.354442f,-0.243845f);
  gl.glVertex3f (-0.000000f,0.306092f,-0.243845f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.105800f,0.306092f,0.219697f);
  gl.glVertex3f (-0.000000f,0.354442f,0.243845f);
  gl.glVertex3f (-0.000000f,0.306092f,0.243845f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.000000f,0.306092f,0.243845f);
  gl.glVertex3f (0.105800f,0.354442f,0.219697f);
  gl.glVertex3f (0.105800f,0.306092f,0.219697f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.000000f,0.306092f,-0.243845f);
  gl.glVertex3f (-0.105800f,0.354442f,-0.219697f);
  gl.glVertex3f (-0.105800f,0.306092f,-0.219697f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.105800f,0.306092f,0.219697f);
  gl.glVertex3f (0.190646f,0.354442f,0.152035f);
  gl.glVertex3f (0.190646f,0.306092f,0.152035f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.105800f,0.306092f,-0.219697f);
  gl.glVertex3f (-0.190646f,0.354442f,-0.152035f);
  gl.glVertex3f (-0.190646f,0.306092f,-0.152035f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.190646f,0.306092f,0.152035f);
  gl.glVertex3f (0.237731f,0.354442f,0.054261f);
  gl.glVertex3f (0.237731f,0.306092f,0.054261f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.190646f,0.306092f,-0.152035f);
  gl.glVertex3f (-0.237731f,0.354442f,-0.054261f);
  gl.glVertex3f (-0.237731f,0.306092f,-0.054261f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.237731f,0.306092f,0.054261f);
  gl.glVertex3f (0.237731f,0.354442f,-0.054261f);
  gl.glVertex3f (0.237731f,0.306092f,-0.054261f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.237731f,0.306092f,-0.054261f);
  gl.glVertex3f (-0.237731f,0.354442f,0.054261f);
  gl.glVertex3f (-0.237731f,0.306092f,0.054261f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.237731f,0.306092f,-0.054261f);
  gl.glVertex3f (0.190646f,0.354442f,-0.152035f);
  gl.glVertex3f (0.190646f,0.306092f,-0.152035f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.237731f,0.306092f,0.054261f);
  gl.glVertex3f (-0.190646f,0.354442f,0.152035f);
  gl.glVertex3f (-0.190646f,0.306092f,0.152035f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.190646f,0.306092f,-0.152035f);
  gl.glVertex3f (0.105800f,0.354442f,-0.219697f);
  gl.glVertex3f (0.105800f,0.306092f,-0.219697f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.190646f,0.306092f,0.152035f);
  gl.glVertex3f (-0.190646f,0.354442f,0.152035f);
  gl.glVertex3f (-0.105800f,0.354442f,0.219697f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.190646f,0.354442f,-0.152035f);
  gl.glVertex3f (-0.105800f,0.354442f,-0.219697f);
  gl.glVertex3f (-0.000000f,0.354442f,-0.243845f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.000000f,0.354442f,-0.243845f);
  gl.glVertex3f (0.105800f,0.354442f,-0.219697f);
  gl.glVertex3f (0.190646f,0.354442f,-0.152035f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.190646f,0.354442f,-0.152035f);
  gl.glVertex3f (0.237731f,0.354442f,-0.054261f);
  gl.glVertex3f (0.237731f,0.354442f,0.054261f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.237731f,0.354442f,0.054261f);
  gl.glVertex3f (0.190646f,0.354442f,0.152035f);
  gl.glVertex3f (0.105800f,0.354442f,0.219697f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.105800f,0.354442f,0.219697f);
  gl.glVertex3f (-0.000000f,0.354442f,0.243845f);
  gl.glVertex3f (-0.105800f,0.354442f,0.219697f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.105800f,0.354442f,0.219697f);
  gl.glVertex3f (-0.190646f,0.354442f,0.152035f);
  gl.glVertex3f (0.105800f,0.354442f,0.219697f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.190646f,0.354442f,0.152035f);
  gl.glVertex3f (-0.237731f,0.354442f,0.054261f);
  gl.glVertex3f (0.105800f,0.354442f,0.219697f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.237731f,0.354442f,0.054261f);
  gl.glVertex3f (-0.237731f,0.354442f,-0.054261f);
  gl.glVertex3f (-0.190646f,0.354442f,-0.152035f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.190646f,0.354442f,-0.152035f);
  gl.glVertex3f (-0.000000f,0.354442f,-0.243845f);
  gl.glVertex3f (0.190646f,0.354442f,-0.152035f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.190646f,0.354442f,-0.152035f);
  gl.glVertex3f (0.237731f,0.354442f,0.054261f);
  gl.glVertex3f (0.105800f,0.354442f,0.219697f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.237731f,0.354442f,0.054261f);
  gl.glVertex3f (-0.190646f,0.354442f,-0.152035f);
  gl.glVertex3f (0.190646f,0.354442f,-0.152035f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.105800f,0.306092f,-0.219697f);
  gl.glVertex3f (0.105800f,0.354442f,-0.219697f);
  gl.glVertex3f (-0.000000f,0.354442f,-0.243845f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.105800f,0.306092f,0.219697f);
  gl.glVertex3f (-0.105800f,0.354442f,0.219697f);
  gl.glVertex3f (-0.000000f,0.354442f,0.243845f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.000000f,0.306092f,0.243845f);
  gl.glVertex3f (-0.000000f,0.354442f,0.243845f);
  gl.glVertex3f (0.105800f,0.354442f,0.219697f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.000000f,0.306092f,-0.243845f);
  gl.glVertex3f (-0.000000f,0.354442f,-0.243845f);
  gl.glVertex3f (-0.105800f,0.354442f,-0.219697f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.105800f,0.306092f,0.219697f);
  gl.glVertex3f (0.105800f,0.354442f,0.219697f);
  gl.glVertex3f (0.190646f,0.354442f,0.152035f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.105800f,0.306092f,-0.219697f);
  gl.glVertex3f (-0.105800f,0.354442f,-0.219697f);
  gl.glVertex3f (-0.190646f,0.354442f,-0.152035f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.190646f,0.306092f,0.152035f);
  gl.glVertex3f (0.190646f,0.354442f,0.152035f);
  gl.glVertex3f (0.237731f,0.354442f,0.054261f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.190646f,0.306092f,-0.152035f);
  gl.glVertex3f (-0.190646f,0.354442f,-0.152035f);
  gl.glVertex3f (-0.237731f,0.354442f,-0.054261f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.237731f,0.306092f,0.054261f);
  gl.glVertex3f (0.237731f,0.354442f,0.054261f);
  gl.glVertex3f (0.237731f,0.354442f,-0.054261f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.237731f,0.306092f,-0.054261f);
  gl.glVertex3f (-0.237731f,0.354442f,-0.054261f);
  gl.glVertex3f (-0.237731f,0.354442f,0.054261f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.237731f,0.306092f,-0.054261f);
  gl.glVertex3f (0.237731f,0.354442f,-0.054261f);
  gl.glVertex3f (0.190646f,0.354442f,-0.152035f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.237731f,0.306092f,0.054261f);
  gl.glVertex3f (-0.237731f,0.354442f,0.054261f);
  gl.glVertex3f (-0.190646f,0.354442f,0.152035f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.190646f,0.306092f,-0.152035f);
  gl.glVertex3f (0.190646f,0.354442f,-0.152035f);
  gl.glVertex3f (0.105800f,0.354442f,-0.219697f);
gl.glEnd();
    
    }
    
}
