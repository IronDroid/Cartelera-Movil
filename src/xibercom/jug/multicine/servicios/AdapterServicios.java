package xibercom.jug.multicine.servicios;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import xibercom.jug.multicine.R;

public class AdapterServicios extends BaseAdapter {

    private LayoutInflater mInflater;
    private Drawable[] ICONOS;

    public int getCount() {

        return ICONOS.length;
    }

    public AdapterServicios(Context contexto, Drawable[] ICONOS) {
        mInflater = LayoutInflater.from(contexto);
        this.ICONOS = ICONOS;
    }

    public Object getItem(int posicion) {
        return posicion;
    }

    public long getItemId(int posicion) {
        return posicion;
    }

    public View getView(int posicion, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.item_servicios, null);
            holder = new ViewHolder();
            holder.imagen = (ImageView) convertView.findViewById(R.id.imageView1);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.imagen.setImageDrawable(ICONOS[posicion]);
        return convertView;
    }

    static class ViewHolder {

        ImageView imagen;
    }
}
