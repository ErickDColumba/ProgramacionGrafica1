
package Principal;

import Estrutura.Nave;
import Estrutura.OrdenarParedesExterior;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.media.opengl.GL;

/**
 *
 * @author Alison
 */
public class Teclado implements KeyListener {

    static GL gl;

    private static float trasladaX = 0;
    private static float trasladaY = 0;
    private static float trasladaZ = 0;

    private static float escalaX = 1;
    private static float escalaY = 1;

    private static float rotarX = 0;
    private static float rotarY = 0;
    private static float rotarZ = 0;

    static boolean validargiro = false;

    public static float getTrasladaX() {
        return trasladaX;
    }

    public static float getTrasladaY() {
        return trasladaY;
    }

    public static float getTrasladaZ() {
        return trasladaZ;
    }

    public static float getRotarX() {
        return rotarX;
    }

    public static void rotarY(GL gl) {
        rotarY += 0.8f;
        gl.glRotatef(rotarY, 0, 1, 0);
    }

    @Override
    public void keyTyped(KeyEvent e) {
             if (e.getKeyChar() == '1') {
           Principal.ncam = 1;
             OrdenarParedesExterior.ba=1.0f;
             OrdenarParedesExterior.ga=1.0f;
             OrdenarParedesExterior.ra=1.0f;
            
        }

        if (e.getKeyChar() == '2') {
            Principal.ncam = 2;
               OrdenarParedesExterior.ba=1.0f;
               OrdenarParedesExterior.ga=0.3f;
               OrdenarParedesExterior.ra=0.3f;
        }
        if (e.getKeyChar() =='3'){
           Principal.ncam=3;
            OrdenarParedesExterior.ba=1.0f;
            OrdenarParedesExterior.ga=1.0f;
            OrdenarParedesExterior.ra=1.0f;
        }
         if (e.getKeyChar() =='4'){
          Principal.ncam =4;
            OrdenarParedesExterior.ba=1.0f;
            OrdenarParedesExterior.ga=1.0f;
            OrdenarParedesExterior.ra=1.0f;
        }
         if (e.getKeyChar() =='5'){
          Principal.ncam =5;
            OrdenarParedesExterior.ba=1.0f;
            OrdenarParedesExterior.ga=1.0f;
            OrdenarParedesExterior.ra=1.0f;
      
            
        }
         
         
         if (e.getKeyChar() =='t'){
             Nave.tec = false;
             
        }
          if (e.getKeyChar() =='u'){
             Nave.tec= true;
        }
           if (e.getKeyChar() =='p'){
         // Principal.techo =false;
         OrdenarParedesExterior.ba=1.0f;
         OrdenarParedesExterior.ga=0.3f;
         OrdenarParedesExterior.ra=0.3f;
         
        }
           if (e.getKeyChar() =='o'){
         // Principal.techo =false;
         OrdenarParedesExterior.ba=1.0f;
         OrdenarParedesExterior.ga=1.0f;
         OrdenarParedesExterior.ra=1.0f;
         
        }
           
         if (e.getKeyChar() =='+'){
             Principal.radio+=0.5f;
            
        }
         
            
         if (e.getKeyChar() =='-'){
             Principal.radio-=0.5;
             
        }
         
           
    }

    @Override
    public void keyPressed(KeyEvent e) {
           
            
            //teclado de traslacion
            if (e.getKeyCode()==KeyEvent.VK_W) {
                trasladaZ-=0.05f;
            }
            
             if (e.getKeyCode()==KeyEvent.VK_S) {
                trasladaZ+=0.05f;             
            }
            if (e.getKeyCode()==KeyEvent.VK_D) {
                trasladaX+=0.05f;
            }
            if (e.getKeyCode()==KeyEvent.VK_A) {
                trasladaX-=0.05f;
            }
            if (e.getKeyCode()==KeyEvent.VK_E) {
               trasladaY-=0.05f;
            }
            if (e.getKeyCode()==KeyEvent.VK_Q) {
               trasladaY+=0.05f;
            }
            
            
            
       
        salir(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void salir(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            System.exit(0);
        }
    }

}
