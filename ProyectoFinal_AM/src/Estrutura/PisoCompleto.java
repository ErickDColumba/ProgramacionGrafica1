/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estrutura;

import EstructuraPartes.Piso.Piso001;
import EstructuraPartes.Piso.Piso002;
import EstructuraPartes.Piso.Piso003;

import javax.media.opengl.GL;

/**
 *
 * @author EDCP
 */
public class PisoCompleto {
    
    
    /*Clase que dibuja el piso completamente */
    GL gl ;
    Piso001 piso001;
    Piso002 piso002;
    Piso003 piso003;
  

    public PisoCompleto(GL gl) {
        this.gl = gl;     
        this.piso001 = new Piso001(gl,0.6f,0.6f,0.6f);
        this.piso002 = new Piso002(gl,0.6f,0.6f,0.6f);
        this.piso003 = new Piso003(gl,0.6f,0.6f,0.6f);
   
                
    }
    
    
    public void dibujarPisoCompleto (){
    
    //Dibuja el irculo superior
    gl.glPushMatrix();
        this.piso001.dibujar();
    gl.glPopMatrix();
    
   //Dibuja el cuadro cnetral
    gl.glPushMatrix();
        this.piso002.dibujar();    
    gl.glPopMatrix();
    
    
    //Dibuja el circulo inferior
    gl.glPushMatrix();
        this.piso001.dibujaralreves();
    gl.glPopMatrix();
    
    //dibuja el lado dercho e izquierdo
    gl.glPushMatrix();
        this.piso003.dibujarIzquierda();  
    gl.glPopMatrix();
    
    gl.glPushMatrix();
     this.piso003.diujarDerecha();
    gl.glPopMatrix();
    
    
    
    
    
    
    }
    
    
    
    
    
    
    
}
