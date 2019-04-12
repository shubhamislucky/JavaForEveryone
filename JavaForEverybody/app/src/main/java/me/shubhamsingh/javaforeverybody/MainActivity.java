package me.shubhamsingh.javaforeverybody;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#f7484e")));
        bar.setTitle("  Java for Everyone");
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        bar.setElevation(13);
        bar.hide();




        Typeface myTypeface = Typeface.createFromAsset(getAssets(),"Comfortaa-Regular.ttf");
        Typeface mytype2 = Typeface.createFromAsset(getAssets(),"Nunito-Bold.ttf");
        TextView myTextview = (TextView)findViewById(R.id.main_first);
        TextView myTextview3 = (TextView)findViewById(R.id.main_second);
        TextView myTextview4 = (TextView)findViewById(R.id.main_third);
        TextView myTextview6 = (TextView)findViewById(R.id.main_four);
        TextView myTextview5 = (TextView)findViewById(R.id.mainlogo);





        myTextview5.setTypeface(mytype2);

        myTextview4.setTypeface(myTypeface);
        myTextview3.setTypeface(myTypeface);

        myTextview.setTypeface(myTypeface);
        myTextview6.setTypeface(myTypeface);



        final Animation animAlpha = new AnimationUtils().loadAnimation(this,R.anim.anim_alpha);
        final Animation animAlpha2 = new AnimationUtils().loadAnimation(this,R.anim.anim_alpha);
        final Animation animAlpha3 = new AnimationUtils().loadAnimation(this,R.anim.anim_alpha);
        View btnAlpha = (View) findViewById(R.id.button1);
        btnAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha);
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);

            }

        });

        View btnAlpha2 = (View)findViewById(R.id.mybutton);
        btnAlpha2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha2);
                Intent i = new Intent(MainActivity.this,QuesAns.class);
                startActivity(i);

            }

        });
        View btnAlpha3 = (View)findViewById(R.id.buttonpdf);
        btnAlpha3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animAlpha3);
                Intent i = new Intent(MainActivity.this,Programs.class);
                startActivity(i);

            }

        });


        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void iamcoder(View v){
        if(v.getId() == R.id.myFAB){
            Intent i = new Intent(MainActivity.this,Coder.class);
            startActivity(i);
        }
    }
    public void aboutUs(View v){
        if(v.getId() == R.id.myshare){
            Intent i = new Intent(MainActivity.this,AboutMe.class);
            startActivity(i);
        }
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }
}
