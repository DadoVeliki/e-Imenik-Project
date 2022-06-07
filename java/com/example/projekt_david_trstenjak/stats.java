package com.example.projekt_david_trstenjak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class stats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);
        Intent intent = getIntent();
        String name = intent.getStringExtra("ime");
        TextView prijavljeni = (TextView) findViewById(R.id.koje);
        prijavljeni.setText("Prijavljeni ste kao " + name);

        String oHrv = intent.getStringExtra("oHrv");
        String oMat = intent.getStringExtra("oMat");
        String oEng = intent.getStringExtra("oEng");
        String oFiz = intent.getStringExtra("oFiz");
        String oProg = intent.getStringExtra("oProg");
        String oTzk = intent.getStringExtra("oTzk");
        String oMreze = intent.getStringExtra("oMreze");

        Bitmap bitmap = Bitmap.createBitmap(
                1280, // Width
                1920, // Height
                Bitmap.Config.ARGB_8888 // Config
        );
        Canvas canvas=new Canvas(bitmap);
        canvas.drawColor(Color.GRAY);
        Paint paint = new Paint();
        Paint paint2=new Paint();

        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(15);
        paint2.setColor(Color.BLACK);
        paint2.setTextSize(100);

        //HRVATSKI
        if(Float.parseFloat(oHrv)>=1 && Float.parseFloat(oHrv)<1.5){
            paint.setColor(Color.RED);
            canvas.drawRect(100, 200, 200, 0, paint);
        }
        else if(Float.parseFloat(oHrv)>=1.5 && Float.parseFloat(oHrv)<2.5){
            paint.setColor(Color.parseColor("#FF8B00"));
            canvas.drawRect(100, 200, 450, 0, paint);
        }
        else if(Float.parseFloat(oHrv)>=2.5 && Float.parseFloat(oHrv)<3.5){
            paint.setColor(Color.YELLOW);
            canvas.drawRect(100, 200, 700, 0, paint);
        }
        else if(Float.parseFloat(oHrv)>=3.5 && Float.parseFloat(oHrv)<4.5){
            paint.setColor(Color.parseColor("#61FF00"));
            canvas.drawRect(100, 200, 950, 0, paint);
        }
        else{
            paint.setColor(Color.parseColor("#00B600"));
            canvas.drawRect(100, 200, 1200, 0, paint);
        }

        //MATEMATIKA
        if(Float.parseFloat(oMat)>=1 && Float.parseFloat(oMat)<1.5){
            paint.setColor(Color.RED);
            canvas.drawRect(100, 400, 200, 200, paint);
        }
        else if(Float.parseFloat(oMat)>=1.5 && Float.parseFloat(oMat)<2.5){
            paint.setColor(Color.parseColor("#FF8B00"));
            canvas.drawRect(100, 400, 450, 200, paint);
        }
        else if(Float.parseFloat(oMat)>=2.5 && Float.parseFloat(oMat)<3.5){
            paint.setColor(Color.YELLOW);
            canvas.drawRect(100, 400, 700, 200, paint);
        }
        else if(Float.parseFloat(oMat)>=3.5 && Float.parseFloat(oMat)<4.5){
            paint.setColor(Color.parseColor("#61FF00"));
            canvas.drawRect(100, 400, 950, 200, paint);
        }
        else{
            paint.setColor(Color.parseColor("#00B600"));
            canvas.drawRect(100, 400, 1200, 200, paint);
        }

        //ENGLESKI
        if(Float.parseFloat(oEng)>=1 && Float.parseFloat(oEng)<1.5){
            paint.setColor(Color.RED);
            canvas.drawRect(100, 400, 200, 400, paint);
        }
        else if(Float.parseFloat(oEng)>=1.5 && Float.parseFloat(oEng)<2.5){
            paint.setColor(Color.parseColor("#FF8B00"));
            canvas.drawRect(100, 400, 450, 400, paint);
        }
        else if(Float.parseFloat(oEng)>=2.5 && Float.parseFloat(oEng)<3.5){
            paint.setColor(Color.YELLOW);
            canvas.drawRect(100, 400, 700, 400, paint);
        }
        else if(Float.parseFloat(oEng)>=3.5 && Float.parseFloat(oEng)<4.5){
            paint.setColor(Color.parseColor("#61FF00"));
            canvas.drawRect(100, 400, 950, 400, paint);
        }
        else{
            paint.setColor(Color.parseColor("#00B600"));
            canvas.drawRect(100, 400, 1200, 400, paint);
        }


        //FIZIKA
        if(Float.parseFloat(oFiz)>=1 && Float.parseFloat(oFiz)<1.5){
            paint.setColor(Color.RED);
            canvas.drawRect(100, 400, 200, 600, paint);
        }
        else if(Float.parseFloat(oFiz)>=1.5 && Float.parseFloat(oFiz)<2.5){
            paint.setColor(Color.parseColor("#FF8B00"));
            canvas.drawRect(100, 400, 450, 600, paint);
        }
        else if(Float.parseFloat(oFiz)>=2.5 && Float.parseFloat(oFiz)<3.5){
            paint.setColor(Color.YELLOW);
            canvas.drawRect(100, 400, 700, 600, paint);
        }
        else if(Float.parseFloat(oFiz)>=3.5 && Float.parseFloat(oFiz)<4.5){
            paint.setColor(Color.parseColor("#61FF00"));
            canvas.drawRect(100, 400, 950, 600, paint);
        }
        else{
            paint.setColor(Color.parseColor("#00B600"));
            canvas.drawRect(100, 400, 1200, 600, paint);
        }

        //PROG
        if(Float.parseFloat(oProg)>=1 && Float.parseFloat(oProg)<1.5){
            paint.setColor(Color.RED);
            canvas.drawRect(100, 400, 200, 800, paint);
        }
        else if(Float.parseFloat(oProg)>=1.5 && Float.parseFloat(oProg)<2.5){
            paint.setColor(Color.parseColor("#FF8B00"));
            canvas.drawRect(100, 400, 450, 800, paint);
        }
        else if(Float.parseFloat(oProg)>=2.5 && Float.parseFloat(oProg)<3.5){
            paint.setColor(Color.YELLOW);
            canvas.drawRect(100, 400, 700, 800, paint);
        }
        else if(Float.parseFloat(oProg)>=3.5 && Float.parseFloat(oProg)<4.5){
            paint.setColor(Color.parseColor("#61FF00"));
            canvas.drawRect(100, 400, 950, 800, paint);
        }
        else if(Float.parseFloat(oProg)>=4.5){
            paint.setColor(Color.parseColor("#00B600"));
            canvas.drawRect(100, 400, 1200, 800, paint);
        }

        //TZK
        if(Float.parseFloat(oTzk)>=1 && Float.parseFloat(oTzk)<1.5){
            paint.setColor(Color.RED);
            canvas.drawRect(100, 400, 200, 1200, paint);
        }
        else if(Float.parseFloat(oTzk)>=1.5 && Float.parseFloat(oTzk)<2.5){
            paint.setColor(Color.parseColor("#FF8B00"));
            canvas.drawRect(100, 400, 450, 1200, paint);
        }
        else if(Float.parseFloat(oTzk)>=2.5 && Float.parseFloat(oTzk)<3.5){
            paint.setColor(Color.YELLOW);
            canvas.drawRect(100, 400, 700, 1200, paint);
        }
        else if(Float.parseFloat(oTzk)>=3.5 && Float.parseFloat(oTzk)<4.5){
            paint.setColor(Color.parseColor("#61FF00"));
            canvas.drawRect(100, 400, 950, 1200, paint);
        }
        else{
            paint.setColor(Color.parseColor("#00B600"));
            canvas.drawRect(100, 400, 1200, 1200, paint);
        }


        //MREZE
        if(Float.parseFloat(oMreze)>=1 && Float.parseFloat(oMreze)<1.5){
            paint.setColor(Color.RED);
            canvas.drawRect(100, 400, 200, 1400, paint);
        }
        else if(Float.parseFloat(oMreze)>=1.5 && Float.parseFloat(oMreze)<2.5){
            paint.setColor(Color.parseColor("#FF8B00"));
            canvas.drawRect(100, 400, 450, 1400, paint);
        }
        else if(Float.parseFloat(oMreze)>=2.5 && Float.parseFloat(oMreze)<3.5){
            paint.setColor(Color.YELLOW);
            canvas.drawRect(100, 400, 700, 1400, paint);
        }
        else if(Float.parseFloat(oMreze)>=3.5 && Float.parseFloat(oMreze)<4.5){
            paint.setColor(Color.parseColor("#61FF00"));
            canvas.drawRect(100, 400, 950, 1400, paint);
        }
        else if(Float.parseFloat(oMreze)>=4.5){
            paint.setColor(Color.parseColor("#00B600"));
            canvas.drawRect(100, 400, 1200, 1400, paint);
        }

        canvas.drawText("Hrvatski",100,125,paint2);

        canvas.drawText("Matematika",100,325,paint2);

        canvas.drawText("Engleski jezik",100,525,paint2);

        canvas.drawText("Fizika",100,725,paint2);

        canvas.drawText("Programiranje",100,925,paint2);

        canvas.drawText("TZK",100,1125,paint2);

        canvas.drawText("Računalne mreže",100,1325,paint2);


        ImageView mImageView = (ImageView) findViewById(R.id.imageview);
        mImageView.setImageBitmap(bitmap);

    }


    public void previousActivity(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);

    }
    public void prosla(View v){
        Intent i = new Intent(this, druga.class);
        Intent intent = getIntent();
        String name = intent.getStringExtra("ime");
        i.putExtra("ime",name);

        startActivity(i);
    }
}
