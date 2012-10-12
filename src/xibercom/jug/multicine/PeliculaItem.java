package xibercom.jug.multicine;

/**
 *
 * @author Jhon_Li
 */
public class PeliculaItem {

    private int image;
    private String titulo;
    private String horarioFuncion;
    private String sinopsis;
    private String duracion;
    private String clasificacion;
    private String genero;
    private String direccion;

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    private boolean estreno;

    public boolean isEstreno() {
        return estreno;
    }

    public void setEstreno(boolean estreno) {
        this.estreno = estreno;
    }

    public String getHorarioFuncion() {
        return horarioFuncion;
    }

    public void setHorarioFuncion(String horarioFuncion) {
        this.horarioFuncion = horarioFuncion;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
