package me.shubhamsingh.javaforeverybody;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SetJava extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_set_java, container, false);
        TextView t2 = (TextView)rootView.findViewById(R.id.jdk);
        t2.setMovementMethod(LinkMovementMethod.getInstance());

        Typeface mytype = Typeface.createFromAsset(getActivity().getAssets(), "Prompt-Regular.ttf");

        TextView mytext1 = (TextView)rootView.findViewById(R.id.jdk);
        TextView mytext2 = (TextView)rootView.findViewById(R.id.setjava_one);
        TextView mytext3 = (TextView)rootView.findViewById(R.id.setjava_two);
        TextView mytext4 = (TextView)rootView.findViewById(R.id.setjava_three);
        TextView mytext5 = (TextView)rootView.findViewById(R.id.setjava_four);
        TextView mytext6 = (TextView)rootView.findViewById(R.id.setjava_five);
        TextView mytext7 = (TextView)rootView.findViewById(R.id.setjava_six);
        TextView mytext8 = (TextView)rootView.findViewById(R.id.setjava_seven);
        TextView mytext9 = (TextView)rootView.findViewById(R.id.setjava_eight);
        TextView mytext10 = (TextView)rootView.findViewById(R.id.setjava_nine);
        TextView mytext11 = (TextView)rootView.findViewById(R.id.setjava_ten);
        TextView mytext12 = (TextView)rootView.findViewById(R.id.setjava_eleven);

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




        return rootView;



    }
}
