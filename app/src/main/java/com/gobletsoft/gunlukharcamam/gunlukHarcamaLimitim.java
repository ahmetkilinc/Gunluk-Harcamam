package com.gobletsoft.gunlukharcamam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class gunlukHarcamaLimitim extends AppCompatActivity {

    public Double toplamGider = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_gunluk_harcama_limitim);

        TextView tv = (TextView) findViewById(R.id.textViewToplamGider);

        //sabit gider sayfasından hesaplanan değeri geri almak.

        Intent intent1 = this.getIntent();
        toplamGider = intent1.getDoubleExtra("toplamGider", 0.0);
        Toast.makeText(getApplicationContext(), "toplam: " + toplamGider, Toast.LENGTH_LONG).show();
        tv.setText(toplamGider.toString());

        Button btnSabitGiderEkle = (Button) findViewById(R.id.buttonSabitGiderEkle);

        btnSabitGiderEkle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(gunlukHarcamaLimitim.this, sabitGiderEkle.class);
                startActivity(intent);
            }
        });
    }
}
