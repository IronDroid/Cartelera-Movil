package xibercom.jug.multicine;

import android.app.ListActivity;
import android.os.Bundle;
import java.util.LinkedList;

public class PeliculasActivity extends ListActivity {

    private LinkedList<PeliculaItem> listP;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listapeliculas);
        pelis();
        setListAdapter(new EficienteAdapter(this, R.layout.listapeliculas, listP));
    }

    public void pelis() {
        listP = new LinkedList<PeliculaItem>();
        PeliculaItem pi = new PeliculaItem();
        pi.setImage(R.drawable.p_367);
        pi.setTitulo("Valiente");
        pi.setHorarioFuncion("Jue a Sab: 10:50");
        listP.add(pi);
        pi = new PeliculaItem();
        pi.setImage(R.drawable.p_373);
        pi.setTitulo("El Caballero De La Noche Asciende");
        pi.setHorarioFuncion("Jue a Sab: 12:00, 17:00");
        listP.add(pi);
        pi = new PeliculaItem();
        pi.setImage(R.drawable.p_384);
        pi.setTitulo("Los Indestructibles 2");
        pi.setHorarioFuncion("Jue a Sab: 11:55, 14:00, 16:05, 18:15, 20:15, 22:20");
        listP.add(pi);
        pi = new PeliculaItem();
        pi.setImage(R.drawable.p_393);
        pi.setTitulo("Tengo Ganas De Ti");
        pi.setHorarioFuncion("Jue a Sab: 12:20, 14:50, 17:20, 19:50, 22:20");
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
