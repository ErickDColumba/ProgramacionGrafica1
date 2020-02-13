/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Avatar;

import BasicPrimitives.*;
import javax.media.opengl.GL;

/**
 *
 * @author EDCP
 */
public class R2D2 {
    
    GL gl;
    public float x,y,z;
    Esfera esfera;
    Cilindro cilB;
    Cilindro cilR;
    Cilindro ci3A;
    
    Cubo cubo1;
    Cubo cubo2;
    

    public R2D2(GL gl, float x, float y, float z) {
        this.gl = gl;
        this.x = x;
        this.y = y;
        this.z = z;
        this.esfera = new Esfera (gl,1,10,10,0.8f,0.8f,0.8f,0,0,0);
        this.cilB = new Cilindro (gl,1,1,10,10,0.8f,0.8f,0.8f);
        this.cilR = new Cilindro (gl,1,1,10,10,1.0f,0.1f,0.1f);
        this.cilR = new Cilindro (gl,1,1,10,10,0.1f,0.1f,1.0f);
        this.cubo1 = new Cubo(gl,1,0.9f,0.9f,0.9f);
        this.cubo2 = new Cubo(gl,1,0,0,1);
    }
    
    
    
    public void dibujar (){
    
    gl.glPushMatrix();
    gl.glTranslated(x, y, z);
    gl.glScaled(0.08, 0.08, 0.08);
        
        dibujarR201();
        dibujarR200();
        dibujarR203();
        dibujarR202();
        
    
    gl.glPopMatrix();
        
        
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public void dibujarR200(){
      
        gl.glColor3f(0.0f, 0.0f, 1.0f);
        
        gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.000000f,-0.000000f,1.000001f);
  gl.glVertex3f (0.000000f,0.309017f,0.951057f);
  gl.glVertex3f (-0.559017f,0.309017f,0.769422f);
  gl.glVertex3f (-0.587785f,-0.000000f,0.809018f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.587785f,-0.000000f,0.809018f);
  gl.glVertex3f (-0.559017f,0.309017f,0.769422f);
  gl.glVertex3f (-0.904509f,0.309017f,0.293893f);
  gl.glVertex3f (-0.951057f,-0.000000f,0.309018f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.951057f,-0.000000f,0.309018f);
  gl.glVertex3f (-0.904509f,0.309017f,0.293893f);
  gl.glVertex3f (-0.904509f,0.309017f,-0.293892f);
  gl.glVertex3f (-0.951057f,-0.000000f,-0.309017f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.951057f,-0.000000f,-0.309017f);
  gl.glVertex3f (-0.904509f,0.309017f,-0.293892f);
  gl.glVertex3f (-0.559017f,0.309017f,-0.769421f);
  gl.glVertex3f (-0.587786f,-0.000000f,-0.809017f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.587786f,-0.000000f,-0.809017f);
  gl.glVertex3f (-0.559017f,0.309017f,-0.769421f);
  gl.glVertex3f (0.000000f,0.309017f,-0.951057f);
  gl.glVertex3f (0.000000f,-0.000000f,-1.000000f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.000000f,-0.000000f,1.000001f);
  gl.glVertex3f (0.587785f,-0.000000f,0.809018f);
  gl.glVertex3f (0.559017f,0.309017f,0.769422f);
  gl.glVertex3f (0.000000f,0.309017f,0.951057f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.587785f,-0.000000f,0.809018f);
  gl.glVertex3f (0.951057f,-0.000000f,0.309018f);
  gl.glVertex3f (0.904509f,0.309017f,0.293893f);
  gl.glVertex3f (0.559017f,0.309017f,0.769422f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.951057f,-0.000000f,0.309018f);
  gl.glVertex3f (0.951057f,-0.000000f,-0.309017f);
  gl.glVertex3f (0.904509f,0.309017f,-0.293892f);
  gl.glVertex3f (0.904509f,0.309017f,0.293893f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.951057f,-0.000000f,-0.309017f);
  gl.glVertex3f (0.587786f,-0.000000f,-0.809017f);
  gl.glVertex3f (0.559017f,0.309017f,-0.769421f);
  gl.glVertex3f (0.904509f,0.309017f,-0.293892f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.587786f,-0.000000f,-0.809017f);
  gl.glVertex3f (0.000000f,-0.000000f,-1.000000f);
  gl.glVertex3f (0.000000f,0.309017f,-0.951057f);
  gl.glVertex3f (0.559017f,0.309017f,-0.769421f);
gl.glEnd();
        
        
    }
    
    
    
    
    public void dibujarR201(){
      
  gl.glColor3f(0.9f, 0.9f, 0.9f);
    gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.951057f,-1.264264f,-0.309017f);
  gl.glVertex3f (0.708883f,-1.738760f,-0.742219f);
  gl.glVertex3f (0.708883f,-1.738760f,0.742220f);
  gl.glVertex3f (0.951057f,-1.264264f,0.309018f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.951057f,-0.000000f,-0.309017f);
  gl.glVertex3f (-0.951057f,-1.264264f,-0.309017f);
  gl.glVertex3f (-1.296558f,-1.264264f,-0.309017f);
  gl.glVertex3f (-1.296558f,-0.000000f,-0.309017f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-1.296558f,-0.000000f,0.309018f);
  gl.glVertex3f (-1.296558f,-0.000000f,-0.309017f);
  gl.glVertex3f (-1.296558f,-1.264264f,-0.309017f);
  gl.glVertex3f (-1.296558f,-1.264264f,0.309018f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.951057f,-0.000000f,0.309018f);
  gl.glVertex3f (-0.951057f,-0.000000f,-0.309017f);
  gl.glVertex3f (-1.296558f,-0.000000f,-0.309017f);
  gl.glVertex3f (-1.296558f,-0.000000f,0.309018f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.951057f,-1.264264f,0.309018f);
  gl.glVertex3f (-0.951057f,-0.000000f,0.309018f);
  gl.glVertex3f (-1.296558f,-0.000000f,0.309018f);
  gl.glVertex3f (-1.296558f,-1.264264f,0.309018f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-1.296558f,-1.264264f,-0.309017f);
  gl.glVertex3f (-0.951057f,-1.264264f,-0.309017f);
  gl.glVertex3f (-0.708883f,-1.738760f,-0.742219f);
  gl.glVertex3f (-1.538732f,-1.738760f,-0.742219f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.951057f,-1.264264f,0.309018f);
  gl.glVertex3f (-1.296558f,-1.264264f,0.309018f);
  gl.glVertex3f (-1.538732f,-1.738760f,0.742220f);
  gl.glVertex3f (-0.708883f,-1.738760f,0.742220f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-1.296558f,-1.264264f,0.309018f);
  gl.glVertex3f (-1.296558f,-1.264264f,-0.309017f);
  gl.glVertex3f (-1.538732f,-1.738760f,-0.742219f);
  gl.glVertex3f (-1.538732f,-1.738760f,0.742220f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.951057f,-1.264264f,-0.309017f);
  gl.glVertex3f (-0.951057f,-1.264264f,0.309018f);
  gl.glVertex3f (-0.708883f,-1.738760f,0.742220f);
  gl.glVertex3f (-0.708883f,-1.738760f,-0.742219f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.951057f,-0.000000f,-0.309017f);
  gl.glVertex3f (1.296558f,-0.000000f,-0.309017f);
  gl.glVertex3f (1.296558f,-1.264264f,-0.309017f);
  gl.glVertex3f (0.951057f,-1.264264f,-0.309017f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (1.296558f,-0.000000f,0.309018f);
  gl.glVertex3f (1.296558f,-1.264264f,0.309018f);
  gl.glVertex3f (1.296558f,-1.264264f,-0.309017f);
  gl.glVertex3f (1.296558f,-0.000000f,-0.309017f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.951057f,-0.000000f,0.309018f);
  gl.glVertex3f (1.296558f,-0.000000f,0.309018f);
  gl.glVertex3f (1.296558f,-0.000000f,-0.309017f);
  gl.glVertex3f (0.951057f,-0.000000f,-0.309017f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.951057f,-1.264264f,0.309018f);
  gl.glVertex3f (1.296558f,-1.264264f,0.309018f);
  gl.glVertex3f (1.296558f,-0.000000f,0.309018f);
  gl.glVertex3f (0.951057f,-0.000000f,0.309018f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (1.296558f,-1.264264f,-0.309017f);
  gl.glVertex3f (1.538732f,-1.738760f,-0.742219f);
  gl.glVertex3f (0.708883f,-1.738760f,-0.742219f);
  gl.glVertex3f (0.951057f,-1.264264f,-0.309017f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.951057f,-1.264264f,0.309018f);
  gl.glVertex3f (0.708883f,-1.738760f,0.742220f);
  gl.glVertex3f (1.538732f,-1.738760f,0.742220f);
  gl.glVertex3f (1.296558f,-1.264264f,0.309018f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (1.296558f,-1.264264f,0.309018f);
  gl.glVertex3f (1.538732f,-1.738760f,0.742220f);
  gl.glVertex3f (1.538732f,-1.738760f,-0.742219f);
  gl.glVertex3f (1.296558f,-1.264264f,-0.309017f);
gl.glEnd();

    
    
    
    
    }
    
    
    
    public void dibujarR202(){
      
        gl.glColor3f(0.8f, 0.8f, 0.8f);
 gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.951057f,-0.000000f,-0.309017f);
  gl.glVertex3f (-0.587786f,-0.000000f,-0.809017f);
  gl.glVertex3f (-0.587786f,-1.264264f,-0.809017f);
  gl.glVertex3f (-0.951057f,-1.264264f,-0.309017f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.587786f,-0.000000f,-0.809017f);
  gl.glVertex3f (0.000000f,-0.000000f,-1.000000f);
  gl.glVertex3f (0.000000f,-1.264264f,-1.000000f);
  gl.glVertex3f (-0.587786f,-1.264264f,-0.809017f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.951057f,-0.000000f,-0.309017f);
  gl.glVertex3f (0.951057f,-1.264264f,-0.309017f);
  gl.glVertex3f (0.587786f,-1.264264f,-0.809017f);
  gl.glVertex3f (0.587786f,-0.000000f,-0.809017f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.587786f,-0.000000f,-0.809017f);
  gl.glVertex3f (0.587786f,-1.264264f,-0.809017f);
  gl.glVertex3f (0.000000f,-1.264264f,-1.000000f);
  gl.glVertex3f (0.000000f,-0.000000f,-1.000000f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.000000f,-0.000000f,1.000001f);
  gl.glVertex3f (-0.587785f,-0.000000f,0.809018f);
  gl.glVertex3f (-0.587785f,-1.264264f,0.809018f);
  gl.glVertex3f (0.000000f,-1.264264f,1.000001f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.587785f,-0.000000f,0.809018f);
  gl.glVertex3f (-0.951057f,-0.000000f,0.309018f);
  gl.glVertex3f (-0.951057f,-1.264264f,0.309018f);
  gl.glVertex3f (-0.587785f,-1.264264f,0.809018f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.000000f,-0.000000f,1.000001f);
  gl.glVertex3f (0.000000f,-1.264264f,1.000001f);
  gl.glVertex3f (0.587785f,-1.264264f,0.809018f);
  gl.glVertex3f (0.587785f,-0.000000f,0.809018f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.587785f,-0.000000f,0.809018f);
  gl.glVertex3f (0.587785f,-1.264264f,0.809018f);
  gl.glVertex3f (0.951057f,-1.264264f,0.309018f);
  gl.glVertex3f (0.951057f,-0.000000f,0.309018f);
gl.glEnd();



    
    
    
    }
    
    
    
     public void dibujarR203(){
      
        gl.glColor3f(0.8f, 0.8f, 0.8f);
    
    
    gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.000000f,0.587785f,0.809018f);
  gl.glVertex3f (-0.345492f,0.809017f,0.475529f);
  gl.glVertex3f (-0.475529f,0.587785f,0.654509f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.000000f,0.587785f,0.809018f);
  gl.glVertex3f (-0.559017f,0.309017f,0.769422f);
  gl.glVertex3f (0.000000f,0.309017f,0.951057f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.000000f,0.809017f,0.587786f);
  gl.glVertex3f (-0.181636f,0.951057f,0.250001f);
  gl.glVertex3f (-0.345492f,0.809017f,0.475529f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.475529f,0.587785f,0.654509f);
  gl.glVertex3f (-0.559017f,0.809017f,0.181636f);
  gl.glVertex3f (-0.769421f,0.587785f,0.250000f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.475529f,0.587785f,0.654509f);
  gl.glVertex3f (-0.904509f,0.309017f,0.293893f);
  gl.glVertex3f (-0.559017f,0.309017f,0.769422f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.181636f,0.951057f,0.250001f);
  gl.glVertex3f (-0.559017f,0.809017f,0.181636f);
  gl.glVertex3f (-0.345492f,0.809017f,0.475529f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.293893f,0.951057f,0.095492f);
  gl.glVertex3f (-0.559017f,0.809017f,-0.181635f);
  gl.glVertex3f (-0.559017f,0.809017f,0.181636f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.769421f,0.587785f,0.250000f);
  gl.glVertex3f (-0.559017f,0.809017f,-0.181635f);
  gl.glVertex3f (-0.769421f,0.587785f,-0.250000f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.769421f,0.587785f,0.250000f);
  gl.glVertex3f (-0.904509f,0.309017f,-0.293892f);
  gl.glVertex3f (-0.904509f,0.309017f,0.293893f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.293893f,0.951057f,-0.095491f);
  gl.glVertex3f (-0.345492f,0.809017f,-0.475528f);
  gl.glVertex3f (-0.559017f,0.809017f,-0.181635f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.769421f,0.587785f,-0.250000f);
  gl.glVertex3f (-0.345492f,0.809017f,-0.475528f);
  gl.glVertex3f (-0.475529f,0.587785f,-0.654509f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.769421f,0.587785f,-0.250000f);
  gl.glVertex3f (-0.559017f,0.309017f,-0.769421f);
  gl.glVertex3f (-0.904509f,0.309017f,-0.293892f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.475529f,0.587785f,-0.654509f);
  gl.glVertex3f (0.000000f,0.309017f,-0.951057f);
  gl.glVertex3f (-0.559017f,0.309017f,-0.769421f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.181636f,0.951057f,-0.250000f);
  gl.glVertex3f (0.000000f,0.809017f,-0.587785f);
  gl.glVertex3f (-0.345492f,0.809017f,-0.475528f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.475529f,0.587785f,-0.654509f);
  gl.glVertex3f (0.000000f,0.809017f,-0.587785f);
  gl.glVertex3f (0.000000f,0.587785f,-0.809017f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.475529f,0.587785f,0.654509f);
  gl.glVertex3f (0.000000f,0.809017f,0.587786f);
  gl.glVertex3f (0.000000f,0.587785f,0.809018f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.559017f,0.309017f,0.769422f);
  gl.glVertex3f (0.000000f,0.587785f,0.809018f);
  gl.glVertex3f (0.000000f,0.309017f,0.951057f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.000000f,0.809017f,0.587786f);
  gl.glVertex3f (0.181636f,0.951057f,0.250001f);
  gl.glVertex3f (0.000000f,0.951057f,0.309018f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.475529f,0.587785f,0.654509f);
  gl.glVertex3f (0.559017f,0.809017f,0.181636f);
  gl.glVertex3f (0.345492f,0.809017f,0.475529f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.904509f,0.309017f,0.293893f);
  gl.glVertex3f (0.475529f,0.587785f,0.654509f);
  gl.glVertex3f (0.559017f,0.309017f,0.769422f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.559017f,0.809017f,0.181636f);
  gl.glVertex3f (0.181636f,0.951057f,0.250001f);
  gl.glVertex3f (0.345492f,0.809017f,0.475529f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.559017f,0.809017f,0.181636f);
  gl.glVertex3f (0.293893f,0.951057f,-0.095491f);
  gl.glVertex3f (0.293893f,0.951057f,0.095492f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.769421f,0.587785f,0.250000f);
  gl.glVertex3f (0.559017f,0.809017f,-0.181635f);
  gl.glVertex3f (0.559017f,0.809017f,0.181636f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.904509f,0.309017f,0.293893f);
  gl.glVertex3f (0.769421f,0.587785f,-0.250000f);
  gl.glVertex3f (0.769421f,0.587785f,0.250000f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.000000f,0.951057f,-0.309017f);
  gl.glVertex3f (-0.293893f,0.951057f,-0.095491f);
  gl.glVertex3f (-0.181636f,0.951057f,0.250001f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.345492f,0.809017f,-0.475528f);
  gl.glVertex3f (0.293893f,0.951057f,-0.095491f);
  gl.glVertex3f (0.559017f,0.809017f,-0.181635f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.769421f,0.587785f,-0.250000f);
  gl.glVertex3f (0.345492f,0.809017f,-0.475528f);
  gl.glVertex3f (0.559017f,0.809017f,-0.181635f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.559017f,0.309017f,-0.769421f);
  gl.glVertex3f (0.769421f,0.587785f,-0.250000f);
  gl.glVertex3f (0.904509f,0.309017f,-0.293892f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.000000f,0.309017f,-0.951057f);
  gl.glVertex3f (0.475529f,0.587785f,-0.654509f);
  gl.glVertex3f (0.559017f,0.309017f,-0.769421f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.000000f,0.809017f,-0.587785f);
  gl.glVertex3f (0.181636f,0.951057f,-0.250000f);
  gl.glVertex3f (0.345492f,0.809017f,-0.475528f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.000000f,0.587785f,-0.809017f);
  gl.glVertex3f (0.345492f,0.809017f,-0.475528f);
  gl.glVertex3f (0.475529f,0.587785f,-0.654509f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.000000f,0.587785f,0.809018f);
  gl.glVertex3f (0.000000f,0.809017f,0.587786f);
  gl.glVertex3f (-0.345492f,0.809017f,0.475529f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.000000f,0.587785f,0.809018f);
  gl.glVertex3f (-0.475529f,0.587785f,0.654509f);
  gl.glVertex3f (-0.559017f,0.309017f,0.769422f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.000000f,0.809017f,0.587786f);
  gl.glVertex3f (0.000000f,0.951057f,0.309018f);
  gl.glVertex3f (-0.181636f,0.951057f,0.250001f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.475529f,0.587785f,0.654509f);
  gl.glVertex3f (-0.345492f,0.809017f,0.475529f);
  gl.glVertex3f (-0.559017f,0.809017f,0.181636f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.475529f,0.587785f,0.654509f);
  gl.glVertex3f (-0.769421f,0.587785f,0.250000f);
  gl.glVertex3f (-0.904509f,0.309017f,0.293893f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.181636f,0.951057f,0.250001f);
  gl.glVertex3f (-0.293893f,0.951057f,0.095492f);
  gl.glVertex3f (-0.559017f,0.809017f,0.181636f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.293893f,0.951057f,0.095492f);
  gl.glVertex3f (-0.293893f,0.951057f,-0.095491f);
  gl.glVertex3f (-0.559017f,0.809017f,-0.181635f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.769421f,0.587785f,0.250000f);
  gl.glVertex3f (-0.559017f,0.809017f,0.181636f);
  gl.glVertex3f (-0.559017f,0.809017f,-0.181635f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.769421f,0.587785f,0.250000f);
  gl.glVertex3f (-0.769421f,0.587785f,-0.250000f);
  gl.glVertex3f (-0.904509f,0.309017f,-0.293892f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.293893f,0.951057f,-0.095491f);
  gl.glVertex3f (-0.181636f,0.951057f,-0.250000f);
  gl.glVertex3f (-0.345492f,0.809017f,-0.475528f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.769421f,0.587785f,-0.250000f);
  gl.glVertex3f (-0.559017f,0.809017f,-0.181635f);
  gl.glVertex3f (-0.345492f,0.809017f,-0.475528f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.769421f,0.587785f,-0.250000f);
  gl.glVertex3f (-0.475529f,0.587785f,-0.654509f);
  gl.glVertex3f (-0.559017f,0.309017f,-0.769421f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.475529f,0.587785f,-0.654509f);
  gl.glVertex3f (0.000000f,0.587785f,-0.809017f);
  gl.glVertex3f (0.000000f,0.309017f,-0.951057f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.181636f,0.951057f,-0.250000f);
  gl.glVertex3f (0.000000f,0.951057f,-0.309017f);
  gl.glVertex3f (0.000000f,0.809017f,-0.587785f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.475529f,0.587785f,-0.654509f);
  gl.glVertex3f (-0.345492f,0.809017f,-0.475528f);
  gl.glVertex3f (0.000000f,0.809017f,-0.587785f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.475529f,0.587785f,0.654509f);
  gl.glVertex3f (0.345492f,0.809017f,0.475529f);
  gl.glVertex3f (0.000000f,0.809017f,0.587786f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.559017f,0.309017f,0.769422f);
  gl.glVertex3f (0.475529f,0.587785f,0.654509f);
  gl.glVertex3f (0.000000f,0.587785f,0.809018f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.000000f,0.809017f,0.587786f);
  gl.glVertex3f (0.345492f,0.809017f,0.475529f);
  gl.glVertex3f (0.181636f,0.951057f,0.250001f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.475529f,0.587785f,0.654509f);
  gl.glVertex3f (0.769421f,0.587785f,0.250000f);
  gl.glVertex3f (0.559017f,0.809017f,0.181636f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.904509f,0.309017f,0.293893f);
  gl.glVertex3f (0.769421f,0.587785f,0.250000f);
  gl.glVertex3f (0.475529f,0.587785f,0.654509f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.559017f,0.809017f,0.181636f);
  gl.glVertex3f (0.293893f,0.951057f,0.095492f);
  gl.glVertex3f (0.181636f,0.951057f,0.250001f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.559017f,0.809017f,0.181636f);
  gl.glVertex3f (0.559017f,0.809017f,-0.181635f);
  gl.glVertex3f (0.293893f,0.951057f,-0.095491f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.769421f,0.587785f,0.250000f);
  gl.glVertex3f (0.769421f,0.587785f,-0.250000f);
  gl.glVertex3f (0.559017f,0.809017f,-0.181635f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.904509f,0.309017f,0.293893f);
  gl.glVertex3f (0.904509f,0.309017f,-0.293892f);
  gl.glVertex3f (0.769421f,0.587785f,-0.250000f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.181636f,0.951057f,0.250001f);
  gl.glVertex3f (0.000000f,0.951057f,0.309018f);
  gl.glVertex3f (0.181636f,0.951057f,0.250001f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.181636f,0.951057f,0.250001f);
  gl.glVertex3f (0.293893f,0.951057f,0.095492f);
  gl.glVertex3f (-0.181636f,0.951057f,0.250001f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.293893f,0.951057f,0.095492f);
  gl.glVertex3f (0.293893f,0.951057f,-0.095491f);
  gl.glVertex3f (-0.181636f,0.951057f,0.250001f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.293893f,0.951057f,-0.095491f);
  gl.glVertex3f (0.181636f,0.951057f,-0.250000f);
  gl.glVertex3f (0.000000f,0.951057f,-0.309017f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.000000f,0.951057f,-0.309017f);
  gl.glVertex3f (-0.181636f,0.951057f,-0.250000f);
  gl.glVertex3f (-0.293893f,0.951057f,-0.095491f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (-0.293893f,0.951057f,-0.095491f);
  gl.glVertex3f (-0.293893f,0.951057f,0.095492f);
  gl.glVertex3f (-0.181636f,0.951057f,0.250001f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.293893f,0.951057f,-0.095491f);
  gl.glVertex3f (0.000000f,0.951057f,-0.309017f);
  gl.glVertex3f (-0.181636f,0.951057f,0.250001f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.345492f,0.809017f,-0.475528f);
  gl.glVertex3f (0.181636f,0.951057f,-0.250000f);
  gl.glVertex3f (0.293893f,0.951057f,-0.095491f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.769421f,0.587785f,-0.250000f);
  gl.glVertex3f (0.475529f,0.587785f,-0.654509f);
  gl.glVertex3f (0.345492f,0.809017f,-0.475528f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.559017f,0.309017f,-0.769421f);
  gl.glVertex3f (0.475529f,0.587785f,-0.654509f);
  gl.glVertex3f (0.769421f,0.587785f,-0.250000f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.000000f,0.309017f,-0.951057f);
  gl.glVertex3f (0.000000f,0.587785f,-0.809017f);
  gl.glVertex3f (0.475529f,0.587785f,-0.654509f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.000000f,0.809017f,-0.587785f);
  gl.glVertex3f (0.000000f,0.951057f,-0.309017f);
  gl.glVertex3f (0.181636f,0.951057f,-0.250000f);
gl.glEnd();
gl.glBegin(gl.GL_TRIANGLES);
  gl.glVertex3f (0.000000f,0.587785f,-0.809017f);
  gl.glVertex3f (0.000000f,0.809017f,-0.587785f);
  gl.glVertex3f (0.345492f,0.809017f,-0.475528f);
gl.glEnd();
    
    
    }
    
    
    
    
    
    
    
}
