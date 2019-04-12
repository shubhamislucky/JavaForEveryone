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
public class Modifiers extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_modifiers, container, false);

        Typeface mytype = Typeface.createFromAsset(getActivity().getAssets(), "Prompt-Regular.ttf");
        Typeface mytype2 = Typeface.createFromAsset(getActivity().getAssets(), "DroidSansMono.ttf");

        TextView mytext1 = (TextView)rootView.findViewById(R.id.mod_first);
        TextView mytext2 = (TextView)rootView.findViewById(R.id.mod_second);
        TextView mytext3 = (TextView)rootView.findViewById(R.id.mod_third);
        TextView mytext4 = (TextView)rootView.findViewById(R.id.mod_four);
        TextView mytext5 = (TextView)rootView.findViewById(R.id.mod_five);
        TextView mytext6 = (TextView)rootView.findViewById(R.id.mod_six);
        TextView mytext7 = (TextView)rootView.findViewById(R.id.mod_seven);
        TextView mytext8 = (TextView)rootView.findViewById(R.id.mod_eight);
        TextView mytext9 = (TextView)rootView.findViewById(R.id.mod_nine);
        TextView mytext10 = (TextView)rootView.findViewById(R.id.mod_ten);
        TextView mytext11 = (TextView)rootView.findViewById(R.id.mod_eleven);
        TextView mytext12 = (TextView)rootView.findViewById(R.id.mod_twelve);
        TextView mytext13 = (TextView)rootView.findViewById(R.id.mod_thirteen);
        TextView mytext14 = (TextView)rootView.findViewById(R.id.mod_fourteen);
        TextView mytext15 = (TextView)rootView.findViewById(R.id.mod_fifteen);
        TextView mytext16 = (TextView)rootView.findViewById(R.id.mod_sixteen);
        TextView mytext17 = (TextView)rootView.findViewById(R.id.mod_seventeen);
        TextView mytext18 = (TextView)rootView.findViewById(R.id.mod_eighteen);
        TextView mytext19 = (TextView)rootView.findViewById(R.id.mod_nineteen);
        TextView mytext20 = (TextView)rootView.findViewById(R.id.mod_twenty);
        TextView mytext21 = (TextView)rootView.findViewById(R.id.mod_twentyone);
        TextView mytext22 = (TextView)rootView.findViewById(R.id.mod_twentytwo);


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
        mytext12.setTypeface(mytype);
        mytext13.setTypeface(mytype);
        mytext14.setTypeface(mytype2);
        mytext15.setTypeface(mytype);
        mytext16.setTypeface(mytype);
        mytext17.setTypeface(mytype);
        mytext18.setTypeface(mytype);
        mytext19.setTypeface(mytype);
        mytext20.setTypeface(mytype2);
        mytext21.setTypeface(mytype);
        mytext22.setTypeface(mytype);



        return rootView;



    }
}
