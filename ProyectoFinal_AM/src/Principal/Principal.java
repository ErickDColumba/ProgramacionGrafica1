package Principal;
import Avatar.R2D2;
import BasicPrimitives.Esfera;
import Estrutura.*;
import com.sun.opengl.util.Animator;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;
import com.sun.opengl.util.GLUT;
import java.awt.event.KeyEvent;
import javax.media.opengl.GLCapabilities;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;




public class Principal extends JFrame implements  KeyListener {
    public static int ncam=1        ;
    public static float  radio=1;
    public static boolean techo=true;
    GLUT glut;
    float cosE,senE,angulo,cose,sene, tx,ty,tz,cosC,senC;
    float nx=0,ny=0,nz=0;
    float rx=0,ry=0,rz=0;
    List<Esfera> ListaEsferas = new ArrayList<Esfera>();
    Estrellas estrellas;
    Nave nave;
    R2D2 r2;
    
 


    public Principal(){
//        setTitle("Puntos");
        setSize(700,700);
        setLocation(10,40);
       
        // Intancia de clase GraphicListener
        
        GraphicListener listener = new GraphicListener();
        GLCanvas canvas= new GLCanvas(new GLCapabilities());
        canvas.addGLEventListener(listener);
        getContentPane().add(canvas);
          Animator animator = new Animator(canvas);
        animator.start();
        
                addKeyListener(this); // Para que canvas reconozca las pulsaciones del teclado
        
    }
    
    public static void main(String[] args) {
        
         Principal frame = new Principal();
        frame.setVisible(true);
        frame.setFocusable(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                       
 
    }
 public class GraphicListener implements GLEventListener{
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
        
        nave= new Nave(gl,nx,ny,nz);
        r2= new R2D2 (gl,rx,ry,rz);
        tc=new Teclado();   
        estrellas= new Estrellas (gl,ListaEsferas,500);
        
       
        
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();
        glut=new GLUT();

        if (height <= 0) { // avoid a divide by zero error!
        
            height = 1;
        }
        final float h = (float) width / (float) height;
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(450.0f, h, 1.0, 200.0);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

int num=0;
    public void display(GLAutoDrawable drawable) {
        try {
            GL gl = drawable.getGL();       
            
            // Clear the drawing area
            gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
            // Reset the current matrix to the "identity"
            gl.glLoadIdentity();
            GLU glu= new GLU ();
            
            /*Camara estatica*/
            if(ncam==1){
                nave.x=0;nave.y=0;nave.z=0;
                r2.x=0;r2.y=0;r2.z=0;
                glu.gluLookAt(2,2,2,nave.x,nave.y,nave.z,0,1,0);
            }
            /*Camara de Seguimiento*/
            if(ncam==2){
                 
                 
                 glu.gluLookAt(nave.x+1.5,nave.y+1.5,nave.z+1.5,nave.x,nave.y,nave.z, 0, 1,0);
            }
            /*Camara Avatar*/
            if (ncam==3){
                nave.x=0;nave.y=0;nave.z=0;
                r2.x=0;r2.y=0;r2.z=0;
                
               glu.gluLookAt(r2.x+0.65+tx,r2.y+0.65+ty,r2.z+0.65+tz,r2.x+tx,r2.y+ty,r2.z,0,1,0);
                // glu.gluLookAt(2,2,2,0,0,0,0,1,0);
            }
            /*Canra Eliptica*/
            if (ncam==4){
                
                nave.x=0;nave.y=0;nave.z=0;
                r2.x=0;r2.y=0;r2.z=0;
                cosE=(float)Math.cos(angulo)*3f;
                senE=(float)Math.sin(angulo)*2f;
                glu.gluLookAt(cosE,2,senE,nave.x,nave.y,nave.z,0,1,0);
                
                
            }
            
            /*Canara Circulas*/
            if (ncam==5){
                cosC=(float)Math.cos(angulo)*radio;
                senC=(float)Math.sin(angulo)*radio;
                nave.x=0;nave.y=0;nave.z=0;
                r2.x=0;r2.y=0;r2.z=0;
                glu.gluLookAt(cosC,2,senC,nave.x,nave.y,nave.z,0,1,0);
            }
         
            tx=0.5f+Teclado.getTrasladaX();
            ty=0.5f+Teclado.getTrasladaY();
            tz=0.5f+Teclado.getTrasladaZ(); 
 
            gl.glPushMatrix();   
                if(ncam==2){ nave.z-=0.1;r2.z-=0.1;}// Movimiento automatico cuando esta activa la camara 2
                nave.dibujarNave(); 
               //gl.glRotated(180, 0, 1, 0);
               // r2.dibujar();
            gl.glPopMatrix();
             
            gl.glPushMatrix();    
                gl.glTranslatef(tx, ty, tz);
                r2.dibujar();
            gl.glPopMatrix();
           
            estrellas.dibujarEstrellas();        
            angulo+=0.05f;
            
            
            
            
            // Flush all drawing operations to the graphics card
            gl.glFlush();
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }
    
     }
 
  Teclado tc;
    public void keyTyped(KeyEvent e) {
       
       tc.keyTyped(e);
    
        
    }    

    public void keyPressed(KeyEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  
     tc.keyPressed(e);

    }

    public void keyReleased(KeyEvent ke) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

