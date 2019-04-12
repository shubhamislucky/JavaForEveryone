package me.shubhamsingh.javaforeverybody;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by SHUBHAM on 12-Aug-16
 */
public class AboutMe extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        Typeface mytype = Typeface.createFromAsset(getAssets(), "Prompt-Regular.ttf");
        Typeface mytype2 = Typeface.createFromAsset(getAssets(),"Nunito-Bold.ttf");
        TextView mytext1 = (TextView)findViewById(R.id.about_one);
        TextView mytext2 = (TextView)findViewById(R.id.about_two);
        TextView mytext3 = (TextView)findViewById(R.id.about_three);
        TextView mytext5 = (TextView)findViewById(R.id.about_five);
        TextView mytext6 = (TextView)findViewById(R.id.about_share_txt);
        TextView mytext7 = (TextView)findViewById(R.id.about_rate);


        mytext1.setTypeface(mytype2);
        mytext2.setTypeface(mytype2);
        mytext3.setTypeface(mytype);
        mytext5.setTypeface(mytype2);
        mytext6.setTypeface(mytype2);
        mytext7.setTypeface(mytype2);



        ImageView img = (ImageView)findViewById(R.id.google);
        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("mailto:shubhamsinghtitanfall@gmail.com"));
                startActivity(intent);
            }
        });

        ImageView img2 = (ImageView)findViewById(R.id.behance);
        img2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.behance.net/shubhamsinghtitan"));
                startActivity(intent);
            }
        });

        ImageView img3 = (ImageView)findViewById(R.id.portfolio);
        img3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.instagram.com/shubham_is_lucky/"));
                startActivity(intent);
            }
        });

        ImageView img4 = (ImageView)findViewById(R.id.share);
        img4.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){
                Intent myintent = new Intent(Intent.ACTION_SEND);
                myintent.setType("text/plain");
                String shareBody = "https://play.google.com/store/apps/details?id=me.shubhamsingh.javaforeverybody";
                String shareSub = "Java For Everyone : Learn Java Programming";
                myintent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
                myintent.putExtra(Intent.EXTRA_TEXT,shareBody);
                startActivity(Intent.createChooser(myintent, "Share Using"));
            }
        });

        ImageView img5 = (ImageView)findViewById(R.id.star);
        img5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=me.shubhamsingh.javaforeverybody&hl=en"));
                startActivity(intent);
            }
        });

    }

}
