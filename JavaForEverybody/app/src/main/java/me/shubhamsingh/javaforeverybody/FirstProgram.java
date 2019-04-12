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
public class FirstProgram extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_first_program, container, false);

        Typeface mytype = Typeface.createFromAsset(getActivity().getAssets(), "Prompt-Regular.ttf");
        TextView mytext1 = (TextView)rootView.findViewById(R.id.first_one);
        TextView mytext2 = (TextView)rootView.findViewById(R.id.first_two);
        TextView mytext3 = (TextView)rootView.findViewById(R.id.first_three);
        TextView mytext4 = (TextView)rootView.findViewById(R.id.first_four);
        TextView mytext5 = (TextView)rootView.findViewById(R.id.first_five);

        mytext1.setTypeface(mytype);
        mytext2.setTypeface(mytype);
        mytext3.setTypeface(mytype);
        mytext4.setTypeface(mytype);
        mytext5.setTypeface(mytype);


        return rootView;



    }
}
