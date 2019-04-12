package me.shubhamsingh.javaforeverybody;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Features extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_features, container, false);
        Typeface mytype1 = Typeface.createFromAsset(getActivity().getAssets(), "Prompt-Regular.ttf");

        TextView mytext1 = (TextView)rootView.findViewById(R.id.features_typeface);
        TextView mytext2 = (TextView)rootView.findViewById(R.id.features_second);
        TextView mytext3 = (TextView)rootView.findViewById(R.id.features_third);
        TextView mytext4 = (TextView)rootView.findViewById(R.id.features_four);
        TextView mytext5 = (TextView)rootView.findViewById(R.id.features_five);
        TextView mytext6 = (TextView)rootView.findViewById(R.id.features_six);
        TextView mytext7 = (TextView)rootView.findViewById(R.id.features_seven);
        TextView mytext8 = (TextView)rootView.findViewById(R.id.features_eight);
        TextView mytext9 = (TextView)rootView.findViewById(R.id.features_nine);
        TextView mytext10 = (TextView)rootView.findViewById(R.id.features_ten);
        TextView mytext11 = (TextView)rootView.findViewById(R.id.features_eleven);
        TextView mytext12 = (TextView)rootView.findViewById(R.id.features_twelve);
        TextView mytext13 = (TextView)rootView.findViewById(R.id.features_fifteen);
        TextView mytext14 = (TextView)rootView.findViewById(R.id.features_sixteen);
        TextView mytext15 = (TextView)rootView.findViewById(R.id.features_seventeen);
        TextView mytext16 = (TextView)rootView.findViewById(R.id.features_eighteen);
        TextView mytext17 = (TextView)rootView.findViewById(R.id.features_nineteen);
        TextView mytext18 = (TextView)rootView.findViewById(R.id.features_twenty);
        TextView mytext19 = (TextView)rootView.findViewById(R.id.features_twentyone);
        TextView mytext20 = (TextView)rootView.findViewById(R.id.features_twentytwo);
        TextView mytext21 = (TextView)rootView.findViewById(R.id.features_twentythree);
        TextView mytext22 = (TextView)rootView.findViewById(R.id.features_twentyfour);
        TextView mytext23 = (TextView)rootView.findViewById(R.id.features_twentysix);
        TextView mytext24 = (TextView)rootView.findViewById(R.id.features_twentyseven);
        TextView mytext25 = (TextView)rootView.findViewById(R.id.features_twentyeight);
        TextView mytext26 = (TextView)rootView.findViewById(R.id.features_twentynine);
        TextView mytext27 = (TextView)rootView.findViewById(R.id.features_thirty);
        TextView mytext28 = (TextView)rootView.findViewById(R.id.features_thirtyone);


        mytext1.setTypeface(mytype1);
        mytext2.setTypeface(mytype1);
        mytext3.setTypeface(mytype1);
        mytext4.setTypeface(mytype1);
        mytext5.setTypeface(mytype1);
        mytext6.setTypeface(mytype1);
        mytext7.setTypeface(mytype1);
        mytext8.setTypeface(mytype1);
        mytext9.setTypeface(mytype1);
        mytext10.setTypeface(mytype1);
        mytext11.setTypeface(mytype1);
        mytext12.setTypeface(mytype1);
        mytext13.setTypeface(mytype1);
        mytext14.setTypeface(mytype1);
        mytext15.setTypeface(mytype1);
        mytext16.setTypeface(mytype1);
        mytext17.setTypeface(mytype1);
        mytext18.setTypeface(mytype1);
        mytext19.setTypeface(mytype1);
        mytext20.setTypeface(mytype1);
        mytext21.setTypeface(mytype1);
        mytext22.setTypeface(mytype1);
        mytext23.setTypeface(mytype1);
        mytext24.setTypeface(mytype1);
        mytext25.setTypeface(mytype1);
        mytext26.setTypeface(mytype1);
        mytext27.setTypeface(mytype1);
        mytext28.setTypeface(mytype1);


        return rootView;



    }
}
