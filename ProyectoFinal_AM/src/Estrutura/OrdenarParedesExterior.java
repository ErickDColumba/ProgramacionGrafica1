/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estrutura;

import BasicPrimitives.Cilindro;
import BasicPrimitives.CilindroHueco;
import EstructuraPartes.Paredes.ParedesCentro;
import EstructuraPartes.Paredes.ParedIzquierda;
import EstructuraPartes.Paredes.ParedDerecha;
import javax.media.opengl.GL;

/**
 *
 * @author EDCP
 */

/*Clase que ordena la prioridad de dibujo de las parede exteriores */
public class OrdenarParedesExterior {
 public static float ra=1.f,ga=1.0f,ba=1.0f;
 GL gl;
 ParedesCentro pared001;
 ParedIzquierda pared002;
 ParedDerecha pared003;
 Cilindro cil ;
 CilindroHueco cilh;
 

    public OrdenarParedesExterior(GL gl) {
        this.gl = gl;
        this.pared001 = new ParedesCentro(gl,0.4f,0.4f,0.4f);
        this.pared002 = new ParedIzquierda(gl,0.4f,0.4f,0.4f);
        this.pared003 = new ParedDerecha(gl,0.4f,0.4f,0.4f);
        this.cil = new Cilindro(gl,1,1,10,10,0.5f,0.5f,0.5f);
        this.cilh = new CilindroHueco(gl,0.4f,0.4f,0.4f);
    }
    
    
    
     public void dibujarParedesCompleto (){
    //Dibuja las paredes fortales izquierdas
    gl.glPushMatrix();
       this.pared002.dibujarIzquierda();
    gl.glPopMatrix();
    
    //Dibuja las paredes fortales derecha
    gl.glPushMatrix();
       this.pared003.dibujarDerecha();
    gl.glPopMatrix();
    
    
    //Dibuja las  paredes exterires de la nave
    gl.glPushMatrix();
        this.pared001.dibujarPared001();
        //Dibuja el propusor y asigna un cambio de color 
        this.pared001.dibujarPropulsor(ra,ga,ba);
    gl.glPopMatrix();
    
    
    gl.glPushMatrix();
        
        gl.glTranslated(0.7, 0.1, 0);
        gl.glRotated(90, 0, 0, 1);
        gl.glScaled(0.15, 0.2, 0.15);
        cil.dibujar();
    gl.glPopMatrix();
    
     gl.glPushMatrix();        
        gl.glTranslated(0.9, 0.1, -0.5);
        gl.glRotated(90, 0.5, 0, 1);
        //gl.glRotated(75, 0, 1, 0);
        gl.glScaled(0.15, 0.1, 0.15);
        cilh.dibujar();
    gl.glPopMatrix();
    

    
    }
    
 
 
    
    
}
