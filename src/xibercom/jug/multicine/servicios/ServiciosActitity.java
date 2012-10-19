package xibercom.jug.multicine.servicios;

/**
 *
 * @author ralexqf
 */
import android.app.ListActivity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import xibercom.jug.multicine.MainActivity;
import xibercom.jug.multicine.R;

public class ServiciosActitity extends ListActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_servicios);

            Drawable[] ICONOS = {getResources().getDrawable(R.drawable.call),
                getResources().getDrawable(R.drawable.parqueo),
                getResources().getDrawable(R.drawable.candybar),
                getResources().getDrawable(R.drawable.tiendas),
                getResources().getDrawable(R.drawable.restaurantes)};
            setListAdapter(new AdapterServicios(this, ICONOS));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        if (position == 1) {
            Intent enlace = new Intent(ServiciosActitity.this, ParqueoActivity.class);
            startActivity(enlace);
        }
        if (position == 3) {
            Intent enlace = new Intent(ServiciosActitity.this, TiendaActivity.class);
            startActivity(enlace);
        }
        if (position == 4) {
            Intent enlace = new Intent(ServiciosActitity.this, RestaurantesActivity.class);
            startActivity(enlace);
        }
    }
}
