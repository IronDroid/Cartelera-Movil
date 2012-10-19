package xibercom.jug.multicine;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import java.util.LinkedList;

public class PeliculasListActivity extends ListActivity {

    private LinkedList<PeliculaItem> listP;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_peliculas);
        pelis();
        setListAdapter(new EficienteAdapter(this, R.layout.list_peliculas, listP));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent i = new Intent(PeliculasListActivity.this, PeliculaActivity.class);
        i.putExtra("image", listP.get(position).getImage());
        i.putExtra("titulo", listP.get(position).getTitulo());
        i.putExtra("horario", listP.get(position).getHorarioFuncion());
        i.putExtra("sinopsis", listP.get(position).getSinopsis());
        i.putExtra("duracion", listP.get(position).getDuracion());
        i.putExtra("clasificacion", listP.get(position).getClasificacion());
        i.putExtra("genero", listP.get(position).getGenero());
        i.putExtra("direccion", listP.get(position).getDireccion());
        startActivity(i);
    }

    public void pelis() {
        listP = new LinkedList<PeliculaItem>();
        PeliculaItem pi = new PeliculaItem();
        pi.setImage(R.drawable.p_367);
        pi.setTitulo("Valiente");
        pi.setHorarioFuncion("Jue a Sab: 10:50");
        pi.setSinopsis("Sobre la familia real pesa la amenaza de una antigua maldición, pero la princesa Merida luchará con todas sus fuerzas contra las impredecibles fuerzas de la naturaleza y de la magia negra para librar a su familia del maleficio. Con las voces de Kelly McDonald, Emma Thompson, Kevin McKidd, Robbie Coltrane, Craig Ferguson, Julie Walters y Billy Connolly.");
        pi.setDuracion("???");
        pi.setClasificacion("Apta para todo público");
        pi.setGenero("Aventura, Animación");
        pi.setDireccion("Mark Andrews, Brenda Chapman, Steve Purcell");
        listP.add(pi);
        pi = new PeliculaItem();
        pi.setImage(R.drawable.p_373);
        pi.setTitulo("El Caballero De La Noche Asciende");
        pi.setHorarioFuncion("Jue a Sab: 12:00, 17:00");
        pi.setSinopsis("");
        pi.setClasificacion("");
        pi.setGenero("");
        pi.setDireccion("");
        listP.add(pi);
        pi = new PeliculaItem();
        pi.setImage(R.drawable.p_384);
        pi.setTitulo("Los Indestructibles 2");
        pi.setHorarioFuncion("Jue a Sab: 11:55, 14:00, 16:05, 18:15, 20:15, 22:20");
        pi.setSinopsis("");
        pi.setClasificacion("");
        pi.setGenero("");
        pi.setDireccion("");
        listP.add(pi);
        pi = new PeliculaItem();
        pi.setImage(R.drawable.p_393);
        pi.setTitulo("Tengo Ganas De Ti");
        pi.setHorarioFuncion("Jue a Sab: 12:20, 14:50, 17:20, 19:50, 22:20");
        pi.setSinopsis("");
        pi.setClasificacion("");
        pi.setGenero("");
        pi.setDireccion("");
        listP.add(pi);
//        pi = new PeliculaItem();
//        pi.setImage(R.drawable.p_394);
//        pi.setTitulo("");
//        pi.setHorarioFuncion("");
//        listP.add(pi);
//        pi = new PeliculaItem();
//        pi.setImage(R.drawable.p_394);
//        pi.setTitulo("");
//        pi.setHorarioFuncion("");
//        listP.add(pi);
//        pi = new PeliculaItem();
//        pi.setImage(R.drawable.p_395);
//        pi.setTitulo("");
//        pi.setHorarioFuncion("");
//        listP.add(pi);
//        pi = new PeliculaItem();
//        pi.setImage(R.drawable.p_398);
//        pi.setTitulo("");
//        pi.setHorarioFuncion("");
//        listP.add(pi);
//        pi = new PeliculaItem();
//        pi.setImage(R.drawable.p_406);
//        pi.setTitulo("");
//        pi.setHorarioFuncion("");
//        listP.add(pi);
//        pi = new PeliculaItem();
//        pi.setImage(R.drawable.p_409);
//        pi.setTitulo("");
//        pi.setHorarioFuncion("");
//        listP.add(pi);
//        pi = new PeliculaItem();
//        pi.setImage(R.drawable.p_410);
//        pi.setTitulo("");
//        pi.setHorarioFuncion("");
//        listP.add(pi);
//        pi = new PeliculaItem();
//        pi.setImage(R.drawable.p_411);
//        pi.setTitulo("");
//        pi.setHorarioFuncion("");
//        listP.add(pi);
//        pi = new PeliculaItem();
//        pi.setImage(R.drawable.p_418);
//        pi.setTitulo("");
//        pi.setHorarioFuncion("");
//        listP.add(pi);
//        pi = new PeliculaItem();
//        pi.setImage(R.drawable.p_420);
//        pi.setTitulo("");
//        pi.setHorarioFuncion("");
//        listP.add(pi);
//        pi = new PeliculaItem();
//        pi.setImage(R.drawable.p_423);
//        pi.setTitulo("");
//        pi.setHorarioFuncion("");
//        listP.add(pi);
//        pi = new PeliculaItem();
//        pi.setImage(R.drawable.p_428);
//        pi.setTitulo("");
//        pi.setHorarioFuncion("");
//        listP.add(pi);
//        pi = new PeliculaItem();
//        pi.setImage(R.drawable.p_429);
//        pi.setTitulo("");
//        pi.setHorarioFuncion("");
//        listP.add(pi);
        pi = new PeliculaItem();
        pi.setImage(R.drawable.p_71);
        pi.setTitulo("Actividad Paranormal 2");
        pi.setHorarioFuncion("Jue a Sab: 21:10, 22:55");
        listP.add(pi);
    }
}
