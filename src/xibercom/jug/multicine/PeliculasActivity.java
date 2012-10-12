package xibercom.jug.multicine;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ListView;


public class PeliculasActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listapeliculas);

				ListView lista = (ListView) findViewById(R.id.listView1);

				Drawable[] ICONOS = {
					getResources().getDrawable(R.drawable.peli1),
					getResources().getDrawable(R.drawable.peli2),
					getResources().getDrawable(R.drawable.peli3),
					getResources().getDrawable(R.drawable.peli4),
					getResources().getDrawable(R.drawable.peli1) };

				lista.setAdapter(new EficienteAdapter(this,ICONOS));
			
    }
    
    
}
