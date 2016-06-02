package com.example.ingecastro.scoregolfcampestrechihuahua;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Resultados extends AppCompatActivity {
    Intent inant,inmenu,inscore;
    int totj;
    TextView txv60,txv13,txv15,txv16,txv17,txv18,txv19,txv20,txv22,txv23,txv24,txv26,txv27,txv28,txv31,txv32,txv33,txv34,txv37,txv38,txv39,txv40
            ,txv44,txv45,txv46,txv47,txv48,txv52,txv53,txv54,txv55,txv56;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);
        txv60=(TextView)findViewById(R.id.textView60);
        txv13=(TextView)findViewById(R.id.textView13);
        txv15=(TextView)findViewById(R.id.textView15);
        txv16=(TextView)findViewById(R.id.textView16);
        txv17=(TextView)findViewById(R.id.textView17);
        txv18=(TextView)findViewById(R.id.textView18);
        txv19=(TextView)findViewById(R.id.textView19);
        txv20=(TextView)findViewById(R.id.textView20);
        txv22=(TextView)findViewById(R.id.textView22);
        txv23=(TextView)findViewById(R.id.textView23);
        txv24=(TextView)findViewById(R.id.textView24);
        txv26=(TextView)findViewById(R.id.textView26);
        txv27=(TextView)findViewById(R.id.textView27);
        txv28=(TextView)findViewById(R.id.textView28);
        txv31=(TextView)findViewById(R.id.textView31);
        txv32=(TextView)findViewById(R.id.textView32);
        txv33=(TextView)findViewById(R.id.textView33);
        txv34=(TextView)findViewById(R.id.textView34);
        txv37=(TextView)findViewById(R.id.textView37);
        txv38=(TextView)findViewById(R.id.textView38);
        txv39=(TextView)findViewById(R.id.textView39);
        txv40=(TextView)findViewById(R.id.textView40);
        txv44=(TextView)findViewById(R.id.textView44);
        txv45=(TextView)findViewById(R.id.textView45);
        txv46=(TextView)findViewById(R.id.textView46);
        txv47=(TextView)findViewById(R.id.textView47);
        txv48=(TextView)findViewById(R.id.textView48);
        txv52=(TextView)findViewById(R.id.textView52);
        txv53=(TextView)findViewById(R.id.textView53);
        txv54=(TextView)findViewById(R.id.textView54);
        txv55=(TextView)findViewById(R.id.textView55);
        txv56=(TextView)findViewById(R.id.textView56);

        inant=new Intent(this,Hoyos.class);
        inmenu=new Intent(this,Principal.class);
        inscore=new Intent(this,score.class);

        Intent inleerdatos=getIntent();
        Bundle bundatos=inleerdatos.getExtras();

        String nombrejug1,nombrejug2;
        int tj1h1,tj2h1,tj1h2,tj2h2,tj1h3,tj2h3,tj1h4,tj2h4,tj1h5,tj2h5,tj1h6,tj2h6,tj1h7,tj2h7,tj1h8,tj2h8,tj1h9,tj2h9;
        nombrejug1=bundatos.getString("nom1");
        nombrejug2=bundatos.getString("nom2");
        tj1h1=bundatos.getInt("tj1h1");
        tj2h1=bundatos.getInt("tj2h1");
        tj1h2=bundatos.getInt("tj1h2");
        tj2h2=bundatos.getInt("tj2h2");
        tj1h3=bundatos.getInt("tj1h3");
        tj2h3=bundatos.getInt("tj2h3");
        tj1h4=bundatos.getInt("tj1h4");
        tj2h4=bundatos.getInt("tj2h4");
        tj1h5=bundatos.getInt("tj1h5");
        tj2h5=bundatos.getInt("tj2h5");
        tj1h6=bundatos.getInt("tj1h6");
        tj2h6=bundatos.getInt("tj2h6");
        tj1h7=bundatos.getInt("tj1h7");
        tj2h7=bundatos.getInt("tj2h7");
        tj1h8=bundatos.getInt("tj1h8");
        tj2h8=bundatos.getInt("tj2h8");
        tj1h9=bundatos.getInt("tj1h9");
        tj2h9=bundatos.getInt("tj2h9");

        txv13.setText(" "+nombrejug1+" ");
        txv15.setText(" "+nombrejug2);

    }
    public void clickscore(View v){

    }

    public void clickmen(View v){
        Intent inleerdatos=getIntent();
        Bundle bundatos=inleerdatos.getExtras();

        String nombrejug1,nombrejug2;
        int tj1h1,tj2h1,tj1h2,tj2h2,tj1h3,tj2h3,tj1h4,tj2h4,tj1h5,tj2h5,tj1h6,tj2h6,tj1h7,tj2h7,tj1h8,tj2h8,tj1h9,tj2h9
                ,h11=0,h12=0,h22=0,h13=0,h23=0,h14=0,h24=0,h34=0,h15=0,h25=0,h35=0,h16=0,h26=0,h36=0,h46=0,h17=0,h27=0,h37=0,h47=0,h18=0,h28=0,
                h38=0,h48=0,h58=0,h19=0,h29=0,h39=0,h49=0,h59=0;
        nombrejug1=bundatos.getString("nom1");
        nombrejug2=bundatos.getString("nom2");
        tj1h1=bundatos.getInt("tj1h1");
        tj2h1=bundatos.getInt("tj2h1");
        tj1h2=bundatos.getInt("tj1h2");
        tj2h2=bundatos.getInt("tj2h2");
        tj1h3=bundatos.getInt("tj1h3");
        tj2h3=bundatos.getInt("tj2h3");
        tj1h4=bundatos.getInt("tj1h4");
        tj2h4=bundatos.getInt("tj2h4");
        tj1h5=bundatos.getInt("tj1h5");
        tj2h5=bundatos.getInt("tj2h5");
        tj1h6=bundatos.getInt("tj1h6");
        tj2h6=bundatos.getInt("tj2h6");
        tj1h7=bundatos.getInt("tj1h7");
        tj2h7=bundatos.getInt("tj2h7");
        tj1h8=bundatos.getInt("tj1h8");
        tj2h8=bundatos.getInt("tj2h8");
        tj1h9=bundatos.getInt("tj1h9");
        tj2h9=bundatos.getInt("tj2h9");

        txv13.setText(" "+nombrejug1+" ");
        txv15.setText(" "+nombrejug2);

        if (tj1h1<tj2h1)h11=1;if (tj1h1>tj2h1)h11=-1;if (tj1h1==tj2h1)h11=0;txv16.setText(""+h11);
        if (tj1h2<tj2h2)h12=h11+1;if (tj1h2>tj2h2)h12=h11-1;if (tj1h2==tj2h2)h12=h11;txv17.setText(""+h12);
        if (tj1h3<tj2h3)h13=h12+1;if (tj1h3>tj2h3)h13=h12-1;if (tj1h3==tj2h3)h13=h12;txv19.setText(""+h13);
        if (tj1h4<tj2h4)h14=h13+1;if (tj1h4>tj2h4)h14=h13-1;if (tj1h4==tj2h4)h14=h13;txv22.setText(""+h14);
        if (tj1h5<tj2h5)h15=h14+1;if (tj1h5>tj2h5)h15=h14-1;if (tj1h5==tj2h5)h15=h14;txv26.setText(""+h15);
        if (tj1h6<tj2h6)h16=h15+1;if (tj1h6>tj2h6)h16=h15-1;if (tj1h6==tj2h6)h16=h15;txv31.setText(""+h16);
        if (tj1h7<tj2h7)h17=h16+1;if (tj1h7>tj2h7)h17=h16-1;if (tj1h7==tj2h7)h17=h16;txv37.setText(""+h17);
        if (tj1h8<tj2h8)h18=h17+1;if (tj1h8>tj2h8)h18=h17-1;if (tj1h8==tj2h8)h18=h17;txv44.setText(""+h18);
        if (tj1h9<tj2h9)h19=h18+1;if (tj1h9>tj2h9)h19=h18-1;if (tj1h9==tj2h9)h19=h18;txv52.setText(""+h19);

        if ((h12==2)||(h12==-2)){h22=0;}txv18.setText(" "+h22);

        if ((h13==2)||(h13==-2)){h23=0;txv20.setText(" "+h23);}
        if (((h13>2)||(h13<-2))&&(tj1h3>tj2h3)){h23=h22-1;txv20.setText(" "+h23);}
        if (((h13>2)||(h13<-2))&&(tj1h3<tj2h3)){h23=h22+1;txv20.setText(" "+h23);}
        if (((h13>2)||(h13<-2))&&(tj1h3==tj2h3)){h23=h22;txv20.setText(" "+h23);}

        if ((h14==2)||(h14==-2)){h24=0;txv23.setText(" "+h24);}
        if (((h14>2)||(h14<-2))&&(tj1h4>tj2h4)){h24=h23-1;txv23.setText(" "+h24);}
        if (((h14>2)||(h14<-2))&&(tj1h4<tj2h4)){h24=h23+1;txv23.setText(" "+h24);}
        if (((h14>2)||(h14<-2))&&(tj1h4==tj2h4)){h24=h23;txv23.setText(" "+h24);}

        if ((h15==2)||(h15==-2)){h25=0;txv27.setText(" "+h25);}
        if (((h15>2)||(h15<-2))&&(tj1h5>tj2h5)){h25=h24-1;txv27.setText(" "+h25);}
        if (((h15>2)||(h15<-2))&&(tj1h5<tj2h5)){h25=h24+1;txv27.setText(" "+h25);}
        if (((h15>2)||(h15<-2))&&(tj1h5==tj2h5)){h25=h24;txv27.setText(" "+h25);}

        if ((h16==2)||(h16==-2)){h26=0;txv32.setText(" "+h26);}
        if (((h16>2)||(h16<-2))&&(tj1h6>tj2h6)){h26=h25-1;txv32.setText(" "+h26);}
        if (((h16>2)||(h16<-2))&&(tj1h6<tj2h6)){h26=h25+1;txv32.setText(" "+h26);}
        if (((h16>2)||(h16<-2))&&(tj1h6==tj2h6)){h26=h25;txv32.setText(" "+h26);}

        if ((h17==2)||(h17==-2)){h27=0;txv38.setText(" "+h27);}
        if (((h17>2)||(h17<-2))&&(tj1h7>tj2h7)){h27=h26-1;txv38.setText(" "+h27);}
        if (((h17>2)||(h17<-2))&&(tj1h7<tj2h7)){h27=h26+1;txv38.setText(" "+h27);}
        if (((h17>2)||(h17<-2))&&(tj1h7==tj2h7)){h27=h26;txv38.setText(" "+h27);}

        if ((h18==2)||(h18==-2)){h28=0;txv45.setText(" "+h28);}
        if (((h18>2)||(h18<-2))&&(tj1h8>tj2h8)){h28=h27-1;txv45.setText(" "+h28);}
        if (((h18>2)||(h18<-2))&&(tj1h8<tj2h8)){h28=h27+1;txv45.setText(" "+h28);}
        if (((h18>2)||(h18<-2))&&(tj1h8==tj2h8)){h28=h27;txv45.setText(" "+h28);}

        if ((h19==2)||(h19==-2)){h29=0;txv53.setText(" "+h29);}
        if (((h19>2)||(h19<-2))&&(tj1h9>tj2h9)){h29=h28-1;txv53.setText(" "+h29);}
        if (((h19>2)||(h19<-2))&&(tj1h9<tj2h9)){h29=h28+1;txv53.setText(" "+h29);}
        if (((h19>2)||(h19<-2))&&(tj1h9==tj2h9)){h29=h28;txv53.setText(" "+h29);}

        if ((h24==2)||(h24==-2)){h34=0;txv24.setText(" "+h34);}

        if ((h25==2)||(h25==-2)){h35=0;txv28.setText(" "+h35);}
        if (((h25>2)||(h25<-2))&&(tj1h5>tj2h5)){h35=h34-1;txv28.setText(" "+h35);}
        if (((h25>2)||(h25<-2))&&(tj1h5<tj2h5)){h35=h34+1;txv28.setText(" "+h35);}
        if (((h25>2)||(h25<-2))&&(tj1h5==tj2h5)){h35=h34;txv28.setText(" "+h35);}

        if ((h26==2)||(h26==-2)){h36=0;txv33.setText(" "+h36);}
        if (((h26>2)||(h26<-2))&&(tj1h6>tj2h6)){h36=h35-1;txv33.setText(" "+h36);}
        if (((h26>2)||(h26<-2))&&(tj1h6<tj2h6)){h36=h35+1;txv33.setText(" "+h36);}
        if (((h26>2)||(h26<-2))&&(tj1h6==tj2h6)){h36=h35;txv33.setText(" "+h36);}

        if ((h27==2)||(h27==-2)){h37=0;txv39.setText(" "+h37);}
        if (((h27>2)||(h27<-2))&&(tj1h7>tj2h7)){h37=h36-1;txv39.setText(" "+h37);}
        if (((h27>2)||(h27<-2))&&(tj1h7<tj2h7)){h37=h36+1;txv39.setText(" "+h37);}
        if (((h27>2)||(h27<-2))&&(tj1h7==tj2h7)){h37=h36;txv39.setText(" "+h37);}

        if ((h28==2)||(h28==-2)){h38=0;txv46.setText(" "+h38);}
        if (((h28>2)||(h28<-2))&&(tj1h8>tj2h8)){h38=h37-1;txv46.setText(" "+h38);}
        if (((h28>2)||(h28<-2))&&(tj1h8<tj2h8)){h38=h37+1;txv46.setText(" "+h38);}
        if (((h28>2)||(h28<-2))&&(tj1h8==tj2h8)){h38=h37;txv46.setText(" "+h38);}

        if ((h29==2)||(h29==-2)){h39=0;txv54.setText(" "+h39);}
        if (((h29>2)||(h29<-2))&&(tj1h9>tj2h9)){h39=h38-1;txv54.setText(" "+h39);}
        if (((h29>2)||(h29<-2))&&(tj1h9<tj2h9)){h39=h38+1;txv54.setText(" "+h39);}
        if (((h29>2)||(h29<-2))&&(tj1h9==tj2h9)){h39=h38;txv54.setText(" "+h39);}

        if ((h36==2)||(h36==-2)){h46=0;txv34.setText(" "+h46);}

        if ((h37==2)||(h37==-2)){h47=0;txv40.setText(" "+h47);}
        if (((h37>2)||(h37<-2))&&(tj1h7>tj2h7)){h47=h46-1;txv40.setText(" "+h47);}
        if (((h37>2)||(h37<-2))&&(tj1h7<tj2h7)){h47=h46+1;txv40.setText(" "+h47);}
        if (((h37>2)||(h37<-2))&&(tj1h7==tj2h7)){h47=h46;txv40.setText(" "+h47);}

        if ((h38==2)||(h38==-2)){h48=0;txv47.setText(" "+h48);}
        if (((h38>2)||(h38<-2))&&(tj1h8>tj2h8)){h48=h47-1;txv47.setText(" "+h48);}
        if (((h38>2)||(h38<-2))&&(tj1h8<tj2h8)){h48=h47+1;txv47.setText(" "+h48);}
        if (((h38>2)||(h38<-2))&&(tj1h8==tj2h8)){h48=h47;txv47.setText(" "+h48);}

        if ((h39==2)||(h39==-2)){h49=0;txv55.setText(" "+h49);}
        if (((h39>2)||(h39<-2))&&(tj1h9>tj2h9)){h49=h48-1;txv55.setText(" "+h49);}
        if (((h39>2)||(h39<-2))&&(tj1h9<tj2h9)){h49=h48+1;txv55.setText(" "+h49);}
        if (((h39>2)||(h39<-2))&&(tj1h9==tj2h9)){h49=h48;txv55.setText(" "+h49);}

        if ((h48==2)||(h48==-2)){h58=0;txv48.setText(" "+h58);}

        if ((h49==2)||(h49==-2)){h59=0;txv56.setText(" "+h59);}
        if (((h49>2)||(h49<-2))&&(tj1h9>tj2h9)){h59=h58-1;txv56.setText(" "+h59);}
        if (((h49>2)||(h49<-2))&&(tj1h9<tj2h9)){h59=h58+1;txv56.setText(" "+h59);}
        if (((h49>2)||(h49<-2))&&(tj1h9==tj2h9)){h59=h58;txv56.setText(" "+h59);}


    }
}
