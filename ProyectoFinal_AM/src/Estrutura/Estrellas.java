/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estrutura;

import BasicPrimitives.Esfera;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.media.opengl.GL;

/**
 *
 * @author EDCP
 */
public class Estrellas {
    
    GL gl ;
    float r,g,b;
    float tamaño;
    float x,y,z;
    Esfera es ;
    int numeroEstrellas;
    List<Esfera> Lista = new ArrayList<Esfera>();

    public Estrellas(GL gl, List lista, int numeroEstrellas) {
        this.gl = gl;
        this.Lista = lista;
        this.numeroEstrellas = numeroEstrellas;
       
      
        int MAX = 6;
        Random random = new Random(); 
        
        
        
        for (int i = 0;i<numeroEstrellas;i++){   
                this.r= (float)Math.random();
                this.g= (float)Math.random();
                this.b= (float)Math.random();
               
                this.tamaño= (float)Math.random()*0.21f;
                this.x= (float)random.nextInt(MAX) * (random .nextBoolean() ? -1 : 1);
                this.y= (float)random.nextInt(MAX) * (random .nextBoolean() ? -1 : 1);
                this.z= (float)random.nextInt(MAX) * (random .nextBoolean() ? -1 : 1);
                this.es = new Esfera(gl,tamaño,10,10,this.r,this.g,this.b,x,y,z);
                        Lista.add(es);
        }
        
        
        
        
        
    }
    
    
   public void dibujarEstrellas (){
         for(Esfera e : Lista){
            //gl.glTranslated(Math.random()*5, Math.random()*5, Math.random()*5);
            e.dibujar();
        }
       
     
       
   } 
    
   
 
    
}
