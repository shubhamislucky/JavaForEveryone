package me.shubhamsingh.javaforeverybody;


import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;



public class myinterface extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_myinterface, container, false);

        Typeface mytype = Typeface.createFromAsset(getActivity().getAssets(), "Prompt-Regular.ttf");
        Typeface mytype2 = Typeface.createFromAsset(getActivity().getAssets(), "DroidSansMono.ttf");


        TextView mytext1 = (TextView)rootView.findViewById(R.id.interface_one);
        TextView mytext2 = (TextView)rootView.findViewById(R.id.interface_two);
        TextView mytext3 = (TextView)rootView.findViewById(R.id.interface_three);
        TextView mytext4 = (TextView)rootView.findViewById(R.id.interface_four);
        TextView mytext5 = (TextView)rootView.findViewById(R.id.interface_five);
        TextView mytext6 = (TextView)rootView.findViewById(R.id.interface_six);
        TextView mytext7 = (TextView)rootView.findViewById(R.id.interface_seven);
        TextView mytext8 = (TextView)rootView.findViewById(R.id.interface_eight);
        TextView mytext9 = (TextView)rootView.findViewById(R.id.interface_nine);





        mytext1.setTypeface(mytype);
        mytext2.setTypeface(mytype);
        mytext3.setTypeface(mytype2);
        mytext4.setTypeface(mytype);
        mytext5.setTypeface(mytype2);
        mytext6.setTypeface(mytype);
        mytext7.setTypeface(mytype2);
        mytext8.setTypeface(mytype);
        mytext9.setTypeface(mytype);



        return rootView;

    }


}