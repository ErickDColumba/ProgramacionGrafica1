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
public class Techo002 {
    
    
    /*Clase que dibuja un rectangulo central en el techo de nave */
    GL gl;
    float r,g,b;

    public Techo002(GL gl, float r, float g, float b) {
        this.gl = gl;
        this.r = r;
        this.g = g;
        this.b = b;
    }
  public void dibujarTecho01 (){
    
    gl.glColor3f(r, g, b);
   gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.725807f,0.270068f,-0.676715f);
  gl.glVertex3f (-0.149594f,0.270068f,-1.013576f);
  gl.glVertex3f (-0.149594f,0.270068f,-1.700681f);
  gl.glVertex3f (-0.285278f,0.270068f,-1.700681f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.722932f,0.270067f,-0.666031f);
  gl.glVertex3f (0.138081f,0.270068f,-0.976116f);
  gl.glVertex3f (0.138081f,0.270068f,-1.705348f);
  gl.glVertex3f (0.275799f,0.270068f,-1.705348f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.114614f,0.300000f,-0.259787f);
  gl.glVertex3f (0.114614f,0.300000f,-0.259787f);
  gl.glVertex3f (0.114614f,0.285492f,-0.871779f);
  gl.glVertex3f (-0.114614f,0.285492f,-0.871779f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.629187f,0.300000f,0.164440f);
  gl.glVertex3f (0.629187f,0.300000f,-0.164440f);
  gl.glVertex3f (0.209729f,0.300000f,-0.164440f);
  gl.glVertex3f (0.209729f,0.300000f,0.164440f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.634708f,0.300000f,-0.164449f);
  gl.glVertex3f (-0.634726f,0.300000f,0.164430f);
  gl.glVertex3f (-0.215268f,0.300000f,0.164453f);
  gl.glVertex3f (-0.215250f,0.300000f,-0.164427f);
gl.glEnd();

  
    
    }
  
  
    public void dibujarTecho02 (){
    
    gl.glColor3f(r-0.1f, g-0.1f, b-0.1f);
   
  gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.820473f,0.250000f,-0.534992f);
  gl.glVertex3f (-0.275225f,0.250000f,-1.802367f);
  gl.glVertex3f (-0.107287f,0.250000f,-1.802367f);
  gl.glVertex3f (-0.107287f,0.250000f,-0.951929f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.811628f,0.250000f,-0.534992f);
  gl.glVertex3f (0.266381f,0.250000f,-1.802367f);
  gl.glVertex3f (0.098442f,0.250000f,-1.802367f);
  gl.glVertex3f (0.098442f,0.250000f,-0.913118f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.811628f,0.250000f,-0.534992f);
  gl.glVertex3f (0.098442f,0.250000f,-0.913118f);
  gl.glVertex3f (0.138081f,0.270068f,-0.976116f);
  gl.glVertex3f (0.722932f,0.270067f,-0.666031f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.107287f,0.250000f,-1.802367f);
  gl.glVertex3f (-0.275225f,0.250000f,-1.802367f);
  gl.glVertex3f (-0.285278f,0.270068f,-1.700681f);
  gl.glVertex3f (-0.149594f,0.270068f,-1.700681f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.820473f,0.250000f,-0.534992f);
  gl.glVertex3f (-0.107287f,0.250000f,-0.951929f);
  gl.glVertex3f (-0.149594f,0.270068f,-1.013576f);
  gl.glVertex3f (-0.725807f,0.270068f,-0.676715f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.098442f,0.250000f,-0.913118f);
  gl.glVertex3f (0.098442f,0.250000f,-1.802367f);
  gl.glVertex3f (0.138081f,0.270068f,-1.705348f);
  gl.glVertex3f (0.138081f,0.270068f,-0.976116f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.266381f,0.250000f,-1.802367f);
  gl.glVertex3f (0.811628f,0.250000f,-0.534992f);
  gl.glVertex3f (0.722932f,0.270067f,-0.666031f);
  gl.glVertex3f (0.275799f,0.270068f,-1.705348f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.107287f,0.250000f,-0.951929f);
  gl.glVertex3f (-0.107287f,0.250000f,-1.802367f);
  gl.glVertex3f (-0.149594f,0.270068f,-1.700681f);
  gl.glVertex3f (-0.149594f,0.270068f,-1.013576f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.275225f,0.250000f,-1.802367f);
  gl.glVertex3f (-0.820473f,0.250000f,-0.534992f);
  gl.glVertex3f (-0.725807f,0.270068f,-0.676715f);
  gl.glVertex3f (-0.285278f,0.270068f,-1.700681f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.098442f,0.250000f,-1.802367f);
  gl.glVertex3f (0.266381f,0.250000f,-1.802367f);
  gl.glVertex3f (0.275799f,0.270068f,-1.705348f);
  gl.glVertex3f (0.138081f,0.270068f,-1.705348f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.135977f,0.250000f,-0.975925f);
  gl.glVertex3f (-0.135977f,0.250000f,-0.975925f);
  gl.glVertex3f (-0.114614f,0.285492f,-0.871779f);
  gl.glVertex3f (0.114614f,0.285492f,-0.871779f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.135977f,0.250000f,-0.264523f);
  gl.glVertex3f (0.135977f,0.250000f,-0.975925f);
  gl.glVertex3f (0.114614f,0.285492f,-0.871779f);
  gl.glVertex3f (0.114614f,0.300000f,-0.259787f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.135977f,0.250000f,-0.975925f);
  gl.glVertex3f (-0.135977f,0.250000f,-0.264523f);
  gl.glVertex3f (-0.114614f,0.300000f,-0.259787f);
  gl.glVertex3f (-0.114614f,0.285492f,-0.871779f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.135977f,0.250000f,-0.264523f);
  gl.glVertex3f (0.135977f,0.250000f,-0.264523f);
  gl.glVertex3f (0.114614f,0.300000f,-0.259787f);
  gl.glVertex3f (-0.114614f,0.300000f,-0.259787f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.212234f,0.250000f,0.195090f);
  gl.glVertex3f (0.746462f,0.250000f,0.195090f);
  gl.glVertex3f (0.629187f,0.300000f,0.164440f);
  gl.glVertex3f (0.209729f,0.300000f,0.164440f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.746462f,0.250000f,0.195090f);
  gl.glVertex3f (0.746462f,0.250000f,-0.195090f);
  gl.glVertex3f (0.629187f,0.300000f,-0.164440f);
  gl.glVertex3f (0.629187f,0.300000f,0.164440f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.746462f,0.250000f,-0.195090f);
  gl.glVertex3f (0.212234f,0.250000f,-0.195090f);
  gl.glVertex3f (0.209729f,0.300000f,-0.164440f);
  gl.glVertex3f (0.629187f,0.300000f,-0.164440f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.212234f,0.250000f,0.195090f);
  gl.glVertex3f (0.209729f,0.300000f,0.164440f);
  gl.glVertex3f (0.209729f,0.300000f,-0.164440f);
  gl.glVertex3f (0.212234f,0.250000f,-0.195090f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.217753f,0.250000f,-0.195077f);
  gl.glVertex3f (-0.751982f,0.250000f,-0.195106f);
  gl.glVertex3f (-0.634708f,0.300000f,-0.164449f);
  gl.glVertex3f (-0.215250f,0.300000f,-0.164427f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.751982f,0.250000f,-0.195106f);
  gl.glVertex3f (-0.752003f,0.250000f,0.195074f);
  gl.glVertex3f (-0.634726f,0.300000f,0.164430f);
  gl.glVertex3f (-0.634708f,0.300000f,-0.164449f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.752003f,0.250000f,0.195074f);
  gl.glVertex3f (-0.217774f,0.250000f,0.195103f);
  gl.glVertex3f (-0.215268f,0.300000f,0.164453f);
  gl.glVertex3f (-0.634726f,0.300000f,0.164430f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.217753f,0.250000f,-0.195077f);
  gl.glVertex3f (-0.215250f,0.300000f,-0.164427f);
  gl.glVertex3f (-0.215268f,0.300000f,0.164453f);
  gl.glVertex3f (-0.217774f,0.250000f,0.195103f);
gl.glEnd();

    
    }
}
