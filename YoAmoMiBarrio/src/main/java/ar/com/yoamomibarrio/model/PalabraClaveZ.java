package ar.com.yoamomibarrio.model;
// Generated 13/10/2013 23:06:13 by Hibernate Tools 3.2.1.GA



/**
 * PalabraClaveZ generated by hbm2java
 */
public class PalabraClaveZ  implements java.io.Serializable {


     private Integer idPalabra;
     private String descripcion;
     private String nota;

    public PalabraClaveZ() {
    }

	
    public PalabraClaveZ(String descripcion) {
        this.descripcion = descripcion;
    }
    public PalabraClaveZ(String descripcion, String nota) {
       this.descripcion = descripcion;
       this.nota = nota;
    }
   
    public Integer getIdPalabra() {
        return this.idPalabra;
    }
    
    public void setIdPalabra(Integer idPalabra) {
        this.idPalabra = idPalabra;
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

