package xibercom.jug.multicine;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 *
 * @author Jhon_Li
 */
public class PeliculaActivity extends Activity {

    private ImageView image;
    private TextView titulo;
    private TextView horarioFuncion;
    private TextView sinopsis;
    private TextView duracion;
    private TextView clasificacion;
    private TextView genero;
    private TextView direccion;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.pelicula);
        setTitle(getIntent().getStringExtra("titulo"));
        image = (ImageView) findViewById(R.id.image_detalle);
        image.setImageResource(getIntent().getIntExtra("image", 0));
        titulo = (TextView) findViewById(R.id.titulo_detalle);
        titulo.setText(getIntent().getStringExtra("titulo"));
        horarioFuncion = (TextView) findViewById(R.id.horarios_detalle);
        horarioFuncion.setText(getIntent().getStringExtra("horario"));
        duracion = (TextView) findViewById(R.id.duracion_detalle);
        duracion.setText(getIntent().getStringExtra("duracion"));
        sinopsis = (TextView) findViewById(R.id.sinopsis_detalle);
        sinopsis.setText(getIntent().getStringExtra("sinopsis"));
        clasificacion = (TextView) findViewById(R.id.clasificacion_detalle);
        clasificacion.setText(getIntent().getStringExtra("clasificacion"));
        genero = (TextView) findViewById(R.id.genero_detalle);
        genero.setText(getIntent().getStringExtra("genero"));
        direccion = (TextView) findViewById(R.id.direccion_detalle);
        direccion.setText(getIntent().getStringExtra("direccion"));

    }
}
