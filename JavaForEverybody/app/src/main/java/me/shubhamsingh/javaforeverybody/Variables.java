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
public class Variables extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_variables, container, false);

        Typeface mytype = Typeface.createFromAsset(getActivity().getAssets(), "Prompt-Regular.ttf");
        Typeface mytype2 = Typeface.createFromAsset(getActivity().getAssets(), "DroidSansMono.ttf");
        TextView mytext1 = (TextView)rootView.findViewById(R.id.variable_one);
        TextView mytext2 = (TextView)rootView.findViewById(R.id.variable_two);
        TextView mytext3 = (TextView)rootView.findViewById(R.id.variable_three);
        TextView mytext4 = (TextView)rootView.findViewById(R.id.variable_four);
        TextView mytext5 = (TextView)rootView.findViewById(R.id.variable_five);
        TextView mytext6 = (TextView)rootView.findViewById(R.id.variable_six);
        TextView mytext7 = (TextView)rootView.findViewById(R.id.variable_seven);
        TextView mytext8 = (TextView)rootView.findViewById(R.id.variable_eight);
        TextView mytext9 = (TextView)rootView.findViewById(R.id.variable_nine);
        TextView mytext10 = (TextView)rootView.findViewById(R.id.variable_ten);
        TextView mytext11 = (TextView)rootView.findViewById(R.id.variable_eleven);
        TextView mytext12 = (TextView)rootView.findViewById(R.id.variable_twelve);
        TextView mytext13 = (TextView)rootView.findViewById(R.id.variable_thirteen);
        TextView mytext14 = (TextView)rootView.findViewById(R.id.variable_fourteen);

        mytext1.setTypeface(mytype);
        mytext2.setTypeface(mytype);
        mytext3.setTypeface(mytype2);
        mytext4.setTypeface(mytype);
        mytext5.setTypeface(mytype2);
        mytext6.setTypeface(mytype);
        mytext7.setTypeface(mytype2);
        mytext8.setTypeface(mytype);
        mytext9.setTypeface(mytype);
        mytext10.setTypeface(mytype);
        mytext11.setTypeface(mytype);
        mytext12.setTypeface(mytype);
        mytext13.setTypeface(mytype);
        mytext14.setTypeface(mytype);


        return rootView;



    }
}
