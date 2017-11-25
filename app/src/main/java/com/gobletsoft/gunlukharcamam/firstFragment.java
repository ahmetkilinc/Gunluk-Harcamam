package com.gobletsoft.gunlukharcamam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class firstFragment extends Fragment{

    public Double sonuc = 0.0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_first, container, false);


        TextView tvSonuc = rootView.findViewById(R.id.textViewSonuc);
        //final Button btnCanBuy = getView().findViewById(R.id.buttonCanBuy);

        //Intent intentSonuc = this.getIntent();
        //sonuc = intentSonuc.getDoubleExtra("sonuc", 0.0);
        /*
        Bundle bundleAssign = this.getArguments();
        Double price1Double = bundleAssign.getDouble("sonuc", 0.00);
        tvSonuc.setText(String.valueOf(price1Double));*/

        /*
        btnCanBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(firstFragment.this, .class);
                startActivity(intent);


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


                popupWindow.showAsDropDown(btnCanBuy, 50, 50);
            }
        });*/

        return rootView;
    }
}