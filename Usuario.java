import java.io.Serializable;
/**
 * Esta clase sera heredada por los diversostipos de usuarios
 * 
 * @author Sebastian Estrada
 * @since 11/11/2021
 * @version 1.0
 */
class Usuario implements Serializable{
    private String correo;// Guarda el correo de los usuarios
    private String usuario;// Guarda el usuario de los usuarios
    private String contrasena;// Guarda la contraseña de los usuarios

    /**
     * Este es el metodo constructor de un usuario
     * @param correo
     * @param usuario
     * @param contrasena
     */
    public Usuario(String correo, String usuario, String contrasena){
        this.correo = correo;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    /**
     * Este metodo retorna el correo del usuario
     * @return retorna un String 
     */
    public String getCorreo(){
        return correo;
    }
    /**
     * Este metodo retorna el ID del usuario
     * @return retorna un String
     */
    public String getUsuario(){
        return usuario;
    }
    /**
     * Este metodo retorna la contraseña del usuario 
     * @return retorna un String
     */
    public String getContra(){
        return contrasena;
    }
}