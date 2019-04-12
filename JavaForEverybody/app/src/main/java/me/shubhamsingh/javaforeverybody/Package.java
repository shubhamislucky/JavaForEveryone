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



public class Package extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_package, container, false);

        Typeface mytype = Typeface.createFromAsset(getActivity().getAssets(), "Prompt-Regular.ttf");
        Typeface mytype2 = Typeface.createFromAsset(getActivity().getAssets(), "DroidSansMono.ttf");


        TextView mytext1 = (TextView)rootView.findViewById(R.id.package_one);
        TextView mytext2 = (TextView)rootView.findViewById(R.id.package_two);
        TextView mytext3 = (TextView)rootView.findViewById(R.id.package_three);
        TextView mytext4 = (TextView)rootView.findViewById(R.id.package_four);
        TextView mytext5 = (TextView)rootView.findViewById(R.id.package_five);
        TextView mytext6 = (TextView)rootView.findViewById(R.id.package_six);
        TextView mytext7 = (TextView)rootView.findViewById(R.id.package_seven);
        TextView mytext8 = (TextView)rootView.findViewById(R.id.package_eight);
        TextView mytext9 = (TextView)rootView.findViewById(R.id.package_nine);
        TextView mytext10 = (TextView)rootView.findViewById(R.id.package_ten);
        TextView mytext11 = (TextView)rootView.findViewById(R.id.package_eleven);
        TextView mytext12 = (TextView)rootView.findViewById(R.id.package_twelve);






        mytext1.setTypeface(mytype);
        mytext2.setTypeface(mytype);
        mytext3.setTypeface(mytype);
        mytext4.setTypeface(mytype);
        mytext5.setTypeface(mytype);
        mytext6.setTypeface(mytype);
        mytext7.setTypeface(mytype2);
        mytext8.setTypeface(mytype);
        mytext9.setTypeface(mytype);
        mytext10.setTypeface(mytype);
        mytext11.setTypeface(mytype);
        mytext12.setTypeface(mytype2);



        return rootView;

    }


}