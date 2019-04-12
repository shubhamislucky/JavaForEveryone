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
public class DataTypes extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_data_types, container, false);

        Typeface mytype = Typeface.createFromAsset(getActivity().getAssets(), "Prompt-Regular.ttf");
        Typeface mytype2 = Typeface.createFromAsset(getActivity().getAssets(), "DroidSansMono.ttf");
        TextView mytext1 = (TextView)rootView.findViewById(R.id.data_one);
        TextView mytext2 = (TextView)rootView.findViewById(R.id.data_two);
        TextView mytext3 = (TextView)rootView.findViewById(R.id.data_three);
        TextView mytext4 = (TextView)rootView.findViewById(R.id.data_four);
        TextView mytext5 = (TextView)rootView.findViewById(R.id.data_five);
        TextView mytext6 = (TextView)rootView.findViewById(R.id.data_six);
        TextView mytext7 = (TextView)rootView.findViewById(R.id.data_seven);
        TextView mytext8 = (TextView)rootView.findViewById(R.id.data_eight);
        TextView mytext9 = (TextView)rootView.findViewById(R.id.data_nine);
        TextView mytext10 = (TextView)rootView.findViewById(R.id.data_ten);
        TextView mytext11 = (TextView)rootView.findViewById(R.id.data_eleven);
        TextView mytext12 = (TextView)rootView.findViewById(R.id.data_twelve);
        TextView mytext13 = (TextView)rootView.findViewById(R.id.data_thirteen);
        TextView mytext14 = (TextView)rootView.findViewById(R.id.data_fourteen);
        TextView mytext15 = (TextView)rootView.findViewById(R.id.data_fifteen);
        TextView mytext16 = (TextView)rootView.findViewById(R.id.data_sixteen);
        TextView mytext17 = (TextView)rootView.findViewById(R.id.data_seventeen);
        TextView mytext18 = (TextView)rootView.findViewById(R.id.data_eighteen);
        TextView mytext19 = (TextView)rootView.findViewById(R.id.data_nineteen);
        TextView mytext20 = (TextView)rootView.findViewById(R.id.data_twenty);
        TextView mytext21 = (TextView)rootView.findViewById(R.id.data_twentyone);
        TextView mytext22 = (TextView)rootView.findViewById(R.id.data_twentytwo);
        TextView mytext23 = (TextView)rootView.findViewById(R.id.data_twentythree);
        TextView mytext24 = (TextView)rootView.findViewById(R.id.data_twentyfour);

        mytext1.setTypeface(mytype);
        mytext2.setTypeface(mytype);
        mytext3.setTypeface(mytype);
        mytext4.setTypeface(mytype2);
        mytext5.setTypeface(mytype);
        mytext6.setTypeface(mytype2);
        mytext7.setTypeface(mytype);
        mytext8.setTypeface(mytype2);
        mytext9.setTypeface(mytype);
        mytext10.setTypeface(mytype2);
        mytext11.setTypeface(mytype);
        mytext12.setTypeface(mytype2);
        mytext13.setTypeface(mytype);
        mytext14.setTypeface(mytype2);
        mytext15.setTypeface(mytype);
        mytext16.setTypeface(mytype2);
        mytext17.setTypeface(mytype);
        mytext18.setTypeface(mytype2);
        mytext19.setTypeface(mytype);
        mytext20.setTypeface(mytype);
        mytext21.setTypeface(mytype);
        mytext22.setTypeface(mytype);
        mytext23.setTypeface(mytype2);
        mytext24.setTypeface(mytype);

        return rootView;



    }
}
