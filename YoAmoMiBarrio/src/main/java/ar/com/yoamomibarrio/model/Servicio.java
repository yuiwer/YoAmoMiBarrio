package ar.com.yoamomibarrio.model;
// Generated 13/10/2013 23:06:13 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Servicio generated by hbm2java
 */
public class Servicio  implements java.io.Serializable {


     private Short idServicio;
     private String descripcion;
     private String nota;
     private Set locals = new HashSet(0);

    public Servicio() {
    }

	
    public Servicio(String descripcion) {
        this.descripcion = descripcion;
    }
    public Servicio(String descripcion, String nota, Set locals) {
       this.descripcion = descripcion;
       this.nota = nota;
       this.locals = locals;
    }
   
    public Short getIdServicio() {
        return this.idServicio;
    }
    
    public void setIdServicio(Short idServicio) {
        this.idServicio = idServicio;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getNota() {
        return this.nota;
    }
    
    public void setNota(String nota) {
        this.nota = nota;
    }
    public Set getLocals() {
        return this.locals;
    }
    
    public void setLocals(Set locals) {
        this.locals = locals;
    }




}


