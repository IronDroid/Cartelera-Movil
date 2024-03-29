package xibercom.jug.multicine;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.viewpagerindicator.UnderlinePageIndicator;
import xibercom.jug.multicine.servicios.ServiciosActitity;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        MyPagerAdapter adapter = new MyPagerAdapter();
        ViewPager pager = (ViewPager) findViewById(R.id.my_pager);
        pager.setAdapter(adapter);
        pager.setCurrentItem(1);
        UnderlinePageIndicator indicator = (UnderlinePageIndicator) findViewById(R.id.my_indicator);
        indicator.setViewPager(pager);
        indicator.setFades(false);
        indicator.setCurrentItem(1);
        ImageView iv = (ImageView) findViewById(R.id.call);
        iv.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:65671476")));
            }
        });
    }

    private AlertDialog messageBoxfinishCancel(Context context, String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int id) {
            }
        });
        builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        return builder.create();
    }

    public void onClickCartelera(View button) {
        startActivity(new Intent(MainActivity.this, PeliculasListActivity.class));
    }

    public void onClickServicios(View button) {
        startActivity(new Intent(MainActivity.this, ServiciosActitity.class));
    }

    public void onClickProximamente(View bottun) {
    }

    private class MyPagerAdapter extends PagerAdapter {

        public MyPagerAdapter() {
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public Object instantiateItem(View container, int position) {
            LayoutInflater inflater = (LayoutInflater) container.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            int res = 0;
            switch (position) {
                case 0:
                    res = R.drawable.p_406;
                    break;
                case 1:
                    res = R.drawable.logo_pager;
                    break;
                case 2:
                    res = R.drawable.p_411;
                    break;
            }
            LinearLayout view = (LinearLayout) inflater.inflate(R.layout.pager, null);
            ImageView img = (ImageView) view.findViewById(R.id.img);
            img.setImageResource(res);
            ((ViewPager) container).addView(view, 0);
            return view;
        }

//        @Override
//        public CharSequence getPageTitle(int position) {
//            return CONTENT[position % CONTENT.length].toUpperCase();
//        }
        @Override
        public boolean isViewFromObject(View view, Object o) {
            return view == (View) o;
        }

        @Override
        public void destroyItem(View container, int position, Object object) {
            ((ViewPager) container).removeView((View) object);
        }

        @Override
        public int getItemPosition(Object object) {
            return super.getItemPosition(object);
        }
    }
}
