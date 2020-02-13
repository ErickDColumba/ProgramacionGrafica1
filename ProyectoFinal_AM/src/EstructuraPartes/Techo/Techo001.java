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
public class Techo001 {
     
    /*Clase que Dibuja un semi cerculo parte el techo */
    
    
    GL gl;
    float r,g,b;

    public Techo001(GL gl, float r, float g, float b) {
        this.gl = gl;
        this.r = r;
        this.g = g;
        this.b = b;
    }
    
     public void  dibujarTecho01 (){
        
gl.glColor3f(r, g, b);
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.171766f,0.289897f,0.944450f);
  gl.glVertex3f (0.489147f,0.289897f,0.812987f);
  gl.glVertex3f (0.863524f,0.289897f,0.252692f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.624413f,0.278915f,-0.703572f);
  gl.glVertex3f (-0.866086f,0.278915f,-0.251434f);
  gl.glVertex3f (0.624413f,0.278915f,-0.703572f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.863524f,0.289897f,0.252692f);
  gl.glVertex3f (-0.813421f,0.289897f,0.417857f);
  gl.glVertex3f (-0.732060f,0.289897f,0.570074f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.732060f,0.289897f,0.570074f);
  gl.glVertex3f (-0.622566f,0.289897f,0.703493f);
  gl.glVertex3f (-0.489147f,0.289897f,0.812987f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.489147f,0.289897f,0.812987f);
  gl.glVertex3f (-0.336930f,0.289897f,0.894348f);
  gl.glVertex3f (-0.732060f,0.289897f,0.570074f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.336930f,0.289897f,0.894348f);
  gl.glVertex3f (-0.171766f,0.289897f,0.944450f);
  gl.glVertex3f (-0.732060f,0.289897f,0.570074f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.171766f,0.289897f,0.944450f);
  gl.glVertex3f (-0.000000f,0.289897f,0.961368f);
  gl.glVertex3f (0.171765f,0.289897f,0.944450f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.171765f,0.289897f,0.944450f);
  gl.glVertex3f (0.336930f,0.289897f,0.894348f);
  gl.glVertex3f (-0.171766f,0.289897f,0.944450f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.336930f,0.289897f,0.894348f);
  gl.glVertex3f (0.489147f,0.289897f,0.812987f);
  gl.glVertex3f (-0.171766f,0.289897f,0.944450f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.489147f,0.289897f,0.812987f);
  gl.glVertex3f (0.622566f,0.289897f,0.703493f);
  gl.glVertex3f (0.732060f,0.289897f,0.570074f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.732060f,0.289897f,0.570074f);
  gl.glVertex3f (0.813421f,0.289897f,0.417857f);
  gl.glVertex3f (0.863524f,0.289897f,0.252692f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.863524f,0.289897f,0.252692f);
  gl.glVertex3f (-0.863524f,0.289897f,0.252692f);
  gl.glVertex3f (-0.732060f,0.289897f,0.570074f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.489147f,0.289897f,0.812987f);
  gl.glVertex3f (0.732060f,0.289897f,0.570074f);
  gl.glVertex3f (0.863524f,0.289897f,0.252692f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.863524f,0.289897f,0.252692f);
  gl.glVertex3f (-0.732060f,0.289897f,0.570074f);
  gl.glVertex3f (-0.171766f,0.289897f,0.944450f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.734232f,0.278915f,-0.569757f);
  gl.glVertex3f (-0.815835f,0.278915f,-0.417088f);
  gl.glVertex3f (-0.866086f,0.278915f,-0.251434f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.866086f,0.278915f,-0.251434f);
  gl.glVertex3f (0.866086f,0.278915f,-0.251433f);
  gl.glVertex3f (0.624413f,0.278915f,-0.703572f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.866086f,0.278915f,-0.251433f);
  gl.glVertex3f (0.815835f,0.278915f,-0.417088f);
  gl.glVertex3f (0.624413f,0.278915f,-0.703572f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.815835f,0.278915f,-0.417088f);
  gl.glVertex3f (0.734232f,0.278915f,-0.569757f);
  gl.glVertex3f (0.624413f,0.278915f,-0.703572f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.624413f,0.278915f,-0.703572f);
  gl.glVertex3f (0.490598f,0.278915f,-0.813391f);
  gl.glVertex3f (0.337930f,0.278915f,-0.894994f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.337930f,0.278915f,-0.894994f);
  gl.glVertex3f (0.172275f,0.278915f,-0.945244f);
  gl.glVertex3f (-0.000000f,0.278915f,-0.962212f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.000000f,0.278915f,-0.962212f);
  gl.glVertex3f (-0.172275f,0.278915f,-0.945244f);
  gl.glVertex3f (-0.337930f,0.278915f,-0.894994f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.337930f,0.278915f,-0.894994f);
  gl.glVertex3f (-0.490598f,0.278915f,-0.813391f);
  gl.glVertex3f (-0.624413f,0.278915f,-0.703572f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.624413f,0.278915f,-0.703572f);
  gl.glVertex3f (-0.734232f,0.278915f,-0.569757f);
  gl.glVertex3f (-0.866086f,0.278915f,-0.251434f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.624413f,0.278915f,-0.703572f);
  gl.glVertex3f (0.337930f,0.278915f,-0.894994f);
  gl.glVertex3f (-0.000000f,0.278915f,-0.962212f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.000000f,0.278915f,-0.962212f);
  gl.glVertex3f (-0.337930f,0.278915f,-0.894994f);
  gl.glVertex3f (0.624413f,0.278915f,-0.703572f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.337930f,0.278915f,-0.894994f);
  gl.glVertex3f (-0.624413f,0.278915f,-0.703572f);
  gl.glVertex3f (0.624413f,0.278915f,-0.703572f);
gl.glEnd();
   }

     public void  dibujarTecho02 (){
        
gl.glColor3f(r-0.1f, g-0.1f, b-0.1f);
gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.555570f,0.250000f,0.831470f);
  gl.glVertex3f (0.707107f,0.250000f,0.707107f);
  gl.glVertex3f (0.622566f,0.289897f,0.703493f);
  gl.glVertex3f (0.489147f,0.289897f,0.812987f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.707107f,0.250000f,0.707107f);
  gl.glVertex3f (-0.555570f,0.250000f,0.831470f);
  gl.glVertex3f (-0.489147f,0.289897f,0.812987f);
  gl.glVertex3f (-0.622566f,0.289897f,0.703493f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.707107f,0.250000f,0.707107f);
  gl.glVertex3f (0.831470f,0.250000f,0.555570f);
  gl.glVertex3f (0.732060f,0.289897f,0.570074f);
  gl.glVertex3f (0.622566f,0.289897f,0.703493f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.555570f,0.250000f,0.831470f);
  gl.glVertex3f (-0.382683f,0.250000f,0.923880f);
  gl.glVertex3f (-0.336930f,0.289897f,0.894348f);
  gl.glVertex3f (-0.489147f,0.289897f,0.812987f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.831470f,0.250000f,0.555570f);
  gl.glVertex3f (0.923880f,0.250000f,0.382683f);
  gl.glVertex3f (0.813421f,0.289897f,0.417857f);
  gl.glVertex3f (0.732060f,0.289897f,0.570074f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.382683f,0.250000f,0.923880f);
  gl.glVertex3f (-0.195090f,0.250000f,0.980785f);
  gl.glVertex3f (-0.171766f,0.289897f,0.944450f);
  gl.glVertex3f (-0.336930f,0.289897f,0.894348f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.923880f,0.250000f,0.382683f);
  gl.glVertex3f (0.980785f,0.250000f,0.195090f);
  gl.glVertex3f (0.863524f,0.289897f,0.252692f);
  gl.glVertex3f (0.813421f,0.289897f,0.417857f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.195090f,0.250000f,0.980785f);
  gl.glVertex3f (-0.000000f,0.250000f,1.000000f);
  gl.glVertex3f (-0.000000f,0.289897f,0.961368f);
  gl.glVertex3f (-0.171766f,0.289897f,0.944450f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.980785f,0.250000f,0.195090f);
  gl.glVertex3f (-0.980785f,0.250000f,0.195090f);
  gl.glVertex3f (-0.863524f,0.289897f,0.252692f);
  gl.glVertex3f (0.863524f,0.289897f,0.252692f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.000000f,0.250000f,1.000000f);
  gl.glVertex3f (0.195090f,0.250000f,0.980785f);
  gl.glVertex3f (0.171765f,0.289897f,0.944450f);
  gl.glVertex3f (-0.000000f,0.289897f,0.961368f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.980785f,0.250000f,0.195090f);
  gl.glVertex3f (-0.923880f,0.250000f,0.382683f);
  gl.glVertex3f (-0.813421f,0.289897f,0.417857f);
  gl.glVertex3f (-0.863524f,0.289897f,0.252692f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.195090f,0.250000f,0.980785f);
  gl.glVertex3f (0.382683f,0.250000f,0.923880f);
  gl.glVertex3f (0.336930f,0.289897f,0.894348f);
  gl.glVertex3f (0.171765f,0.289897f,0.944450f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.923880f,0.250000f,0.382683f);
  gl.glVertex3f (-0.831470f,0.250000f,0.555570f);
  gl.glVertex3f (-0.732060f,0.289897f,0.570074f);
  gl.glVertex3f (-0.813421f,0.289897f,0.417857f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.382683f,0.250000f,0.923880f);
  gl.glVertex3f (0.555570f,0.250000f,0.831470f);
  gl.glVertex3f (0.489147f,0.289897f,0.812987f);
  gl.glVertex3f (0.336930f,0.289897f,0.894348f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.831470f,0.250000f,0.555570f);
  gl.glVertex3f (-0.707107f,0.250000f,0.707107f);
  gl.glVertex3f (-0.622566f,0.289897f,0.703493f);
  gl.glVertex3f (-0.732060f,0.289897f,0.570074f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.707107f,0.250000f,-0.707107f);
  gl.glVertex3f (0.555570f,0.250000f,-0.831470f);
  gl.glVertex3f (0.490598f,0.278915f,-0.813391f);
  gl.glVertex3f (0.624413f,0.278915f,-0.703572f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.555570f,0.250000f,-0.831470f);
  gl.glVertex3f (-0.707107f,0.250000f,-0.707107f);
  gl.glVertex3f (-0.624413f,0.278915f,-0.703572f);
  gl.glVertex3f (-0.490598f,0.278915f,-0.813391f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.831470f,0.250000f,-0.555570f);
  gl.glVertex3f (0.707107f,0.250000f,-0.707107f);
  gl.glVertex3f (0.624413f,0.278915f,-0.703572f);
  gl.glVertex3f (0.734232f,0.278915f,-0.569757f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.382683f,0.250000f,-0.923880f);
  gl.glVertex3f (-0.555570f,0.250000f,-0.831470f);
  gl.glVertex3f (-0.490598f,0.278915f,-0.813391f);
  gl.glVertex3f (-0.337930f,0.278915f,-0.894994f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.923880f,0.250000f,-0.382683f);
  gl.glVertex3f (0.831470f,0.250000f,-0.555570f);
  gl.glVertex3f (0.734232f,0.278915f,-0.569757f);
  gl.glVertex3f (0.815835f,0.278915f,-0.417088f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.195090f,0.250000f,-0.980785f);
  gl.glVertex3f (-0.382683f,0.250000f,-0.923880f);
  gl.glVertex3f (-0.337930f,0.278915f,-0.894994f);
  gl.glVertex3f (-0.172275f,0.278915f,-0.945244f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.980785f,0.250000f,-0.195090f);
  gl.glVertex3f (0.923880f,0.250000f,-0.382683f);
  gl.glVertex3f (0.815835f,0.278915f,-0.417088f);
  gl.glVertex3f (0.866086f,0.278915f,-0.251433f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.000000f,0.250000f,-1.000000f);
  gl.glVertex3f (-0.195090f,0.250000f,-0.980785f);
  gl.glVertex3f (-0.172275f,0.278915f,-0.945244f);
  gl.glVertex3f (-0.000000f,0.278915f,-0.962212f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.980785f,0.250000f,-0.195090f);
  gl.glVertex3f (0.980785f,0.250000f,-0.195090f);
  gl.glVertex3f (0.866086f,0.278915f,-0.251433f);
  gl.glVertex3f (-0.866086f,0.278915f,-0.251434f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.195090f,0.250000f,-0.980785f);
  gl.glVertex3f (-0.000000f,0.250000f,-1.000000f);
  gl.glVertex3f (-0.000000f,0.278915f,-0.962212f);
  gl.glVertex3f (0.172275f,0.278915f,-0.945244f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.923880f,0.250000f,-0.382683f);
  gl.glVertex3f (-0.980785f,0.250000f,-0.195090f);
  gl.glVertex3f (-0.866086f,0.278915f,-0.251434f);
  gl.glVertex3f (-0.815835f,0.278915f,-0.417088f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.382683f,0.250000f,-0.923880f);
  gl.glVertex3f (0.195090f,0.250000f,-0.980785f);
  gl.glVertex3f (0.172275f,0.278915f,-0.945244f);
  gl.glVertex3f (0.337930f,0.278915f,-0.894994f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.831470f,0.250000f,-0.555570f);
  gl.glVertex3f (-0.923880f,0.250000f,-0.382683f);
  gl.glVertex3f (-0.815835f,0.278915f,-0.417088f);
  gl.glVertex3f (-0.734232f,0.278915f,-0.569757f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.555570f,0.250000f,-0.831470f);
  gl.glVertex3f (0.382683f,0.250000f,-0.923880f);
  gl.glVertex3f (0.337930f,0.278915f,-0.894994f);
  gl.glVertex3f (0.490598f,0.278915f,-0.813391f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.707107f,0.250000f,-0.707107f);
  gl.glVertex3f (-0.831470f,0.250000f,-0.555570f);
  gl.glVertex3f (-0.734232f,0.278915f,-0.569757f);
  gl.glVertex3f (-0.624413f,0.278915f,-0.703572f);
gl.glEnd();
       
       
       }
public void  dibujarTecho03 (){
        
gl.glColor3f(r-0.1f, g-0.1f, b-0.1f);

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.141098f,0.286109f,0.759961f);
  gl.glVertex3f (-0.175782f,0.286109f,0.787620f);
  gl.glVertex3f (-0.175782f,0.304259f,0.787620f);
  gl.glVertex3f (-0.141098f,0.304259f,0.759961f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.296967f,0.286109f,0.635660f);
  gl.glVertex3f (-0.262283f,0.286109f,0.608000f);
  gl.glVertex3f (-0.262283f,0.304259f,0.608000f);
  gl.glVertex3f (-0.296967f,0.304259f,0.635660f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.121850f,0.286109f,0.719991f);
  gl.glVertex3f (-0.141098f,0.286109f,0.759961f);
  gl.glVertex3f (-0.141098f,0.304259f,0.759961f);
  gl.glVertex3f (-0.121850f,0.304259f,0.719991f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.316215f,0.286109f,0.675629f);
  gl.glVertex3f (-0.296967f,0.286109f,0.635660f);
  gl.glVertex3f (-0.296967f,0.304259f,0.635660f);
  gl.glVertex3f (-0.316215f,0.304259f,0.675629f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.121850f,0.286109f,0.675629f);
  gl.glVertex3f (-0.121850f,0.286109f,0.719991f);
  gl.glVertex3f (-0.121850f,0.304259f,0.719991f);
  gl.glVertex3f (-0.121850f,0.304259f,0.675629f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.316215f,0.286109f,0.719991f);
  gl.glVertex3f (-0.316215f,0.286109f,0.675629f);
  gl.glVertex3f (-0.316215f,0.304259f,0.675629f);
  gl.glVertex3f (-0.316215f,0.304259f,0.719991f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.141098f,0.286109f,0.635660f);
  gl.glVertex3f (-0.121850f,0.286109f,0.675629f);
  gl.glVertex3f (-0.121850f,0.304259f,0.675629f);
  gl.glVertex3f (-0.141098f,0.304259f,0.635660f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.296967f,0.286109f,0.759961f);
  gl.glVertex3f (-0.316215f,0.286109f,0.719991f);
  gl.glVertex3f (-0.316215f,0.304259f,0.719991f);
  gl.glVertex3f (-0.296967f,0.304259f,0.759961f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.175782f,0.286109f,0.608000f);
  gl.glVertex3f (-0.141098f,0.286109f,0.635660f);
  gl.glVertex3f (-0.141098f,0.304259f,0.635660f);
  gl.glVertex3f (-0.175782f,0.304259f,0.608000f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.262283f,0.286109f,0.787620f);
  gl.glVertex3f (-0.296967f,0.286109f,0.759961f);
  gl.glVertex3f (-0.296967f,0.304259f,0.759961f);
  gl.glVertex3f (-0.262283f,0.304259f,0.787620f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.219032f,0.286109f,0.598128f);
  gl.glVertex3f (-0.175782f,0.286109f,0.608000f);
  gl.glVertex3f (-0.175782f,0.304259f,0.608000f);
  gl.glVertex3f (-0.219032f,0.304259f,0.598128f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.219032f,0.286109f,0.797492f);
  gl.glVertex3f (-0.262283f,0.286109f,0.787620f);
  gl.glVertex3f (-0.262283f,0.304259f,0.787620f);
  gl.glVertex3f (-0.219032f,0.304259f,0.797492f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.175782f,0.286109f,0.787620f);
  gl.glVertex3f (-0.219032f,0.286109f,0.797492f);
  gl.glVertex3f (-0.219032f,0.304259f,0.797492f);
  gl.glVertex3f (-0.175782f,0.304259f,0.787620f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.262283f,0.286109f,0.608000f);
  gl.glVertex3f (-0.219032f,0.286109f,0.598128f);
  gl.glVertex3f (-0.219032f,0.304259f,0.598128f);
  gl.glVertex3f (-0.262283f,0.304259f,0.608000f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.175782f,0.304259f,0.787620f);
  gl.glVertex3f (-0.219032f,0.304259f,0.797492f);
  gl.glVertex3f (-0.219032f,0.304259f,0.782131f);
  gl.glVertex3f (-0.182447f,0.304259f,0.773781f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.153108f,0.304259f,0.750383f);
  gl.glVertex3f (-0.182447f,0.304259f,0.773781f);
  gl.glVertex3f (-0.182447f,0.296934f,0.773781f);
  gl.glVertex3f (-0.153108f,0.296934f,0.750383f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.262283f,0.304259f,0.608000f);
  gl.glVertex3f (-0.219032f,0.304259f,0.598128f);
  gl.glVertex3f (-0.219032f,0.304259f,0.613489f);
  gl.glVertex3f (-0.255618f,0.304259f,0.621840f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.141098f,0.304259f,0.759961f);
  gl.glVertex3f (-0.175782f,0.304259f,0.787620f);
  gl.glVertex3f (-0.182447f,0.304259f,0.773781f);
  gl.glVertex3f (-0.153108f,0.304259f,0.750383f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.296967f,0.304259f,0.635660f);
  gl.glVertex3f (-0.262283f,0.304259f,0.608000f);
  gl.glVertex3f (-0.255618f,0.304259f,0.621840f);
  gl.glVertex3f (-0.284957f,0.304259f,0.645237f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.121850f,0.304259f,0.719991f);
  gl.glVertex3f (-0.141098f,0.304259f,0.759961f);
  gl.glVertex3f (-0.153108f,0.304259f,0.750383f);
  gl.glVertex3f (-0.136826f,0.304259f,0.716573f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.316215f,0.304259f,0.675629f);
  gl.glVertex3f (-0.296967f,0.304259f,0.635660f);
  gl.glVertex3f (-0.284957f,0.304259f,0.645237f);
  gl.glVertex3f (-0.301239f,0.304259f,0.679047f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.121850f,0.304259f,0.675629f);
  gl.glVertex3f (-0.121850f,0.304259f,0.719991f);
  gl.glVertex3f (-0.136826f,0.304259f,0.716573f);
  gl.glVertex3f (-0.136826f,0.304259f,0.679047f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.316215f,0.304259f,0.719991f);
  gl.glVertex3f (-0.316215f,0.304259f,0.675629f);
  gl.glVertex3f (-0.301239f,0.304259f,0.679047f);
  gl.glVertex3f (-0.301239f,0.304259f,0.716573f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.141098f,0.304259f,0.635660f);
  gl.glVertex3f (-0.121850f,0.304259f,0.675629f);
  gl.glVertex3f (-0.136826f,0.304259f,0.679047f);
  gl.glVertex3f (-0.153108f,0.304259f,0.645237f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.296967f,0.304259f,0.759961f);
  gl.glVertex3f (-0.316215f,0.304259f,0.719991f);
  gl.glVertex3f (-0.301239f,0.304259f,0.716573f);
  gl.glVertex3f (-0.284957f,0.304259f,0.750383f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.175782f,0.304259f,0.608000f);
  gl.glVertex3f (-0.141098f,0.304259f,0.635660f);
  gl.glVertex3f (-0.153108f,0.304259f,0.645237f);
  gl.glVertex3f (-0.182447f,0.304259f,0.621840f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.262283f,0.304259f,0.787620f);
  gl.glVertex3f (-0.296967f,0.304259f,0.759961f);
  gl.glVertex3f (-0.284957f,0.304259f,0.750383f);
  gl.glVertex3f (-0.255618f,0.304259f,0.773781f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.219032f,0.304259f,0.598128f);
  gl.glVertex3f (-0.175782f,0.304259f,0.608000f);
  gl.glVertex3f (-0.182447f,0.304259f,0.621840f);
  gl.glVertex3f (-0.219032f,0.304259f,0.613489f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.219032f,0.304259f,0.797492f);
  gl.glVertex3f (-0.262283f,0.304259f,0.787620f);
  gl.glVertex3f (-0.255618f,0.304259f,0.773781f);
  gl.glVertex3f (-0.219032f,0.304259f,0.782131f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.284957f,0.304259f,0.645237f);
  gl.glVertex3f (-0.255618f,0.304259f,0.621840f);
  gl.glVertex3f (-0.255618f,0.296934f,0.621840f);
  gl.glVertex3f (-0.284957f,0.296934f,0.645237f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.136826f,0.304259f,0.716573f);
  gl.glVertex3f (-0.153108f,0.304259f,0.750383f);
  gl.glVertex3f (-0.153108f,0.296934f,0.750383f);
  gl.glVertex3f (-0.136826f,0.296934f,0.716573f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.301239f,0.304259f,0.679047f);
  gl.glVertex3f (-0.284957f,0.304259f,0.645237f);
  gl.glVertex3f (-0.284957f,0.296934f,0.645237f);
  gl.glVertex3f (-0.301239f,0.296934f,0.679047f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.136826f,0.304259f,0.679047f);
  gl.glVertex3f (-0.136826f,0.304259f,0.716573f);
  gl.glVertex3f (-0.136826f,0.296934f,0.716573f);
  gl.glVertex3f (-0.136826f,0.296934f,0.679047f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.301239f,0.304259f,0.716573f);
  gl.glVertex3f (-0.301239f,0.304259f,0.679047f);
  gl.glVertex3f (-0.301239f,0.296934f,0.679047f);
  gl.glVertex3f (-0.301239f,0.296934f,0.716573f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.153108f,0.304259f,0.645237f);
  gl.glVertex3f (-0.136826f,0.304259f,0.679047f);
  gl.glVertex3f (-0.136826f,0.296934f,0.679047f);
  gl.glVertex3f (-0.153108f,0.296934f,0.645237f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.284957f,0.304259f,0.750383f);
  gl.glVertex3f (-0.301239f,0.304259f,0.716573f);
  gl.glVertex3f (-0.301239f,0.296934f,0.716573f);
  gl.glVertex3f (-0.284957f,0.296934f,0.750383f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.182447f,0.304259f,0.621840f);
  gl.glVertex3f (-0.153108f,0.304259f,0.645237f);
  gl.glVertex3f (-0.153108f,0.296934f,0.645237f);
  gl.glVertex3f (-0.182447f,0.296934f,0.621840f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.255618f,0.304259f,0.773781f);
  gl.glVertex3f (-0.284957f,0.304259f,0.750383f);
  gl.glVertex3f (-0.284957f,0.296934f,0.750383f);
  gl.glVertex3f (-0.255618f,0.296934f,0.773781f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.219032f,0.304259f,0.613489f);
  gl.glVertex3f (-0.182447f,0.304259f,0.621840f);
  gl.glVertex3f (-0.182447f,0.296934f,0.621840f);
  gl.glVertex3f (-0.219032f,0.296934f,0.613489f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.219032f,0.304259f,0.782131f);
  gl.glVertex3f (-0.255618f,0.304259f,0.773781f);
  gl.glVertex3f (-0.255618f,0.296934f,0.773781f);
  gl.glVertex3f (-0.219032f,0.296934f,0.782131f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.182447f,0.304259f,0.773781f);
  gl.glVertex3f (-0.219032f,0.304259f,0.782131f);
  gl.glVertex3f (-0.219032f,0.296934f,0.782131f);
  gl.glVertex3f (-0.182447f,0.296934f,0.773781f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.255618f,0.304259f,0.621840f);
  gl.glVertex3f (-0.219032f,0.304259f,0.613489f);
  gl.glVertex3f (-0.219032f,0.296934f,0.613489f);
  gl.glVertex3f (-0.255618f,0.296934f,0.621840f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.077934f,0.286109f,0.603661f);
  gl.glVertex3f (0.043250f,0.286109f,0.631320f);
  gl.glVertex3f (0.043250f,0.304259f,0.631320f);
  gl.glVertex3f (0.077934f,0.304259f,0.603661f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.077934f,0.286109f,0.479360f);
  gl.glVertex3f (-0.043250f,0.286109f,0.451700f);
  gl.glVertex3f (-0.043250f,0.304259f,0.451700f);
  gl.glVertex3f (-0.077934f,0.304259f,0.479360f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.097182f,0.286109f,0.563692f);
  gl.glVertex3f (0.077934f,0.286109f,0.603661f);
  gl.glVertex3f (0.077934f,0.304259f,0.603661f);
  gl.glVertex3f (0.097182f,0.304259f,0.563692f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.097182f,0.286109f,0.519329f);
  gl.glVertex3f (-0.077934f,0.286109f,0.479360f);
  gl.glVertex3f (-0.077934f,0.304259f,0.479360f);
  gl.glVertex3f (-0.097182f,0.304259f,0.519329f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.097182f,0.286109f,0.519329f);
  gl.glVertex3f (0.097182f,0.286109f,0.563692f);
  gl.glVertex3f (0.097182f,0.304259f,0.563692f);
  gl.glVertex3f (0.097182f,0.304259f,0.519329f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.097182f,0.286109f,0.563692f);
  gl.glVertex3f (-0.097182f,0.286109f,0.519329f);
  gl.glVertex3f (-0.097182f,0.304259f,0.519329f);
  gl.glVertex3f (-0.097182f,0.304259f,0.563692f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.077934f,0.286109f,0.479360f);
  gl.glVertex3f (0.097182f,0.286109f,0.519329f);
  gl.glVertex3f (0.097182f,0.304259f,0.519329f);
  gl.glVertex3f (0.077934f,0.304259f,0.479360f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.077934f,0.286109f,0.603661f);
  gl.glVertex3f (-0.097182f,0.286109f,0.563692f);
  gl.glVertex3f (-0.097182f,0.304259f,0.563692f);
  gl.glVertex3f (-0.077934f,0.304259f,0.603661f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.043250f,0.286109f,0.451700f);
  gl.glVertex3f (0.077934f,0.286109f,0.479360f);
  gl.glVertex3f (0.077934f,0.304259f,0.479360f);
  gl.glVertex3f (0.043250f,0.304259f,0.451700f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.043250f,0.286109f,0.631320f);
  gl.glVertex3f (-0.077934f,0.286109f,0.603661f);
  gl.glVertex3f (-0.077934f,0.304259f,0.603661f);
  gl.glVertex3f (-0.043250f,0.304259f,0.631320f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.000000f,0.286109f,0.441829f);
  gl.glVertex3f (0.043250f,0.286109f,0.451700f);
  gl.glVertex3f (0.043250f,0.304259f,0.451700f);
  gl.glVertex3f (0.000000f,0.304259f,0.441829f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.000000f,0.286109f,0.641192f);
  gl.glVertex3f (-0.043250f,0.286109f,0.631320f);
  gl.glVertex3f (-0.043250f,0.304259f,0.631320f);
  gl.glVertex3f (-0.000000f,0.304259f,0.641192f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.043250f,0.286109f,0.631320f);
  gl.glVertex3f (-0.000000f,0.286109f,0.641192f);
  gl.glVertex3f (-0.000000f,0.304259f,0.641192f);
  gl.glVertex3f (0.043250f,0.304259f,0.631320f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.043250f,0.286109f,0.451700f);
  gl.glVertex3f (0.000000f,0.286109f,0.441829f);
  gl.glVertex3f (0.000000f,0.304259f,0.441829f);
  gl.glVertex3f (-0.043250f,0.304259f,0.451700f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.043250f,0.304259f,0.631320f);
  gl.glVertex3f (-0.000000f,0.304259f,0.641192f);
  gl.glVertex3f (-0.000000f,0.304259f,0.625831f);
  gl.glVertex3f (0.036585f,0.304259f,0.617481f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.065925f,0.304259f,0.594083f);
  gl.glVertex3f (0.036585f,0.304259f,0.617481f);
  gl.glVertex3f (0.036585f,0.296934f,0.617481f);
  gl.glVertex3f (0.065925f,0.296934f,0.594083f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.043250f,0.304259f,0.451700f);
  gl.glVertex3f (0.000000f,0.304259f,0.441829f);
  gl.glVertex3f (0.000000f,0.304259f,0.457190f);
  gl.glVertex3f (-0.036585f,0.304259f,0.465540f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.077934f,0.304259f,0.603661f);
  gl.glVertex3f (0.043250f,0.304259f,0.631320f);
  gl.glVertex3f (0.036585f,0.304259f,0.617481f);
  gl.glVertex3f (0.065925f,0.304259f,0.594083f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.077934f,0.304259f,0.479360f);
  gl.glVertex3f (-0.043250f,0.304259f,0.451700f);
  gl.glVertex3f (-0.036585f,0.304259f,0.465540f);
  gl.glVertex3f (-0.065925f,0.304259f,0.488937f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.097182f,0.304259f,0.563692f);
  gl.glVertex3f (0.077934f,0.304259f,0.603661f);
  gl.glVertex3f (0.065925f,0.304259f,0.594083f);
  gl.glVertex3f (0.082207f,0.304259f,0.560273f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.097182f,0.304259f,0.519329f);
  gl.glVertex3f (-0.077934f,0.304259f,0.479360f);
  gl.glVertex3f (-0.065925f,0.304259f,0.488937f);
  gl.glVertex3f (-0.082207f,0.304259f,0.522747f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.097182f,0.304259f,0.519329f);
  gl.glVertex3f (0.097182f,0.304259f,0.563692f);
  gl.glVertex3f (0.082207f,0.304259f,0.560273f);
  gl.glVertex3f (0.082207f,0.304259f,0.522747f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.097182f,0.304259f,0.563692f);
  gl.glVertex3f (-0.097182f,0.304259f,0.519329f);
  gl.glVertex3f (-0.082207f,0.304259f,0.522747f);
  gl.glVertex3f (-0.082207f,0.304259f,0.560273f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.077934f,0.304259f,0.479360f);
  gl.glVertex3f (0.097182f,0.304259f,0.519329f);
  gl.glVertex3f (0.082207f,0.304259f,0.522747f);
  gl.glVertex3f (0.065925f,0.304259f,0.488937f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.077934f,0.304259f,0.603661f);
  gl.glVertex3f (-0.097182f,0.304259f,0.563692f);
  gl.glVertex3f (-0.082207f,0.304259f,0.560273f);
  gl.glVertex3f (-0.065925f,0.304259f,0.594083f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.043250f,0.304259f,0.451700f);
  gl.glVertex3f (0.077934f,0.304259f,0.479360f);
  gl.glVertex3f (0.065925f,0.304259f,0.488937f);
  gl.glVertex3f (0.036585f,0.304259f,0.465540f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.043250f,0.304259f,0.631320f);
  gl.glVertex3f (-0.077934f,0.304259f,0.603661f);
  gl.glVertex3f (-0.065925f,0.304259f,0.594083f);
  gl.glVertex3f (-0.036585f,0.304259f,0.617481f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.000000f,0.304259f,0.441829f);
  gl.glVertex3f (0.043250f,0.304259f,0.451700f);
  gl.glVertex3f (0.036585f,0.304259f,0.465540f);
  gl.glVertex3f (0.000000f,0.304259f,0.457190f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.000000f,0.304259f,0.641192f);
  gl.glVertex3f (-0.043250f,0.304259f,0.631320f);
  gl.glVertex3f (-0.036585f,0.304259f,0.617481f);
  gl.glVertex3f (-0.000000f,0.304259f,0.625831f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.065925f,0.304259f,0.488937f);
  gl.glVertex3f (-0.036585f,0.304259f,0.465540f);
  gl.glVertex3f (-0.036585f,0.296934f,0.465540f);
  gl.glVertex3f (-0.065925f,0.296934f,0.488937f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.082207f,0.304259f,0.560273f);
  gl.glVertex3f (0.065925f,0.304259f,0.594083f);
  gl.glVertex3f (0.065925f,0.296934f,0.594083f);
  gl.glVertex3f (0.082207f,0.296934f,0.560273f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.082207f,0.304259f,0.522747f);
  gl.glVertex3f (-0.065925f,0.304259f,0.488937f);
  gl.glVertex3f (-0.065925f,0.296934f,0.488937f);
  gl.glVertex3f (-0.082207f,0.296934f,0.522747f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.082207f,0.304259f,0.522747f);
  gl.glVertex3f (0.082207f,0.304259f,0.560273f);
  gl.glVertex3f (0.082207f,0.296934f,0.560273f);
  gl.glVertex3f (0.082207f,0.296934f,0.522747f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.082207f,0.304259f,0.560273f);
  gl.glVertex3f (-0.082207f,0.304259f,0.522747f);
  gl.glVertex3f (-0.082207f,0.296934f,0.522747f);
  gl.glVertex3f (-0.082207f,0.296934f,0.560273f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.065925f,0.304259f,0.488937f);
  gl.glVertex3f (0.082207f,0.304259f,0.522747f);
  gl.glVertex3f (0.082207f,0.296934f,0.522747f);
  gl.glVertex3f (0.065925f,0.296934f,0.488937f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.065925f,0.304259f,0.594083f);
  gl.glVertex3f (-0.082207f,0.304259f,0.560273f);
  gl.glVertex3f (-0.082207f,0.296934f,0.560273f);
  gl.glVertex3f (-0.065925f,0.296934f,0.594083f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.036585f,0.304259f,0.465540f);
  gl.glVertex3f (0.065925f,0.304259f,0.488937f);
  gl.glVertex3f (0.065925f,0.296934f,0.488937f);
  gl.glVertex3f (0.036585f,0.296934f,0.465540f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.036585f,0.304259f,0.617481f);
  gl.glVertex3f (-0.065925f,0.304259f,0.594083f);
  gl.glVertex3f (-0.065925f,0.296934f,0.594083f);
  gl.glVertex3f (-0.036585f,0.296934f,0.617481f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.000000f,0.304259f,0.457190f);
  gl.glVertex3f (0.036585f,0.304259f,0.465540f);
  gl.glVertex3f (0.036585f,0.296934f,0.465540f);
  gl.glVertex3f (0.000000f,0.296934f,0.457190f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.000000f,0.304259f,0.625831f);
  gl.glVertex3f (-0.036585f,0.304259f,0.617481f);
  gl.glVertex3f (-0.036585f,0.296934f,0.617481f);
  gl.glVertex3f (-0.000000f,0.296934f,0.625831f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.036585f,0.304259f,0.617481f);
  gl.glVertex3f (-0.000000f,0.304259f,0.625831f);
  gl.glVertex3f (-0.000000f,0.296934f,0.625831f);
  gl.glVertex3f (0.036585f,0.296934f,0.617481f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.036585f,0.304259f,0.465540f);
  gl.glVertex3f (0.000000f,0.304259f,0.457190f);
  gl.glVertex3f (0.000000f,0.296934f,0.457190f);
  gl.glVertex3f (-0.036585f,0.296934f,0.465540f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.294197f,0.286109f,0.516418f);
  gl.glVertex3f (0.259513f,0.286109f,0.544077f);
  gl.glVertex3f (0.259513f,0.304259f,0.544077f);
  gl.glVertex3f (0.294197f,0.304259f,0.516418f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.138329f,0.286109f,0.392116f);
  gl.glVertex3f (0.173013f,0.286109f,0.364457f);
  gl.glVertex3f (0.173013f,0.304259f,0.364457f);
  gl.glVertex3f (0.138329f,0.304259f,0.392116f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.313446f,0.286109f,0.476448f);
  gl.glVertex3f (0.294197f,0.286109f,0.516418f);
  gl.glVertex3f (0.294197f,0.304259f,0.516418f);
  gl.glVertex3f (0.313446f,0.304259f,0.476448f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.119081f,0.286109f,0.432086f);
  gl.glVertex3f (0.138329f,0.286109f,0.392116f);
  gl.glVertex3f (0.138329f,0.304259f,0.392116f);
  gl.glVertex3f (0.119081f,0.304259f,0.432086f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.313446f,0.286109f,0.432086f);
  gl.glVertex3f (0.313446f,0.286109f,0.476448f);
  gl.glVertex3f (0.313446f,0.304259f,0.476448f);
  gl.glVertex3f (0.313446f,0.304259f,0.432086f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.119081f,0.286109f,0.476448f);
  gl.glVertex3f (0.119081f,0.286109f,0.432086f);
  gl.glVertex3f (0.119081f,0.304259f,0.432086f);
  gl.glVertex3f (0.119081f,0.304259f,0.476448f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.294197f,0.286109f,0.392116f);
  gl.glVertex3f (0.313446f,0.286109f,0.432086f);
  gl.glVertex3f (0.313446f,0.304259f,0.432086f);
  gl.glVertex3f (0.294197f,0.304259f,0.392116f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.138329f,0.286109f,0.516418f);
  gl.glVertex3f (0.119081f,0.286109f,0.476448f);
  gl.glVertex3f (0.119081f,0.304259f,0.476448f);
  gl.glVertex3f (0.138329f,0.304259f,0.516418f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.259513f,0.286109f,0.364457f);
  gl.glVertex3f (0.294197f,0.286109f,0.392116f);
  gl.glVertex3f (0.294197f,0.304259f,0.392116f);
  gl.glVertex3f (0.259513f,0.304259f,0.364457f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.173013f,0.286109f,0.544077f);
  gl.glVertex3f (0.138329f,0.286109f,0.516418f);
  gl.glVertex3f (0.138329f,0.304259f,0.516418f);
  gl.glVertex3f (0.173013f,0.304259f,0.544077f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.216263f,0.286109f,0.354585f);
  gl.glVertex3f (0.259513f,0.286109f,0.364457f);
  gl.glVertex3f (0.259513f,0.304259f,0.364457f);
  gl.glVertex3f (0.216263f,0.304259f,0.354585f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.216263f,0.286109f,0.553949f);
  gl.glVertex3f (0.173013f,0.286109f,0.544077f);
  gl.glVertex3f (0.173013f,0.304259f,0.544077f);
  gl.glVertex3f (0.216263f,0.304259f,0.553949f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.259513f,0.286109f,0.544077f);
  gl.glVertex3f (0.216263f,0.286109f,0.553949f);
  gl.glVertex3f (0.216263f,0.304259f,0.553949f);
  gl.glVertex3f (0.259513f,0.304259f,0.544077f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.173013f,0.286109f,0.364457f);
  gl.glVertex3f (0.216263f,0.286109f,0.354585f);
  gl.glVertex3f (0.216263f,0.304259f,0.354585f);
  gl.glVertex3f (0.173013f,0.304259f,0.364457f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.259513f,0.304259f,0.544077f);
  gl.glVertex3f (0.216263f,0.304259f,0.553949f);
  gl.glVertex3f (0.216263f,0.304259f,0.538588f);
  gl.glVertex3f (0.252849f,0.304259f,0.530237f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.282188f,0.304259f,0.506840f);
  gl.glVertex3f (0.252849f,0.304259f,0.530237f);
  gl.glVertex3f (0.252849f,0.296934f,0.530237f);
  gl.glVertex3f (0.282188f,0.296934f,0.506840f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.173013f,0.304259f,0.364457f);
  gl.glVertex3f (0.216263f,0.304259f,0.354585f);
  gl.glVertex3f (0.216263f,0.304259f,0.369946f);
  gl.glVertex3f (0.179678f,0.304259f,0.378297f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.294197f,0.304259f,0.516418f);
  gl.glVertex3f (0.259513f,0.304259f,0.544077f);
  gl.glVertex3f (0.252849f,0.304259f,0.530237f);
  gl.glVertex3f (0.282188f,0.304259f,0.506840f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.138329f,0.304259f,0.392116f);
  gl.glVertex3f (0.173013f,0.304259f,0.364457f);
  gl.glVertex3f (0.179678f,0.304259f,0.378297f);
  gl.glVertex3f (0.150339f,0.304259f,0.401694f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.313446f,0.304259f,0.476448f);
  gl.glVertex3f (0.294197f,0.304259f,0.516418f);
  gl.glVertex3f (0.282188f,0.304259f,0.506840f);
  gl.glVertex3f (0.298470f,0.304259f,0.473030f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.119081f,0.304259f,0.432086f);
  gl.glVertex3f (0.138329f,0.304259f,0.392116f);
  gl.glVertex3f (0.150339f,0.304259f,0.401694f);
  gl.glVertex3f (0.134057f,0.304259f,0.435504f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.313446f,0.304259f,0.432086f);
  gl.glVertex3f (0.313446f,0.304259f,0.476448f);
  gl.glVertex3f (0.298470f,0.304259f,0.473030f);
  gl.glVertex3f (0.298470f,0.304259f,0.435504f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.119081f,0.304259f,0.476448f);
  gl.glVertex3f (0.119081f,0.304259f,0.432086f);
  gl.glVertex3f (0.134057f,0.304259f,0.435504f);
  gl.glVertex3f (0.134057f,0.304259f,0.473030f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.294197f,0.304259f,0.392116f);
  gl.glVertex3f (0.313446f,0.304259f,0.432086f);
  gl.glVertex3f (0.298470f,0.304259f,0.435504f);
  gl.glVertex3f (0.282188f,0.304259f,0.401694f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.138329f,0.304259f,0.516418f);
  gl.glVertex3f (0.119081f,0.304259f,0.476448f);
  gl.glVertex3f (0.134057f,0.304259f,0.473030f);
  gl.glVertex3f (0.150339f,0.304259f,0.506840f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.259513f,0.304259f,0.364457f);
  gl.glVertex3f (0.294197f,0.304259f,0.392116f);
  gl.glVertex3f (0.282188f,0.304259f,0.401694f);
  gl.glVertex3f (0.252849f,0.304259f,0.378297f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.173013f,0.304259f,0.544077f);
  gl.glVertex3f (0.138329f,0.304259f,0.516418f);
  gl.glVertex3f (0.150339f,0.304259f,0.506840f);
  gl.glVertex3f (0.179678f,0.304259f,0.530237f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.216263f,0.304259f,0.354585f);
  gl.glVertex3f (0.259513f,0.304259f,0.364457f);
  gl.glVertex3f (0.252849f,0.304259f,0.378297f);
  gl.glVertex3f (0.216263f,0.304259f,0.369946f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.216263f,0.304259f,0.553949f);
  gl.glVertex3f (0.173013f,0.304259f,0.544077f);
  gl.glVertex3f (0.179678f,0.304259f,0.530237f);
  gl.glVertex3f (0.216263f,0.304259f,0.538588f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.150339f,0.304259f,0.401694f);
  gl.glVertex3f (0.179678f,0.304259f,0.378297f);
  gl.glVertex3f (0.179678f,0.296934f,0.378297f);
  gl.glVertex3f (0.150339f,0.296934f,0.401694f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.298470f,0.304259f,0.473030f);
  gl.glVertex3f (0.282188f,0.304259f,0.506840f);
  gl.glVertex3f (0.282188f,0.296934f,0.506840f);
  gl.glVertex3f (0.298470f,0.296934f,0.473030f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.134057f,0.304259f,0.435504f);
  gl.glVertex3f (0.150339f,0.304259f,0.401694f);
  gl.glVertex3f (0.150339f,0.296934f,0.401694f);
  gl.glVertex3f (0.134057f,0.296934f,0.435504f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.298470f,0.304259f,0.435504f);
  gl.glVertex3f (0.298470f,0.304259f,0.473030f);
  gl.glVertex3f (0.298470f,0.296934f,0.473030f);
  gl.glVertex3f (0.298470f,0.296934f,0.435504f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.134057f,0.304259f,0.473030f);
  gl.glVertex3f (0.134057f,0.304259f,0.435504f);
  gl.glVertex3f (0.134057f,0.296934f,0.435504f);
  gl.glVertex3f (0.134057f,0.296934f,0.473030f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.282188f,0.304259f,0.401694f);
  gl.glVertex3f (0.298470f,0.304259f,0.435504f);
  gl.glVertex3f (0.298470f,0.296934f,0.435504f);
  gl.glVertex3f (0.282188f,0.296934f,0.401694f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.150339f,0.304259f,0.506840f);
  gl.glVertex3f (0.134057f,0.304259f,0.473030f);
  gl.glVertex3f (0.134057f,0.296934f,0.473030f);
  gl.glVertex3f (0.150339f,0.296934f,0.506840f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.252849f,0.304259f,0.378297f);
  gl.glVertex3f (0.282188f,0.304259f,0.401694f);
  gl.glVertex3f (0.282188f,0.296934f,0.401694f);
  gl.glVertex3f (0.252849f,0.296934f,0.378297f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.179678f,0.304259f,0.530237f);
  gl.glVertex3f (0.150339f,0.304259f,0.506840f);
  gl.glVertex3f (0.150339f,0.296934f,0.506840f);
  gl.glVertex3f (0.179678f,0.296934f,0.530237f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.216263f,0.304259f,0.369946f);
  gl.glVertex3f (0.252849f,0.304259f,0.378297f);
  gl.glVertex3f (0.252849f,0.296934f,0.378297f);
  gl.glVertex3f (0.216263f,0.296934f,0.369946f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.216263f,0.304259f,0.538588f);
  gl.glVertex3f (0.179678f,0.304259f,0.530237f);
  gl.glVertex3f (0.179678f,0.296934f,0.530237f);
  gl.glVertex3f (0.216263f,0.296934f,0.538588f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.252849f,0.304259f,0.530237f);
  gl.glVertex3f (0.216263f,0.304259f,0.538588f);
  gl.glVertex3f (0.216263f,0.296934f,0.538588f);
  gl.glVertex3f (0.252849f,0.296934f,0.530237f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.179678f,0.304259f,0.378297f);
  gl.glVertex3f (0.216263f,0.304259f,0.369946f);
  gl.glVertex3f (0.216263f,0.296934f,0.369946f);
  gl.glVertex3f (0.179678f,0.296934f,0.378297f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.141098f,0.286109f,0.516418f);
  gl.glVertex3f (-0.175782f,0.286109f,0.544077f);
  gl.glVertex3f (-0.175782f,0.304259f,0.544077f);
  gl.glVertex3f (-0.141098f,0.304259f,0.516418f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.296967f,0.286109f,0.392116f);
  gl.glVertex3f (-0.262283f,0.286109f,0.364457f);
  gl.glVertex3f (-0.262283f,0.304259f,0.364457f);
  gl.glVertex3f (-0.296967f,0.304259f,0.392116f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.121850f,0.286109f,0.476448f);
  gl.glVertex3f (-0.141098f,0.286109f,0.516418f);
  gl.glVertex3f (-0.141098f,0.304259f,0.516418f);
  gl.glVertex3f (-0.121850f,0.304259f,0.476448f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.316215f,0.286109f,0.432086f);
  gl.glVertex3f (-0.296967f,0.286109f,0.392116f);
  gl.glVertex3f (-0.296967f,0.304259f,0.392116f);
  gl.glVertex3f (-0.316215f,0.304259f,0.432086f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.121850f,0.286109f,0.432086f);
  gl.glVertex3f (-0.121850f,0.286109f,0.476448f);
  gl.glVertex3f (-0.121850f,0.304259f,0.476448f);
  gl.glVertex3f (-0.121850f,0.304259f,0.432086f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.316215f,0.286109f,0.476448f);
  gl.glVertex3f (-0.316215f,0.286109f,0.432086f);
  gl.glVertex3f (-0.316215f,0.304259f,0.432086f);
  gl.glVertex3f (-0.316215f,0.304259f,0.476448f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.141098f,0.286109f,0.392116f);
  gl.glVertex3f (-0.121850f,0.286109f,0.432086f);
  gl.glVertex3f (-0.121850f,0.304259f,0.432086f);
  gl.glVertex3f (-0.141098f,0.304259f,0.392116f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.296967f,0.286109f,0.516418f);
  gl.glVertex3f (-0.316215f,0.286109f,0.476448f);
  gl.glVertex3f (-0.316215f,0.304259f,0.476448f);
  gl.glVertex3f (-0.296967f,0.304259f,0.516418f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.175782f,0.286109f,0.364457f);
  gl.glVertex3f (-0.141098f,0.286109f,0.392116f);
  gl.glVertex3f (-0.141098f,0.304259f,0.392116f);
  gl.glVertex3f (-0.175782f,0.304259f,0.364457f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.262283f,0.286109f,0.544077f);
  gl.glVertex3f (-0.296967f,0.286109f,0.516418f);
  gl.glVertex3f (-0.296967f,0.304259f,0.516418f);
  gl.glVertex3f (-0.262283f,0.304259f,0.544077f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.219032f,0.286109f,0.354585f);
  gl.glVertex3f (-0.175782f,0.286109f,0.364457f);
  gl.glVertex3f (-0.175782f,0.304259f,0.364457f);
  gl.glVertex3f (-0.219032f,0.304259f,0.354585f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.219032f,0.286109f,0.553949f);
  gl.glVertex3f (-0.262283f,0.286109f,0.544077f);
  gl.glVertex3f (-0.262283f,0.304259f,0.544077f);
  gl.glVertex3f (-0.219032f,0.304259f,0.553949f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.175782f,0.286109f,0.544077f);
  gl.glVertex3f (-0.219032f,0.286109f,0.553949f);
  gl.glVertex3f (-0.219032f,0.304259f,0.553949f);
  gl.glVertex3f (-0.175782f,0.304259f,0.544077f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.262283f,0.286109f,0.364457f);
  gl.glVertex3f (-0.219032f,0.286109f,0.354585f);
  gl.glVertex3f (-0.219032f,0.304259f,0.354585f);
  gl.glVertex3f (-0.262283f,0.304259f,0.364457f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.175782f,0.304259f,0.544077f);
  gl.glVertex3f (-0.219032f,0.304259f,0.553949f);
  gl.glVertex3f (-0.219032f,0.304259f,0.538588f);
  gl.glVertex3f (-0.182447f,0.304259f,0.530237f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.153108f,0.304259f,0.506840f);
  gl.glVertex3f (-0.182447f,0.304259f,0.530237f);
  gl.glVertex3f (-0.182447f,0.296934f,0.530237f);
  gl.glVertex3f (-0.153108f,0.296934f,0.506840f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.262283f,0.304259f,0.364457f);
  gl.glVertex3f (-0.219032f,0.304259f,0.354585f);
  gl.glVertex3f (-0.219032f,0.304259f,0.369946f);
  gl.glVertex3f (-0.255618f,0.304259f,0.378297f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.141098f,0.304259f,0.516418f);
  gl.glVertex3f (-0.175782f,0.304259f,0.544077f);
  gl.glVertex3f (-0.182447f,0.304259f,0.530237f);
  gl.glVertex3f (-0.153108f,0.304259f,0.506840f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.296967f,0.304259f,0.392116f);
  gl.glVertex3f (-0.262283f,0.304259f,0.364457f);
  gl.glVertex3f (-0.255618f,0.304259f,0.378297f);
  gl.glVertex3f (-0.284957f,0.304259f,0.401694f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.121850f,0.304259f,0.476448f);
  gl.glVertex3f (-0.141098f,0.304259f,0.516418f);
  gl.glVertex3f (-0.153108f,0.304259f,0.506840f);
  gl.glVertex3f (-0.136826f,0.304259f,0.473030f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.316215f,0.304259f,0.432086f);
  gl.glVertex3f (-0.296967f,0.304259f,0.392116f);
  gl.glVertex3f (-0.284957f,0.304259f,0.401694f);
  gl.glVertex3f (-0.301239f,0.304259f,0.435504f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.121850f,0.304259f,0.432086f);
  gl.glVertex3f (-0.121850f,0.304259f,0.476448f);
  gl.glVertex3f (-0.136826f,0.304259f,0.473030f);
  gl.glVertex3f (-0.136826f,0.304259f,0.435504f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.316215f,0.304259f,0.476448f);
  gl.glVertex3f (-0.316215f,0.304259f,0.432086f);
  gl.glVertex3f (-0.301239f,0.304259f,0.435504f);
  gl.glVertex3f (-0.301239f,0.304259f,0.473030f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.141098f,0.304259f,0.392116f);
  gl.glVertex3f (-0.121850f,0.304259f,0.432086f);
  gl.glVertex3f (-0.136826f,0.304259f,0.435504f);
  gl.glVertex3f (-0.153108f,0.304259f,0.401694f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.296967f,0.304259f,0.516418f);
  gl.glVertex3f (-0.316215f,0.304259f,0.476448f);
  gl.glVertex3f (-0.301239f,0.304259f,0.473030f);
  gl.glVertex3f (-0.284957f,0.304259f,0.506840f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.175782f,0.304259f,0.364457f);
  gl.glVertex3f (-0.141098f,0.304259f,0.392116f);
  gl.glVertex3f (-0.153108f,0.304259f,0.401694f);
  gl.glVertex3f (-0.182447f,0.304259f,0.378297f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.262283f,0.304259f,0.544077f);
  gl.glVertex3f (-0.296967f,0.304259f,0.516418f);
  gl.glVertex3f (-0.284957f,0.304259f,0.506840f);
  gl.glVertex3f (-0.255618f,0.304259f,0.530237f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.219032f,0.304259f,0.354585f);
  gl.glVertex3f (-0.175782f,0.304259f,0.364457f);
  gl.glVertex3f (-0.182447f,0.304259f,0.378297f);
  gl.glVertex3f (-0.219032f,0.304259f,0.369946f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.219032f,0.304259f,0.553949f);
  gl.glVertex3f (-0.262283f,0.304259f,0.544077f);
  gl.glVertex3f (-0.255618f,0.304259f,0.530237f);
  gl.glVertex3f (-0.219032f,0.304259f,0.538588f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.284957f,0.304259f,0.401694f);
  gl.glVertex3f (-0.255618f,0.304259f,0.378297f);
  gl.glVertex3f (-0.255618f,0.296934f,0.378297f);
  gl.glVertex3f (-0.284957f,0.296934f,0.401694f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.136826f,0.304259f,0.473030f);
  gl.glVertex3f (-0.153108f,0.304259f,0.506840f);
  gl.glVertex3f (-0.153108f,0.296934f,0.506840f);
  gl.glVertex3f (-0.136826f,0.296934f,0.473030f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.301239f,0.304259f,0.435504f);
  gl.glVertex3f (-0.284957f,0.304259f,0.401694f);
  gl.glVertex3f (-0.284957f,0.296934f,0.401694f);
  gl.glVertex3f (-0.301239f,0.296934f,0.435504f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.136826f,0.304259f,0.435504f);
  gl.glVertex3f (-0.136826f,0.304259f,0.473030f);
  gl.glVertex3f (-0.136826f,0.296934f,0.473030f);
  gl.glVertex3f (-0.136826f,0.296934f,0.435504f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.301239f,0.304259f,0.473030f);
  gl.glVertex3f (-0.301239f,0.304259f,0.435504f);
  gl.glVertex3f (-0.301239f,0.296934f,0.435504f);
  gl.glVertex3f (-0.301239f,0.296934f,0.473030f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.153108f,0.304259f,0.401694f);
  gl.glVertex3f (-0.136826f,0.304259f,0.435504f);
  gl.glVertex3f (-0.136826f,0.296934f,0.435504f);
  gl.glVertex3f (-0.153108f,0.296934f,0.401694f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.284957f,0.304259f,0.506840f);
  gl.glVertex3f (-0.301239f,0.304259f,0.473030f);
  gl.glVertex3f (-0.301239f,0.296934f,0.473030f);
  gl.glVertex3f (-0.284957f,0.296934f,0.506840f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.182447f,0.304259f,0.378297f);
  gl.glVertex3f (-0.153108f,0.304259f,0.401694f);
  gl.glVertex3f (-0.153108f,0.296934f,0.401694f);
  gl.glVertex3f (-0.182447f,0.296934f,0.378297f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.255618f,0.304259f,0.530237f);
  gl.glVertex3f (-0.284957f,0.304259f,0.506840f);
  gl.glVertex3f (-0.284957f,0.296934f,0.506840f);
  gl.glVertex3f (-0.255618f,0.296934f,0.530237f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.219032f,0.304259f,0.369946f);
  gl.glVertex3f (-0.182447f,0.304259f,0.378297f);
  gl.glVertex3f (-0.182447f,0.296934f,0.378297f);
  gl.glVertex3f (-0.219032f,0.296934f,0.369946f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.219032f,0.304259f,0.538588f);
  gl.glVertex3f (-0.255618f,0.304259f,0.530237f);
  gl.glVertex3f (-0.255618f,0.296934f,0.530237f);
  gl.glVertex3f (-0.219032f,0.296934f,0.538588f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.182447f,0.304259f,0.530237f);
  gl.glVertex3f (-0.219032f,0.304259f,0.538588f);
  gl.glVertex3f (-0.219032f,0.296934f,0.538588f);
  gl.glVertex3f (-0.182447f,0.296934f,0.530237f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.255618f,0.304259f,0.378297f);
  gl.glVertex3f (-0.219032f,0.304259f,0.369946f);
  gl.glVertex3f (-0.219032f,0.296934f,0.369946f);
  gl.glVertex3f (-0.255618f,0.296934f,0.378297f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.077934f,0.286109f,0.847204f);
  gl.glVertex3f (0.043250f,0.286109f,0.874864f);
  gl.glVertex3f (0.043250f,0.304259f,0.874864f);
  gl.glVertex3f (0.077934f,0.304259f,0.847204f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.077934f,0.286109f,0.722903f);
  gl.glVertex3f (-0.043250f,0.286109f,0.695243f);
  gl.glVertex3f (-0.043250f,0.304259f,0.695243f);
  gl.glVertex3f (-0.077934f,0.304259f,0.722903f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.097182f,0.286109f,0.807235f);
  gl.glVertex3f (0.077934f,0.286109f,0.847204f);
  gl.glVertex3f (0.077934f,0.304259f,0.847204f);
  gl.glVertex3f (0.097182f,0.304259f,0.807235f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.097182f,0.286109f,0.762872f);
  gl.glVertex3f (-0.077934f,0.286109f,0.722903f);
  gl.glVertex3f (-0.077934f,0.304259f,0.722903f);
  gl.glVertex3f (-0.097182f,0.304259f,0.762872f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.097182f,0.286109f,0.762872f);
  gl.glVertex3f (0.097182f,0.286109f,0.807235f);
  gl.glVertex3f (0.097182f,0.304259f,0.807235f);
  gl.glVertex3f (0.097182f,0.304259f,0.762872f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.097182f,0.286109f,0.807235f);
  gl.glVertex3f (-0.097182f,0.286109f,0.762872f);
  gl.glVertex3f (-0.097182f,0.304259f,0.762872f);
  gl.glVertex3f (-0.097182f,0.304259f,0.807235f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.077934f,0.286109f,0.722903f);
  gl.glVertex3f (0.097182f,0.286109f,0.762872f);
  gl.glVertex3f (0.097182f,0.304259f,0.762872f);
  gl.glVertex3f (0.077934f,0.304259f,0.722903f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.077934f,0.286109f,0.847204f);
  gl.glVertex3f (-0.097182f,0.286109f,0.807235f);
  gl.glVertex3f (-0.097182f,0.304259f,0.807235f);
  gl.glVertex3f (-0.077934f,0.304259f,0.847204f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.043250f,0.286109f,0.695243f);
  gl.glVertex3f (0.077934f,0.286109f,0.722903f);
  gl.glVertex3f (0.077934f,0.304259f,0.722903f);
  gl.glVertex3f (0.043250f,0.304259f,0.695243f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.043250f,0.286109f,0.874864f);
  gl.glVertex3f (-0.077934f,0.286109f,0.847204f);
  gl.glVertex3f (-0.077934f,0.304259f,0.847204f);
  gl.glVertex3f (-0.043250f,0.304259f,0.874864f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.000000f,0.286109f,0.685372f);
  gl.glVertex3f (0.043250f,0.286109f,0.695243f);
  gl.glVertex3f (0.043250f,0.304259f,0.695243f);
  gl.glVertex3f (0.000000f,0.304259f,0.685372f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.000000f,0.286109f,0.884735f);
  gl.glVertex3f (-0.043250f,0.286109f,0.874864f);
  gl.glVertex3f (-0.043250f,0.304259f,0.874864f);
  gl.glVertex3f (-0.000000f,0.304259f,0.884735f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.043250f,0.286109f,0.874864f);
  gl.glVertex3f (-0.000000f,0.286109f,0.884735f);
  gl.glVertex3f (-0.000000f,0.304259f,0.884735f);
  gl.glVertex3f (0.043250f,0.304259f,0.874864f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.043250f,0.286109f,0.695243f);
  gl.glVertex3f (0.000000f,0.286109f,0.685372f);
  gl.glVertex3f (0.000000f,0.304259f,0.685372f);
  gl.glVertex3f (-0.043250f,0.304259f,0.695243f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.043250f,0.304259f,0.874864f);
  gl.glVertex3f (-0.000000f,0.304259f,0.884735f);
  gl.glVertex3f (-0.000000f,0.304259f,0.869374f);
  gl.glVertex3f (0.036585f,0.304259f,0.861024f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.065925f,0.304259f,0.837627f);
  gl.glVertex3f (0.036585f,0.304259f,0.861024f);
  gl.glVertex3f (0.036585f,0.296934f,0.861024f);
  gl.glVertex3f (0.065925f,0.296934f,0.837627f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.043250f,0.304259f,0.695243f);
  gl.glVertex3f (0.000000f,0.304259f,0.685372f);
  gl.glVertex3f (0.000000f,0.304259f,0.700733f);
  gl.glVertex3f (-0.036585f,0.304259f,0.709083f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.077934f,0.304259f,0.847204f);
  gl.glVertex3f (0.043250f,0.304259f,0.874864f);
  gl.glVertex3f (0.036585f,0.304259f,0.861024f);
  gl.glVertex3f (0.065925f,0.304259f,0.837627f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.077934f,0.304259f,0.722903f);
  gl.glVertex3f (-0.043250f,0.304259f,0.695243f);
  gl.glVertex3f (-0.036585f,0.304259f,0.709083f);
  gl.glVertex3f (-0.065925f,0.304259f,0.732480f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.097182f,0.304259f,0.807235f);
  gl.glVertex3f (0.077934f,0.304259f,0.847204f);
  gl.glVertex3f (0.065925f,0.304259f,0.837627f);
  gl.glVertex3f (0.082207f,0.304259f,0.803817f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.097182f,0.304259f,0.762872f);
  gl.glVertex3f (-0.077934f,0.304259f,0.722903f);
  gl.glVertex3f (-0.065925f,0.304259f,0.732480f);
  gl.glVertex3f (-0.082207f,0.304259f,0.766290f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.097182f,0.304259f,0.762872f);
  gl.glVertex3f (0.097182f,0.304259f,0.807235f);
  gl.glVertex3f (0.082207f,0.304259f,0.803817f);
  gl.glVertex3f (0.082207f,0.304259f,0.766290f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.097182f,0.304259f,0.807235f);
  gl.glVertex3f (-0.097182f,0.304259f,0.762872f);
  gl.glVertex3f (-0.082207f,0.304259f,0.766290f);
  gl.glVertex3f (-0.082207f,0.304259f,0.803817f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.077934f,0.304259f,0.722903f);
  gl.glVertex3f (0.097182f,0.304259f,0.762872f);
  gl.glVertex3f (0.082207f,0.304259f,0.766290f);
  gl.glVertex3f (0.065925f,0.304259f,0.732480f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.077934f,0.304259f,0.847204f);
  gl.glVertex3f (-0.097182f,0.304259f,0.807235f);
  gl.glVertex3f (-0.082207f,0.304259f,0.803817f);
  gl.glVertex3f (-0.065925f,0.304259f,0.837627f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.043250f,0.304259f,0.695243f);
  gl.glVertex3f (0.077934f,0.304259f,0.722903f);
  gl.glVertex3f (0.065925f,0.304259f,0.732480f);
  gl.glVertex3f (0.036585f,0.304259f,0.709083f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.043250f,0.304259f,0.874864f);
  gl.glVertex3f (-0.077934f,0.304259f,0.847204f);
  gl.glVertex3f (-0.065925f,0.304259f,0.837627f);
  gl.glVertex3f (-0.036585f,0.304259f,0.861024f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.000000f,0.304259f,0.685372f);
  gl.glVertex3f (0.043250f,0.304259f,0.695243f);
  gl.glVertex3f (0.036585f,0.304259f,0.709083f);
  gl.glVertex3f (0.000000f,0.304259f,0.700733f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.000000f,0.304259f,0.884735f);
  gl.glVertex3f (-0.043250f,0.304259f,0.874864f);
  gl.glVertex3f (-0.036585f,0.304259f,0.861024f);
  gl.glVertex3f (-0.000000f,0.304259f,0.869374f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.065925f,0.304259f,0.732480f);
  gl.glVertex3f (-0.036585f,0.304259f,0.709083f);
  gl.glVertex3f (-0.036585f,0.296934f,0.709083f);
  gl.glVertex3f (-0.065925f,0.296934f,0.732480f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.082207f,0.304259f,0.803817f);
  gl.glVertex3f (0.065925f,0.304259f,0.837627f);
  gl.glVertex3f (0.065925f,0.296934f,0.837627f);
  gl.glVertex3f (0.082207f,0.296934f,0.803817f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.082207f,0.304259f,0.766290f);
  gl.glVertex3f (-0.065925f,0.304259f,0.732480f);
  gl.glVertex3f (-0.065925f,0.296934f,0.732480f);
  gl.glVertex3f (-0.082207f,0.296934f,0.766290f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.082207f,0.304259f,0.766290f);
  gl.glVertex3f (0.082207f,0.304259f,0.803817f);
  gl.glVertex3f (0.082207f,0.296934f,0.803817f);
  gl.glVertex3f (0.082207f,0.296934f,0.766290f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.082207f,0.304259f,0.803817f);
  gl.glVertex3f (-0.082207f,0.304259f,0.766290f);
  gl.glVertex3f (-0.082207f,0.296934f,0.766290f);
  gl.glVertex3f (-0.082207f,0.296934f,0.803817f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.065925f,0.304259f,0.732480f);
  gl.glVertex3f (0.082207f,0.304259f,0.766290f);
  gl.glVertex3f (0.082207f,0.296934f,0.766290f);
  gl.glVertex3f (0.065925f,0.296934f,0.732480f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.065925f,0.304259f,0.837627f);
  gl.glVertex3f (-0.082207f,0.304259f,0.803817f);
  gl.glVertex3f (-0.082207f,0.296934f,0.803817f);
  gl.glVertex3f (-0.065925f,0.296934f,0.837627f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.036585f,0.304259f,0.709083f);
  gl.glVertex3f (0.065925f,0.304259f,0.732480f);
  gl.glVertex3f (0.065925f,0.296934f,0.732480f);
  gl.glVertex3f (0.036585f,0.296934f,0.709083f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.036585f,0.304259f,0.861024f);
  gl.glVertex3f (-0.065925f,0.304259f,0.837627f);
  gl.glVertex3f (-0.065925f,0.296934f,0.837627f);
  gl.glVertex3f (-0.036585f,0.296934f,0.861024f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.000000f,0.304259f,0.700733f);
  gl.glVertex3f (0.036585f,0.304259f,0.709083f);
  gl.glVertex3f (0.036585f,0.296934f,0.709083f);
  gl.glVertex3f (0.000000f,0.296934f,0.700733f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.000000f,0.304259f,0.869374f);
  gl.glVertex3f (-0.036585f,0.304259f,0.861024f);
  gl.glVertex3f (-0.036585f,0.296934f,0.861024f);
  gl.glVertex3f (-0.000000f,0.296934f,0.869374f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.036585f,0.304259f,0.861024f);
  gl.glVertex3f (-0.000000f,0.304259f,0.869374f);
  gl.glVertex3f (-0.000000f,0.296934f,0.869374f);
  gl.glVertex3f (0.036585f,0.296934f,0.861024f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.036585f,0.304259f,0.709083f);
  gl.glVertex3f (0.000000f,0.304259f,0.700733f);
  gl.glVertex3f (0.000000f,0.296934f,0.700733f);
  gl.glVertex3f (-0.036585f,0.296934f,0.709083f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.294197f,0.286109f,0.759961f);
  gl.glVertex3f (0.259513f,0.286109f,0.787620f);
  gl.glVertex3f (0.259513f,0.304259f,0.787620f);
  gl.glVertex3f (0.294197f,0.304259f,0.759961f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.138329f,0.286109f,0.635660f);
  gl.glVertex3f (0.173013f,0.286109f,0.608000f);
  gl.glVertex3f (0.173013f,0.304259f,0.608000f);
  gl.glVertex3f (0.138329f,0.304259f,0.635660f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.313446f,0.286109f,0.719991f);
  gl.glVertex3f (0.294197f,0.286109f,0.759961f);
  gl.glVertex3f (0.294197f,0.304259f,0.759961f);
  gl.glVertex3f (0.313446f,0.304259f,0.719991f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.119081f,0.286109f,0.675629f);
  gl.glVertex3f (0.138329f,0.286109f,0.635660f);
  gl.glVertex3f (0.138329f,0.304259f,0.635660f);
  gl.glVertex3f (0.119081f,0.304259f,0.675629f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.313446f,0.286109f,0.675629f);
  gl.glVertex3f (0.313446f,0.286109f,0.719991f);
  gl.glVertex3f (0.313446f,0.304259f,0.719991f);
  gl.glVertex3f (0.313446f,0.304259f,0.675629f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.119081f,0.286109f,0.719991f);
  gl.glVertex3f (0.119081f,0.286109f,0.675629f);
  gl.glVertex3f (0.119081f,0.304259f,0.675629f);
  gl.glVertex3f (0.119081f,0.304259f,0.719991f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.294197f,0.286109f,0.635660f);
  gl.glVertex3f (0.313446f,0.286109f,0.675629f);
  gl.glVertex3f (0.313446f,0.304259f,0.675629f);
  gl.glVertex3f (0.294197f,0.304259f,0.635660f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.138329f,0.286109f,0.759961f);
  gl.glVertex3f (0.119081f,0.286109f,0.719991f);
  gl.glVertex3f (0.119081f,0.304259f,0.719991f);
  gl.glVertex3f (0.138329f,0.304259f,0.759961f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.259513f,0.286109f,0.608000f);
  gl.glVertex3f (0.294197f,0.286109f,0.635660f);
  gl.glVertex3f (0.294197f,0.304259f,0.635660f);
  gl.glVertex3f (0.259513f,0.304259f,0.608000f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.173013f,0.286109f,0.787620f);
  gl.glVertex3f (0.138329f,0.286109f,0.759961f);
  gl.glVertex3f (0.138329f,0.304259f,0.759961f);
  gl.glVertex3f (0.173013f,0.304259f,0.787620f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.216263f,0.286109f,0.598128f);
  gl.glVertex3f (0.259513f,0.286109f,0.608000f);
  gl.glVertex3f (0.259513f,0.304259f,0.608000f);
  gl.glVertex3f (0.216263f,0.304259f,0.598128f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.216263f,0.286109f,0.797492f);
  gl.glVertex3f (0.173013f,0.286109f,0.787620f);
  gl.glVertex3f (0.173013f,0.304259f,0.787620f);
  gl.glVertex3f (0.216263f,0.304259f,0.797492f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.259513f,0.286109f,0.787620f);
  gl.glVertex3f (0.216263f,0.286109f,0.797492f);
  gl.glVertex3f (0.216263f,0.304259f,0.797492f);
  gl.glVertex3f (0.259513f,0.304259f,0.787620f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.173013f,0.286109f,0.608000f);
  gl.glVertex3f (0.216263f,0.286109f,0.598128f);
  gl.glVertex3f (0.216263f,0.304259f,0.598128f);
  gl.glVertex3f (0.173013f,0.304259f,0.608000f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.259513f,0.304259f,0.787620f);
  gl.glVertex3f (0.216263f,0.304259f,0.797492f);
  gl.glVertex3f (0.216263f,0.304259f,0.782131f);
  gl.glVertex3f (0.252849f,0.304259f,0.773781f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.282188f,0.304259f,0.750383f);
  gl.glVertex3f (0.252849f,0.304259f,0.773781f);
  gl.glVertex3f (0.252849f,0.296934f,0.773781f);
  gl.glVertex3f (0.282188f,0.296934f,0.750383f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.173013f,0.304259f,0.608000f);
  gl.glVertex3f (0.216263f,0.304259f,0.598128f);
  gl.glVertex3f (0.216263f,0.304259f,0.613489f);
  gl.glVertex3f (0.179678f,0.304259f,0.621840f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.294197f,0.304259f,0.759961f);
  gl.glVertex3f (0.259513f,0.304259f,0.787620f);
  gl.glVertex3f (0.252849f,0.304259f,0.773781f);
  gl.glVertex3f (0.282188f,0.304259f,0.750383f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.138329f,0.304259f,0.635660f);
  gl.glVertex3f (0.173013f,0.304259f,0.608000f);
  gl.glVertex3f (0.179678f,0.304259f,0.621840f);
  gl.glVertex3f (0.150339f,0.304259f,0.645237f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.313446f,0.304259f,0.719991f);
  gl.glVertex3f (0.294197f,0.304259f,0.759961f);
  gl.glVertex3f (0.282188f,0.304259f,0.750383f);
  gl.glVertex3f (0.298470f,0.304259f,0.716573f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.119081f,0.304259f,0.675629f);
  gl.glVertex3f (0.138329f,0.304259f,0.635660f);
  gl.glVertex3f (0.150339f,0.304259f,0.645237f);
  gl.glVertex3f (0.134057f,0.304259f,0.679047f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.313446f,0.304259f,0.675629f);
  gl.glVertex3f (0.313446f,0.304259f,0.719991f);
  gl.glVertex3f (0.298470f,0.304259f,0.716573f);
  gl.glVertex3f (0.298470f,0.304259f,0.679047f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.119081f,0.304259f,0.719991f);
  gl.glVertex3f (0.119081f,0.304259f,0.675629f);
  gl.glVertex3f (0.134057f,0.304259f,0.679047f);
  gl.glVertex3f (0.134057f,0.304259f,0.716573f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.294197f,0.304259f,0.635660f);
  gl.glVertex3f (0.313446f,0.304259f,0.675629f);
  gl.glVertex3f (0.298470f,0.304259f,0.679047f);
  gl.glVertex3f (0.282188f,0.304259f,0.645237f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.138329f,0.304259f,0.759961f);
  gl.glVertex3f (0.119081f,0.304259f,0.719991f);
  gl.glVertex3f (0.134057f,0.304259f,0.716573f);
  gl.glVertex3f (0.150339f,0.304259f,0.750383f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.259513f,0.304259f,0.608000f);
  gl.glVertex3f (0.294197f,0.304259f,0.635660f);
  gl.glVertex3f (0.282188f,0.304259f,0.645237f);
  gl.glVertex3f (0.252849f,0.304259f,0.621840f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.173013f,0.304259f,0.787620f);
  gl.glVertex3f (0.138329f,0.304259f,0.759961f);
  gl.glVertex3f (0.150339f,0.304259f,0.750383f);
  gl.glVertex3f (0.179678f,0.304259f,0.773781f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.216263f,0.304259f,0.598128f);
  gl.glVertex3f (0.259513f,0.304259f,0.608000f);
  gl.glVertex3f (0.252849f,0.304259f,0.621840f);
  gl.glVertex3f (0.216263f,0.304259f,0.613489f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.216263f,0.304259f,0.797492f);
  gl.glVertex3f (0.173013f,0.304259f,0.787620f);
  gl.glVertex3f (0.179678f,0.304259f,0.773781f);
  gl.glVertex3f (0.216263f,0.304259f,0.782131f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.150339f,0.304259f,0.645237f);
  gl.glVertex3f (0.179678f,0.304259f,0.621840f);
  gl.glVertex3f (0.179678f,0.296934f,0.621840f);
  gl.glVertex3f (0.150339f,0.296934f,0.645237f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.298470f,0.304259f,0.716573f);
  gl.glVertex3f (0.282188f,0.304259f,0.750383f);
  gl.glVertex3f (0.282188f,0.296934f,0.750383f);
  gl.glVertex3f (0.298470f,0.296934f,0.716573f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.134057f,0.304259f,0.679047f);
  gl.glVertex3f (0.150339f,0.304259f,0.645237f);
  gl.glVertex3f (0.150339f,0.296934f,0.645237f);
  gl.glVertex3f (0.134057f,0.296934f,0.679047f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.298470f,0.304259f,0.679047f);
  gl.glVertex3f (0.298470f,0.304259f,0.716573f);
  gl.glVertex3f (0.298470f,0.296934f,0.716573f);
  gl.glVertex3f (0.298470f,0.296934f,0.679047f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.134057f,0.304259f,0.716573f);
  gl.glVertex3f (0.134057f,0.304259f,0.679047f);
  gl.glVertex3f (0.134057f,0.296934f,0.679047f);
  gl.glVertex3f (0.134057f,0.296934f,0.716573f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.282188f,0.304259f,0.645237f);
  gl.glVertex3f (0.298470f,0.304259f,0.679047f);
  gl.glVertex3f (0.298470f,0.296934f,0.679047f);
  gl.glVertex3f (0.282188f,0.296934f,0.645237f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.150339f,0.304259f,0.750383f);
  gl.glVertex3f (0.134057f,0.304259f,0.716573f);
  gl.glVertex3f (0.134057f,0.296934f,0.716573f);
  gl.glVertex3f (0.150339f,0.296934f,0.750383f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.252849f,0.304259f,0.621840f);
  gl.glVertex3f (0.282188f,0.304259f,0.645237f);
  gl.glVertex3f (0.282188f,0.296934f,0.645237f);
  gl.glVertex3f (0.252849f,0.296934f,0.621840f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.179678f,0.304259f,0.773781f);
  gl.glVertex3f (0.150339f,0.304259f,0.750383f);
  gl.glVertex3f (0.150339f,0.296934f,0.750383f);
  gl.glVertex3f (0.179678f,0.296934f,0.773781f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.216263f,0.304259f,0.613489f);
  gl.glVertex3f (0.252849f,0.304259f,0.621840f);
  gl.glVertex3f (0.252849f,0.296934f,0.621840f);
  gl.glVertex3f (0.216263f,0.296934f,0.613489f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.216263f,0.304259f,0.782131f);
  gl.glVertex3f (0.179678f,0.304259f,0.773781f);
  gl.glVertex3f (0.179678f,0.296934f,0.773781f);
  gl.glVertex3f (0.216263f,0.296934f,0.782131f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.252849f,0.304259f,0.773781f);
  gl.glVertex3f (0.216263f,0.304259f,0.782131f);
  gl.glVertex3f (0.216263f,0.296934f,0.782131f);
  gl.glVertex3f (0.252849f,0.296934f,0.773781f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.179678f,0.304259f,0.621840f);
  gl.glVertex3f (0.216263f,0.304259f,0.613489f);
  gl.glVertex3f (0.216263f,0.296934f,0.613489f);
  gl.glVertex3f (0.179678f,0.296934f,0.621840f);
gl.glEnd();


    



}
     
     
     
     
}