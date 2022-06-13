package com.example.projekt_david_trstenjak;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.util.Random;

public class druga extends AppCompatActivity {
    int broj1=0,broj2=0,broj3=0,broj4=0,broj5=0;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();*/
        setContentView(R.layout.activity_druga);


        Toast.makeText(this, "Uspješno ste prijavljeni!", Toast.LENGTH_SHORT).show();

        Intent intent2=getIntent();
        String name = intent2.getStringExtra("ime");
        if(stanje2==false){
            prvi.popuni();
            trenutniHrv=prvi.prosjekHrv;
            trenutniMat=prvi.prosjekMat;
            trenutniEng=prvi.prosjekEng;
            trenutniFiz=prvi.prosjekFiz;
            trenutniProg=prvi.prosjekProg;
            trenutniTzk=prvi.prosjekTzk;
            trenutniMreze=prvi.prosjekMreze;
            trenutniMikro=prvi.prosjekMC;
            trenutniBaze=prvi.prosjekBaze;
        }

        TextView prijavljeni = (TextView) findViewById(R.id.koje);
        TextView ime = (TextView) findViewById(R.id.ime);
        prijavljeni.setText("Prijavljeni ste kao ");
        ime.setText(name);
        TextView hrv=(TextView) findViewById(R.id.hrv);
        TextView mat=(TextView) findViewById(R.id.mat);
        TextView eng=(TextView) findViewById(R.id.eng);
        TextView fiz=(TextView) findViewById(R.id.fiz);
        TextView prog=(TextView) findViewById(R.id.prog);
        TextView tzk=(TextView) findViewById(R.id.tzk);
        TextView mreze=(TextView) findViewById(R.id.mreze);
        TextView mikro=(TextView) findViewById(R.id.control);
        TextView baze=(TextView) findViewById(R.id.baze);
        hrv.append("                 "+trenutniHrv);
        mat.append("                   "+trenutniMat);
        eng.append("                "+trenutniEng);
        fiz.append("                              "+trenutniFiz);
        prog.append("               "+trenutniProg);
        tzk.append("                                 "+trenutniTzk);
        mreze.append("          "+trenutniMreze);
        mikro.append("             "+trenutniMikro);
        baze.append("              "+trenutniBaze);


    }
    Ucenik prvi=new Ucenik();
    boolean stanje2=false;
    float trenutniHrv,trenutniMat,trenutniEng,trenutniFiz,trenutniProg,trenutniTzk,trenutniMreze,trenutniMikro,trenutniBaze;
    public void sljedeca(View v){
        Intent i=new Intent(this,stats.class);
        Intent intent = getIntent();
        String name = intent.getStringExtra("ime");
        i.putExtra("ime",name);

        i.putExtra("oHrv",""+trenutniHrv);
        i.putExtra("oMat",""+trenutniMat);
        i.putExtra("oEng",""+trenutniEng);
        i.putExtra("oFiz",""+trenutniFiz);
        i.putExtra("oProg",""+trenutniProg);
        i.putExtra("oTzk",""+trenutniTzk);
        i.putExtra("oMreze",""+trenutniMreze);
        i.putExtra("oMikro",""+trenutniMikro);
        i.putExtra("oBaze",""+trenutniBaze);
        startActivity(i);

    }
    public void previousActivity(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);

    }
    boolean stanje1=false;

    public void ukupniProsjek(View view){
        TextView zavrsni=(TextView) findViewById(R.id.prosjek);
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        if(stanje1==false){
            zavrsni.setText("Završni prosjek: "+df.format(prvi.ukupniProsjek));
            stanje1=true;
        }
        else{
            zavrsni.setText("");
            stanje1=false;
        }
    }

    public void onClick1(View view) {
        String[] polje=getResources().getStringArray(R.array.ocjene);
        for(int i=0;i<5;i++){
            polje[i]=""+prvi.hrvatski[i];
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Hrvatski jezik OCJENE");
        builder.setItems(polje, null);
        builder.show();
    }
    public void onClick2(View view) {
        String[] polje=getResources().getStringArray(R.array.ocjene);
        for(int i=0;i<5;i++){
            polje[i]=""+prvi.matematika[i];
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Matematika OCJENE");
        builder.setItems(polje, null);
        builder.show();
    }
    public void onClick3(View view) {
        String[] polje=getResources().getStringArray(R.array.ocjene);
        for(int i=0;i<5;i++){
            polje[i]=""+prvi.engleski[i];
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Engleski jezik OCJENE");
        builder.setItems(polje, null);
        builder.show();
    }
    public void onClick4(View view) {
        String[] polje=getResources().getStringArray(R.array.ocjene);
        for(int i=0;i<5;i++){
            polje[i]=""+prvi.fizika[i];
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Fizika OCJENE");
        builder.setItems(polje, null);
        builder.show();
    }
    public void onClick5(View view) {
        String[] polje=getResources().getStringArray(R.array.ocjene);
        for(int i=0;i<5;i++){
            polje[i]=""+prvi.programiranje[i];
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Programiranje OCJENE");
        builder.setItems(polje, null);
        builder.show();
    }
    public void onClick6(View view) {
        String[] polje=getResources().getStringArray(R.array.ocjene);
        for(int i=0;i<5;i++){
            polje[i]=""+prvi.tzk[i];
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("TZK OCJENE");
        builder.setItems(polje, null);
        builder.show();
    }
    public void onClick7(View view) {
        String[] polje=getResources().getStringArray(R.array.ocjene);
        for(int i=0;i<5;i++){
            polje[i]=""+prvi.mreze[i];
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Računalne mreže OCJENE");
        builder.setItems(polje, null);
        builder.show();
    }
    public void onClick8(View view) {
        String[] polje=getResources().getStringArray(R.array.ocjene);
        for(int i=0;i<5;i++){
            polje[i]=""+prvi.mikro[i];
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Mikroupravljači OCJENE");
        builder.setItems(polje, null);
        builder.show();
    }
    public void onClick9(View view) {
        String[] polje=getResources().getStringArray(R.array.ocjene);
        for(int i=0;i<5;i++){
            polje[i]=""+prvi.baze[i];
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Baze podataka OCJENE");
        builder.setItems(polje, null);
        builder.show();
    }
    int sel=0;
    final CharSequence nazivi[]={"Nedovoljnih(1)","Dovoljnih(2)","Dobrih(3)","Vrlo dobrih(4)","Odličnih(5)"};
    public void tipkaPritisnuta(View view){
        TextView display=(TextView) findViewById(R.id.prosjek);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Broj i udio:");

        builder.setSingleChoiceItems(nazivi, sel, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                sel=id;
            }});
        builder.setPositiveButton("ISPIŠI", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {

                display.setText("");
                switch(sel){
                    case 0:
                        display.setText("Nedovoljan(1): "+prvi.brojac1+" ("+Math.round(prvi.post1*100)+"%)");
                        break;
                    case 1:
                        display.setText("Dovoljan(2): "+prvi.brojac2+" ("+Math.round(prvi.post2*100)+"%)");
                        break;
                    case 2:
                        display.setText("Dobar(3): "+prvi.brojac3+" ("+Math.round(prvi.post3*100)+"%)");
                        break;
                    case 3:
                        display.setText("Vrlo dobar(4): "+prvi.brojac4+" ("+Math.round(prvi.post4*100)+"%)");
                        break;
                    case 4:
                        display.setText("Odličan(5): "+prvi.brojac5+" ("+Math.round(prvi.post5*100)+"%)");
                        break;
                }
            }
        });
        builder.setNegativeButton("ODUSTANI", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
            }
        });

        builder.show();

    }
}
