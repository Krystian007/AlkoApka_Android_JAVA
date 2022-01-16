package com.example.drinki;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;


public class DrinkActivity extends AppCompatActivity {

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);


        Datebase barek = new Datebase(this, "barek");
        Datebase alldrink = new Datebase(this, "alldrink");

        StringBuilder builder = new StringBuilder();
        Cursor cursor = barek.getAllDate();
        int lenght = barek.getAllDate().getColumnCount();
        String drinki[];
        while (cursor.moveToNext()) {
            for (int b = 0; b < lenght; b++) {
                builder.append(cursor.getString(b).toUpperCase() + ";;");
            }
        }
        drinki = builder.toString().split(";;");

        int kontrola = 0;
        String nazwy[];

        StringBuilder pomocniczy = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        Cursor cursor2 = alldrink.getAllDate();
        while (cursor2.moveToNext()) {
            pomocniczy.append(cursor2.getString(0) + "\n\n");
            for (int a = 1; a < 78; a++) {
                if (cursor2.getString(a).equals("false")) {
                }else if (drinki[a].equals("TRUE")) {
                    pomocniczy.append(cursor2.getString(a) + "\n");
                    kontrola++;}
                    }
                pomocniczy.append("\n");
            if (cursor2.getString(78).equals("false")){
            }else pomocniczy.append("inne: " + cursor2.getString(78) + "\n\n");
            if (cursor2.getString(79).equals("false")){
            }else pomocniczy.append("Dekoracja: " + cursor2.getString(79) + "\n");
            if (cursor2.getString(80).equals("false")){
//                todo: zrób w to porządnie w wersji z sortowaniem
            }else pomocniczy.append("Szkło: " + cursor2.getString(80)+ "\n\n");
            if (cursor2.getString(81).equals("false")){
            }else pomocniczy.append(cursor2.getString(82));

                if(cursor2.getString(84).equals( String.valueOf(kontrola))){
                    pomocniczy.append(";;;");
                    builder2.append(pomocniczy);
                        }


                kontrola = 0;
                pomocniczy.delete(0,pomocniczy.length());


        }
        nazwy = builder2.toString().split(";;;");

        //todo ustal czy lepiej wrzucić listę po przeróbce w main menu i sortować w drinki
        //todo czy lepiej wszystko zrobić w drinki


        int buttonsNumber = nazwy.length;
        LinearLayout lista =  findViewById(R.id.lista);
        LinearLayout rodzic =  findViewById(R.id.rodzic);


        int i;

        for (i = 0; i < buttonsNumber; i++) {
            Button button = new Button(getApplicationContext());
            rodzic.removeView(lista);
            lista.addView(button);
            button.setText(nazwy[i]);
            button.setTextColor(R.color.colorText);
        }



    }
}
