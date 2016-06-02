package com.example.ingecastro.scoregolfcampestrechihuahua;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Hoyos extends AppCompatActivity {
    Intent inppal,inresul;
    TextView txvh,txvn1,txvn2;
    int hole=0,up1,up2,utj1,utj2,tj1h1,tj2h1,tj1h2,tj2h2,tj1h3,tj2h3,tj1h4,tj2h4,tj1h5,tj2h5,tj1h6,tj2h6,tj1h7,tj2h7,tj1h8,tj2h8,tj1h9,tj2h9;
    EditText edtxj1,edtxj2,edtxu1,edtxu2;
    int[] hoyo=new int[10];
    int[] hoyoj2=new int[10];
    int mostrar=1;
    Bundle bundatosh;
    //String nomj1,nomj2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoyos);

        Intent inleerdatos=getIntent();
        Bundle bundatos=inleerdatos.getExtras();

        String nombrejug1,nombrejug2;
        //int tirosjug1,tjug2h1,ujug1h1,ujug2h1;
        nombrejug1=bundatos.getString("nom1");
        nombrejug2=bundatos.getString("nom2");
        txvn1=(TextView)findViewById(R.id.textView10);
        txvn2=(TextView)findViewById(R.id.textView11);
        txvh=(TextView)findViewById(R.id.textView6);
        edtxj1=(EditText)findViewById(R.id.editText3);
        edtxu1=(EditText)findViewById(R.id.editText4);
        edtxj2=(EditText)findViewById(R.id.editText5);
        edtxu2=(EditText)findViewById(R.id.editText6);

        inppal=new Intent(this,Principal.class);
        inresul=new Intent(this,Resultados.class);
        txvh.setText(""+mostrar);
        txvn1.setText(""+nombrejug1);
        txvn2.setText(""+nombrejug2);

    }
    public void clickante(View v){
        startActivity(inppal);
        finish();
    }
    public void clicksig(View v){
        Intent inleerdatos=getIntent();
        Bundle bundatos=inleerdatos.getExtras();

        String nombrejug1,nombrejug2;

        nombrejug1=bundatos.getString("nom1");
        nombrejug2=bundatos.getString("nom2");

        hoyo[hole]=Integer.parseInt(edtxj1.getText().toString());
        hoyoj2[hole]=Integer.parseInt(edtxj2.getText().toString());
        up1=Integer.parseInt(edtxj1.getText().toString());
        up2=Integer.parseInt(edtxj2.getText().toString());
        utj1=utj1+up1;
        utj2=utj2+up2;
        tj1h1=hoyo[0];
        tj2h1=hoyoj2[0];
        tj1h2=hoyo[1];
        tj2h2=hoyoj2[1];
        tj1h3=hoyo[2];
        tj2h3=hoyoj2[2];
        tj1h4=hoyo[3];
        tj2h4=hoyoj2[3];
        tj1h5=hoyo[4];
        tj2h5=hoyoj2[4];
        tj1h6=hoyo[5];
        tj2h6=hoyoj2[5];
        tj1h7=hoyo[6];
        tj2h7=hoyoj2[6];
        tj1h8=hoyo[7];
        tj2h8=hoyoj2[7];
        tj1h9=hoyo[8];
        tj2h9=hoyoj2[8];
        hole++;mostrar++;
        txvh.setText(""+mostrar);

        bundatosh=new Bundle();
        bundatosh.putString("nom1",nombrejug1);
        bundatosh.putString("nom2",nombrejug2);
        bundatosh.putInt("tj1h1",tj1h1);
        bundatosh.putInt("tj2h1",tj2h1);
        bundatosh.putInt("tj1h2",tj1h2);
        bundatosh.putInt("tj2h2",tj2h2);
        bundatosh.putInt("tj1h3",tj1h3);
        bundatosh.putInt("tj2h3",tj2h3);
        bundatosh.putInt("tj1h4",tj1h4);
        bundatosh.putInt("tj2h4",tj2h4);
        bundatosh.putInt("tj1h5",tj1h5);
        bundatosh.putInt("tj2h5",tj2h5);
        bundatosh.putInt("tj1h6",tj1h6);
        bundatosh.putInt("tj2h6",tj2h6);
        bundatosh.putInt("tj1h7",tj1h7);
        bundatosh.putInt("tj2h7",tj2h7);
        bundatosh.putInt("tj1h8",tj1h8);
        bundatosh.putInt("tj2h8",tj2h8);
        bundatosh.putInt("tj1h9",tj1h9);
        bundatosh.putInt("tj2h9",tj2h9);
        //bundatosh.putInt("utj1",utj1);
        //bundatosh.putInt("utj1",utj2);
        inresul.putExtras(bundatosh);
        if (hole>8){
            txvh.setText("");
            startActivity(inresul);
            finish();}
        edtxj1.setText("0");
        edtxu1.setText("0");
        edtxj2.setText("0");
        edtxu2.setText("0");
        //Toast.makeText(getApplicationContext(),""+hoyo,Toast.LENGTH_LONG).show();

    }
}
