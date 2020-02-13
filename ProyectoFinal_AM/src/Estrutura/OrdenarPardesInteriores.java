/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estrutura;

import EstructuraPardes.Interiores.*;
import javax.media.opengl.GL;

/**
 *
 * @author EDCP
 */

/*Clase que tiene metodos que ordenan */
public class OrdenarPardesInteriores {
    GL gl;
    ParedesCirculares centro;
    ParedesRectas rectas;
    

    public OrdenarPardesInteriores(GL gl) {
        this.gl = gl;
        this.centro = new ParedesCirculares(gl,0.3f,0.3f,0.3f);
        this.rectas = new ParedesRectas(gl,0.3f,0.3f,0.3f);
        
        
    }
    
        public void dibujarInterior() {
            //
            gl.glPushMatrix();
                 rectas.dibujaParedesRectas();
                 centro.dibujaParedesCirculares();
            gl.glPopMatrix();
                  
           
        }
    
  
   
}
