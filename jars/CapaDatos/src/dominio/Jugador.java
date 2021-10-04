package dominio;

import javax.swing.ImageIcon;

public class Jugador implements IReceptor {
    
    private String usuario;
    private String contrasenia;
    private ImageIcon avatar;
    private ColorJ color;
    private int puntuacion;

    public Jugador() {
    }

    public Jugador(String usuario, String contrasenia, ImageIcon avatar, ColorJ color, int puntuacion) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.avatar = avatar;
        this.color = color;
        this.puntuacion = puntuacion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public ImageIcon getAvatar() {
        return avatar;
    }

    public void setAvatar(ImageIcon avatar) {
        this.avatar = avatar;
    }

    @Override
    public ColorJ getColor() {
        return color;
    }

    public void setColor(ColorJ color) {
        this.color = color;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "Jugador{" + "usuario=" + usuario + ", contrasenia=" + contrasenia + ", avatar=" + avatar + ", color=" + color + ", puntuacion=" + puntuacion + '}';
    }
    
}
