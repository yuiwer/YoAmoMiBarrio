package ar.com.yoamomibarrio.model;
// Generated 13/10/2013 23:06:13 by Hibernate Tools 3.2.1.GA



/**
 * BarrioPalabraClave generated by hbm2java
 */
public class BarrioPalabraClave  implements java.io.Serializable {


     private BarrioPalabraClaveId id;
     private Barrio barrio;

    public BarrioPalabraClave() {
    }

    public BarrioPalabraClave(BarrioPalabraClaveId id, Barrio barrio) {
       this.id = id;
       this.barrio = barrio;
    }
   
    public BarrioPalabraClaveId getId() {
        return this.id;
    }
    
    public void setId(BarrioPalabraClaveId id) {
        this.id = id;
    }
    public Barrio getBarrio() {
        return this.barrio;
    }
    
    public void setBarrio(Barrio barrio) {
        this.barrio = barrio;
    }




}

