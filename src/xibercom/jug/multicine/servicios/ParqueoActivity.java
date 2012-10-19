package xibercom.jug.multicine.servicios;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import xibercom.jug.multicine.R;

public class ParqueoActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parqueo);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
