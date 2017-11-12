package com.gobletsoft.gunlukharcamam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.text.TextUtils.isEmpty;
import static android.widget.RelativeLayout.TRUE;

public class sabitGiderEkle extends AppCompatActivity {

    public double deger1 = 0.0;
    public double deger2 = 0.0;
    public double deger3 = 0.0;
    public double deger4 = 0.0;
    public double deger5 = 0.0;
    public double toplam = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_sabit_gider_ekle);

        Button btnEkle = (Button) findViewById(R.id.buttonEkle);
        Button btnAdd = (Button) findViewById(R.id.buttonAdd);
        Button btnBack = (Button) findViewById(R.id.buttonVazgec);
        final EditText et1 = (EditText) findViewById(R.id.editText);
        final EditText et2 = (EditText) findViewById(R.id.editText2);
        final EditText et3 = (EditText) findViewById(R.id.editText3);
        final EditText et4 = (EditText) findViewById(R.id.editText4);
        final EditText et5 = (EditText) findViewById(R.id.editText5);

        final Button btnRemove1 = (Button) findViewById(R.id.buttonKaldir);
        final Button btnRemove2 = (Button) findViewById(R.id.buttonVazgec1);
        final Button btnRemove3 = (Button) findViewById(R.id.buttonVazgec2);
        final Button btnRemove4 = (Button) findViewById(R.id.buttonVazgec3);
        final Button btnRemove5 = (Button) findViewById(R.id.buttonVazgec4);

        btnEkle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(et1.isShown() == false) {

                    Toast.makeText(getApplicationContext(), "Gider ekleyebilmek için öncelikle gider kutusu ekleyerek değer eklemelisiniz.", Toast.LENGTH_LONG).show();
                }
                else{

                    if (isEmpty(et1.getText().toString()) == false){

                        deger1 = Double.parseDouble(et1.getText().toString());
                    }
                    else{

                        Toast.makeText(getApplicationContext(), "Gider kutusuna lütfen bir değer giriniz.", Toast.LENGTH_LONG).show();
                    }

                    if (et2.isShown() == false){


                    }
                    else{

                        if (isEmpty(et2.getText().toString()) == false){

                            deger2 = Double.parseDouble(et2.getText().toString());
                        }
                        else{

                            Toast.makeText(getApplicationContext(), "Gider kutusuna lütfen bir değer giriniz.", Toast.LENGTH_LONG).show();
                        }

                        if(et3.isShown() == false){


                        }

                        else{

                            if (isEmpty(et3.getText().toString()) == false){

                                deger3 = Double.parseDouble(et3.getText().toString());
                            }

                            else{

                                Toast.makeText(getApplicationContext(), "Gider kutusuna lütfen bir değer giriniz.", Toast.LENGTH_LONG).show();
                            }

                            if(et4.isShown() == false){


                            }

                            else{

                                if (isEmpty(et4.getText().toString()) == false){

                                    deger4 = Double.parseDouble(et4.getText().toString());
                                }

                                else{

                                    Toast.makeText(getApplicationContext(), "Gider kutusuna lütfen bir değer giriniz.", Toast.LENGTH_LONG).show();
                                }

                                if (et5.isShown() == false){


                                }

                                else{

                                    if (isEmpty(et5.getText().toString()) == false){

                                        deger5 = Double.parseDouble(et5.getText().toString());
                                    }

                                    else{

                                        Toast.makeText(getApplicationContext(), "Gider kutusuna lütfen bir değer giriniz.", Toast.LENGTH_LONG).show();
                                    }
                                }
                            }
                        }
                    }

                    toplam = deger1 + deger2 + deger3 + deger4 + deger5;
                    //Toast.makeText(getApplicationContext(), "giderler: " +  toplam, Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(sabitGiderEkle.this, gunlukHarcamaLimitim.class);
                    intent.putExtra("toplamGider", toplam);
                    startActivity(intent);
                }
            }
        });

        btnRemove5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                et5.setVisibility(View.INVISIBLE);
                btnRemove5.setVisibility(View.INVISIBLE);
                btnRemove4.setVisibility(View.VISIBLE);
            }
        });

        btnRemove4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                et4.setVisibility(View.INVISIBLE);
                btnRemove4.setVisibility(View.INVISIBLE);
                btnRemove3.setVisibility(View.VISIBLE);
            }
        });

        btnRemove3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                et3.setVisibility(View.INVISIBLE);
                btnRemove3.setVisibility(View.INVISIBLE);
                btnRemove2.setVisibility(View.VISIBLE);
            }
        });

        btnRemove2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                et2.setVisibility(View.INVISIBLE);
                btnRemove2.setVisibility(View.INVISIBLE);
                btnRemove1.setVisibility(View.VISIBLE);
            }
        });

        btnRemove1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                et1.setVisibility(View.INVISIBLE);
                btnRemove1.setVisibility(View.INVISIBLE);
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(sabitGiderEkle.this, gunlukHarcamaLimitim.class);
                startActivity(intent);
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(et1.isShown() == false) {

                    et1.setVisibility(View.VISIBLE);
                    btnRemove1.setVisibility(View.VISIBLE);
                }
                else{

                    if(et2.isShown() == false){

                        et2.setVisibility(View.VISIBLE);
                        btnRemove1.setVisibility(View.INVISIBLE);
                        btnRemove2.setVisibility(View.VISIBLE);
                    }

                    else{

                        if(et3.isShown() == false){

                            et3.setVisibility(View.VISIBLE);
                            btnRemove2.setVisibility(View.INVISIBLE);
                            btnRemove3.setVisibility(View.VISIBLE);
                        }

                        else{

                            if (et4.isShown() == false){

                                et4.setVisibility(View.VISIBLE);
                                btnRemove3.setVisibility(View.INVISIBLE);
                                btnRemove4.setVisibility(View.VISIBLE);
                            }

                            else{

                                if (et5.isShown() == false){

                                    et5.setVisibility(View.VISIBLE);
                                    btnRemove4.setVisibility(View.INVISIBLE);
                                    btnRemove5.setVisibility(View.VISIBLE);

                                }

                                else{

                                    Toast.makeText(getApplicationContext(), "Eklenebilecek maksimum sayıda gider eklendi", Toast.LENGTH_LONG).show();
                                }
                            }
                        }
                    }
                }
            }
        });
    }
}
