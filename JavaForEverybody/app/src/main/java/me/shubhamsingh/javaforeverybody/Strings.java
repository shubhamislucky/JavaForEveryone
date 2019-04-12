package me.shubhamsingh.javaforeverybody;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Strings extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_strings, container, false);

        Typeface mytype = Typeface.createFromAsset(getActivity().getAssets(), "Prompt-Regular.ttf");
        Typeface mytype2 = Typeface.createFromAsset(getActivity().getAssets(), "DroidSansMono.ttf");

        TextView mytext1 = (TextView)rootView.findViewById(R.id.string_one);
        TextView mytext2 = (TextView)rootView.findViewById(R.id.string_two);
        TextView mytext3 = (TextView)rootView.findViewById(R.id.string_three);
        TextView mytext4 = (TextView)rootView.findViewById(R.id.string_four);
        TextView mytext5 = (TextView)rootView.findViewById(R.id.string_five);
        TextView mytext6 = (TextView)rootView.findViewById(R.id.string_six);
        TextView mytext7 = (TextView)rootView.findViewById(R.id.string_seven);
        TextView mytext8 = (TextView)rootView.findViewById(R.id.string_eight);
        TextView mytext9 = (TextView)rootView.findViewById(R.id.string_nine);
        TextView mytext10 = (TextView)rootView.findViewById(R.id.string_ten);
        TextView mytext11 = (TextView)rootView.findViewById(R.id.string_eleven);
        TextView mytext12 = (TextView)rootView.findViewById(R.id.string_twelve);
        TextView mytext13 = (TextView)rootView.findViewById(R.id.string_thirteen);
        TextView mytext14 = (TextView)rootView.findViewById(R.id.string_fourteen);
        TextView mytext15 = (TextView)rootView.findViewById(R.id.string_fifteen);
        TextView mytext16 = (TextView)rootView.findViewById(R.id.string_sixteen);
        TextView mytext17 = (TextView)rootView.findViewById(R.id.string_seventeen);
        TextView mytext18 = (TextView)rootView.findViewById(R.id.string_eighteen);
        TextView mytext19 = (TextView)rootView.findViewById(R.id.string_nineteen);
        TextView mytext20 = (TextView)rootView.findViewById(R.id.string_twenty);
        TextView mytext21 = (TextView)rootView.findViewById(R.id.string_twentyone);
        TextView mytext22 = (TextView)rootView.findViewById(R.id.string_twentytwo);
        TextView mytext23 = (TextView)rootView.findViewById(R.id.string_twentythree);
        TextView mytext24 = (TextView)rootView.findViewById(R.id.string_twentyfour);
        TextView mytext25 = (TextView)rootView.findViewById(R.id.string_twentyfive);
        TextView mytext26 = (TextView)rootView.findViewById(R.id.string_twentysix);
        TextView mytext27 = (TextView)rootView.findViewById(R.id.string_twentyseven);


        mytext1.setTypeface(mytype);
        mytext2.setTypeface(mytype);
        mytext3.setTypeface(mytype);
        mytext4.setTypeface(mytype);
        mytext5.setTypeface(mytype2);
        mytext6.setTypeface(mytype);
        mytext7.setTypeface(mytype2);
        mytext8.setTypeface(mytype);
        mytext9.setTypeface(mytype2);
        mytext10.setTypeface(mytype);
        mytext11.setTypeface(mytype);
        mytext12.setTypeface(mytype);
        mytext13.setTypeface(mytype);
        mytext14.setTypeface(mytype2);
        mytext15.setTypeface(mytype);
        mytext16.setTypeface(mytype);
        mytext17.setTypeface(mytype);
        mytext18.setTypeface(mytype);
        mytext19.setTypeface(mytype2);
        mytext20.setTypeface(mytype);
        mytext21.setTypeface(mytype2);
        mytext22.setTypeface(mytype);
        mytext23.setTypeface(mytype2);
        mytext24.setTypeface(mytype);
        mytext25.setTypeface(mytype);
        mytext26.setTypeface(mytype);
        mytext27.setTypeface(mytype);


        return rootView;



    }
}
