package xibercom.jug.multicine;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button cartelera =  (Button)findViewById(R.id.cartelera);
        
        
		cartelera.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				Intent enlace = new Intent(MainActivity.this, PeliculasListActivity.class);
				startActivity(enlace);
				
				
			}
		});
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
