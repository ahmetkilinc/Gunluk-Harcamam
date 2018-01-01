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

        sonuc = ((ScreenSlidePagerActivity) getActivity()).sonuc;

        tvSonuc.setText(sonuc.toString());

        return rootView;
    }
}