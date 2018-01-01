package com.gobletsoft.gunlukharcamam;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;


public class secondFragment extends Fragment {

    public Double sonuc = 0.0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_second, container, false);

        sonuc = ((ScreenSlidePagerActivity) getActivity()).sonuc;

        final ImageView imgFoods =  rootView.findViewById(R.id.imageViewFood);
        final ImageView imgDrinks =  rootView.findViewById(R.id.imageViewDrink);
        final ImageView imgFuns =  rootView.findViewById(R.id.imageViewFun);
        final ImageButton imgButtonRefresh = rootView.findViewById(R.id.imageButtonRefresh);

        imgButtonRefresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random rand = new Random(); // random number generator.

                int randomFood = rand.nextInt(5) + 1; // we have 5 images so we generate 5 numbers.

                int randomDrink = rand.nextInt(4) + 1;

                int randomFun = rand.nextInt(4) + 1;

                String imgFood = "food" + randomFood;
                int idFood = getResources().getIdentifier(imgFood, "drawable", getContext().getPackageName());
                imgFoods.setImageResource(idFood); // adding random image resource to image.

                String imgDrink = "drink" + randomDrink;
                int idDrink = getResources().getIdentifier(imgDrink, "drawable", getContext().getPackageName());
                imgDrinks.setImageResource(idDrink); // adding random image resource to image.

                String imgFun = "fun" + randomFun;
                int idFun = getResources().getIdentifier(imgFun, "drawable", getContext().getPackageName());
                imgFuns.setImageResource(idFun); // adding random image resource to image.
            }
        });

        Random rand = new Random(); // random number generator.

        int randomFood = rand.nextInt(5) + 1; // we have 5 images so we generate 5 numbers.

        int randomDrink = rand.nextInt(4) + 1;

        int randomFun = rand.nextInt(4) + 1;


        String imgFood = "food" + randomFood;
        int idFood = getResources().getIdentifier(imgFood, "drawable", getContext().getPackageName());
        imgFoods.setImageResource(idFood); // adding random image resource to image.

        String imgDrink = "drink" + randomDrink;
        int idDrink = getResources().getIdentifier(imgDrink, "drawable", getContext().getPackageName());
        imgDrinks.setImageResource(idDrink); // adding random image resource to image.

        String imgFun = "fun" + randomFun;
        int idFun = getResources().getIdentifier(imgFun, "drawable", getContext().getPackageName());
        imgFuns.setImageResource(idFun); // adding random image resource to image.

        return rootView;
    }
}
