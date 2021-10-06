package dominio;

import javax.swing.ImageIcon;
/**
 * Clase jugador que implementa a IReceptor 
 * 
 * @author Administrador
 */
public class Jugador implements IReceptor {
    
    private String usuario;
    private String contrasenia;
    private ImageIcon avatar;
    private ColorJ color;
    private int puntuacion;

    public Jugador() {
    }
    /**
     * Constructor que inicializa los atributos de Jugador
     * 
     * @param usuario
     * @param contrasenia
     * @param avatar
     * @param color
     * @param puntuacion 
     */
    public Jugador(String usuario, String contrasenia, ImageIcon avatar, ColorJ color, int puntuacion) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.avatar = avatar;
        this.color = color;
        this.puntuacion = puntuacion;
    }
    /**
     * Se obtiene el usuario de jugador
     * 
     * @return usuario
     */
    public String getUsuario() {
        return usuario;
    }
    /**
     * Se establece el usuario del jugador
     * 
     * @param usuario 
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    /**
     * Se obtiene la contrasenia de jugador
     * @return 
     */
    public String getContrasenia() {
        return contrasenia;
    }
    /**
     * Se establece la contrasenia de jugador
     * 
     * @param contrasenia 
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    /**
     * Se obtiene el avatar del jugador
     * 
     * @return avatar
     */
    public ImageIcon getAvatar() {
        return avatar;
    }
    /**
     * Se establece el avatar del jugador
     * 
     * @param avatar 
     */
    public void setAvatar(ImageIcon avatar) {
        this.avatar = avatar;
    }
    /**
     * Se obtiene el color del jugador
     * 
     * @return color
     */
    @Override
    public ColorJ getColor() {
        return color;
    }
    /**
     * Se establece el color del jugador
     * 
     * @param color 
     */
    public void setColor(ColorJ color) {
        this.color = color;
    }
    /**
     * Se obtiene la puntuacion del jugador
     * 
     * @return puntuacion
     */
    public int getPuntuacion() {
        return puntuacion;
    }
    /**
     * Se establece la puntuacion del jugador
     * 
     * @param puntuacion 
     */
    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    /**
     * Devuelve los atributos del jugador
     * 
     * @return usuraio, contrasenia, avatar, color y puntuacion
     */
    @Override
    public String toString() {
        return "Jugador{" + "usuario=" + usuario + ", contrasenia=" + contrasenia + ", avatar=" + avatar + ", color=" + color + ", puntuacion=" + puntuacion + '}';
    }
    
}
