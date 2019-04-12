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
public class ObjectsAndClasses extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_objects_and_classes, container, false);

        Typeface mytype = Typeface.createFromAsset(getActivity().getAssets(), "Prompt-Regular.ttf");
        Typeface mytype2 = Typeface.createFromAsset(getActivity().getAssets(), "DroidSansMono.ttf");
        TextView mytext1 = (TextView)rootView.findViewById(R.id.oandc_one);
        TextView mytext2 = (TextView)rootView.findViewById(R.id.oandc_two);
        TextView mytext3 = (TextView)rootView.findViewById(R.id.oandc_three);
        TextView mytext4 = (TextView)rootView.findViewById(R.id.oandc_four);
        TextView mytext5 = (TextView)rootView.findViewById(R.id.oandc_five);
        TextView mytext6 = (TextView)rootView.findViewById(R.id.oandc_six);
        TextView mytext7 = (TextView)rootView.findViewById(R.id.oandc_seven);
        TextView mytext8 = (TextView)rootView.findViewById(R.id.oandc_eight);
        TextView mytext9 = (TextView)rootView.findViewById(R.id.oandc_nine);
        TextView mytext10 = (TextView)rootView.findViewById(R.id.oandc_ten);
        TextView mytext11 = (TextView)rootView.findViewById(R.id.oandc_eleven);
        TextView mytext12 = (TextView)rootView.findViewById(R.id.oandc_twelve);
        TextView mytext13 = (TextView)rootView.findViewById(R.id.oandc_thirteen);


        mytext1.setTypeface(mytype);
        mytext2.setTypeface(mytype);
        mytext3.setTypeface(mytype);
        mytext4.setTypeface(mytype);
        mytext5.setTypeface(mytype2);
        mytext6.setTypeface(mytype);
        mytext7.setTypeface(mytype);
        mytext8.setTypeface(mytype);
        mytext9.setTypeface(mytype2);
        mytext10.setTypeface(mytype);
        mytext11.setTypeface(mytype2);
        mytext12.setTypeface(mytype);
        mytext13.setTypeface(mytype);


        return rootView;



    }
}
