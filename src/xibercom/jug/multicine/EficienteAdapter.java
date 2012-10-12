package xibercom.jug.multicine;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.LinkedList;

public class EficienteAdapter extends ArrayAdapter<PeliculaItem> {

    private LayoutInflater mInflater;
    private LinkedList<PeliculaItem> listP;

    public EficienteAdapter(Context context, int textViewResourceId, LinkedList<PeliculaItem> objects) {
        super(context, textViewResourceId, objects);
        mInflater = LayoutInflater.from(context);
        listP = objects;
    }

    @Override
    public View getView(int posicion, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.peliculas, null);
            holder = new ViewHolder();

            holder.image = (ImageView) convertView.findViewById(R.id.image);
            holder.titulo = (TextView) convertView.findViewById(R.id.titulo);
            holder.horarioFuncion = (TextView) convertView.findViewById(R.id.horarios);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.image.setImageResource(listP.get(posicion).getImage());
        holder.titulo.setText(listP.get(posicion).getTitulo());
        holder.horarioFuncion.setText(listP.get(posicion).getHorarioFuncion());
        return convertView;
    }

    static class ViewHolder {

        ImageView image;
        TextView titulo;
        TextView horarioFuncion;
        boolean estreno;
    }
}
