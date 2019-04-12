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
public class Break extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_break, container, false);

        Typeface mytype = Typeface.createFromAsset(getActivity().getAssets(), "Prompt-Regular.ttf");
        Typeface mytype2 = Typeface.createFromAsset(getActivity().getAssets(), "DroidSansMono.ttf");
        TextView mytext1 = (TextView)rootView.findViewById(R.id.break_one);
        TextView mytext2 = (TextView)rootView.findViewById(R.id.break_two);
        TextView mytext3 = (TextView)rootView.findViewById(R.id.break_three);
        TextView mytext4 = (TextView)rootView.findViewById(R.id.break_four);
        TextView mytext5 = (TextView)rootView.findViewById(R.id.break_five);
        TextView mytext6 = (TextView)rootView.findViewById(R.id.break_six);
        TextView mytext7 = (TextView)rootView.findViewById(R.id.break_seven);

        mytext1.setTypeface(mytype);
        mytext2.setTypeface(mytype);
        mytext3.setTypeface(mytype2);
        mytext4.setTypeface(mytype);
        mytext5.setTypeface(mytype2);
        mytext6.setTypeface(mytype);
        mytext7.setTypeface(mytype);


        return rootView;



    }
}
