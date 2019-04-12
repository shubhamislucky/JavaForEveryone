package me.shubhamsingh.javaforeverybody;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class OOP extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_oop, container, false);

        Typeface mytype = Typeface.createFromAsset(getActivity().getAssets(), "Prompt-Regular.ttf");
        TextView mytext1 = (TextView)rootView.findViewById(R.id.oop_typeface);
        TextView mytext2 = (TextView)rootView.findViewById(R.id.oopdef);
        TextView mytext3 = (TextView)rootView.findViewById(R.id.oop_typeface2);
        TextView mytext4 = (TextView)rootView.findViewById(R.id.oop_typeface3);
        TextView mytext5 = (TextView)rootView.findViewById(R.id.oop_typeface4);
        TextView mytext6 = (TextView)rootView.findViewById(R.id.oop_typeface5);
        TextView mytext7 = (TextView)rootView.findViewById(R.id.oop_typeface6);
        TextView mytext8 = (TextView)rootView.findViewById(R.id.oop_typeface7);
        TextView mytext9 = (TextView)rootView.findViewById(R.id.oop_typeface8);


        mytext1.setTypeface(mytype);
        mytext2.setTypeface(mytype);
        mytext3.setTypeface(mytype);
        mytext4.setTypeface(mytype);
        mytext5.setTypeface(mytype);
        mytext6.setTypeface(mytype);
        mytext7.setTypeface(mytype);
        mytext8.setTypeface(mytype);
        mytext9.setTypeface(mytype);


        return rootView;



    }
}
