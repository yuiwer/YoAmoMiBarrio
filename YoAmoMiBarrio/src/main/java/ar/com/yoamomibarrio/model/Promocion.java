package ar.com.yoamomibarrio.model;
// Generated 13/10/2013 23:06:13 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Promocion generated by hbm2java
 */
public class Promocion  implements java.io.Serializable {


     private int idPromocion;
     private Set localPromocions = new HashSet(0);

    public Promocion() {
    }

	
    public Promocion(int idPromocion) {
        this.idPromocion = idPromocion;
    }
    public Promocion(int idPromocion, Set localPromocions) {
       this.idPromocion = idPromocion;
       this.localPromocions = localPromocions;
    }
   
    public int getIdPromocion() {
        return this.idPromocion;
    }
    
    public void setIdPromocion(int idPromocion) {
        this.idPromocion = idPromocion;
    }
    public Set getLocalPromocions() {
        return this.localPromocions;
    }
    
    public void setLocalPromocions(Set localPromocions) {
        this.localPromocions = localPromocions;
    }




}


