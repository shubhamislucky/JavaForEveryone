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
public class java2 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_java2, container, false);

        Typeface mytype1 = Typeface.createFromAsset(getActivity().getAssets(), "Prompt-Regular.ttf");
        Typeface mytype2 = Typeface.createFromAsset(getActivity().getAssets(),"Nunito-Bold.ttf");
        TextView mytext1 = (TextView)rootView.findViewById(R.id.java2one);
        TextView mytext2 = (TextView)rootView.findViewById(R.id.javaintro);
        TextView mytext3 = (TextView)rootView.findViewById(R.id.java2second);
        TextView mytext4 = (TextView)rootView.findViewById(R.id.java2third);

        mytext1.setTypeface(mytype1);
        mytext2.setTypeface(mytype2);
        mytext3.setTypeface(mytype1);
        mytext4.setTypeface(mytype1);

        return rootView;



    }
}
