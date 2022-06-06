package com.example.projekt_david_trstenjak;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.Random;

public class druga extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_druga);

        prvi.popuni();

        Toast.makeText(this, "Uspješno ste prijavljeni!", Toast.LENGTH_SHORT).show();

        Intent intent = getIntent();
        String name = intent.getStringExtra("ime");

        TextView prijavljeni = (TextView) findViewById(R.id.koje);
        prijavljeni.setText("Prijavljeni ste kao " + name);
        TextView hrv=(TextView) findViewById(R.id.hrv);
        TextView mat=(TextView) findViewById(R.id.mat);
        TextView eng=(TextView) findViewById(R.id.eng);
        TextView fiz=(TextView) findViewById(R.id.fiz);
        TextView prog=(TextView) findViewById(R.id.prog);
        TextView tzk=(TextView) findViewById(R.id.tzk);
        TextView mreze=(TextView) findViewById(R.id.mreze);
        hrv.append("                    "+prvi.prosjekHrv);
        mat.append("                       "+prvi.prosjekMat);
        eng.append("                    "+prvi.prosjekEng);
        fiz.append("                                  "+prvi.prosjekFiz);
        prog.append("                   "+prvi.prosjekProg);
        tzk.append("                                     "+prvi.prosjekTzk);
        mreze.append("              "+prvi.prosjekMreze);
    }
    Ucenik prvi=new Ucenik();

    public void sljedeca(View v){
        Intent i=new Intent(this,stats.class);
        startActivity(i);
    }
    public void previousActivity(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);

    }
    public void ukupniProsjek(View view){
        TextView zavrsni=(TextView) findViewById(R.id.prosjek);
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        zavrsni.setText("Završni prosjek: "+df.format(prvi.ukupniProsjek));
    }

    public void onClick1(View view) {
        String[] polje=getResources().getStringArray(R.array.ocjene);
        for(int i=0;i<5;i++){
            polje[i]=""+prvi.hrvatski[i];
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Hrvatski jezik");
        builder.setItems(polje, null);
        builder.show();
    }
    public void onClick2(View view) {
        String[] polje=getResources().getStringArray(R.array.ocjene);
        for(int i=0;i<5;i++){
            polje[i]=""+prvi.matematika[i];
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Matematika");
        builder.setItems(polje, null);
        builder.show();
    }
    public void onClick3(View view) {
        String[] polje=getResources().getStringArray(R.array.ocjene);
        for(int i=0;i<5;i++){
            polje[i]=""+prvi.engleski[i];
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Engleski jezik");
        builder.setItems(polje, null);
        builder.show();
    }
    public void onClick4(View view) {
        String[] polje=getResources().getStringArray(R.array.ocjene);
        for(int i=0;i<5;i++){
            polje[i]=""+prvi.fizika[i];
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Fizika");
        builder.setItems(polje, null);
        builder.show();
    }
    public void onClick5(View view) {
        String[] polje=getResources().getStringArray(R.array.ocjene);
        for(int i=0;i<5;i++){
            polje[i]=""+prvi.programiranje[i];
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Programiranje");
        builder.setItems(polje, null);
        builder.show();
    }
    public void onClick6(View view) {
        String[] polje=getResources().getStringArray(R.array.ocjene);
        for(int i=0;i<5;i++){
            polje[i]=""+prvi.tzk[i];
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("TZK");
        builder.setItems(polje, null);
        builder.show();
    }
    public void onClick7(View view) {
        String[] polje=getResources().getStringArray(R.array.ocjene);
        for(int i=0;i<5;i++){
            polje[i]=""+prvi.mreze[i];
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Računalne mreže");
        builder.setItems(polje, null);
        builder.show();
    }

}
