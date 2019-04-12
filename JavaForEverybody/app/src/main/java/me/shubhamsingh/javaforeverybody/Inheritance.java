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


/**
 * A simple {@link Fragment} subclass.
 */
public class Inheritance extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_inheritance, container, false);

        Typeface mytype = Typeface.createFromAsset(getActivity().getAssets(), "Prompt-Regular.ttf");
        Typeface mytype2 = Typeface.createFromAsset(getActivity().getAssets(), "DroidSansMono.ttf");


        TextView mytext1 = (TextView)rootView.findViewById(R.id.inherit_one);
        TextView mytext2 = (TextView)rootView.findViewById(R.id.inherit_two);
        TextView mytext3 = (TextView)rootView.findViewById(R.id.inherit_three);
        TextView mytext4 = (TextView)rootView.findViewById(R.id.inherit_four);
        TextView mytext5 = (TextView)rootView.findViewById(R.id.inherit_five);
        TextView mytext6 = (TextView)rootView.findViewById(R.id.inherit_six);
        TextView mytext7 = (TextView)rootView.findViewById(R.id.inherit_seven);
        TextView mytext8 = (TextView)rootView.findViewById(R.id.inherit_eight);
        TextView mytext9 = (TextView)rootView.findViewById(R.id.inherit_nine);
        TextView mytext10 = (TextView)rootView.findViewById(R.id.inherit_ten);
        TextView mytext11 = (TextView)rootView.findViewById(R.id.inherit_eleven);
        TextView mytext12 = (TextView)rootView.findViewById(R.id.inherit_twelve);
        TextView mytext13 = (TextView)rootView.findViewById(R.id.inherit_thirteen);
        TextView mytext14 = (TextView)rootView.findViewById(R.id.inherit_fourteen);
        TextView mytext15 = (TextView)rootView.findViewById(R.id.inherit_fifteen);
        TextView mytext16 = (TextView)rootView.findViewById(R.id.inherit_sixteen);



        mytext1.setTypeface(mytype);
        mytext2.setTypeface(mytype);
        mytext3.setTypeface(mytype2);
        mytext4.setTypeface(mytype);
        mytext5.setTypeface(mytype2);
        mytext6.setTypeface(mytype);
        mytext7.setTypeface(mytype);
        mytext8.setTypeface(mytype);
        mytext9.setTypeface(mytype);
        mytext10.setTypeface(mytype);
        mytext11.setTypeface(mytype2);
        mytext12.setTypeface(mytype);
        mytext13.setTypeface(mytype2);
        mytext14.setTypeface(mytype);
        mytext15.setTypeface(mytype2);
        mytext16.setTypeface(mytype);





        return rootView;

    }


}
