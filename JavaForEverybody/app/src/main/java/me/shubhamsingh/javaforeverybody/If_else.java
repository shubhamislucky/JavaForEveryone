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
public class If_else extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_if_else, container, false);

        Typeface mytype = Typeface.createFromAsset(getActivity().getAssets(), "Prompt-Regular.ttf");
        Typeface mytype2 = Typeface.createFromAsset(getActivity().getAssets(), "DroidSansMono.ttf");
        TextView mytext1 = (TextView)rootView.findViewById(R.id.if_one);
        TextView mytext2 = (TextView)rootView.findViewById(R.id.if_two);
        TextView mytext3 = (TextView)rootView.findViewById(R.id.if_three);
        TextView mytext4 = (TextView)rootView.findViewById(R.id.if_four);
        TextView mytext5 = (TextView)rootView.findViewById(R.id.if_five);
        TextView mytext6 = (TextView)rootView.findViewById(R.id.if_six);
        TextView mytext7 = (TextView)rootView.findViewById(R.id.if_seven);
        TextView mytext8 = (TextView)rootView.findViewById(R.id.if_eight);
        TextView mytext9 = (TextView)rootView.findViewById(R.id.if_nine);
        TextView mytext10 = (TextView)rootView.findViewById(R.id.if_ten);
        TextView mytext11 = (TextView)rootView.findViewById(R.id.if_eleven);
        TextView mytext12 = (TextView)rootView.findViewById(R.id.if_twelve);
        TextView mytext13 = (TextView)rootView.findViewById(R.id.if_thirteen);
        TextView mytext14 = (TextView)rootView.findViewById(R.id.if_fourteen);
        TextView mytext15 = (TextView)rootView.findViewById(R.id.if_fifteen);
        TextView mytext16 = (TextView)rootView.findViewById(R.id.if_sixteen);
        TextView mytext17 = (TextView)rootView.findViewById(R.id.if_seventeen);
        TextView mytext18 = (TextView)rootView.findViewById(R.id.if_eighteen);
        TextView mytext19 = (TextView)rootView.findViewById(R.id.if_nineteen);
        TextView mytext20 = (TextView)rootView.findViewById(R.id.if_twenty);
        TextView mytext21 = (TextView)rootView.findViewById(R.id.if_twentyone);
        TextView mytext22 = (TextView)rootView.findViewById(R.id.if_twentytwo);
        TextView mytext23 = (TextView)rootView.findViewById(R.id.if_twentythree);
        TextView mytext24 = (TextView)rootView.findViewById(R.id.if_twentyfour);
        TextView mytext25 = (TextView)rootView.findViewById(R.id.if_twentyfive);
        TextView mytext26 = (TextView)rootView.findViewById(R.id.if_twentysix);
        TextView mytext27 = (TextView)rootView.findViewById(R.id.if_twentyseven);
        TextView mytext28 = (TextView)rootView.findViewById(R.id.if_twentyeight);


        mytext1.setTypeface(mytype);
        mytext2.setTypeface(mytype);
        mytext3.setTypeface(mytype);
        mytext4.setTypeface(mytype);
        mytext5.setTypeface(mytype);
        mytext6.setTypeface(mytype);
        mytext7.setTypeface(mytype);
        mytext8.setTypeface(mytype);
        mytext9.setTypeface(mytype);
        mytext10.setTypeface(mytype);
        mytext11.setTypeface(mytype);
        mytext12.setTypeface(mytype);
        mytext13.setTypeface(mytype);
        mytext14.setTypeface(mytype);
        mytext15.setTypeface(mytype);
        mytext16.setTypeface(mytype);
        mytext17.setTypeface(mytype);
        mytext18.setTypeface(mytype);
        mytext19.setTypeface(mytype);
        mytext20.setTypeface(mytype);
        mytext21.setTypeface(mytype);
        mytext22.setTypeface(mytype);
        mytext23.setTypeface(mytype);
        mytext24.setTypeface(mytype);
        mytext25.setTypeface(mytype);
        mytext26.setTypeface(mytype2);
        mytext27.setTypeface(mytype);
        mytext28.setTypeface(mytype);


        return rootView;



    }
}
