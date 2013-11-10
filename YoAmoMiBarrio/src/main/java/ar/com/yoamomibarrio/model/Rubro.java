package ar.com.yoamomibarrio.model;
// Generated 13/10/2013 23:06:13 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Rubro generated by hbm2java
 */
public class Rubro  implements java.io.Serializable {


     private Short idRubro;
     private Seccion seccion;
     private String descripcion;
     private Set subrubros = new HashSet(0);

    public Rubro() {
    }

	
    public Rubro(Seccion seccion, String descripcion) {
        this.seccion = seccion;
        this.descripcion = descripcion;
    }
    public Rubro(Seccion seccion, String descripcion, Set subrubros) {
       this.seccion = seccion;
       this.descripcion = descripcion;
       this.subrubros = subrubros;
    }
   
    public Short getIdRubro() {
        return this.idRubro;
    }
    
    public void setIdRubro(Short idRubro) {
        this.idRubro = idRubro;
    }
    public Seccion getSeccion() {
        return this.seccion;
    }
    
    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getSubrubros() {
        return this.subrubros;
    }
    
    public void setSubrubros(Set subrubros) {
        this.subrubros = subrubros;
    }




}

