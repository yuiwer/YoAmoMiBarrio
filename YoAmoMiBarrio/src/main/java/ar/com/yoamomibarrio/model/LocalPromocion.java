package ar.com.yoamomibarrio.model;
// Generated 13/10/2013 23:06:13 by Hibernate Tools 3.2.1.GA



/**
 * LocalPromocion generated by hbm2java
 */
public class LocalPromocion  implements java.io.Serializable {


     private LocalPromocionId id;
     private Promocion promocion;

    public LocalPromocion() {
    }

    public LocalPromocion(LocalPromocionId id, Promocion promocion) {
       this.id = id;
       this.promocion = promocion;
    }
   
    public LocalPromocionId getId() {
        return this.id;
    }
    
    public void setId(LocalPromocionId id) {
        this.id = id;
    }
    public Promocion getPromocion() {
        return this.promocion;
    }
    
    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
    }




}

