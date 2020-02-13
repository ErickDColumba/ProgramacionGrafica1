/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructuraPardes.Interiores;

import javax.media.opengl.GL;

/**
 *
 * @author EDCP
 */
public class ParedesRectas {
      
    GL gl;
    float r,g,b;

    public ParedesRectas(GL gl, float r, float g, float b) {
        this.gl = gl;
        this.r = r;
        this.g = g;
        this.b = b;
    }
    
    
   
    
    public void dibujaParedesRectas(){
        
        gl.glColor3f(r, g, b);
 gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.589808f,0.250000f,-0.449037f);
  gl.glVertex3f (0.589808f,0.000000f,-0.449037f);
  gl.glVertex3f (0.741977f,0.000000f,-0.670359f);
  gl.glVertex3f (0.739910f,0.250000f,-0.666733f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.384402f,0.000000f,-0.307907f);
  gl.glVertex3f (0.890782f,0.000000f,-0.552625f);
  gl.glVertex3f (0.890782f,0.250000f,-0.533031f);
  gl.glVertex3f (0.384402f,0.250000f,-0.307907f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.641744f,0.250000f,-0.428239f);
  gl.glVertex3f (-0.642964f,0.250000f,-0.759628f);
  gl.glVertex3f (-0.642964f,0.000000f,-0.759628f);
  gl.glVertex3f (-0.641744f,0.000000f,-0.428239f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.641744f,0.250000f,-0.592590f);
  gl.glVertex3f (-0.641744f,0.000000f,-0.592590f);
  gl.glVertex3f (-0.426167f,0.000000f,-0.592590f);
  gl.glVertex3f (-0.426167f,0.250000f,-0.592590f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.319447f,0.250000f,-0.592590f);
  gl.glVertex3f (-0.319447f,0.000000f,-0.592590f);
  gl.glVertex3f (0.099781f,0.000000f,-0.592590f);
  gl.glVertex3f (0.099781f,0.250000f,-0.592590f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.103870f,0.000000f,-0.592590f);
  gl.glVertex3f (-0.103870f,0.250000f,-0.592590f);
  gl.glVertex3f (-0.103870f,0.250000f,-0.753383f);
  gl.glVertex3f (-0.103870f,0.000000f,-0.753383f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.002044f,0.250000f,-0.592590f);
  gl.glVertex3f (-0.002044f,0.000000f,-0.592590f);
  gl.glVertex3f (0.000972f,0.000000f,-0.449037f);
  gl.glVertex3f (0.000972f,0.250000f,-0.449037f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.099781f,0.000000f,-0.449037f);
  gl.glVertex3f (0.099781f,0.250000f,-0.449037f);
  gl.glVertex3f (0.000972f,0.250000f,-0.449037f);
  gl.glVertex3f (0.000972f,0.000000f,-0.449037f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.099781f,0.250000f,-0.449037f);
  gl.glVertex3f (0.099781f,0.250000f,-0.756347f);
  gl.glVertex3f (0.099781f,0.000000f,-0.756347f);
  gl.glVertex3f (0.099781f,0.000000f,-0.449037f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.099781f,0.250000f,-0.449037f);
  gl.glVertex3f (0.099781f,0.000000f,-0.449037f);
  gl.glVertex3f (0.589808f,0.000000f,-0.449037f);
  gl.glVertex3f (0.589808f,0.250000f,-0.449037f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.470146f,0.000000f,-0.185135f);
  gl.glVertex3f (0.470146f,0.250000f,-0.185135f);
  gl.glVertex3f (0.919801f,0.250000f,-0.385201f);
  gl.glVertex3f (0.920460f,0.000000f,-0.385540f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.581725f,0.250018f,-0.464010f);
  gl.glVertex3f (0.731827f,0.250018f,-0.681706f);
  gl.glVertex3f (0.733894f,0.000018f,-0.685332f);
  gl.glVertex3f (0.581725f,0.000018f,-0.464010f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.381086f,0.000753f,-0.327138f);
  gl.glVertex3f (0.381086f,0.250753f,-0.327138f);
  gl.glVertex3f (0.887466f,0.250753f,-0.552262f);
  gl.glVertex3f (0.887466f,0.000753f,-0.571856f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.629551f,0.250000f,-0.428359f);
  gl.glVertex3f (-0.629551f,0.000000f,-0.428359f);
  gl.glVertex3f (-0.630771f,0.000000f,-0.759748f);
  gl.glVertex3f (-0.630771f,0.250000f,-0.759748f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.641744f,0.250000f,-0.612590f);
  gl.glVertex3f (-0.426167f,0.250000f,-0.612590f);
  gl.glVertex3f (-0.426167f,0.000000f,-0.612590f);
  gl.glVertex3f (-0.641744f,0.000000f,-0.612590f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.319447f,0.250000f,-0.612590f);
  gl.glVertex3f (0.099781f,0.250000f,-0.612590f);
  gl.glVertex3f (0.099781f,0.000000f,-0.612590f);
  gl.glVertex3f (-0.319447f,0.000000f,-0.612590f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.091676f,0.000000f,-0.592590f);
  gl.glVertex3f (-0.091676f,0.000000f,-0.753383f);
  gl.glVertex3f (-0.091676f,0.250000f,-0.753383f);
  gl.glVertex3f (-0.091676f,0.250000f,-0.592590f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.010142f,0.250000f,-0.593278f);
  gl.glVertex3f (0.013158f,0.250000f,-0.449725f);
  gl.glVertex3f (0.013158f,0.000000f,-0.449725f);
  gl.glVertex3f (0.010142f,0.000000f,-0.593278f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.099781f,0.000000f,-0.469037f);
  gl.glVertex3f (0.000972f,0.000000f,-0.469037f);
  gl.glVertex3f (0.000972f,0.250000f,-0.469037f);
  gl.glVertex3f (0.099781f,0.250000f,-0.469037f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.111974f,0.250000f,-0.449037f);
  gl.glVertex3f (0.111974f,0.000000f,-0.449037f);
  gl.glVertex3f (0.111975f,0.000000f,-0.756347f);
  gl.glVertex3f (0.111975f,0.250000f,-0.756347f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.099781f,0.250000f,-0.469037f);
  gl.glVertex3f (0.589808f,0.250000f,-0.469037f);
  gl.glVertex3f (0.589808f,0.000000f,-0.469037f);
  gl.glVertex3f (0.099781f,0.000000f,-0.469037f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.473338f,-0.000001f,-0.165833f);
  gl.glVertex3f (0.923653f,-0.000001f,-0.366238f);
  gl.glVertex3f (0.922994f,0.249999f,-0.365899f);
  gl.glVertex3f (0.473338f,0.249999f,-0.165833f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.589808f,0.250000f,-0.449037f);
  gl.glVertex3f (0.739910f,0.250000f,-0.666733f);
  gl.glVertex3f (0.731827f,0.250018f,-0.681706f);
  gl.glVertex3f (0.581725f,0.250018f,-0.464010f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.890782f,0.250000f,-0.533031f);
  gl.glVertex3f (0.890782f,0.000000f,-0.552625f);
  gl.glVertex3f (0.887466f,0.000753f,-0.571856f);
  gl.glVertex3f (0.887466f,0.250753f,-0.552262f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.384402f,0.250000f,-0.307907f);
  gl.glVertex3f (0.890782f,0.250000f,-0.533031f);
  gl.glVertex3f (0.887466f,0.250753f,-0.552262f);
  gl.glVertex3f (0.381086f,0.250753f,-0.327138f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.642964f,0.250000f,-0.759628f);
  gl.glVertex3f (-0.641744f,0.250000f,-0.428239f);
  gl.glVertex3f (-0.629551f,0.250000f,-0.428359f);
  gl.glVertex3f (-0.630771f,0.250000f,-0.759748f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.641744f,0.250000f,-0.592590f);
  gl.glVertex3f (-0.426167f,0.250000f,-0.592590f);
  gl.glVertex3f (-0.426167f,0.250000f,-0.612590f);
  gl.glVertex3f (-0.641744f,0.250000f,-0.612590f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.426167f,0.250000f,-0.592590f);
  gl.glVertex3f (-0.426167f,0.000000f,-0.592590f);
  gl.glVertex3f (-0.426167f,0.000000f,-0.612590f);
  gl.glVertex3f (-0.426167f,0.250000f,-0.612590f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.319447f,0.000000f,-0.592590f);
  gl.glVertex3f (-0.319447f,0.250000f,-0.592590f);
  gl.glVertex3f (-0.319447f,0.250000f,-0.612590f);
  gl.glVertex3f (-0.319447f,0.000000f,-0.612590f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.319447f,0.250000f,-0.592590f);
  gl.glVertex3f (0.099781f,0.250000f,-0.592590f);
  gl.glVertex3f (0.099781f,0.250000f,-0.612590f);
  gl.glVertex3f (-0.319447f,0.250000f,-0.612590f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.103870f,0.250000f,-0.753383f);
  gl.glVertex3f (-0.103870f,0.250000f,-0.592590f);
  gl.glVertex3f (-0.091676f,0.250000f,-0.592590f);
  gl.glVertex3f (-0.091676f,0.250000f,-0.753383f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.103870f,0.000000f,-0.753383f);
  gl.glVertex3f (-0.103870f,0.250000f,-0.753383f);
  gl.glVertex3f (-0.091676f,0.250000f,-0.753383f);
  gl.glVertex3f (-0.091676f,0.000000f,-0.753383f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.002044f,0.250000f,-0.592590f);
  gl.glVertex3f (0.000972f,0.250000f,-0.449037f);
  gl.glVertex3f (0.013158f,0.250000f,-0.449725f);
  gl.glVertex3f (0.010142f,0.250000f,-0.593278f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.000972f,0.250000f,-0.449037f);
  gl.glVertex3f (0.099781f,0.250000f,-0.449037f);
  gl.glVertex3f (0.099781f,0.250000f,-0.469037f);
  gl.glVertex3f (0.000972f,0.250000f,-0.469037f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.099781f,0.250000f,-0.756347f);
  gl.glVertex3f (0.099781f,0.250000f,-0.449037f);
  gl.glVertex3f (0.111974f,0.250000f,-0.449037f);
  gl.glVertex3f (0.111975f,0.250000f,-0.756347f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.099781f,0.000000f,-0.756347f);
  gl.glVertex3f (0.099781f,0.250000f,-0.756347f);
  gl.glVertex3f (0.111975f,0.250000f,-0.756347f);
  gl.glVertex3f (0.111975f,0.000000f,-0.756347f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.099781f,0.250000f,-0.449037f);
  gl.glVertex3f (0.589808f,0.250000f,-0.449037f);
  gl.glVertex3f (0.589808f,0.250000f,-0.469037f);
  gl.glVertex3f (0.099781f,0.250000f,-0.469037f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.470146f,0.250000f,-0.185135f);
  gl.glVertex3f (0.470146f,0.000000f,-0.185135f);
  gl.glVertex3f (0.473338f,-0.000001f,-0.165833f);
  gl.glVertex3f (0.473338f,0.249999f,-0.165833f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.920460f,0.000000f,-0.385540f);
  gl.glVertex3f (0.919801f,0.250000f,-0.385201f);
  gl.glVertex3f (0.922994f,0.249999f,-0.365899f);
  gl.glVertex3f (0.923653f,-0.000001f,-0.366238f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.919801f,0.250000f,-0.385201f);
  gl.glVertex3f (0.470146f,0.250000f,-0.185135f);
  gl.glVertex3f (0.473338f,0.249999f,-0.165833f);
  gl.glVertex3f (0.922994f,0.249999f,-0.365899f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.503648f,0.000000f,0.112182f);
  gl.glVertex3f (0.503648f,0.250000f,0.112182f);
  gl.glVertex3f (0.894516f,0.250000f,0.437604f);
  gl.glVertex3f (0.894516f,0.000000f,0.437604f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.498129f,0.000000f,0.130016f);
  gl.glVertex3f (0.888997f,0.000000f,0.455438f);
  gl.glVertex3f (0.888997f,0.250000f,0.455438f);
  gl.glVertex3f (0.498129f,0.250000f,0.130016f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.894516f,0.250000f,0.437604f);
  gl.glVertex3f (0.503648f,0.250000f,0.112182f);
  gl.glVertex3f (0.498129f,0.250000f,0.130016f);
  gl.glVertex3f (0.888997f,0.250000f,0.455438f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.445792f,0.250000f,0.313991f);
  gl.glVertex3f (-0.445792f,0.000000f,0.313991f);
  gl.glVertex3f (-0.875448f,0.000000f,0.470636f);
  gl.glVertex3f (-0.875448f,0.250000f,0.470636f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.443146f,0.250000f,0.333515f);
  gl.glVertex3f (-0.872803f,0.250000f,0.490159f);
  gl.glVertex3f (-0.872803f,0.000000f,0.490159f);
  gl.glVertex3f (-0.443146f,0.000000f,0.333515f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.445792f,0.000000f,0.313991f);
  gl.glVertex3f (-0.445792f,0.250000f,0.313991f);
  gl.glVertex3f (-0.443146f,0.250000f,0.333515f);
  gl.glVertex3f (-0.443146f,0.000000f,0.333515f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.445792f,0.250000f,0.313991f);
  gl.glVertex3f (-0.875448f,0.250000f,0.470636f);
  gl.glVertex3f (-0.872803f,0.250000f,0.490159f);
  gl.glVertex3f (-0.443146f,0.250000f,0.333515f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.303805f,0.250000f,0.471683f);
  gl.glVertex3f (-0.303805f,0.000000f,0.471683f);
  gl.glVertex3f (-0.623851f,0.000000f,0.769496f);
  gl.glVertex3f (-0.623851f,0.250000f,0.769496f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.297789f,0.250000f,0.489078f);
  gl.glVertex3f (-0.617834f,0.250000f,0.786891f);
  gl.glVertex3f (-0.617834f,0.000000f,0.786891f);
  gl.glVertex3f (-0.297789f,0.000000f,0.489078f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.303805f,0.250000f,0.471683f);
  gl.glVertex3f (-0.623851f,0.250000f,0.769496f);
  gl.glVertex3f (-0.617834f,0.250000f,0.786891f);
  gl.glVertex3f (-0.297789f,0.250000f,0.489078f);
gl.glEnd();

    }
}
