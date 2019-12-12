package org.yourorghere;

import com.sun.opengl.util.Animator;
import com.sun.opengl.util.GLUT;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;



/**
 * PrimitivasGLUGLUT.java <BR>
 * author: Brian Paul (converted to Java by Ron Cemer and Sven Goethel) <P>
 *
 * This version is equal to Brian Paul's version 1.2 1999/10/21
 */
public class PrimitivasGLUGLUT implements GLEventListener {

    public static void main(String[] args) {
        Frame frame = new Frame("Simple JOGL Application");
        GLCanvas canvas = new GLCanvas();

        canvas.addGLEventListener(new PrimitivasGLUGLUT());
        frame.add(canvas);
        frame.setSize(640, 480);
        final Animator animator = new Animator(canvas);
        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                // Run this on another thread than the AWT event queue to
                // make sure the call to Animator.stop() completes before
                // exiting
                new Thread(new Runnable() {

                    public void run() {
                        animator.stop();
                        System.exit(0);
                    }
                }).start();
            }
        });
        // Center frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        animator.start();
    }

    public void init(GLAutoDrawable drawable) {
        // Use debug pipeline
        // drawable.setGL(new DebugGL(drawable.getGL()));

        GL gl = drawable.getGL();
        System.err.println("INIT GL IS: " + gl.getClass().getName());

        // Enable VSync
        gl.setSwapInterval(1);

        // Setup the drawing area and shading mode
        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        gl.glShadeModel(GL.GL_SMOOTH); // try setting this to GL_FLAT and see what happens.
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();

        if (height <= 0) { // avoid a divide by zero error!
        
            height = 1;
        }
        final float h = (float) width / (float) height;
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        gl.glOrtho(-20,20, -20, 20,-20, 20);       
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

    public void display(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();
        GLUT glut = new GLUT ();
        // Clear the drawing area
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        // Reset the current matrix to the "identity"
        gl.glLoadIdentity();
 //Creacion de la esfera 
         gl.glPushMatrix();
            gl.glColor3f(1.0f, 0, 0);
            gl.glTranslatef(-15.0f,10.0f,-6.0f);
            glut.glutSolidSphere(1,50,50);
         gl.glPopMatrix();
//creacion del cubo     
         gl.glPushMatrix();
            gl.glColor3f(1.0f, 1.0f, 0);
            //gl.glRotated(45, 0, 0, 0);
            gl.glTranslatef(-10.0f,10.0f,-6.0f);
            glut.glutSolidCube(1.5f);
         gl.glPopMatrix();
//creacion del cono       
         gl.glPushMatrix();
            gl.glColor3f(1.0f, 0, 1.0f);
            gl.glTranslatef(-5.0f,10.0f,-6.0f);
            glut.glutSolidCone(1, 1, 50, 50);
         gl.glPopMatrix();
//creacion del toro        
         gl.glPushMatrix();
            gl.glColor3f(0.0f, 1.0f, 1.0f);
            gl.glTranslatef(0.0f,10.0f,-6.0f);
            glut.glutSolidTorus(0.5, 1, 50, 50);
         gl.glPopMatrix();
//creraion del dodecadro         
         gl.glPushMatrix();
            gl.glColor3f(0.0f, 1.0f, 0);
            gl.glTranslatef(5.0f,10.0f,-6.0f);
            glut.glutSolidDodecahedron();
         gl.glPopMatrix();
//craecion del octaerdro         
         gl.glPushMatrix();
            gl.glColor3f(0.0f, 0, 1.0f);
            gl.glTranslatef(-5.0f,00.0f,-6.0f);
            glut.glutSolidOctahedron();
         gl.glPopMatrix();
//craecion del tetaedro       
         gl.glPushMatrix();
            gl.glColor3f(0.0f, 0, 1.0f);
            gl.glTranslatef(5.0f,0.0f,-6.0f);
            glut.glutSolidTetrahedron();
         gl.glPopMatrix();
//craecion del icosahedro       
         gl.glPushMatrix();
            gl.glColor3f(0.0f, 1.0f, 1.0f);
            gl.glTranslatef(-10.0f,0.0f,6.0f);
            glut.glutSolidIcosahedron();
         gl.glPopMatrix();
//craecion de la tetera      
         gl.glPushMatrix();
            gl.glColor3f(1.0f, 0, 1.0f);
            gl.glTranslatef(10.0f,0.0f,6.0f);
            glut.glutSolidTeapot(1.5);
         gl.glPopMatrix();

         
              
         gl.glPushMatrix();
            gl.glColor3f(1.0f, 0, 1.0f);
            gl.glTranslatef(-15.0f,-10.0f,6.0f);
            gl.glRotated(15, 0, 1, 1);
            glut.glutWireCube(1.5f);
         gl.glPopMatrix();
         
          gl.glPushMatrix();
            gl.glColor3f(0.0f, 0.0f, 1.0f);
            gl.glTranslatef(-10.0f,-10.0f,6.0f);
            gl.glRotated(60, 0, 1, 0);
            glut.glutWireCone(1,1,15,15);
         gl.glPopMatrix();
         
          gl.glPushMatrix();
            gl.glColor3f(0.0f, 0.0f, 1.0f);
            gl.glTranslatef(-5.0f,-10.0f,6.0f);
            gl.glRotated(60, 0, 1, 0);
            glut.glutWireTorus(1,1,15,15);
         gl.glPopMatrix();
         
           gl.glPushMatrix();
            gl.glColor3f(1.0f, 0.0f, 1.0f);
            gl.glTranslatef(-0.0f,-10.0f,6.0f);
            gl.glRotated(60, 0, 1, 0);
            glut.glutWireCylinder(1, 1, 10, 10);
         gl.glPopMatrix();
         
           gl.glPushMatrix();
            gl.glColor3f(1.0f, 0.0f, 1.0f);
            gl.glTranslatef(5.0f,-10.0f,6.0f);
            gl.glRotated(60, 0, 1, 0);
            glut.glutWireDodecahedron();
         gl.glPopMatrix();
         
          gl.glPushMatrix();
            gl.glColor3f(1.0f, 1.0f, 1.0f);
            gl.glTranslatef(10.0f,-10.0f,6.0f);
            gl.glRotated(60, 0, 1, 0);
            glut.glutWireIcosahedron();
         gl.glPopMatrix();

      

        
        gl.glFlush();
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }
}

