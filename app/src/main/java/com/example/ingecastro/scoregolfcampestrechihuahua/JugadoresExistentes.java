package com.example.ingecastro.scoregolfcampestrechihuahua;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class JugadoresExistentes extends AppCompatActivity {
    public static final String PREF_NAME = "JUGADORES";
    TextView txtVwJugador1, txtVwJugador2;
    Button btnBorrar, btnAgregar, btnNuevoJuego;
    Intent injugadores, intHoyos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jugadores_existentes);


        txtVwJugador1 = (TextView) findViewById(R.id.txtVwJugador1);
        txtVwJugador2 = (TextView) findViewById(R.id.txtVwJugador2);

        btnBorrar = (Button) findViewById(R.id.btnBorrarJugadores);
        btnAgregar = (Button) findViewById(R.id.btnAgregarJugadores);
        btnNuevoJuego = (Button) findViewById(R.id.btnNuevoJuego);

        injugadores = new Intent(this, Jugadores.class);
        intHoyos = new Intent(this, Hoyos.class);

        //SharedPreferences settings = getSharedPreferences("Jugadores", MODE_PRIVATE);
        //boolean miValor = settings.getBoolean("Jugadores", false);
        comprobacion();


        //}
    }

    public void comprobacion() {
        SharedPreferences settings = getSharedPreferences("Jugadores", MODE_PRIVATE);
        boolean miValor = settings.getBoolean("Jugadores", false);
        if (miValor == false) {
            Toast.makeText(JugadoresExistentes.this, "No hay Jugadores. Agregalos", Toast.LENGTH_SHORT).show();
            btnBorrar.setEnabled(false);
            btnNuevoJuego.setEnabled(false);
            txtVwJugador1.setText("Jugador 1");
            txtVwJugador2.setText("Jugador 2");
        } else if (miValor) {
            btnBorrar.setEnabled(true);
            btnNuevoJuego.setEnabled(true);
            //SharedPreferences settings = getSharedPreferences("Jugadores", MODE_PRIVATE);

            String nomJugador1 = settings.getString("nom1", "null");
            txtVwJugador1.setText(nomJugador1);

            String nomJugador2 = settings.getString("nom2", "null");
            txtVwJugador2.setText(nomJugador2);
        }

    }

    public void clickAgregarJugadores(View v) {
        startActivity(injugadores);
    }

    public void clickNuevoJuego(View v) {
        startActivity(intHoyos);
    }

    public void clickBorrarJugadores(View v) {
        SharedPreferences settings = getSharedPreferences("Jugadores", MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean("Jugadores", false);
        editor.putString("nom1", "Jugador 1");
        editor.putString("nom2", "Jugador 2");
        editor.commit();
        comprobacion();

    }


}
