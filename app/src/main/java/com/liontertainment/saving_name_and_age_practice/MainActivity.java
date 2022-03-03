package com.liontertainment.saving_name_and_age_practice;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView isimsonuctext;
    EditText isimgirtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // OLMADI AlertDialog.Builder eminmisinalert;
        //AlertDialog.Builder eminmisinalert = new AlertDialog.Builder(this);



    }

    public void kaydetbutonu (View view){
        AlertDialog.Builder eminmisinalert = new AlertDialog.Builder(MainActivity.this);

        eminmisinalert.setTitle("Adın Kaydedilecek");
        eminmisinalert.setMessage("Emin misin?");

        isimsonuctext = findViewById(R.id.resultnametext);
        isimgirtext = findViewById(R.id.loginnametext);

        eminmisinalert.setPositiveButton("Eminim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                isimsonuctext.setText("Veee senin adın: " + isimgirtext);
                //BURDA Bİ HATA ALIYORUM AMA ANLAMADIM BENCE ONCLİCK İLE İLGİLİ BİŞİLER VAR
            }
        });

        eminmisinalert.setNegativeButton("Tekrar düşüneyim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                isimsonuctext.setText(null);
                isimgirtext.setText(null);
            }
        });
        eminmisinalert.show();

    }



}