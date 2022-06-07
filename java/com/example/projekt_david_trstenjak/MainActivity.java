package com.example.projekt_david_trstenjak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.EmptyStackException;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextActivity(View v){
        Intent i=new Intent(this,druga.class);
        TextView napomena=(TextView) findViewById(R.id.napomena);
        EditText ime=(EditText) findViewById(R.id.username);
        EditText lozinka=(EditText) findViewById(R.id.password);
        String user=ime.getText().toString();
        String pass=lozinka.getText().toString();
        String imeIprezime="";

        imeIprezime+=user.substring(0,1).toUpperCase();
        imeIprezime+=(user.substring(1,user.indexOf('.')));
        imeIprezime+=" ";
        imeIprezime+=(user.substring((user.indexOf('.'))+1,(user.indexOf('.'))+2)).toUpperCase();
        imeIprezime+=user.substring(user.indexOf('.')+2,user.indexOf('@'));
try{


        if(user.contains("@skole.hr")) {
            i.putExtra("ime", imeIprezime);
            napomena.setText("");
            try{
                Integer.parseInt(pass);
                startActivity(i);
            }
            catch (NumberFormatException e){
                napomena.append("Neispravna lozinka.");
            }
        }
        else{
            napomena.setText("Neispravno korisničko ime.");
        }
}
catch(EmptyStackException e){
    napomena.setText("Neispravno korisničko ime ili lozinka.");
}
    }
}
