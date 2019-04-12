package me.shubhamsingh.javaforeverybody;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.renderscript.Type;
import android.widget.TextView;

public class Coder extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.coder);

        Typeface mytype = Typeface.createFromAsset(getAssets(), "Prompt-Regular.ttf");
        Typeface mytype2 = Typeface.createFromAsset(getAssets(),"BalooThambi-Regular.ttf");
        Typeface mytype3 = Typeface.createFromAsset(getAssets(),"Nunito-Bold.ttf");
        TextView mytext1 = (TextView)findViewById(R.id.coderid1);
        TextView mytext2 = (TextView)findViewById(R.id.coderid2);
        TextView mytext3 = (TextView)findViewById(R.id.coderid3);
        TextView mytext4 = (TextView)findViewById(R.id.coderid4);
        TextView mytext5 = (TextView)findViewById(R.id.coderid5);
        TextView mytext6 = (TextView)findViewById(R.id.coderid6);
        TextView mytext7 = (TextView)findViewById(R.id.coderid7);
        TextView mytext8 = (TextView)findViewById(R.id.coderid8);
        TextView mytext9 = (TextView)findViewById(R.id.coderid9);
        TextView mytext10 = (TextView)findViewById(R.id.coderid10);
        TextView mytext11 = (TextView)findViewById(R.id.coderid11);
        TextView mytext12 = (TextView)findViewById(R.id.coderid12);
        TextView mytext13 = (TextView)findViewById(R.id.coderid13);
        TextView mytext14 = (TextView)findViewById(R.id.coderid14);
        TextView mytext15 = (TextView)findViewById(R.id.coderid15);
        TextView mytext16 = (TextView)findViewById(R.id.coderid17);
        TextView mytext17 = (TextView)findViewById(R.id.coderid18);
        TextView mytext18 = (TextView)findViewById(R.id.coderid19);
        TextView mytext19 = (TextView)findViewById(R.id.coderid20);



        mytext1.setTypeface(mytype3);
        mytext2.setTypeface(mytype3);
        mytext3.setTypeface(mytype);
        mytext4.setTypeface(mytype);
        mytext5.setTypeface(mytype3);
        mytext6.setTypeface(mytype);
        mytext7.setTypeface(mytype);
        mytext8.setTypeface(mytype3);
        mytext9.setTypeface(mytype);
        mytext10.setTypeface(mytype);
        mytext11.setTypeface(mytype);
        mytext12.setTypeface(mytype3);
        mytext13.setTypeface(mytype);
        mytext14.setTypeface(mytype);
        mytext15.setTypeface(mytype3);
        mytext16.setTypeface(mytype);
        mytext17.setTypeface(mytype3);
        mytext18.setTypeface(mytype);
        mytext19.setTypeface(mytype);




    }

}
