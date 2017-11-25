package com.gobletsoft.gunlukharcamam;

import android.content.Intent;
import android.media.Image;
import android.support.constraint.ConstraintLayout;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

import java.util.Random;

public class sonucHesap extends AppCompatActivity {

    public Double sonuc = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_sonuc_hesap);

        TextView tvSonuc = findViewById(R.id.textViewSonuc);
        final Button btnCanBuy = findViewById(R.id.buttonCanBuy);

        btnCanBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(sonucHesap.this, ScreenSlidePagerActivity.class);
                startActivity(intent);

                /*
                LayoutInflater layoutInflater
                        = (LayoutInflater)getBaseContext()
                        .getSystemService(LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.canbuy, null);
                final PopupWindow popupWindow = new PopupWindow(

                        popupView,
                        DrawerLayout.LayoutParams.FILL_PARENT,
                        DrawerLayout.LayoutParams.FILL_PARENT);

                final ImageView imgFoods =  popupView.findViewById(R.id.imageView1);
                final ImageView imgDrinks =  popupView.findViewById(R.id.imageView2);
                final ImageView imgFuns =  popupView.findViewById(R.id.imageView3);


                Random rand = new Random(); // random number generator.
                int randomFood = rand.nextInt(5) + 1; // we have 5 images so we generate 5 numbers.

                int randomDrink = rand.nextInt(4) + 1;

                int randomFun = rand.nextInt(4) + 1;

                String imgFood = "food" + randomFood;
                int idFood = getResources().getIdentifier(imgFood, "drawable", getPackageName());
                imgFoods.setImageResource(idFood); // adding random image resource to image.

                String imgDrink = "drink" + randomDrink;
                int idDrink = getResources().getIdentifier(imgDrink, "drawable", getPackageName());
                imgDrinks.setImageResource(idDrink); // adding random image resource to image.

                String imgFun = "fun" + randomFun;
                int idFun = getResources().getIdentifier(imgFun, "drawable", getPackageName());
                imgFuns.setImageResource(idFun); // adding random image resource to image.

                Button btnDismiss = popupView.findViewById(R.id.dismiss);
                btnDismiss.setOnClickListener(new Button.OnClickListener(){

                    @Override
                    public void onClick(View v){
                        // TODO Auto-generated method stub
                        popupWindow.dismiss();
                    }
                });


                popupWindow.showAsDropDown(btnCanBuy, 50, 50);*/
            }
        });

        Intent intentSonuc = this.getIntent();
        sonuc = intentSonuc.getDoubleExtra("sonuc", 0.0);

        tvSonuc.setText(sonuc.toString());
    }
}
