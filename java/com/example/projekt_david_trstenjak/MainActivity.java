package com.example.projekt_david_trstenjak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

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

        if(user.contains("@skole.hr") && pass.equals("123")) {
            String name = "David Trstenjak";
            i.putExtra("ime", name);
            startActivity(i);
            napomena.setText(" ");
        }
        else if(user.contains("@skole.hr") && pass.equals("456")) {
            String name = "Lukas Kraljić";
            i.putExtra("ime", name);
            startActivity(i);
            napomena.setText(" ");
        }
        else{
            napomena.setText("Neispravno korisničko ime ili lozinka.");
        }
    }
}