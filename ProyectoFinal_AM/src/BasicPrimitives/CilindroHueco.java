/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicPrimitives;

import javax.media.opengl.GL;

/**
 *
 * @author EDCP
 */
public class CilindroHueco {
    GL gl ;
  
    
    float r,g,b;
 

    public CilindroHueco(GL gl, float r, float g, float b) {
        this.gl = gl;
        this.r = r;
        this.g = g;
        this.b = b;
     
    }

   
    
    public void dibujar (){
        
          
   gl.glLineWidth(4);
   gl.glColor3f(r-0.1f, g-0.1f, b-0.1f);
   
   gl.glBegin(gl.GL_LINE_LOOP);  
   
            gl.glVertex3f (0.000000f, -1.000000f, -1.000000f);      
            gl.glVertex3f (0.406737f, -1.000000f, -0.913545f);           
            gl.glVertex3f (0.743145f,-1.000000f, -0.669131f);          
            gl.glVertex3f (0.951057f, -1.000000f, -0.309017f);   
            gl.glVertex3f (0.994522f, -1.000000f, 0.104529f);           
            gl.glVertex3f (0.866025f, -1.000000f, 0.500000f);           
            gl.glVertex3f (0.587785f, -1.000000f, 0.809017f);          
            gl.glVertex3f (0.207912f, -1.000000f, 0.978148f);           
            gl.glVertex3f (-0.207912f, -1.000000f, 0.978148f);            
            gl.glVertex3f (-0.587785f, -1.000000f, 0.809017f);           
            gl.glVertex3f (-0.866025f, -1.000000f, 0.500000f);        
            gl.glVertex3f (-0.994522f, -1.000000f, 0.104528f);           
            gl.glVertex3f (-0.951056f, -1.000000f, -0.309017f);            
            gl.glVertex3f (-0.743145f, -1.000000f, -0.669131f);           
            gl.glVertex3f (-0.406736f, -1.000000f, -0.913546f);          
            gl.glVertex3f (0.000000f, -1.000000f, -1.000000f);
                    
    gl.glEnd();
 
   gl.glLineWidth(4);
   gl.glColor3f(r-0.1f, g-0.1f, b-0.1f);
   
   gl.glBegin(gl.GL_LINE_LOOP);  
            
           
            gl.glVertex3f (0.000000f, 1.000000f, -1.000000f);           
            gl.glVertex3f (0.406737f, 1.000000f, -0.913545f);       
            gl.glVertex3f (0.743145f, 1.000000f, -0.669131f);        
            gl.glVertex3f (0.951057f, 1.000000f, -0.309017f);           
            gl.glVertex3f (0.994522f, 1.000000f, 0.104529f);           
            gl.glVertex3f (0.866025f, 1.000000f, 0.500000f);            
            gl.glVertex3f (0.587785f, 1.000000f, 0.809017f);            
            gl.glVertex3f (0.207912f, 1.000000f, 0.978148f);            
            gl.glVertex3f (-0.207912f, 1.000000f, 0.978148f);          
            gl.glVertex3f (-0.587785f, 1.000000f, 0.809017f);           
            gl.glVertex3f (-0.866025f, 1.000000f, 0.500000f);           
            gl.glVertex3f (-0.994522f, 1.000000f, 0.104528f);           
            gl.glVertex3f (-0.951056f, 1.000000f, -0.309017f);           
            gl.glVertex3f (-0.743145f, 1.000000f, -0.669131f);        
            gl.glVertex3f (-0.406736f, 1.000000f, -0.913546f);         
            gl.glVertex3f (0.000000f, 1.000000f, -1.000000f);
              
    gl.glEnd();
 
    
        
        
        gl.glColor3f(r,g,b);
        
         gl.glBegin(gl.GL_TRIANGLE_STRIP); 
         
            gl.glVertex3f (0.000000f, -1.000000f, -1.000000f);
            gl.glVertex3f (0.000000f, 1.000000f, -1.000000f);
            gl.glVertex3f (0.406737f, -1.000000f, -0.913545f);
            gl.glVertex3f (0.406737f, 1.000000f, -0.913545f);
            gl.glVertex3f (0.743145f,-1.000000f, -0.669131f);
            gl.glVertex3f (0.743145f, 1.000000f, -0.669131f);
            gl.glVertex3f (0.951057f, -1.000000f, -0.309017f);
            gl.glVertex3f (0.951057f, 1.000000f, -0.309017f);
            gl.glVertex3f (0.994522f, -1.000000f, 0.104529f);
            gl.glVertex3f (0.994522f, 1.000000f, 0.104529f);
            gl.glVertex3f (0.866025f, -1.000000f, 0.500000f);
            gl.glVertex3f (0.866025f, 1.000000f, 0.500000f);
            gl.glVertex3f (0.587785f, -1.000000f, 0.809017f);
            gl.glVertex3f (0.587785f, 1.000000f, 0.809017f);
            gl.glVertex3f (0.207912f, -1.000000f, 0.978148f);
            gl.glVertex3f (0.207912f, 1.000000f, 0.978148f);
            gl.glVertex3f (-0.207912f, -1.000000f, 0.978148f);
            gl.glVertex3f (-0.207912f, 1.000000f, 0.978148f);
            gl.glVertex3f (-0.587785f, -1.000000f, 0.809017f);
            gl.glVertex3f (-0.587785f, 1.000000f, 0.809017f);
            gl.glVertex3f (-0.866025f, -1.000000f, 0.500000f);
            gl.glVertex3f (-0.866025f, 1.000000f, 0.500000f);
            gl.glVertex3f (-0.994522f, -1.000000f, 0.104528f);
            gl.glVertex3f (-0.994522f, 1.000000f, 0.104528f);
            gl.glVertex3f (-0.951056f, -1.000000f, -0.309017f);
            gl.glVertex3f (-0.951056f, 1.000000f, -0.309017f);
            gl.glVertex3f (-0.743145f, -1.000000f, -0.669131f);
            gl.glVertex3f (-0.743145f, 1.000000f, -0.669131f);
            gl.glVertex3f (-0.406736f, -1.000000f, -0.913546f);
            gl.glVertex3f (-0.406736f, 1.000000f, -0.913546f);
            gl.glVertex3f (0.000000f, -1.000000f, -1.000000f);
            gl.glVertex3f (0.000000f, 1.000000f, -1.000000f);
            
        gl.glEnd();
        

    }
    
    
    
}
