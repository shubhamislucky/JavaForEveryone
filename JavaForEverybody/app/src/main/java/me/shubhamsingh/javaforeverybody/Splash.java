package me.shubhamsingh.javaforeverybody;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.splash);
        Typeface mytype = Typeface.createFromAsset(getAssets(), "Prompt-Regular.ttf");
        Typeface mytype2 = Typeface.createFromAsset(getAssets(),"Nunito-Bold.ttf");
        Typeface mytype3 = Typeface.createFromAsset(getAssets(),"Satisfy-Regular.ttf");


        TextView mytext = (TextView)findViewById(R.id.textView);
        TextView mytext1 = (TextView)findViewById(R.id.togethersplash);
        TextView mytext2 = (TextView)findViewById(R.id.textView2);
        TextView mytext3 = (TextView)findViewById(R.id.textView3);

        mytext.setTypeface(mytype2);
        mytext1.setTypeface(mytype);
        mytext2.setTypeface(mytype3);
        mytext3.setTypeface(mytype3);

        final ImageView iv = (ImageView) findViewById(R.id.imageView);
        final Animation an = AnimationUtils.loadAnimation(getBaseContext(),R.anim.rotate);
        final Animation an2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.abc_fade_out);

        iv.startAnimation(an);
        an.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                iv.startAnimation(an2);
                    finish();
                Intent i = new Intent(Splash.this,MainActivity.class);
                startActivity(i);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

}
