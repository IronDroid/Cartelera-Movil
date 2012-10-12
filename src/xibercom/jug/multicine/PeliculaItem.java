package xibercom.jug.multicine;

/**
 *
 * @author Jhon_Li
 */
public class PeliculaItem {

    private int image;
    private String titulo;
    private String horarioFuncion;
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
