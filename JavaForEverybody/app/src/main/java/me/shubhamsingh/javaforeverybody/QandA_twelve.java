package me.shubhamsingh.javaforeverybody;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.TextView;

public class QandA_twelve extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qand_a_twelve);

        ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#7369F8")));
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        bar.setElevation(13);
        bar.setDisplayShowHomeEnabled(true);

        bar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        bar.setCustomView(R.layout.abs_layout);

        Typeface myTypeface = Typeface.createFromAsset(getAssets(),"Prompt-Regular.ttf");


        TextView mytext1 = (TextView)findViewById(R.id.classvar_first);
        TextView mytext2 = (TextView)findViewById(R.id.classvar_second);

        mytext1.setTypeface(myTypeface);
        mytext2.setTypeface(myTypeface);


    }


}
