/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructuraPardes.Interiores;

import javax.media.opengl.GL;

/**
 *
 * @author EDCP
 */
public class ParedesCirculares {
    
    GL gl;
    float r,g,b;

    public ParedesCirculares(GL gl, float r, float g, float b) {
        this.gl = gl;
        this.r = r;
        this.g = g;
        this.b = b;
    }
    
    
   
    
    public void dibujaParedesCirculares(){
        
   gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.338813f,0.235862f,-0.030497f);
  gl.glVertex3f (-0.338813f,0.210992f,-0.073073f);
  gl.glVertex3f (-0.072028f,0.210992f,-0.070790f);
  gl.glVertex3f (-0.090076f,0.235862f,-0.032228f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.338813f,0.241061f,0.018397f);
  gl.glVertex3f (-0.338813f,0.235862f,-0.030497f);
  gl.glVertex3f (-0.090076f,0.235862f,-0.032228f);
  gl.glVertex3f (-0.110802f,0.241061f,0.012056f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.338813f,0.225691f,0.065154f);
  gl.glVertex3f (-0.338813f,0.241061f,0.018397f);
  gl.glVertex3f (-0.110802f,0.241061f,0.012056f);
  gl.glVertex3f (-0.130622f,0.225691f,0.054404f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.338813f,0.033209f,-0.073073f);
  gl.glVertex3f (-0.338813f,0.008340f,-0.030497f);
  gl.glVertex3f (-0.090076f,0.008340f,-0.032228f);
  gl.glVertex3f (-0.072028f,0.033209f,-0.070790f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.338813f,0.073449f,-0.101970f);
  gl.glVertex3f (-0.338813f,0.033209f,-0.073073f);
  gl.glVertex3f (-0.072028f,0.033209f,-0.070790f);
  gl.glVertex3f (-0.059779f,0.073449f,-0.096962f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.338813f,0.122101f,-0.112192f);
  gl.glVertex3f (-0.338813f,0.073449f,-0.101970f);
  gl.glVertex3f (-0.059779f,0.073449f,-0.096962f);
  gl.glVertex3f (-0.055446f,0.122101f,-0.106220f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.338813f,0.170753f,-0.101970f);
  gl.glVertex3f (-0.338813f,0.122101f,-0.112192f);
  gl.glVertex3f (-0.055446f,0.122101f,-0.106220f);
  gl.glVertex3f (-0.059779f,0.170753f,-0.096962f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.338813f,0.210992f,-0.073073f);
  gl.glVertex3f (-0.338813f,0.170753f,-0.101970f);
  gl.glVertex3f (-0.059779f,0.170753f,-0.096962f);
  gl.glVertex3f (-0.072028f,0.210992f,-0.070790f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.210992f,-0.073073f);
  gl.glVertex3f (-0.867979f,0.170753f,-0.101970f);
  gl.glVertex3f (-0.745667f,0.170753f,-0.101970f);
  gl.glVertex3f (-0.745667f,0.210992f,-0.073073f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.051792f,0.101689f);
  gl.glVertex3f (-0.867979f,0.097231f,0.121685f);
  gl.glVertex3f (-0.745667f,0.097231f,0.121685f);
  gl.glVertex3f (-0.745667f,0.051792f,0.101689f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.170753f,-0.101970f);
  gl.glVertex3f (-0.867979f,0.122101f,-0.112192f);
  gl.glVertex3f (-0.745667f,0.122101f,-0.112192f);
  gl.glVertex3f (-0.745667f,0.170753f,-0.101970f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.097231f,0.121685f);
  gl.glVertex3f (-0.867979f,0.146970f,0.121685f);
  gl.glVertex3f (-0.745667f,0.146970f,0.121685f);
  gl.glVertex3f (-0.745667f,0.097231f,0.121685f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.122101f,-0.112192f);
  gl.glVertex3f (-0.867979f,0.073449f,-0.101970f);
  gl.glVertex3f (-0.745667f,0.073449f,-0.101970f);
  gl.glVertex3f (-0.745667f,0.122101f,-0.112192f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.146970f,0.121685f);
  gl.glVertex3f (-0.867979f,0.192409f,0.101689f);
  gl.glVertex3f (-0.745667f,0.192409f,0.101689f);
  gl.glVertex3f (-0.745667f,0.146970f,0.121685f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.073449f,-0.101970f);
  gl.glVertex3f (-0.867979f,0.033209f,-0.073073f);
  gl.glVertex3f (-0.745667f,0.033209f,-0.073073f);
  gl.glVertex3f (-0.745667f,0.073449f,-0.101970f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.192409f,0.101689f);
  gl.glVertex3f (-0.867979f,0.225691f,0.065154f);
  gl.glVertex3f (-0.745667f,0.225691f,0.065154f);
  gl.glVertex3f (-0.745667f,0.192409f,0.101689f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.033209f,-0.073073f);
  gl.glVertex3f (-0.867979f,0.008340f,-0.030497f);
  gl.glVertex3f (-0.745667f,0.008340f,-0.030497f);
  gl.glVertex3f (-0.745667f,0.033209f,-0.073073f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.225691f,0.065154f);
  gl.glVertex3f (-0.867979f,0.241061f,0.018397f);
  gl.glVertex3f (-0.745667f,0.241061f,0.018397f);
  gl.glVertex3f (-0.745667f,0.225691f,0.065154f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.241061f,0.018397f);
  gl.glVertex3f (-0.867979f,0.235862f,-0.030497f);
  gl.glVertex3f (-0.745667f,0.235862f,-0.030497f);
  gl.glVertex3f (-0.745667f,0.241061f,0.018397f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.235862f,-0.030497f);
  gl.glVertex3f (-0.867979f,0.210992f,-0.073073f);
  gl.glVertex3f (-0.745667f,0.210992f,-0.073073f);
  gl.glVertex3f (-0.745667f,0.235862f,-0.030497f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.018511f,0.065154f);
  gl.glVertex3f (-0.867979f,0.051792f,0.101689f);
  gl.glVertex3f (-0.745667f,0.051792f,0.101689f);
  gl.glVertex3f (-0.745667f,0.018511f,0.065154f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.745667f,0.051792f,0.101689f);
  gl.glVertex3f (-0.745667f,0.097231f,0.121685f);
  gl.glVertex3f (-0.547679f,0.097231f,0.121685f);
  gl.glVertex3f (-0.547679f,0.051792f,0.101689f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.745667f,0.097231f,0.121685f);
  gl.glVertex3f (-0.745667f,0.146970f,0.121685f);
  gl.glVertex3f (-0.547679f,0.146970f,0.121685f);
  gl.glVertex3f (-0.547679f,0.097231f,0.121685f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.745667f,0.146970f,0.121685f);
  gl.glVertex3f (-0.745667f,0.192409f,0.101689f);
  gl.glVertex3f (-0.547679f,0.192409f,0.101689f);
  gl.glVertex3f (-0.547679f,0.146970f,0.121685f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.745667f,0.192409f,0.101689f);
  gl.glVertex3f (-0.745667f,0.225691f,0.065154f);
  gl.glVertex3f (-0.547679f,0.225691f,0.065154f);
  gl.glVertex3f (-0.547679f,0.192409f,0.101689f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.745667f,0.225691f,0.065154f);
  gl.glVertex3f (-0.745667f,0.241061f,0.018397f);
  gl.glVertex3f (-0.547679f,0.241061f,0.018397f);
  gl.glVertex3f (-0.547679f,0.225691f,0.065154f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.745667f,0.241061f,0.018397f);
  gl.glVertex3f (-0.745667f,0.235862f,-0.030497f);
  gl.glVertex3f (-0.547679f,0.235862f,-0.030497f);
  gl.glVertex3f (-0.547679f,0.241061f,0.018397f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.745667f,0.235862f,-0.030497f);
  gl.glVertex3f (-0.745667f,0.210992f,-0.073073f);
  gl.glVertex3f (-0.547679f,0.210992f,-0.073073f);
  gl.glVertex3f (-0.547679f,0.235862f,-0.030497f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.745667f,0.018511f,0.065154f);
  gl.glVertex3f (-0.745667f,0.051792f,0.101689f);
  gl.glVertex3f (-0.547679f,0.051792f,0.101689f);
  gl.glVertex3f (-0.547679f,0.018511f,0.065154f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.547679f,0.210992f,-0.073073f);
  gl.glVertex3f (-0.547679f,0.170753f,-0.101970f);
  gl.glVertex3f (-0.338813f,0.170753f,-0.101970f);
  gl.glVertex3f (-0.338813f,0.210992f,-0.073073f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.547679f,0.170753f,-0.101970f);
  gl.glVertex3f (-0.547679f,0.122101f,-0.112192f);
  gl.glVertex3f (-0.338813f,0.122101f,-0.112192f);
  gl.glVertex3f (-0.338813f,0.170753f,-0.101970f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.547679f,0.122101f,-0.112192f);
  gl.glVertex3f (-0.547679f,0.073449f,-0.101970f);
  gl.glVertex3f (-0.338813f,0.073449f,-0.101970f);
  gl.glVertex3f (-0.338813f,0.122101f,-0.112192f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.547679f,0.073449f,-0.101970f);
  gl.glVertex3f (-0.547679f,0.033209f,-0.073073f);
  gl.glVertex3f (-0.338813f,0.033209f,-0.073073f);
  gl.glVertex3f (-0.338813f,0.073449f,-0.101970f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.547679f,0.033209f,-0.073073f);
  gl.glVertex3f (-0.547679f,0.008340f,-0.030497f);
  gl.glVertex3f (-0.338813f,0.008340f,-0.030497f);
  gl.glVertex3f (-0.338813f,0.033209f,-0.073073f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.547679f,0.225691f,0.065154f);
  gl.glVertex3f (-0.547679f,0.241061f,0.018397f);
  gl.glVertex3f (-0.338813f,0.241061f,0.018397f);
  gl.glVertex3f (-0.338813f,0.225691f,0.065154f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.547679f,0.241061f,0.018397f);
  gl.glVertex3f (-0.547679f,0.235862f,-0.030497f);
  gl.glVertex3f (-0.338813f,0.235862f,-0.030497f);
  gl.glVertex3f (-0.338813f,0.241061f,0.018397f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.547679f,0.235862f,-0.030497f);
  gl.glVertex3f (-0.547679f,0.210992f,-0.073073f);
  gl.glVertex3f (-0.338813f,0.210992f,-0.073073f);
  gl.glVertex3f (-0.338813f,0.235862f,-0.030497f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.338815f,0.242896f,-0.032803f);
  gl.glVertex3f (-0.090079f,0.242727f,-0.034989f);
  gl.glVertex3f (-0.071977f,0.216169f,-0.076032f);
  gl.glVertex3f (-0.338791f,0.216445f,-0.078034f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.338792f,0.248428f,0.019198f);
  gl.glVertex3f (-0.110777f,0.248465f,0.012396f);
  gl.glVertex3f (-0.090079f,0.242727f,-0.034989f);
  gl.glVertex3f (-0.338815f,0.242896f,-0.032803f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.338767f,0.232720f,0.067476f);
  gl.glVertex3f (-0.130529f,0.232699f,0.056786f);
  gl.glVertex3f (-0.110777f,0.248465f,0.012396f);
  gl.glVertex3f (-0.338792f,0.248428f,0.019198f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.338791f,0.027756f,-0.078034f);
  gl.glVertex3f (-0.071977f,0.028033f,-0.076032f);
  gl.glVertex3f (-0.090072f,0.002000f,-0.036023f);
  gl.glVertex3f (-0.338811f,0.001960f,-0.034226f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.338757f,0.070488f,-0.108686f);
  gl.glVertex3f (-0.059663f,0.070691f,-0.103761f);
  gl.glVertex3f (-0.071977f,0.028033f,-0.076032f);
  gl.glVertex3f (-0.338791f,0.027756f,-0.078034f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.338741f,0.122101f,-0.119517f);
  gl.glVertex3f (-0.055303f,0.122101f,-0.113544f);
  gl.glVertex3f (-0.059663f,0.070691f,-0.103761f);
  gl.glVertex3f (-0.338757f,0.070488f,-0.108686f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.338757f,0.173713f,-0.108686f);
  gl.glVertex3f (-0.059663f,0.173510f,-0.103761f);
  gl.glVertex3f (-0.055303f,0.122101f,-0.113544f);
  gl.glVertex3f (-0.338741f,0.122101f,-0.119517f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.338791f,0.216445f,-0.078034f);
  gl.glVertex3f (-0.071977f,0.216169f,-0.076032f);
  gl.glVertex3f (-0.059663f,0.173510f,-0.103761f);
  gl.glVertex3f (-0.338757f,0.173713f,-0.108686f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.216500f,-0.077975f);
  gl.glVertex3f (-0.745667f,0.216837f,-0.077578f);
  gl.glVertex3f (-0.745667f,0.173767f,-0.108663f);
  gl.glVertex3f (-0.867979f,0.173767f,-0.108663f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.047436f,0.107616f);
  gl.glVertex3f (-0.745667f,0.047436f,0.107616f);
  gl.glVertex3f (-0.745667f,0.095690f,0.128851f);
  gl.glVertex3f (-0.867979f,0.095690f,0.128851f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.173767f,-0.108663f);
  gl.glVertex3f (-0.745667f,0.173767f,-0.108663f);
  gl.glVertex3f (-0.745667f,0.122101f,-0.119517f);
  gl.glVertex3f (-0.867979f,0.122101f,-0.119517f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.095690f,0.128851f);
  gl.glVertex3f (-0.745667f,0.095690f,0.128851f);
  gl.glVertex3f (-0.745667f,0.148511f,0.128851f);
  gl.glVertex3f (-0.867979f,0.148511f,0.128851f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.122101f,-0.119517f);
  gl.glVertex3f (-0.745667f,0.122101f,-0.119517f);
  gl.glVertex3f (-0.745667f,0.070434f,-0.108663f);
  gl.glVertex3f (-0.867979f,0.070434f,-0.108663f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.148511f,0.128851f);
  gl.glVertex3f (-0.745667f,0.148511f,0.128851f);
  gl.glVertex3f (-0.745667f,0.196765f,0.107616f);
  gl.glVertex3f (-0.867979f,0.196765f,0.107616f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.070434f,-0.108663f);
  gl.glVertex3f (-0.745667f,0.070434f,-0.108663f);
  gl.glVertex3f (-0.745667f,0.027701f,-0.077975f);
  gl.glVertex3f (-0.867979f,0.027701f,-0.077975f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.196765f,0.107616f);
  gl.glVertex3f (-0.745667f,0.196765f,0.107616f);
  gl.glVertex3f (-0.745667f,0.232110f,0.068817f);
  gl.glVertex3f (-0.867979f,0.232110f,0.068817f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.027701f,-0.077975f);
  gl.glVertex3f (-0.745667f,0.027701f,-0.077975f);
  gl.glVertex3f (-0.745667f,0.001921f,-0.034159f);
  gl.glVertex3f (-0.867979f,0.001921f,-0.034159f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.232110f,0.068817f);
  gl.glVertex3f (-0.745667f,0.232110f,0.068817f);
  gl.glVertex3f (-0.745667f,0.248432f,0.019163f);
  gl.glVertex3f (-0.867979f,0.248432f,0.019163f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.248432f,0.019163f);
  gl.glVertex3f (-0.745667f,0.248432f,0.019163f);
  gl.glVertex3f (-0.745667f,0.242911f,-0.032760f);
  gl.glVertex3f (-0.867979f,0.242911f,-0.032760f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.242911f,-0.032760f);
  gl.glVertex3f (-0.745667f,0.242911f,-0.032760f);
  gl.glVertex3f (-0.745667f,0.216837f,-0.077578f);
  gl.glVertex3f (-0.867979f,0.216500f,-0.077975f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.013003f,0.070056f);
  gl.glVertex3f (-0.745667f,0.013003f,0.070056f);
  gl.glVertex3f (-0.745667f,0.047436f,0.107616f);
  gl.glVertex3f (-0.867979f,0.047436f,0.107616f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.745667f,0.047436f,0.107616f);
  gl.glVertex3f (-0.547679f,0.047436f,0.107616f);
  gl.glVertex3f (-0.547679f,0.095690f,0.128851f);
  gl.glVertex3f (-0.745667f,0.095690f,0.128851f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.745667f,0.095690f,0.128851f);
  gl.glVertex3f (-0.547679f,0.095690f,0.128851f);
  gl.glVertex3f (-0.547679f,0.148511f,0.128851f);
  gl.glVertex3f (-0.745667f,0.148511f,0.128851f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.745667f,0.148511f,0.128851f);
  gl.glVertex3f (-0.547679f,0.148511f,0.128851f);
  gl.glVertex3f (-0.547679f,0.196765f,0.107616f);
  gl.glVertex3f (-0.745667f,0.196765f,0.107616f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.745667f,0.196765f,0.107616f);
  gl.glVertex3f (-0.547679f,0.196765f,0.107616f);
  gl.glVertex3f (-0.547679f,0.232355f,0.068359f);
  gl.glVertex3f (-0.745667f,0.232110f,0.068817f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.745667f,0.232110f,0.068817f);
  gl.glVertex3f (-0.547679f,0.232355f,0.068359f);
  gl.glVertex3f (-0.547679f,0.248432f,0.019163f);
  gl.glVertex3f (-0.745667f,0.248432f,0.019163f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.745667f,0.248432f,0.019163f);
  gl.glVertex3f (-0.547679f,0.248432f,0.019163f);
  gl.glVertex3f (-0.547679f,0.242911f,-0.032760f);
  gl.glVertex3f (-0.745667f,0.242911f,-0.032760f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.745667f,0.242911f,-0.032760f);
  gl.glVertex3f (-0.547679f,0.242911f,-0.032760f);
  gl.glVertex3f (-0.547679f,0.216837f,-0.077578f);
  gl.glVertex3f (-0.745667f,0.216837f,-0.077578f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.745667f,0.013003f,0.070056f);
  gl.glVertex3f (-0.547679f,0.013003f,0.070056f);
  gl.glVertex3f (-0.547679f,0.047436f,0.107616f);
  gl.glVertex3f (-0.745667f,0.047436f,0.107616f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.547679f,0.216837f,-0.077578f);
  gl.glVertex3f (-0.338791f,0.216445f,-0.078034f);
  gl.glVertex3f (-0.338757f,0.173713f,-0.108686f);
  gl.glVertex3f (-0.547679f,0.173767f,-0.108663f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.547679f,0.173767f,-0.108663f);
  gl.glVertex3f (-0.338757f,0.173713f,-0.108686f);
  gl.glVertex3f (-0.338741f,0.122101f,-0.119517f);
  gl.glVertex3f (-0.547679f,0.122101f,-0.119517f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.547679f,0.122101f,-0.119517f);
  gl.glVertex3f (-0.338741f,0.122101f,-0.119517f);
  gl.glVertex3f (-0.338757f,0.070488f,-0.108686f);
  gl.glVertex3f (-0.547679f,0.070434f,-0.108663f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.547679f,0.070434f,-0.108663f);
  gl.glVertex3f (-0.338757f,0.070488f,-0.108686f);
  gl.glVertex3f (-0.338791f,0.027756f,-0.078034f);
  gl.glVertex3f (-0.547679f,0.027701f,-0.077975f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.547679f,0.027701f,-0.077975f);
  gl.glVertex3f (-0.338791f,0.027756f,-0.078034f);
  gl.glVertex3f (-0.338811f,0.001960f,-0.034226f);
  gl.glVertex3f (-0.547679f,0.001921f,-0.034159f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.547679f,0.232355f,0.068359f);
  gl.glVertex3f (-0.338767f,0.232720f,0.067476f);
  gl.glVertex3f (-0.338792f,0.248428f,0.019198f);
  gl.glVertex3f (-0.547679f,0.248432f,0.019163f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.547679f,0.248432f,0.019163f);
  gl.glVertex3f (-0.338792f,0.248428f,0.019198f);
  gl.glVertex3f (-0.338815f,0.242896f,-0.032803f);
  gl.glVertex3f (-0.547679f,0.242911f,-0.032760f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.547679f,0.242911f,-0.032760f);
  gl.glVertex3f (-0.338815f,0.242896f,-0.032803f);
  gl.glVertex3f (-0.338791f,0.216445f,-0.078034f);
  gl.glVertex3f (-0.547679f,0.216837f,-0.077578f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.122101f,-0.112192f);
  gl.glVertex3f (-0.867979f,0.170753f,-0.101970f);
  gl.glVertex3f (-0.867979f,0.173767f,-0.108663f);
  gl.glVertex3f (-0.867979f,0.122101f,-0.119517f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.170753f,-0.101970f);
  gl.glVertex3f (-0.867979f,0.210992f,-0.073073f);
  gl.glVertex3f (-0.867979f,0.216500f,-0.077975f);
  gl.glVertex3f (-0.867979f,0.173767f,-0.108663f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.210992f,-0.073073f);
  gl.glVertex3f (-0.867979f,0.235862f,-0.030497f);
  gl.glVertex3f (-0.867979f,0.242911f,-0.032760f);
  gl.glVertex3f (-0.867979f,0.216500f,-0.077975f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.235862f,-0.030497f);
  gl.glVertex3f (-0.867979f,0.241061f,0.018397f);
  gl.glVertex3f (-0.867979f,0.248432f,0.019163f);
  gl.glVertex3f (-0.867979f,0.242911f,-0.032760f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.241061f,0.018397f);
  gl.glVertex3f (-0.867979f,0.225691f,0.065154f);
  gl.glVertex3f (-0.867979f,0.232110f,0.068817f);
  gl.glVertex3f (-0.867979f,0.248432f,0.019163f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.225691f,0.065154f);
  gl.glVertex3f (-0.867979f,0.192409f,0.101689f);
  gl.glVertex3f (-0.867979f,0.196765f,0.107616f);
  gl.glVertex3f (-0.867979f,0.232110f,0.068817f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.192409f,0.101689f);
  gl.glVertex3f (-0.867979f,0.146970f,0.121685f);
  gl.glVertex3f (-0.867979f,0.148511f,0.128851f);
  gl.glVertex3f (-0.867979f,0.196765f,0.107616f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.146970f,0.121685f);
  gl.glVertex3f (-0.867979f,0.097231f,0.121685f);
  gl.glVertex3f (-0.867979f,0.095690f,0.128851f);
  gl.glVertex3f (-0.867979f,0.148511f,0.128851f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.097231f,0.121685f);
  gl.glVertex3f (-0.867979f,0.051792f,0.101689f);
  gl.glVertex3f (-0.867979f,0.047436f,0.107616f);
  gl.glVertex3f (-0.867979f,0.095690f,0.128851f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.051792f,0.101689f);
  gl.glVertex3f (-0.867979f,0.018511f,0.065154f);
  gl.glVertex3f (-0.867979f,0.013003f,0.070056f);
  gl.glVertex3f (-0.867979f,0.047436f,0.107616f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.008340f,-0.030497f);
  gl.glVertex3f (-0.867979f,0.033209f,-0.073073f);
  gl.glVertex3f (-0.867979f,0.027701f,-0.077975f);
  gl.glVertex3f (-0.867979f,0.001921f,-0.034159f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.033209f,-0.073073f);
  gl.glVertex3f (-0.867979f,0.073449f,-0.101970f);
  gl.glVertex3f (-0.867979f,0.070434f,-0.108663f);
  gl.glVertex3f (-0.867979f,0.027701f,-0.077975f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.073449f,-0.101970f);
  gl.glVertex3f (-0.867979f,0.122101f,-0.112192f);
  gl.glVertex3f (-0.867979f,0.122101f,-0.119517f);
  gl.glVertex3f (-0.867979f,0.070434f,-0.108663f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.059779f,0.170753f,-0.096962f);
  gl.glVertex3f (-0.055446f,0.122101f,-0.106220f);
  gl.glVertex3f (-0.055303f,0.122101f,-0.113544f);
  gl.glVertex3f (-0.059663f,0.173510f,-0.103761f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.072028f,0.210992f,-0.070790f);
  gl.glVertex3f (-0.059779f,0.170753f,-0.096962f);
  gl.glVertex3f (-0.059663f,0.173510f,-0.103761f);
  gl.glVertex3f (-0.071977f,0.216169f,-0.076032f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.090076f,0.235862f,-0.032228f);
  gl.glVertex3f (-0.072028f,0.210992f,-0.070790f);
  gl.glVertex3f (-0.071977f,0.216169f,-0.076032f);
  gl.glVertex3f (-0.090079f,0.242727f,-0.034989f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.110802f,0.241061f,0.012056f);
  gl.glVertex3f (-0.090076f,0.235862f,-0.032228f);
  gl.glVertex3f (-0.090079f,0.242727f,-0.034989f);
  gl.glVertex3f (-0.110777f,0.248465f,0.012396f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.130622f,0.225691f,0.054404f);
  gl.glVertex3f (-0.110802f,0.241061f,0.012056f);
  gl.glVertex3f (-0.110777f,0.248465f,0.012396f);
  gl.glVertex3f (-0.130529f,0.232699f,0.056786f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.072028f,0.033209f,-0.070790f);
  gl.glVertex3f (-0.090076f,0.008340f,-0.032228f);
  gl.glVertex3f (-0.090072f,0.002000f,-0.036023f);
  gl.glVertex3f (-0.071977f,0.028033f,-0.076032f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.059779f,0.073449f,-0.096962f);
  gl.glVertex3f (-0.072028f,0.033209f,-0.070790f);
  gl.glVertex3f (-0.071977f,0.028033f,-0.076032f);
  gl.glVertex3f (-0.059663f,0.070691f,-0.103761f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.055446f,0.122101f,-0.106220f);
  gl.glVertex3f (-0.059779f,0.073449f,-0.096962f);
  gl.glVertex3f (-0.059663f,0.070691f,-0.103761f);
  gl.glVertex3f (-0.055303f,0.122101f,-0.113544f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.867979f,0.018511f,0.065154f);
  gl.glVertex3f (-0.745667f,0.018511f,0.065154f);
  gl.glVertex3f (-0.745667f,0.013003f,0.070056f);
  gl.glVertex3f (-0.867979f,0.013003f,0.070056f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.745667f,0.008340f,-0.030497f);
  gl.glVertex3f (-0.867979f,0.008340f,-0.030497f);
  gl.glVertex3f (-0.867979f,0.001921f,-0.034159f);
  gl.glVertex3f (-0.745667f,0.001921f,-0.034159f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.745667f,0.018511f,0.065154f);
  gl.glVertex3f (-0.547679f,0.018511f,0.065154f);
  gl.glVertex3f (-0.547679f,0.013003f,0.070056f);
  gl.glVertex3f (-0.745667f,0.013003f,0.070056f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.745667f,0.210992f,-0.073073f);
  gl.glVertex3f (-0.745667f,0.170753f,-0.101970f);
  gl.glVertex3f (-0.745667f,0.173767f,-0.108663f);
  gl.glVertex3f (-0.745667f,0.216837f,-0.077578f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.745667f,0.170753f,-0.101970f);
  gl.glVertex3f (-0.745667f,0.122101f,-0.112192f);
  gl.glVertex3f (-0.745667f,0.122101f,-0.119517f);
  gl.glVertex3f (-0.745667f,0.173767f,-0.108663f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.745667f,0.122101f,-0.112192f);
  gl.glVertex3f (-0.745667f,0.073449f,-0.101970f);
  gl.glVertex3f (-0.745667f,0.070434f,-0.108663f);
  gl.glVertex3f (-0.745667f,0.122101f,-0.119517f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.745667f,0.073449f,-0.101970f);
  gl.glVertex3f (-0.745667f,0.033209f,-0.073073f);
  gl.glVertex3f (-0.745667f,0.027701f,-0.077975f);
  gl.glVertex3f (-0.745667f,0.070434f,-0.108663f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.745667f,0.033209f,-0.073073f);
  gl.glVertex3f (-0.745667f,0.008340f,-0.030497f);
  gl.glVertex3f (-0.745667f,0.001921f,-0.034159f);
  gl.glVertex3f (-0.745667f,0.027701f,-0.077975f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.547679f,0.210992f,-0.073073f);
  gl.glVertex3f (-0.745667f,0.210992f,-0.073073f);
  gl.glVertex3f (-0.745667f,0.216837f,-0.077578f);
  gl.glVertex3f (-0.547679f,0.216837f,-0.077578f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.338813f,0.008340f,-0.030497f);
  gl.glVertex3f (-0.547679f,0.008340f,-0.030497f);
  gl.glVertex3f (-0.547679f,0.001921f,-0.034159f);
  gl.glVertex3f (-0.338811f,0.001960f,-0.034226f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.547679f,0.225691f,0.065154f);
  gl.glVertex3f (-0.338813f,0.225691f,0.065154f);
  gl.glVertex3f (-0.338767f,0.232720f,0.067476f);
  gl.glVertex3f (-0.547679f,0.232355f,0.068359f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.547679f,0.170753f,-0.101970f);
  gl.glVertex3f (-0.547679f,0.210992f,-0.073073f);
  gl.glVertex3f (-0.547679f,0.216837f,-0.077578f);
  gl.glVertex3f (-0.547679f,0.173767f,-0.108663f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.547679f,0.051792f,0.101689f);
  gl.glVertex3f (-0.547679f,0.097231f,0.121685f);
  gl.glVertex3f (-0.547679f,0.095690f,0.128851f);
  gl.glVertex3f (-0.547679f,0.047436f,0.107616f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.547679f,0.122101f,-0.112192f);
  gl.glVertex3f (-0.547679f,0.170753f,-0.101970f);
  gl.glVertex3f (-0.547679f,0.173767f,-0.108663f);
  gl.glVertex3f (-0.547679f,0.122101f,-0.119517f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.547679f,0.097231f,0.121685f);
  gl.glVertex3f (-0.547679f,0.146970f,0.121685f);
  gl.glVertex3f (-0.547679f,0.148511f,0.128851f);
  gl.glVertex3f (-0.547679f,0.095690f,0.128851f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.547679f,0.073449f,-0.101970f);
  gl.glVertex3f (-0.547679f,0.122101f,-0.112192f);
  gl.glVertex3f (-0.547679f,0.122101f,-0.119517f);
  gl.glVertex3f (-0.547679f,0.070434f,-0.108663f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.547679f,0.146970f,0.121685f);
  gl.glVertex3f (-0.547679f,0.192409f,0.101689f);
  gl.glVertex3f (-0.547679f,0.196765f,0.107616f);
  gl.glVertex3f (-0.547679f,0.148511f,0.128851f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.547679f,0.033209f,-0.073073f);
  gl.glVertex3f (-0.547679f,0.073449f,-0.101970f);
  gl.glVertex3f (-0.547679f,0.070434f,-0.108663f);
  gl.glVertex3f (-0.547679f,0.027701f,-0.077975f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.547679f,0.192409f,0.101689f);
  gl.glVertex3f (-0.547679f,0.225691f,0.065154f);
  gl.glVertex3f (-0.547679f,0.232355f,0.068359f);
  gl.glVertex3f (-0.547679f,0.196765f,0.107616f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.547679f,0.008340f,-0.030497f);
  gl.glVertex3f (-0.547679f,0.033209f,-0.073073f);
  gl.glVertex3f (-0.547679f,0.027701f,-0.077975f);
  gl.glVertex3f (-0.547679f,0.001921f,-0.034159f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.547679f,0.018511f,0.065154f);
  gl.glVertex3f (-0.547679f,0.051792f,0.101689f);
  gl.glVertex3f (-0.547679f,0.047436f,0.107616f);
  gl.glVertex3f (-0.547679f,0.013003f,0.070056f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.090076f,0.008340f,-0.032228f);
  gl.glVertex3f (-0.338813f,0.008340f,-0.030497f);
  gl.glVertex3f (-0.338811f,0.001960f,-0.034226f);
  gl.glVertex3f (-0.090072f,0.002000f,-0.036023f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.338813f,0.225691f,0.065154f);
  gl.glVertex3f (-0.130622f,0.225691f,0.054404f);
  gl.glVertex3f (-0.130529f,0.232699f,0.056786f);
  gl.glVertex3f (-0.338767f,0.232720f,0.067476f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.445792f,0.000000f,0.313992f);
  gl.glVertex3f (-0.511364f,0.000000f,0.198356f);
  gl.glVertex3f (-0.511364f,0.250000f,0.198356f);
  gl.glVertex3f (-0.445792f,0.250000f,0.313992f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.511364f,0.250000f,0.198356f);
  gl.glVertex3f (-0.511364f,0.000000f,0.198356f);
  gl.glVertex3f (-0.544629f,0.000000f,0.126102f);
  gl.glVertex3f (-0.544629f,0.250000f,0.126102f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.454720f,0.000000f,0.327612f);
  gl.glVertex3f (-0.454720f,0.250000f,0.327612f);
  gl.glVertex3f (-0.520705f,0.250000f,0.211209f);
  gl.glVertex3f (-0.520705f,0.000000f,0.211209f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.520705f,0.250000f,0.211209f);
  gl.glVertex3f (-0.554360f,0.250000f,0.138154f);
  gl.glVertex3f (-0.554360f,0.000000f,0.138154f);
  gl.glVertex3f (-0.520705f,0.000000f,0.211209f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.445792f,0.250000f,0.313992f);
  gl.glVertex3f (-0.511364f,0.250000f,0.198356f);
  gl.glVertex3f (-0.520705f,0.250000f,0.211209f);
  gl.glVertex3f (-0.454720f,0.250000f,0.327612f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.544629f,0.250000f,0.126102f);
  gl.glVertex3f (-0.544629f,0.000000f,0.126102f);
  gl.glVertex3f (-0.554360f,0.000000f,0.138154f);
  gl.glVertex3f (-0.554360f,0.250000f,0.138154f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.511364f,0.250000f,0.198356f);
  gl.glVertex3f (-0.544629f,0.250000f,0.126102f);
  gl.glVertex3f (-0.554360f,0.250000f,0.138154f);
  gl.glVertex3f (-0.520705f,0.250000f,0.211209f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.499531f,0.000000f,-0.097045f);
  gl.glVertex3f (0.503648f,0.000000f,0.112182f);
  gl.glVertex3f (0.503648f,0.250000f,0.112182f);
  gl.glVertex3f (0.499531f,0.250000f,-0.097045f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.470146f,0.000000f,-0.185135f);
  gl.glVertex3f (0.499531f,0.000000f,-0.097045f);
  gl.glVertex3f (0.499531f,0.250000f,-0.097045f);
  gl.glVertex3f (0.470146f,0.250000f,-0.185135f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.438076f,0.000000f,0.313991f);
  gl.glVertex3f (0.296090f,0.000000f,0.471683f);
  gl.glVertex3f (0.296090f,0.250000f,0.471683f);
  gl.glVertex3f (0.438076f,0.250000f,0.313991f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.503648f,0.000000f,0.112182f);
  gl.glVertex3f (0.438076f,0.000000f,0.313991f);
  gl.glVertex3f (0.438076f,0.250000f,0.313991f);
  gl.glVertex3f (0.503648f,0.250000f,0.112182f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.296090f,0.000000f,0.471683f);
  gl.glVertex3f (0.199165f,0.000000f,0.514837f);
  gl.glVertex3f (0.199165f,0.250000f,0.514837f);
  gl.glVertex3f (0.296090f,0.250000f,0.471683f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.511294f,0.000000f,-0.102311f);
  gl.glVertex3f (0.511294f,0.250000f,-0.102311f);
  gl.glVertex3f (0.515524f,0.250000f,0.116716f);
  gl.glVertex3f (0.515524f,0.000000f,0.116716f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.480842f,0.000000f,-0.194735f);
  gl.glVertex3f (0.480842f,0.250000f,-0.194735f);
  gl.glVertex3f (0.511294f,0.250000f,-0.102311f);
  gl.glVertex3f (0.511294f,0.000000f,-0.102311f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.447141f,0.000000f,0.327368f);
  gl.glVertex3f (0.447141f,0.250000f,0.327368f);
  gl.glVertex3f (0.301174f,0.250000f,0.489861f);
  gl.glVertex3f (0.301174f,0.000000f,0.489861f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.515524f,0.000000f,0.116716f);
  gl.glVertex3f (0.515524f,0.250000f,0.116716f);
  gl.glVertex3f (0.447141f,0.250000f,0.327368f);
  gl.glVertex3f (0.447141f,0.000000f,0.327368f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.301174f,0.000000f,0.489861f);
  gl.glVertex3f (0.301174f,0.250000f,0.489861f);
  gl.glVertex3f (0.202359f,0.250000f,0.534138f);
  gl.glVertex3f (0.202359f,0.000000f,0.534138f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.438076f,0.250000f,0.313991f);
  gl.glVertex3f (0.296090f,0.250000f,0.471683f);
  gl.glVertex3f (0.301174f,0.250000f,0.489861f);
  gl.glVertex3f (0.447141f,0.250000f,0.327368f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.503648f,0.250000f,0.112182f);
  gl.glVertex3f (0.438076f,0.250000f,0.313991f);
  gl.glVertex3f (0.447141f,0.250000f,0.327368f);
  gl.glVertex3f (0.515524f,0.250000f,0.116716f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.499531f,0.250000f,-0.097045f);
  gl.glVertex3f (0.503648f,0.250000f,0.112182f);
  gl.glVertex3f (0.515524f,0.250000f,0.116716f);
  gl.glVertex3f (0.511294f,0.250000f,-0.102311f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.470146f,0.250000f,-0.185135f);
  gl.glVertex3f (0.499531f,0.250000f,-0.097045f);
  gl.glVertex3f (0.511294f,0.250000f,-0.102311f);
  gl.glVertex3f (0.480842f,0.250000f,-0.194735f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.296090f,0.250000f,0.471683f);
  gl.glVertex3f (0.199165f,0.250000f,0.514837f);
  gl.glVertex3f (0.202359f,0.250000f,0.534138f);
  gl.glVertex3f (0.301174f,0.250000f,0.489861f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.199165f,0.250000f,0.514837f);
  gl.glVertex3f (0.199165f,0.000000f,0.514837f);
  gl.glVertex3f (0.202359f,0.000000f,0.534138f);
  gl.glVertex3f (0.202359f,0.250000f,0.534138f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.003858f,0.000000f,0.557991f);
  gl.glVertex3f (-0.109955f,0.000000f,0.557991f);
  gl.glVertex3f (-0.109955f,0.250000f,0.557991f);
  gl.glVertex3f (-0.003858f,0.250000f,0.557991f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.109955f,0.000000f,0.557991f);
  gl.glVertex3f (-0.303805f,0.000000f,0.471683f);
  gl.glVertex3f (-0.303805f,0.250000f,0.471683f);
  gl.glVertex3f (-0.109955f,0.250000f,0.557991f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.003858f,0.000000f,0.577991f);
  gl.glVertex3f (-0.003858f,0.250000f,0.577991f);
  gl.glVertex3f (-0.111566f,0.250000f,0.577815f);
  gl.glVertex3f (-0.111566f,0.000000f,0.577815f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.111566f,0.000000f,0.577815f);
  gl.glVertex3f (-0.111566f,0.250000f,0.577815f);
  gl.glVertex3f (-0.306999f,0.250000f,0.490984f);
  gl.glVertex3f (-0.306999f,0.000000f,0.490984f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.109955f,0.250000f,0.557991f);
  gl.glVertex3f (-0.303805f,0.250000f,0.471683f);
  gl.glVertex3f (-0.306999f,0.250000f,0.490984f);
  gl.glVertex3f (-0.111566f,0.250000f,0.577815f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.003858f,0.250000f,0.557991f);
  gl.glVertex3f (-0.109955f,0.250000f,0.557991f);
  gl.glVertex3f (-0.111566f,0.250000f,0.577815f);
  gl.glVertex3f (-0.003858f,0.250000f,0.577991f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.003858f,0.000000f,0.557991f);
  gl.glVertex3f (-0.003858f,0.250000f,0.557991f);
  gl.glVertex3f (-0.003858f,0.250000f,0.577991f);
  gl.glVertex3f (-0.003858f,0.000000f,0.577991f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.073199f,0.000000f,0.367387f);
  gl.glVertex3f (-0.068603f,0.000000f,0.367387f);
  gl.glVertex3f (-0.068603f,0.250000f,0.367387f);
  gl.glVertex3f (0.073199f,0.250000f,0.367387f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.293029f,0.000000f,0.208553f);
  gl.glVertex3f (-0.336848f,0.000000f,0.133279f);
  gl.glVertex3f (-0.336848f,0.250000f,0.133279f);
  gl.glVertex3f (-0.293029f,0.250000f,0.208553f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.326622f,0.000000f,-0.060190f);
  gl.glVertex3f (0.341445f,0.000000f,0.077183f);
  gl.glVertex3f (0.341445f,0.250000f,0.077183f);
  gl.glVertex3f (0.326622f,0.250000f,-0.060190f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.202742f,0.000000f,0.311204f);
  gl.glVertex3f (0.073199f,0.000000f,0.367387f);
  gl.glVertex3f (0.073199f,0.250000f,0.367387f);
  gl.glVertex3f (0.202742f,0.250000f,0.311204f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.198145f,0.000000f,0.311204f);
  gl.glVertex3f (-0.293029f,0.000000f,0.208553f);
  gl.glVertex3f (-0.293029f,0.250000f,0.208553f);
  gl.glVertex3f (-0.198145f,0.250000f,0.311204f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.297626f,0.000000f,0.208553f);
  gl.glVertex3f (0.202742f,0.000000f,0.311204f);
  gl.glVertex3f (0.202742f,0.250000f,0.311204f);
  gl.glVertex3f (0.297626f,0.250000f,0.208553f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.068603f,0.000000f,0.367387f);
  gl.glVertex3f (-0.198145f,0.000000f,0.311204f);
  gl.glVertex3f (-0.198145f,0.250000f,0.311204f);
  gl.glVertex3f (-0.068603f,0.250000f,0.367387f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.341445f,0.000000f,0.077183f);
  gl.glVertex3f (0.297626f,0.000000f,0.208553f);
  gl.glVertex3f (0.297626f,0.250000f,0.208553f);
  gl.glVertex3f (0.341445f,0.250000f,0.077183f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.074771f,0.000000f,0.387220f);
  gl.glVertex3f (0.074771f,0.250000f,0.387220f);
  gl.glVertex3f (-0.070174f,0.250000f,0.387220f);
  gl.glVertex3f (-0.070174f,0.000000f,0.387220f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.300845f,0.000000f,0.223904f);
  gl.glVertex3f (-0.300845f,0.250000f,0.223904f);
  gl.glVertex3f (-0.345668f,0.250000f,0.147091f);
  gl.glVertex3f (-0.345668f,0.000000f,0.147091f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.338629f,0.000000f,-0.063676f);
  gl.glVertex3f (0.338629f,0.250000f,-0.063676f);
  gl.glVertex3f (0.353477f,0.250000f,0.080423f);
  gl.glVertex3f (0.353477f,0.000000f,0.080423f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.207722f,0.000000f,0.329459f);
  gl.glVertex3f (0.207722f,0.250000f,0.329459f);
  gl.glVertex3f (0.074771f,0.250000f,0.387220f);
  gl.glVertex3f (0.074771f,0.000000f,0.387220f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.203126f,0.000000f,0.329459f);
  gl.glVertex3f (-0.203126f,0.250000f,0.329459f);
  gl.glVertex3f (-0.300845f,0.250000f,0.223904f);
  gl.glVertex3f (-0.300845f,0.000000f,0.223904f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.306596f,0.000000f,0.222100f);
  gl.glVertex3f (0.306596f,0.250000f,0.222100f);
  gl.glVertex3f (0.207722f,0.250000f,0.329459f);
  gl.glVertex3f (0.207722f,0.000000f,0.329459f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.070174f,0.000000f,0.387220f);
  gl.glVertex3f (-0.070174f,0.250000f,0.387220f);
  gl.glVertex3f (-0.203126f,0.250000f,0.329459f);
  gl.glVertex3f (-0.203126f,0.000000f,0.329459f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.353477f,0.000000f,0.080423f);
  gl.glVertex3f (0.353477f,0.250000f,0.080423f);
  gl.glVertex3f (0.306596f,0.250000f,0.222100f);
  gl.glVertex3f (0.306596f,0.000000f,0.222100f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.293029f,0.250000f,0.208553f);
  gl.glVertex3f (-0.336848f,0.250000f,0.133279f);
  gl.glVertex3f (-0.345668f,0.250000f,0.147091f);
  gl.glVertex3f (-0.300845f,0.250000f,0.223904f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.198145f,0.250000f,0.311204f);
  gl.glVertex3f (-0.293029f,0.250000f,0.208553f);
  gl.glVertex3f (-0.300845f,0.250000f,0.223904f);
  gl.glVertex3f (-0.203126f,0.250000f,0.329459f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.068603f,0.250000f,0.367387f);
  gl.glVertex3f (-0.198145f,0.250000f,0.311204f);
  gl.glVertex3f (-0.203126f,0.250000f,0.329459f);
  gl.glVertex3f (-0.070174f,0.250000f,0.387220f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.073199f,0.250000f,0.367387f);
  gl.glVertex3f (-0.068603f,0.250000f,0.367387f);
  gl.glVertex3f (-0.070174f,0.250000f,0.387220f);
  gl.glVertex3f (0.074771f,0.250000f,0.387220f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.202742f,0.250000f,0.311204f);
  gl.glVertex3f (0.073199f,0.250000f,0.367387f);
  gl.glVertex3f (0.074771f,0.250000f,0.387220f);
  gl.glVertex3f (0.207722f,0.250000f,0.329459f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.297626f,0.250000f,0.208553f);
  gl.glVertex3f (0.202742f,0.250000f,0.311204f);
  gl.glVertex3f (0.207722f,0.250000f,0.329459f);
  gl.glVertex3f (0.306596f,0.250000f,0.222100f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.341445f,0.250000f,0.077183f);
  gl.glVertex3f (0.297626f,0.250000f,0.208553f);
  gl.glVertex3f (0.306596f,0.250000f,0.222100f);
  gl.glVertex3f (0.353477f,0.250000f,0.080423f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.326622f,0.250000f,-0.060190f);
  gl.glVertex3f (0.341445f,0.250000f,0.077183f);
  gl.glVertex3f (0.353477f,0.250000f,0.080423f);
  gl.glVertex3f (0.338629f,0.250000f,-0.063676f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.336848f,0.250000f,0.133279f);
  gl.glVertex3f (-0.336848f,0.000000f,0.133279f);
  gl.glVertex3f (-0.345668f,0.000000f,0.147091f);
  gl.glVertex3f (-0.345668f,0.250000f,0.147091f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.326622f,0.000000f,-0.060190f);
  gl.glVertex3f (0.326622f,0.250000f,-0.060190f);
  gl.glVertex3f (0.338629f,0.250000f,-0.063676f);
  gl.glVertex3f (0.338629f,0.000000f,-0.063676f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.000389f,0.250000f,-0.261776f);
  gl.glVertex3f (0.000389f,0.000000f,-0.261776f);
  gl.glVertex3f (-0.001258f,0.000000f,-0.116353f);
  gl.glVertex3f (-0.001258f,0.250000f,-0.116353f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.000389f,0.000000f,-0.261776f);
  gl.glVertex3f (0.141001f,0.000000f,-0.261006f);
  gl.glVertex3f (0.141001f,0.250000f,-0.261006f);
  gl.glVertex3f (0.000389f,0.250000f,-0.261776f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.141001f,0.000000f,-0.261006f);
  gl.glVertex3f (0.255721f,0.000000f,-0.179815f);
  gl.glVertex3f (0.255721f,0.250000f,-0.179815f);
  gl.glVertex3f (0.141001f,0.250000f,-0.261006f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.012580f,0.250000f,-0.261405f);
  gl.glVertex3f (0.010933f,0.250000f,-0.115982f);
  gl.glVertex3f (0.010933f,0.000000f,-0.115982f);
  gl.glVertex3f (0.012580f,0.000000f,-0.261405f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.000429f,0.000000f,-0.281776f);
  gl.glVertex3f (0.000429f,0.250000f,-0.281776f);
  gl.glVertex3f (0.143487f,0.250000f,-0.280585f);
  gl.glVertex3f (0.143487f,0.000000f,-0.280585f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.143487f,0.000000f,-0.280585f);
  gl.glVertex3f (0.143487f,0.250000f,-0.280585f);
  gl.glVertex3f (0.260552f,0.250000f,-0.198178f);
  gl.glVertex3f (0.260552f,0.000000f,-0.198178f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.000389f,0.250000f,-0.261776f);
  gl.glVertex3f (-0.001258f,0.250000f,-0.116353f);
  gl.glVertex3f (0.010933f,0.250000f,-0.115982f);
  gl.glVertex3f (0.012580f,0.250000f,-0.261405f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.141001f,0.250000f,-0.261006f);
  gl.glVertex3f (0.255721f,0.250000f,-0.179815f);
  gl.glVertex3f (0.260552f,0.250000f,-0.198178f);
  gl.glVertex3f (0.143487f,0.250000f,-0.280585f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.255721f,0.250000f,-0.179815f);
  gl.glVertex3f (0.255721f,0.000000f,-0.179815f);
  gl.glVertex3f (0.260552f,0.000000f,-0.198178f);
  gl.glVertex3f (0.260552f,0.250000f,-0.198178f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.000389f,0.250000f,-0.261776f);
  gl.glVertex3f (0.141001f,0.250000f,-0.261006f);
  gl.glVertex3f (0.143487f,0.250000f,-0.280585f);
  gl.glVertex3f (0.000429f,0.250000f,-0.281776f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.000000f,-0.000543f,-0.116295f);
  gl.glVertex3f (-0.049337f,-0.000543f,-0.104135f);
  gl.glVertex3f (-0.049337f,0.241547f,-0.104135f);
  gl.glVertex3f (0.000000f,0.241547f,-0.116295f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.049337f,-0.000543f,-0.104135f);
  gl.glVertex3f (-0.087371f,-0.000543f,-0.070440f);
  gl.glVertex3f (-0.087371f,0.241547f,-0.070440f);
  gl.glVertex3f (-0.049337f,0.241547f,-0.104135f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.087371f,-0.000543f,-0.070440f);
  gl.glVertex3f (-0.105390f,-0.000543f,-0.022928f);
  gl.glVertex3f (-0.105390f,0.241547f,-0.022928f);
  gl.glVertex3f (-0.087371f,0.241547f,-0.070440f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.105390f,-0.000543f,-0.022928f);
  gl.glVertex3f (-0.099265f,-0.000543f,0.027515f);
  gl.glVertex3f (-0.099265f,0.241547f,0.027515f);
  gl.glVertex3f (-0.105390f,0.241547f,-0.022928f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.087371f,-0.000543f,-0.070440f);
  gl.glVertex3f (0.049337f,-0.000543f,-0.104135f);
  gl.glVertex3f (0.049337f,0.241547f,-0.104135f);
  gl.glVertex3f (0.087371f,0.241547f,-0.070440f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.099265f,-0.000543f,0.027515f);
  gl.glVertex3f (-0.070400f,-0.000543f,0.069333f);
  gl.glVertex3f (-0.070400f,0.241547f,0.069333f);
  gl.glVertex3f (-0.099265f,0.241547f,0.027515f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.049337f,-0.000543f,-0.104135f);
  gl.glVertex3f (0.000000f,-0.000543f,-0.116295f);
  gl.glVertex3f (0.000000f,0.241547f,-0.116295f);
  gl.glVertex3f (0.049337f,0.241547f,-0.104135f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.070400f,-0.000543f,0.069333f);
  gl.glVertex3f (-0.025407f,-0.000543f,0.092947f);
  gl.glVertex3f (-0.025407f,0.241547f,0.092947f);
  gl.glVertex3f (-0.070400f,0.241547f,0.069333f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.025407f,-0.000543f,0.092947f);
  gl.glVertex3f (0.025407f,-0.000543f,0.092947f);
  gl.glVertex3f (0.025407f,0.241547f,0.092947f);
  gl.glVertex3f (-0.025407f,0.241547f,0.092947f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.025407f,-0.000543f,0.092947f);
  gl.glVertex3f (0.070400f,-0.000543f,0.069333f);
  gl.glVertex3f (0.070400f,0.241547f,0.069333f);
  gl.glVertex3f (0.025407f,0.241547f,0.092947f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.000000f,-0.000543f,-0.102702f);
  gl.glVertex3f (0.000000f,0.241547f,-0.102702f);
  gl.glVertex3f (-0.043020f,0.241547f,-0.092099f);
  gl.glVertex3f (-0.043020f,-0.000543f,-0.092099f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.043020f,-0.000543f,-0.092099f);
  gl.glVertex3f (-0.043020f,0.241547f,-0.092099f);
  gl.glVertex3f (-0.076184f,0.241547f,-0.062718f);
  gl.glVertex3f (-0.076184f,-0.000543f,-0.062718f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.076184f,-0.000543f,-0.062718f);
  gl.glVertex3f (-0.076184f,0.241547f,-0.062718f);
  gl.glVertex3f (-0.091895f,0.241547f,-0.021290f);
  gl.glVertex3f (-0.091895f,-0.000543f,-0.021290f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.091895f,-0.000543f,-0.021290f);
  gl.glVertex3f (-0.091895f,0.241547f,-0.021290f);
  gl.glVertex3f (-0.086555f,0.241547f,0.022694f);
  gl.glVertex3f (-0.086555f,-0.000543f,0.022694f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.078357f,-0.000543f,-0.060265f);
  gl.glVertex3f (0.078357f,0.241547f,-0.060265f);
  gl.glVertex3f (0.043020f,0.241547f,-0.092099f);
  gl.glVertex3f (0.043020f,-0.000543f,-0.092099f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.086555f,-0.000543f,0.022694f);
  gl.glVertex3f (-0.086555f,0.241547f,0.022694f);
  gl.glVertex3f (-0.061385f,0.241547f,0.059158f);
  gl.glVertex3f (-0.061386f,-0.000543f,0.059158f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.043020f,-0.000543f,-0.092099f);
  gl.glVertex3f (0.043020f,0.241547f,-0.092099f);
  gl.glVertex3f (0.000000f,0.241547f,-0.102702f);
  gl.glVertex3f (0.000000f,-0.000543f,-0.102702f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.061386f,-0.000543f,0.059158f);
  gl.glVertex3f (-0.061385f,0.241547f,0.059158f);
  gl.glVertex3f (-0.022154f,0.241547f,0.079749f);
  gl.glVertex3f (-0.022154f,-0.000543f,0.079749f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.022154f,-0.000543f,0.079749f);
  gl.glVertex3f (-0.022154f,0.241547f,0.079749f);
  gl.glVertex3f (0.022154f,0.241547f,0.079749f);
  gl.glVertex3f (0.022154f,-0.000543f,0.079749f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.022154f,-0.000543f,0.079749f);
  gl.glVertex3f (0.022154f,0.241547f,0.079749f);
  gl.glVertex3f (0.064083f,0.241547f,0.057297f);
  gl.glVertex3f (0.064083f,-0.000543f,0.057297f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.000000f,0.241547f,-0.116295f);
  gl.glVertex3f (-0.049337f,0.241547f,-0.104135f);
  gl.glVertex3f (-0.043020f,0.241547f,-0.092099f);
  gl.glVertex3f (0.000000f,0.241547f,-0.102702f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.049337f,0.241547f,-0.104135f);
  gl.glVertex3f (-0.087371f,0.241547f,-0.070440f);
  gl.glVertex3f (-0.076184f,0.241547f,-0.062718f);
  gl.glVertex3f (-0.043020f,0.241547f,-0.092099f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.087371f,0.241547f,-0.070440f);
  gl.glVertex3f (-0.105390f,0.241547f,-0.022928f);
  gl.glVertex3f (-0.091895f,0.241547f,-0.021290f);
  gl.glVertex3f (-0.076184f,0.241547f,-0.062718f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.105390f,0.241547f,-0.022928f);
  gl.glVertex3f (-0.099265f,0.241547f,0.027515f);
  gl.glVertex3f (-0.086555f,0.241547f,0.022694f);
  gl.glVertex3f (-0.091895f,0.241547f,-0.021290f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.099265f,0.241547f,0.027515f);
  gl.glVertex3f (-0.070400f,0.241547f,0.069333f);
  gl.glVertex3f (-0.061385f,0.241547f,0.059158f);
  gl.glVertex3f (-0.086555f,0.241547f,0.022694f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.070400f,0.241547f,0.069333f);
  gl.glVertex3f (-0.025407f,0.241547f,0.092947f);
  gl.glVertex3f (-0.022154f,0.241547f,0.079749f);
  gl.glVertex3f (-0.061385f,0.241547f,0.059158f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.025407f,0.241547f,0.092947f);
  gl.glVertex3f (0.025407f,0.241547f,0.092947f);
  gl.glVertex3f (0.022154f,0.241547f,0.079749f);
  gl.glVertex3f (-0.022154f,0.241547f,0.079749f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.025407f,0.241547f,0.092947f);
  gl.glVertex3f (0.070400f,0.241547f,0.069333f);
  gl.glVertex3f (0.064083f,0.241547f,0.057297f);
  gl.glVertex3f (0.022154f,0.241547f,0.079749f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.087371f,0.241547f,-0.070440f);
  gl.glVertex3f (0.049337f,0.241547f,-0.104135f);
  gl.glVertex3f (0.043020f,0.241547f,-0.092099f);
  gl.glVertex3f (0.078357f,0.241547f,-0.060265f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.049337f,0.241547f,-0.104135f);
  gl.glVertex3f (0.000000f,0.241547f,-0.116295f);
  gl.glVertex3f (0.000000f,0.241547f,-0.102702f);
  gl.glVertex3f (0.043020f,0.241547f,-0.092099f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.070400f,0.241547f,0.069333f);
  gl.glVertex3f (0.070400f,-0.000543f,0.069333f);
  gl.glVertex3f (0.064083f,-0.000543f,0.057297f);
  gl.glVertex3f (0.064083f,0.241547f,0.057297f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.087371f,-0.000543f,-0.070440f);
  gl.glVertex3f (0.087371f,0.241547f,-0.070440f);
  gl.glVertex3f (0.078357f,0.241547f,-0.060265f);
  gl.glVertex3f (0.078357f,-0.000543f,-0.060265f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.544266f,0.250000f,-0.115504f);
  gl.glVertex3f (-0.544266f,0.000000f,-0.115504f);
  gl.glVertex3f (-0.544266f,0.000000f,-0.196472f);
  gl.glVertex3f (-0.544266f,0.250000f,-0.196472f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.544266f,0.250000f,-0.196472f);
  gl.glVertex3f (-0.544266f,0.000000f,-0.196472f);
  gl.glVertex3f (-0.529801f,0.000000f,-0.277332f);
  gl.glVertex3f (-0.529801f,0.250000f,-0.277332f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.529801f,0.250000f,-0.277332f);
  gl.glVertex3f (-0.529801f,0.000000f,-0.277332f);
  gl.glVertex3f (-0.459380f,0.000000f,-0.344379f);
  gl.glVertex3f (-0.459380f,0.250000f,-0.344379f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.743600f,0.250000f,-0.194816f);
  gl.glVertex3f (-0.743600f,0.000000f,-0.194816f);
  gl.glVertex3f (-0.743600f,0.000000f,-0.294428f);
  gl.glVertex3f (-0.743600f,0.250000f,-0.294428f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.743600f,0.250000f,-0.294428f);
  gl.glVertex3f (-0.743600f,0.000000f,-0.294428f);
  gl.glVertex3f (-0.709458f,0.000000f,-0.364466f);
  gl.glVertex3f (-0.709458f,0.250000f,-0.364466f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.709458f,0.250000f,-0.364466f);
  gl.glVertex3f (-0.709458f,0.000000f,-0.364466f);
  gl.glVertex3f (-0.641744f,0.000000f,-0.428239f);
  gl.glVertex3f (-0.641744f,0.250000f,-0.428239f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.743600f,0.000000f,-0.194816f);
  gl.glVertex3f (-0.743600f,0.250000f,-0.194816f);
  gl.glVertex3f (-0.743600f,0.250000f,-0.116058f);
  gl.glVertex3f (-0.743600f,0.000000f,-0.116058f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.099781f,0.000000f,-0.449037f);
  gl.glVertex3f (0.210926f,0.000000f,-0.419987f);
  gl.glVertex3f (0.210926f,0.250000f,-0.419987f);
  gl.glVertex3f (0.099781f,0.250000f,-0.449037f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.210926f,0.000000f,-0.419987f);
  gl.glVertex3f (0.384402f,0.000000f,-0.307907f);
  gl.glVertex3f (0.384402f,0.250000f,-0.307907f);
  gl.glVertex3f (0.210926f,0.250000f,-0.419987f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.556460f,0.250000f,-0.115504f);
  gl.glVertex3f (-0.556335f,0.250000f,-0.199316f);
  gl.glVertex3f (-0.556336f,0.000000f,-0.199316f);
  gl.glVertex3f (-0.556460f,0.000000f,-0.115504f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.556335f,0.250000f,-0.199316f);
  gl.glVertex3f (-0.539395f,0.250000f,-0.289675f);
  gl.glVertex3f (-0.539395f,0.000000f,-0.289675f);
  gl.glVertex3f (-0.556336f,0.000000f,-0.199316f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.539395f,0.250000f,-0.289675f);
  gl.glVertex3f (-0.465501f,0.250000f,-0.361676f);
  gl.glVertex3f (-0.465501f,0.000000f,-0.361676f);
  gl.glVertex3f (-0.539395f,0.000000f,-0.289675f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.755794f,0.250000f,-0.194816f);
  gl.glVertex3f (-0.755107f,0.250000f,-0.301045f);
  gl.glVertex3f (-0.755107f,0.000000f,-0.301045f);
  gl.glVertex3f (-0.755794f,0.000000f,-0.194816f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.755107f,0.250000f,-0.301045f);
  gl.glVertex3f (-0.717395f,0.250000f,-0.379648f);
  gl.glVertex3f (-0.717395f,0.000000f,-0.379648f);
  gl.glVertex3f (-0.755107f,0.000000f,-0.301045f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.717395f,0.250000f,-0.379648f);
  gl.glVertex3f (-0.647816f,0.250000f,-0.445583f);
  gl.glVertex3f (-0.647816f,0.000000f,-0.445583f);
  gl.glVertex3f (-0.717395f,0.000000f,-0.379648f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.755794f,0.000000f,-0.194816f);
  gl.glVertex3f (-0.755794f,0.000000f,-0.116058f);
  gl.glVertex3f (-0.755794f,0.250000f,-0.116058f);
  gl.glVertex3f (-0.755794f,0.250000f,-0.194816f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.101700f,0.000000f,-0.468787f);
  gl.glVertex3f (0.101700f,0.250000f,-0.468787f);
  gl.glVertex3f (0.212845f,0.250000f,-0.439738f);
  gl.glVertex3f (0.212845f,0.000000f,-0.439738f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.215395f,0.000000f,-0.438596f);
  gl.glVertex3f (0.215395f,0.250000f,-0.438596f);
  gl.glVertex3f (0.388871f,0.250000f,-0.326515f);
  gl.glVertex3f (0.388871f,0.000000f,-0.326515f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.544266f,0.000000f,-0.115504f);
  gl.glVertex3f (-0.544266f,0.250000f,-0.115504f);
  gl.glVertex3f (-0.556460f,0.250000f,-0.115504f);
  gl.glVertex3f (-0.556460f,0.000000f,-0.115504f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.544266f,0.250000f,-0.115504f);
  gl.glVertex3f (-0.544266f,0.250000f,-0.196472f);
  gl.glVertex3f (-0.556335f,0.250000f,-0.199316f);
  gl.glVertex3f (-0.556460f,0.250000f,-0.115504f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.544266f,0.250000f,-0.196472f);
  gl.glVertex3f (-0.529801f,0.250000f,-0.277332f);
  gl.glVertex3f (-0.539395f,0.250000f,-0.289675f);
  gl.glVertex3f (-0.556335f,0.250000f,-0.199316f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.459380f,0.250000f,-0.344379f);
  gl.glVertex3f (-0.459380f,0.000000f,-0.344379f);
  gl.glVertex3f (-0.465501f,0.000000f,-0.361676f);
  gl.glVertex3f (-0.465501f,0.250000f,-0.361676f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.529801f,0.250000f,-0.277332f);
  gl.glVertex3f (-0.459380f,0.250000f,-0.344379f);
  gl.glVertex3f (-0.465501f,0.250000f,-0.361676f);
  gl.glVertex3f (-0.539395f,0.250000f,-0.289675f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.743600f,0.250000f,-0.194816f);
  gl.glVertex3f (-0.743600f,0.250000f,-0.294428f);
  gl.glVertex3f (-0.755107f,0.250000f,-0.301045f);
  gl.glVertex3f (-0.755794f,0.250000f,-0.194816f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.743600f,0.250000f,-0.294428f);
  gl.glVertex3f (-0.709458f,0.250000f,-0.364466f);
  gl.glVertex3f (-0.717395f,0.250000f,-0.379648f);
  gl.glVertex3f (-0.755107f,0.250000f,-0.301045f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.709458f,0.250000f,-0.364466f);
  gl.glVertex3f (-0.641744f,0.250000f,-0.428239f);
  gl.glVertex3f (-0.647816f,0.250000f,-0.445583f);
  gl.glVertex3f (-0.717395f,0.250000f,-0.379648f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.743600f,0.000000f,-0.116058f);
  gl.glVertex3f (-0.743600f,0.250000f,-0.116058f);
  gl.glVertex3f (-0.755794f,0.250000f,-0.116058f);
  gl.glVertex3f (-0.755794f,0.000000f,-0.116058f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.743600f,0.250000f,-0.116058f);
  gl.glVertex3f (-0.743600f,0.250000f,-0.194816f);
  gl.glVertex3f (-0.755794f,0.250000f,-0.194816f);
  gl.glVertex3f (-0.755794f,0.250000f,-0.116058f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (-0.641744f,0.250000f,-0.428239f);
  gl.glVertex3f (-0.641744f,0.000000f,-0.428239f);
  gl.glVertex3f (-0.629551f,0.000000f,-0.428359f);
  gl.glVertex3f (-0.629551f,0.250000f,-0.428359f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.099781f,0.250000f,-0.449037f);
  gl.glVertex3f (0.210926f,0.250000f,-0.419987f);
  gl.glVertex3f (0.212845f,0.250000f,-0.439738f);
  gl.glVertex3f (0.101700f,0.250000f,-0.468787f);
gl.glEnd();

gl.glBegin(gl.GL_QUADS);
  gl.glVertex3f (0.210926f,0.250000f,-0.419987f);
  gl.glVertex3f (0.384402f,0.250000f,-0.307907f);
  gl.glVertex3f (0.388871f,0.250000f,-0.326515f);
  gl.glVertex3f (0.215395f,0.250000f,-0.438596f);
gl.glEnd();
        
    }
    
    
   
    
}
