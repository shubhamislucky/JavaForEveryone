package me.shubhamsingh.javaforeverybody;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.TextView;

public class Program_third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program_third);

        ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#7369F8")));
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        bar.setElevation(13);
        bar.setDisplayShowHomeEnabled(true);

        bar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        bar.setCustomView(R.layout.programactionbar);

        Typeface mytype = Typeface.createFromAsset(getAssets(),"Prompt-Regular.ttf");
        Typeface mytype2 = Typeface.createFromAsset(getAssets(), "DroidSansMono.ttf");


        TextView mytext1 = (TextView)findViewById(R.id.even_first);
        TextView mytext2 = (TextView)findViewById(R.id.even_second);
        TextView mytext3 = (TextView)findViewById(R.id.even_three);

        mytext1.setTypeface(mytype);
        mytext2.setTypeface(mytype2);
        mytext3.setTypeface(mytype);


    }


}
