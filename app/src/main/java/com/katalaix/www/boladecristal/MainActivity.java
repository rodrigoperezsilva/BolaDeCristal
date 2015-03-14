package com.katalaix.www.boladecristal;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends ActionBarActivity {

    public BolaDeCristal instanciaBolaDeCristal = new BolaDeCristal();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView etiquetaRepuesta = (TextView) findViewById(R.id.campoTexto);
        Button botonPregunta = (Button) findViewById(R.id.boton);

        botonPregunta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etiquetaRepuesta.setText(instanciaBolaDeCristal.obtenerRespuesta());
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
