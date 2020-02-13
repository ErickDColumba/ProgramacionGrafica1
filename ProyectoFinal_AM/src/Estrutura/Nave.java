/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estrutura;
import Muebles.*;
import static Principal.Principal.techo;
import javax.media.opengl.GL;

/**
 *
 * @author EDCP
 */
public class Nave {
    
    GL gl;
    ordenarTecho techo;
    PisoCompleto piso;
    OrdenarParedesExterior paredFuera;
    OrdenarPardesInteriores paredInterior;
    ordenarTecho dibujarTecho;
    Asiento as;
    Caja ca1;
    Caja ca2;
    Mesas me;
    public static boolean tec=true;
    public  float x , y ,z;

    public Nave(GL gl, float x, float y, float z) {
        this.gl = gl;
        this.x = x;
        this.y = y;
        this.z = z;
        this.tec= tec;
        this.piso = new PisoCompleto(gl); 
        this.paredFuera= new OrdenarParedesExterior(gl);
        this.paredInterior = new OrdenarPardesInteriores(gl);
        this.dibujarTecho = new ordenarTecho(gl);
        this.me= new Mesas(gl);
        this.ca1 = new Caja (gl,0.6f,0.4f,0);
        this.ca2 = new Caja (gl,0.5f,0.5f,0.7f);
        this.as = new Asiento (gl);
    }
    
 
   
    
 
    public void dibujarNave(){
        
        gl.glTranslatef(x, y, z);
           gl.glPushMatrix();
            this.piso.dibujarPisoCompleto();
            //Dibujas muebeles
            gl.glPushMatrix();
                gl.glTranslated(-0.2, 0.02, -0.5);
               gl.glScaled(0.15, 0.15, 0.15);
                me.dibujarMesa();
            gl.glPopMatrix();
            
            gl.glPushMatrix();
                gl.glTranslated(-0.1, 0.02, -0.35);
               gl.glScaled(0.15, 0.15, 0.15);
                as.dibujarAsiento();
            gl.glPopMatrix();
            
            
            
            
            gl.glPushMatrix();
                gl.glTranslated(-0.2, 0.02, 0.7);            
                ca1.dibujarCaja(0.2f);
            gl.glPopMatrix();
            gl.glPushMatrix();
                gl.glTranslated(-0.4, 0.02, 0.81);            
                ca1.dibujarCaja(0.1f);
            gl.glPopMatrix();
            
            gl.glPushMatrix();
                gl.glTranslated(0.3, 0.02, 0.75);            
                ca2.dibujarCaja(0.16f);
            gl.glPopMatrix();
            
            gl.glPushMatrix();
                gl.glTranslated(0.35, 0.02, 0.65);            
                ca2.dibujarCaja(0.21f);
            gl.glPopMatrix();
            
            
            this.paredInterior.dibujarInterior();
            this.paredFuera.dibujarParedesCompleto();
            if (tec){
                     dibujarTecho.dibujarTechoCompleto();
            }
            
           gl.glPopMatrix();
           
    
    }
      
    }
       
      
    
    

