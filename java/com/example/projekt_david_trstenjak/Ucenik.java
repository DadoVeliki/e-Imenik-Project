package com.example.projekt_david_trstenjak;

import java.util.Random;

public class Ucenik {

    public String[] hrvatski=new String[5];
    public String[] matematika=new String[5];
    public String[] engleski=new String[5];
    public String[] fizika=new String[5];
    public String[] programiranje=new String[5];
    public String[] tzk=new String[5];
    public String[] mreze=new String[5];
    Random ran=new Random();
    public float ukupnoHrv=0,ukupnoMat=0,ukupnoEng=0,ukupnoFiz=0,ukupnoProg=0,ukupnoTzk=0,ukupnoMreze=0;
    public float prosjekHrv,prosjekMat,prosjekEng,prosjekFiz,prosjekProg,prosjekTzk,prosjekMreze;
    public float ukupniZbroj=0;
    public float ukupniProsjek=0;
    public void popuni(){
        for(int i=0;i<5;i++){
            int broj1=ran.nextInt(5)+1;
            int broj2=ran.nextInt(5)+1;
            int broj3=ran.nextInt(5)+1;
            int broj4=ran.nextInt(5)+1;
            int broj5=ran.nextInt(5)+1;
            int broj6=ran.nextInt(5)+1;
            int broj7=ran.nextInt(5)+1;
            hrvatski[i]=""+broj1;
            matematika[i]=""+broj2;
            engleski[i]=""+broj3;
            fizika[i]=""+broj4;
            programiranje[i]=""+broj5;
            tzk[i]=""+broj6;
            mreze[i]=""+broj7;

            ukupnoHrv+=broj1;
            ukupnoMat+=broj2;
            ukupnoEng+=broj3;
            ukupnoFiz+=broj4;
            ukupnoProg+=broj5;
            ukupnoTzk+=broj6;
            ukupnoMreze+=broj7;
        }
        prosjekHrv=ukupnoHrv/5;
        prosjekMat=ukupnoMat/5;
        prosjekEng=ukupnoEng/5;
        prosjekFiz=ukupnoFiz/5;
        prosjekProg=ukupnoProg/5;
        prosjekTzk=ukupnoTzk/5;
        prosjekMreze=ukupnoMreze/5;

        ukupniZbroj=prosjekHrv+prosjekMat+prosjekEng+prosjekFiz+prosjekProg+prosjekTzk+prosjekMreze;
        ukupniProsjek=ukupniZbroj/7f;
    }
}

