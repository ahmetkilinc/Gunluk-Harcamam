package com.gobletsoft.gunlukharcamam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class gunlukHarcamaLimitim extends AppCompatActivity {

    public Double toplamGider;
    public Double eldekiPara;
    public Double sonuc = 0.0;
    public Double kalanGunSayisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_gunluk_harcama_limitim);

        Button btnSabitGiderEkle = findViewById(R.id.buttonSabitGiderEkle);
        TextView tvToplamGider = (TextView) findViewById(R.id.textViewToplamGider);
        Button btnHesapla = (Button) findViewById(R.id.buttonHesapla);
        final EditText etEldekiPara = (EditText) findViewById(R.id.editTextEldekiPara);
        final EditText etKalanGunSayisi = (EditText) findViewById(R.id.editTextKalanGunSayisi);

        //sabit gider sayfasından hesaplanan değeri geri almak.
        Intent intentToplamGider = this.getIntent();
        toplamGider = intentToplamGider.getDoubleExtra("toplamGider", 0.0);
        tvToplamGider.setText(toplamGider.toString());

        btnHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               if (etEldekiPara.getText().toString().isEmpty() || etKalanGunSayisi.getText().toString().isEmpty() || toplamGider.toString().isEmpty()){

                   Toast.makeText(getApplicationContext(), "Please be sure to fill all the variables", Toast.LENGTH_LONG).show();
               }

               else {

                   eldekiPara = Double.parseDouble(etEldekiPara.getText().toString());
                   kalanGunSayisi = Double.parseDouble(etKalanGunSayisi.getText().toString());
                   sonuc = (eldekiPara - toplamGider) / kalanGunSayisi;

                   Toast.makeText(getApplicationContext(), sonuc.toString(), Toast.LENGTH_LONG).show();

                   Intent intentSonuc = new Intent(gunlukHarcamaLimitim.this, sonucHesap.class);
                   intentSonuc.putExtra("sonuc", sonuc);
                   startActivity(intentSonuc);
               }
            }
        });

        btnSabitGiderEkle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(gunlukHarcamaLimitim.this, sabitGiderEkle.class);
                startActivity(intent);
            }
        });
    }
}
