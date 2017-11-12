package com.gobletsoft.gunlukharcamam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class gunlukHarcamaLimitim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_gunluk_harcama_limitim);

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
