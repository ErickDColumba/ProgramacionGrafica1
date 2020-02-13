/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructuraPartes.Paredes;

import BasicPrimitives.Cilindro;
import javax.media.opengl.GL;

/**
 *
 * @author EDCP
 */
public class ParedesCentro {
    GL gl;
    float r,g,b;
    Cilindro cil ;

    public ParedesCentro(GL gl, float r, float g, float b) {
        this.gl = gl;
        this.r = r;
        this.g = g;
        this.b = b;
        this.cil = new Cilindro(gl,1,1,10,10,0.4f,0.4f,0.4f);
    }
    
    public void dibujarPared001 (){
        
    //gl.glColor3f(r,g , b); 
    gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.746462f,0.000000f,-0.195090f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.746462f,0.000000f,0.195090f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.746462f,0.250000f,0.195090f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.746462f,0.250000f,-0.195090f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.831470f,0.000000f,0.555570f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.707107f,0.000000f,0.707107f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.707107f,0.250000f,0.707107f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.831470f,0.250000f,0.555570f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.382683f,0.000000f,0.923880f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.555570f,0.000000f,0.831470f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.555570f,0.250000f,0.831470f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.382683f,0.250000f,0.923880f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.923880f,0.000000f,0.382683f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.831470f,0.000000f,0.555570f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.831470f,0.250000f,0.555570f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.923880f,0.250000f,0.382683f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.195090f,0.000000f,0.980785f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.382683f,0.000000f,0.923880f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.382683f,0.250000f,0.923880f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.195090f,0.250000f,0.980785f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.980785f,0.000000f,0.195090f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.923880f,0.000000f,0.382683f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.923880f,0.250000f,0.382683f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.980785f,0.250000f,0.195090f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.000000f,0.000000f,1.000000f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.195090f,0.000000f,0.980785f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.195090f,0.250000f,0.980785f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.000000f,0.250000f,1.000000f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.195090f,0.000000f,0.980785f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.000000f,0.000000f,1.000000f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.000000f,0.250000f,1.000000f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.195090f,0.250000f,0.980785f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.923880f,0.000000f,0.382683f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.980785f,0.000000f,0.195090f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.980785f,0.250000f,0.195090f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.923880f,0.250000f,0.382683f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.382683f,0.000000f,0.923880f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.195090f,0.000000f,0.980785f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.195090f,0.250000f,0.980785f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.382683f,0.250000f,0.923880f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.831470f,0.000000f,0.555570f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.923880f,0.000000f,0.382683f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.923880f,0.250000f,0.382683f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.831470f,0.250000f,0.555570f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.555570f,0.000000f,0.831470f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.382683f,0.000000f,0.923880f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.382683f,0.250000f,0.923880f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.555570f,0.250000f,0.831470f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.707107f,0.000000f,0.707107f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.831470f,0.000000f,0.555570f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.831470f,0.250000f,0.555570f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.707107f,0.250000f,0.707107f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.707107f,0.000000f,0.707107f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.555570f,0.000000f,0.831470f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.555570f,0.250000f,0.831470f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.707107f,0.250000f,0.707107f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.555570f,0.000000f,0.831470f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.707107f,0.000000f,0.707107f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.707107f,0.250000f,0.707107f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.555570f,0.250000f,0.831470f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.743598f,0.000000f,0.195355f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.981482f,0.000000f,0.195354f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.981482f,0.250000f,0.195354f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.743598f,0.250000f,0.195355f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.743598f,0.000000f,-0.194816f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.981482f,0.000000f,-0.194816f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.981482f,0.250000f,-0.194816f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.743598f,0.250000f,-0.194816f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.831470f,0.000000f,-0.555570f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.707107f,0.000000f,-0.707107f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.707107f,0.250000f,-0.707107f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.831470f,0.250000f,-0.555570f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.555570f,0.000000f,-0.831470f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.715965f,0.000000f,-0.702874f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.739910f,0.250000f,-0.666733f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.555570f,0.250000f,-0.831470f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.707107f,0.000000f,-0.707107f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.555570f,0.000000f,-0.831470f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.555570f,0.250000f,-0.831470f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.707107f,0.250000f,-0.707107f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.715965f,0.000000f,-0.702874f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.846204f,0.000000f,-0.527715f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.846204f,0.250000f,-0.508121f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.739910f,0.250000f,-0.666733f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.555570f,0.000000f,-0.831470f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.382683f,0.000000f,-0.923880f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.382683f,0.250000f,-0.923880f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.555570f,0.250000f,-0.831470f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.382683f,0.000000f,-0.923880f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.195090f,0.000000f,-0.980785f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.195090f,0.250000f,-0.980785f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.382683f,0.250000f,-0.923880f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.195090f,0.000000f,-0.980785f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.000000f,0.000000f,-1.000000f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.000000f,0.250000f,-1.000000f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.195090f,0.250000f,-0.980785f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.000000f,0.000000f,-1.000000f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.195090f,0.000000f,-0.980785f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.195090f,0.250000f,-0.980785f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.000000f,0.250000f,-1.000000f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.980785f,0.000000f,-0.195090f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.923880f,0.000000f,-0.382683f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.923880f,0.250000f,-0.382683f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.980785f,0.250000f,-0.195090f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.195090f,0.000000f,-0.980785f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.382683f,0.000000f,-0.923880f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.382683f,0.250000f,-0.923880f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.195090f,0.250000f,-0.980785f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.923880f,0.000000f,-0.382683f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.831470f,0.000000f,-0.555570f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.831470f,0.250000f,-0.555570f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.923880f,0.250000f,-0.382683f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.382683f,0.000000f,-0.923880f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.555570f,0.000000f,-0.831470f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.555570f,0.250000f,-0.831470f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.382683f,0.250000f,-0.923880f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.920460f,0.000000f,-0.385540f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.980785f,0.000000f,-0.195090f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (0.980785f,0.250000f,-0.195090f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (0.919801f,0.250000f,-0.385201f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.981485f,0.000000f,-0.194816f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.743600f,0.000000f,-0.194816f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.743600f,0.250000f,-0.194816f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.981485f,0.250000f,-0.194816f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.544629f,0.250000f,0.126102f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.544629f,0.000000f,0.126102f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.744591f,0.000000f,0.126102f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.744591f,0.250000f,0.126102f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.981485f,0.000000f,0.195355f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.743600f,0.000000f,0.195354f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.743600f,0.250000f,0.195354f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.981485f,0.250000f,0.195355f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.744591f,0.250000f,0.126102f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.744591f,0.000000f,0.126102f);
   gl.glColor3f(r+0.1f,g+0.1f,b+0.1f);gl.glVertex3f (-0.743600f,0.000000f,0.195354f);
   gl.glColor3f(r+-0.1f,g+-0.1f,b+-0.1f);gl.glVertex3f (-0.743600f,0.250000f,0.195354f);
gl.glEnd();

   
  
    
    
    
    }
    

    



/*Metodo para dibujar y controlar el cambio de color de los propulsores*/
public void dibujarPropulsor(float rp,float gp,float bp){

 gl.glColor3f(rp, gp, bp);
 gl.glBegin(gl.GL_TRIANGLE_STRIP); 
        
        gl.glVertex3f ( -0.831470f, 0.0500000f, 0.555570f);
        gl.glVertex3f (-0.831470f, 0.200000f, 0.555570f );
        gl.glVertex3f ( -0.707107f, 0.0500000f, 0.707107f);
        gl.glVertex3f (-0.707107f, 0.200000f, 0.707107f);
        gl.glVertex3f ( -0.555570f, 0.0500000f, 0.831470f);
        gl.glVertex3f ( -0.555570f, 0.200000f, 0.831470f);
        gl.glVertex3f ( -0.382683f, 0.0500000f, 0.923880f);
        gl.glVertex3f (-0.382683f, 0.200000f, 0.923880f);
        gl.glVertex3f ( -0.195090f, 0.0500000f, 0.980785f);
        gl.glVertex3f ( -0.195090f, 0.200000f, 0.980785f);
        gl.glVertex3f ( -0.000000f, 0.0500000f, 1.000000f);
        gl.glVertex3f ( -0.000000f, 0.200000f, 1.000000f);
        gl.glVertex3f ( 0.195090f, 0.0500000f, 0.980785f);
        gl.glVertex3f (0.195090f, 0.200000f, 0.980785f);
        gl.glVertex3f ( 0.382683f, 0.0500000f, 0.923880f);
        gl.glVertex3f ( 0.382683f, 0.200000f, 0.923880f);
        gl.glVertex3f ( 0.555570f, 0.0500000f, 0.831470f);
        gl.glVertex3f (0.555570f, 0.200000f, 0.831470f);
        gl.glVertex3f ( 0.707107f, 0.0500000f, 0.707107f);
        gl.glVertex3f (0.707107f, 0.200000f, 0.707107f );
        gl.glVertex3f ( 0.831470f, 0.0500000f, 0.555570f);
        gl.glVertex3f (0.831470f, 0.200000f, 0.555570f);
              
    gl.glEnd();
    



}


public void dibujarLado(){
    
    

}
   
    
}
