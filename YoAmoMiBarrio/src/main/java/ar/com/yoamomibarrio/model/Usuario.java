package ar.com.yoamomibarrio.model;
// Generated 13/10/2013 23:06:13 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private int idUsuario;
     private int dni;
     private String nombre;
     private String apellido;
     private String celular;
     private String mail;
     private String chat;
     private int password;
     private Set usuarioLocals = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(int idUsuario, int dni, String nombre, String apellido, String celular, String mail, String chat, int password) {
        this.idUsuario = idUsuario;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.mail = mail;
        this.chat = chat;
        this.password = password;
    }
    public Usuario(int idUsuario, int dni, String nombre, String apellido, String celular, String mail, String chat, int password, Set usuarioLocals) {
       this.idUsuario = idUsuario;
       this.dni = dni;
       this.nombre = nombre;
       this.apellido = apellido;
       this.celular = celular;
       this.mail = mail;
       this.chat = chat;
       this.password = password;
       this.usuarioLocals = usuarioLocals;
    }
   
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public int getDni() {
        return this.dni;
    }
    
    public void setDni(int dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCelular() {
        return this.celular;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getMail() {
        return this.mail;
    }
    
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getChat() {
        return this.chat;
    }
    
    public void setChat(String chat) {
        this.chat = chat;
    }
    public int getPassword() {
        return this.password;
    }
    
    public void setPassword(int password) {
        this.password = password;
    }
    public Set getUsuarioLocals() {
        return this.usuarioLocals;
    }
    
    public void setUsuarioLocals(Set usuarioLocals) {
        this.usuarioLocals = usuarioLocals;
    }




}


