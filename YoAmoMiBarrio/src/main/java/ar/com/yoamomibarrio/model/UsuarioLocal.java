package ar.com.yoamomibarrio.model;
// Generated 13/10/2013 23:06:13 by Hibernate Tools 3.2.1.GA



/**
 * UsuarioLocal generated by hbm2java
 */
public class UsuarioLocal  implements java.io.Serializable {


     private UsuarioLocalId id;
     private Usuario usuario;

    public UsuarioLocal() {
    }

    public UsuarioLocal(UsuarioLocalId id, Usuario usuario) {
       this.id = id;
       this.usuario = usuario;
    }
   
    public UsuarioLocalId getId() {
        return this.id;
    }
    
    public void setId(UsuarioLocalId id) {
        this.id = id;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }




}

