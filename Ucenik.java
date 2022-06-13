package com.example.projekt_david_trstenjak;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Ucenik {

    public String[] hrvatski=new String[5];
    public String[] matematika=new String[5];
    public String[] engleski=new String[5];
    public String[] fizika=new String[5];
    public String[] programiranje=new String[5];
    public String[] tzk=new String[5];
    public String[] mreze=new String[5];
    public String[] mikro=new String[5];
    public String[] baze=new String[5];
    //Random ran=new Random();
    public float ukupnoHrv=0,ukupnoMat=0,ukupnoEng=0,ukupnoFiz=0,ukupnoProg=0,ukupnoTzk=0,ukupnoMreze=0,ukupnoMC=0,ukupnoBaze=0;
    public float prosjekHrv,prosjekMat,prosjekEng,prosjekFiz,prosjekProg,prosjekTzk,prosjekMreze,prosjekMC,prosjekBaze;
    public float ukupniZbroj=0;
    public float ukupniProsjek=0;
    public int brojac1=0,brojac2=0,brojac3=0,brojac4=0,brojac5=0;
    public float post1,post2,post3,post4,post5;
    public void popuni(){
        for(int i=0;i<5;i++){
            ThreadLocalRandom ran = ThreadLocalRandom. current();
            int broj1=ran.nextInt(5)+1;
            int broj2=ran.nextInt(5)+1;
            int broj3=ran.nextInt(3,6);
            int broj4=ran.nextInt(5)+1;
            int broj5=ran.nextInt(5)+1;
            int broj6=ran.nextInt(4,6);
            int broj7=ran.nextInt(5)+1;
            int broj8=ran.nextInt(5)+1;
            int broj9=ran.nextInt(5)+1;

            if(broj1==1)
                brojac1++;
            else if(broj1==2)
                brojac2++;
            else if(broj1==3)
                brojac3++;
            else if(broj1==4)
                brojac4++;
            else if(broj1==5)
                brojac5++;

            if(broj2==1)
                brojac1++;
            else if(broj2==2)
                brojac2++;
            else if(broj2==3)
                brojac3++;
            else if(broj2==4)
                brojac4++;
            else if(broj2==5)
                brojac5++;

            if(broj3==1)
                brojac1++;
            else if(broj3==2)
                brojac2++;
            else if(broj3==3)
                brojac3++;
            else if(broj3==4)
                brojac4++;
            else if(broj3==5)
                brojac5++;

            if(broj4==1)
                brojac1++;
            else if(broj4==2)
                brojac2++;
            else if(broj4==3)
                brojac3++;
            else if(broj4==4)
                brojac4++;
            else if(broj4==5)
                brojac5++;

            if(broj5==1)
                brojac1++;
            else if(broj5==2)
                brojac2++;
            else if(broj5==3)
                brojac3++;
            else if(broj5==4)
                brojac4++;
            else if(broj5==5)
                brojac5++;

            if(broj6==1)
                brojac1++;
            else if(broj6==2)
                brojac2++;
            else if(broj6==3)
                brojac3++;
            else if(broj6==4)
                brojac4++;
            else if(broj6==5)
                brojac5++;

            if(broj7==1)
                brojac1++;
            else if(broj7==2)
                brojac2++;
            else if(broj7==3)
                brojac3++;
            else if(broj7==4)
                brojac4++;
            else if(broj7==5)
                brojac5++;

            if(broj8==1)
                brojac1++;
            else if(broj8==2)
                brojac2++;
            else if(broj8==3)
                brojac3++;
            else if(broj8==4)
                brojac4++;
            else if(broj8==5)
                brojac5++;

            if(broj9==1)
                brojac1++;
            else if(broj9==2)
                brojac2++;
            else if(broj9==3)
                brojac3++;
            else if(broj9==4)
                brojac4++;
            else if(broj9==5)
                brojac5++;
            hrvatski[i]=""+broj1;
            matematika[i]=""+broj2;
            engleski[i]=""+broj3;
            fizika[i]=""+broj4;
            programiranje[i]=""+broj5;
            tzk[i]=""+broj6;
            mreze[i]=""+broj7;
            mikro[i]=""+broj8;
            baze[i]=""+broj9;

            ukupnoHrv+=broj1;
            ukupnoMat+=broj2;
            ukupnoEng+=broj3;
            ukupnoFiz+=broj4;
            ukupnoProg+=broj5;
            ukupnoTzk+=broj6;
            ukupnoMreze+=broj7;
            ukupnoMC+=broj8;
            ukupnoBaze+=broj9;
        }
        prosjekHrv=ukupnoHrv/5;
        prosjekMat=ukupnoMat/5;
        prosjekEng=ukupnoEng/5;
        prosjekFiz=ukupnoFiz/5;
        prosjekProg=ukupnoProg/5;
        prosjekTzk=ukupnoTzk/5;
        prosjekMreze=ukupnoMreze/5;
        prosjekMC=ukupnoMC/5;
        prosjekBaze=ukupnoBaze/5;

        ukupniZbroj=prosjekHrv+prosjekMat+prosjekEng+prosjekFiz+prosjekProg+prosjekTzk+prosjekMreze+prosjekMC+prosjekBaze;
        ukupniProsjek=ukupniZbroj/9f;

        post1=brojac1/45f;
        post2=brojac2/45f;
        post3=brojac3/45f;
        post4=brojac4/45f;
        post5=brojac5/45f;
    }
}

