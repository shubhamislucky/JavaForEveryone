package me.shubhamsingh.javaforeverybody;


import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Exception_two extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_exception_two, container, false);

        Typeface mytype = Typeface.createFromAsset(getActivity().getAssets(), "Prompt-Regular.ttf");
        Typeface mytype2 = Typeface.createFromAsset(getActivity().getAssets(), "DroidSansMono.ttf");

        TextView mytext1 = (TextView)rootView.findViewById(R.id.exc_two_first);
        TextView mytext2 = (TextView)rootView.findViewById(R.id.exc_two_second);
        TextView mytext3 = (TextView)rootView.findViewById(R.id.exc_two_third);
        TextView mytext4 = (TextView)rootView.findViewById(R.id.exc_two_four);
        TextView mytext5 = (TextView)rootView.findViewById(R.id.exc_two_five);
        TextView mytext6 = (TextView)rootView.findViewById(R.id.exc_two_six);
        TextView mytext7 = (TextView)rootView.findViewById(R.id.exc_two_seven);
        TextView mytext8 = (TextView)rootView.findViewById(R.id.exc_two_eight);


        mytext1.setTypeface(mytype);
        mytext2.setTypeface(mytype);
        mytext3.setTypeface(mytype);
        mytext4.setTypeface(mytype);
        mytext5.setTypeface(mytype);
        mytext6.setTypeface(mytype2);
        mytext7.setTypeface(mytype);
        mytext8.setTypeface(mytype);





        return rootView;



    }
}
