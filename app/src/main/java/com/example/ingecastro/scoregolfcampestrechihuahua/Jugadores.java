package com.example.ingecastro.scoregolfcampestrechihuahua;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Jugadores extends AppCompatActivity {
    Intent inhoyos;
    EditText nj,hc;
    Bundle bundatju;
    String[] players=new String[12];
    int npl=0,numer=1;
    TextView txnum;
    Button btncam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jugadores);
        nj=(EditText)findViewById(R.id.editText);
        hc=(EditText)findViewById(R.id.editText2);
        txnum=(TextView)findViewById(R.id.textView67);
        btncam=(Button)findViewById(R.id.button4);
        txnum.setText(""+numer);
        btncam.setText("CONFIRMAR");


        inhoyos=new Intent(this,Hoyos.class);
    }
    public void clickconfirmar(View v){
        players[npl]=nj.getText().toString();
        String sname,sname2;
        sname=players[0];
        sname2=players[1];

        //sname=nj.getText().toString();
        bundatju=new Bundle();
        bundatju.putString("nom1",sname);
        bundatju.putString("nom2",sname2);
        inhoyos.putExtras(bundatju);
        npl++;numer++;
        txnum.setText(""+numer);
        btncam.setText("AGREGAR OTRO JUGADOR");
        nj.setText("");hc.setText("");
    }
    public void clickotro(View v){

    }
    public void clickjah(View v){
        startActivity(inhoyos);
        finish();

    }
}
