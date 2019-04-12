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
public class JavaBasic extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_java_basic, container, false);

        Typeface mytype = Typeface.createFromAsset(getActivity().getAssets(), "Prompt-Regular.ttf");
        TextView mytext1 = (TextView)rootView.findViewById(R.id.basic_one);
        TextView mytext2 = (TextView)rootView.findViewById(R.id.basic_two);
        TextView mytext3 = (TextView)rootView.findViewById(R.id.basic_three);
        TextView mytext4 = (TextView)rootView.findViewById(R.id.basic_four);
        TextView mytext5 = (TextView)rootView.findViewById(R.id.basic_five);
        TextView mytext6 = (TextView)rootView.findViewById(R.id.basic_six);
        TextView mytext7 = (TextView)rootView.findViewById(R.id.basic_seven);
        TextView mytext8 = (TextView)rootView.findViewById(R.id.basic_eight);
        TextView mytext9 = (TextView)rootView.findViewById(R.id.basic_nine);
        TextView mytext10 = (TextView)rootView.findViewById(R.id.basic_ten);
        TextView mytext11 = (TextView)rootView.findViewById(R.id.basic_eleven);
        TextView mytext12 = (TextView)rootView.findViewById(R.id.basic_twelve);
        TextView mytext13 = (TextView)rootView.findViewById(R.id.basic_thirteen);
        TextView mytext14 = (TextView)rootView.findViewById(R.id.basic_fourteen);
        TextView mytext15 = (TextView)rootView.findViewById(R.id.basic_fifteen);


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

        return rootView;



    }
}
