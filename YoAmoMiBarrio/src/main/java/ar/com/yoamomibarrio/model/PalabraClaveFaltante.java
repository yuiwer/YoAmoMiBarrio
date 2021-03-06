package ar.com.yoamomibarrio.model;
// Generated 13/10/2013 23:06:13 by Hibernate Tools 3.2.1.GA



/**
 * PalabraClaveFaltante generated by hbm2java
 */
public class PalabraClaveFaltante  implements java.io.Serializable {


     private Short idPalabra;
     private Barrio barrio;
     private String descripcion;
     private String nota;

    public PalabraClaveFaltante() {
    }

	
    public PalabraClaveFaltante(Barrio barrio, String descripcion) {
        this.barrio = barrio;
        this.descripcion = descripcion;
    }
    public PalabraClaveFaltante(Barrio barrio, String descripcion, String nota) {
       this.barrio = barrio;
       this.descripcion = descripcion;
       this.nota = nota;
    }
   
    public Short getIdPalabra() {
        return this.idPalabra;
    }
    
    public void setIdPalabra(Short idPalabra) {
        this.idPalabra = idPalabra;
    }
    public Barrio getBarrio() {
        return this.barrio;
    }
    
    public void setBarrio(Barrio barrio) {
        this.barrio = barrio;
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




}


