package com.gobletsoft.gunlukharcamam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import static android.widget.RelativeLayout.TRUE;

public class sabitGiderEkle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_sabit_gider_ekle);

        Button btnAdd = (Button) findViewById(R.id.buttonAdd);
        final EditText et1 = (EditText) findViewById(R.id.editText);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(et1.isShown() == false){

                    et1.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
