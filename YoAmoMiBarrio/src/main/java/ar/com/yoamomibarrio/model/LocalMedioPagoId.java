package ar.com.yoamomibarrio.model;
// Generated 13/10/2013 23:06:13 by Hibernate Tools 3.2.1.GA



/**
 * LocalMedioPagoId generated by hbm2java
 */
public class LocalMedioPagoId  implements java.io.Serializable {


     private int idPago;
     private int idLocal;

    public LocalMedioPagoId() {
    }

    public LocalMedioPagoId(int idPago, int idLocal) {
       this.idPago = idPago;
       this.idLocal = idLocal;
    }
   
    public int getIdPago() {
        return this.idPago;
    }
    
    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }
    public int getIdLocal() {
        return this.idLocal;
    }
    
    public void setIdLocal(int idLocal) {
        this.idLocal = idLocal;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof LocalMedioPagoId) ) return false;
		 LocalMedioPagoId castOther = ( LocalMedioPagoId ) other; 
         
		 return (this.getIdPago()==castOther.getIdPago())
 && (this.getIdLocal()==castOther.getIdLocal());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdPago();
         result = 37 * result + this.getIdLocal();
         return result;
   }   


}


