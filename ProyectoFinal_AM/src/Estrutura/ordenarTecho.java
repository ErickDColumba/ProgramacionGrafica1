/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estrutura;



import BasicPrimitives.Cilindro;
import BasicPrimitives.Cubo;
import EstructuraPartes.Techo.Techo001;
import EstructuraPartes.Techo.Techo002;
import EstructuraPartes.Techo.Techo003;

import javax.media.opengl.GL;

/**
 *
 * @author EDCP
 */
public class ordenarTecho {
    
    /*Clase que Dibuja el techo completamente*/
    
    
 GL gl;
 Techo001 techo001;
 Techo002 techo002;
 Techo003 techo003;
 Cilindro cilindor;
 Cubo cubo;

    public ordenarTecho(GL gl) {
        this.gl = gl;
        this.techo001 = new Techo001(gl,0.5f,0.5f,0.5f);
        this.techo002 = new Techo002(gl,0.5f,0.5f,0.5f);
        this.techo003 = new Techo003(gl,0.4f,0.4f,0.4f);
        this.cilindor = new Cilindro(gl,0.2f,0.05f,6,6,0.3f,0.3f,0.3f);
        this.cubo = new Cubo(gl,0.25f,0.2f,0.2f,0.2f);
     
    }
    
    public void dibujarTechoCompleto (){
    
    //Dibuja el irculo superior
    gl.glPushMatrix();
        this.techo001.dibujarTecho01();
        this.techo001.dibujarTecho02();
        
    gl.glPopMatrix();
    gl.glPushMatrix();
        this.techo002.dibujarTecho01();
        this.techo002.dibujarTecho02();
    gl.glPopMatrix();
    
     gl.glPushMatrix();
        this.techo003.dibujarTecho01();
        this.techo003.dibujarTecho02();
        this.techo001.dibujarTecho03();
    gl.glPopMatrix();
 
    
    }
    
    
    
    
    
   
    
    
}
