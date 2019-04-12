package me.shubhamsingh.javaforeverybody;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class QuesAns extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques_ans);

        ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#8b85ff")));
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        bar.setElevation(13);
        bar.setDisplayShowHomeEnabled(true);

        bar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        bar.setCustomView(R.layout.abs_layout);

        Typeface myTypeface = Typeface.createFromAsset(getAssets(),"Prompt-Regular.ttf");

        TextView mytext1 = (TextView)findViewById(R.id.qanda1);
        TextView mytext2 = (TextView)findViewById(R.id.qanda2);
        TextView mytext3 = (TextView)findViewById(R.id.qanda3);
        TextView mytext4 = (TextView)findViewById(R.id.qanda4);
        TextView mytext5 = (TextView)findViewById(R.id.qanda5);
        TextView mytext6 = (TextView)findViewById(R.id.qanda6);
        TextView mytext7 = (TextView)findViewById(R.id.qanda7);
        TextView mytext8 = (TextView)findViewById(R.id.qanda8);
        TextView mytext9 = (TextView)findViewById(R.id.qanda9);
        TextView mytext10 = (TextView)findViewById(R.id.qanda10);
        TextView mytext11 = (TextView)findViewById(R.id.qanda11);
        TextView mytext12 = (TextView)findViewById(R.id.qanda12);
        TextView mytext13 = (TextView)findViewById(R.id.qanda13);
        TextView mytext14 = (TextView)findViewById(R.id.qanda14);
        TextView mytext15 = (TextView)findViewById(R.id.qanda15);
        TextView mytext16 = (TextView)findViewById(R.id.qanda16);
        TextView mytext17 = (TextView)findViewById(R.id.qanda17);
        TextView mytext18 = (TextView)findViewById(R.id.qanda18);
        TextView mytext19 = (TextView)findViewById(R.id.qanda19);
        TextView mytext20 = (TextView)findViewById(R.id.qanda20);
        TextView mytext21 = (TextView)findViewById(R.id.qanda21);
        TextView mytext22 = (TextView)findViewById(R.id.qanda22);
        TextView mytext23 = (TextView)findViewById(R.id.qanda23);
        TextView mytext24 = (TextView)findViewById(R.id.qanda24);
        TextView mytext25 = (TextView)findViewById(R.id.qanda25);
        TextView mytext26 = (TextView)findViewById(R.id.qanda26);
        TextView mytext27 = (TextView)findViewById(R.id.qanda27);
        TextView mytext28 = (TextView)findViewById(R.id.qanda28);
        TextView mytext29 = (TextView)findViewById(R.id.qanda29);
        TextView mytext30 = (TextView)findViewById(R.id.qanda30);
        TextView mytext31 = (TextView)findViewById(R.id.qanda31);
        TextView mytext32 = (TextView)findViewById(R.id.qanda32);
        TextView mytext33 = (TextView)findViewById(R.id.qanda33);
        TextView mytext34 = (TextView)findViewById(R.id.qanda34);
        TextView mytext35 = (TextView)findViewById(R.id.qanda35);
        TextView mytext36 = (TextView)findViewById(R.id.qanda36);


        mytext1.setTypeface(myTypeface);
        mytext2.setTypeface(myTypeface);
        mytext3.setTypeface(myTypeface);
        mytext4.setTypeface(myTypeface);
        mytext5.setTypeface(myTypeface);
        mytext6.setTypeface(myTypeface);
        mytext7.setTypeface(myTypeface);
        mytext8.setTypeface(myTypeface);
        mytext9.setTypeface(myTypeface);
        mytext10.setTypeface(myTypeface);
        mytext11.setTypeface(myTypeface);
        mytext12.setTypeface(myTypeface);
        mytext13.setTypeface(myTypeface);
        mytext14.setTypeface(myTypeface);
        mytext15.setTypeface(myTypeface);
        mytext16.setTypeface(myTypeface);
        mytext17.setTypeface(myTypeface);
        mytext18.setTypeface(myTypeface);
        mytext19.setTypeface(myTypeface);
        mytext20.setTypeface(myTypeface);
        mytext21.setTypeface(myTypeface);
        mytext22.setTypeface(myTypeface);
        mytext23.setTypeface(myTypeface);
        mytext24.setTypeface(myTypeface);
        mytext25.setTypeface(myTypeface);
        mytext26.setTypeface(myTypeface);
        mytext27.setTypeface(myTypeface);
        mytext28.setTypeface(myTypeface);
        mytext29.setTypeface(myTypeface);
        mytext30.setTypeface(myTypeface);
        mytext31.setTypeface(myTypeface);
        mytext32.setTypeface(myTypeface);
        mytext33.setTypeface(myTypeface);
        mytext34.setTypeface(myTypeface);
        mytext35.setTypeface(myTypeface);
        mytext36.setTypeface(myTypeface);


    }

    public void qanda1(View v){
        if(v.getId() == R.id.qanda1){
            Intent i = new Intent(QuesAns.this,QandA_first.class);
            startActivity(i);
        }
    }
    public void qanda2(View v){
        if(v.getId() == R.id.qanda2){
            Intent i = new Intent(QuesAns.this,QandA_second.class);
            startActivity(i);
        }
    }
    public void qanda3(View v){
        if(v.getId() == R.id.qanda3){
            Intent i = new Intent(QuesAns.this,QandA_third.class);
            startActivity(i);
        }
    }
    public void qanda4(View v){
        if(v.getId() == R.id.qanda4){
            Intent i = new Intent(QuesAns.this,QandA_four.class);
            startActivity(i);
        }
    }
    public void qanda5(View v){
        if(v.getId() == R.id.qanda5){
            Intent i = new Intent(QuesAns.this,QandA_fifth.class);
            startActivity(i);
        }
    }
    public void qanda6(View v){
        if(v.getId() == R.id.qanda6){
            Intent i = new Intent(QuesAns.this,QandA_six.class);
            startActivity(i);
        }
    }
    public void qanda7(View v){
        if(v.getId() == R.id.qanda7){
            Intent i = new Intent(QuesAns.this,QandA_seven.class);
            startActivity(i);
        }
    }
    public void qanda8(View v){
        if(v.getId() == R.id.qanda8){
            Intent i = new Intent(QuesAns.this,QandA_eight.class);
            startActivity(i);
        }
    }
    public void qanda9(View v){
        if(v.getId() == R.id.qanda9){
            Intent i = new Intent(QuesAns.this,QandA_nine.class);
            startActivity(i);
        }
    }
    public void qanda10(View v){
        if(v.getId() == R.id.qanda10){
            Intent i = new Intent(QuesAns.this,QandA_ten.class);
            startActivity(i);
        }
    }
    public void qanda11(View v){
        if(v.getId() == R.id.qanda11){
            Intent i = new Intent(QuesAns.this,QandA_eleven.class);
            startActivity(i);
        }
    }
    public void qanda12(View v){
        if(v.getId() == R.id.qanda12){
            Intent i = new Intent(QuesAns.this,QandA_twelve.class);
            startActivity(i);
        }
    }
    public void qanda13(View v){
        if(v.getId() == R.id.qanda13){
            Intent i = new Intent(QuesAns.this,QandA_thirteen.class);
            startActivity(i);
        }
    }
    public void qanda14(View v){
        if(v.getId() == R.id.qanda14){
            Intent i = new Intent(QuesAns.this,QandA_fourteen.class);
            startActivity(i);
        }
    }
    public void qanda15(View v){
        if(v.getId() == R.id.qanda15){
            Intent i = new Intent(QuesAns.this,QandA_fifteen.class);
            startActivity(i);
        }
    }
    public void qanda16(View v){
        if(v.getId() == R.id.qanda16){
            Intent i = new Intent(QuesAns.this,QandA_sixteen.class);
            startActivity(i);
        }
    }
    public void qanda17(View v){
        if(v.getId() == R.id.qanda17){
            Intent i = new Intent(QuesAns.this,QandA_seventeen.class);
            startActivity(i);
        }
    }
    public void qanda18(View v){
        if(v.getId() == R.id.qanda18){
            Intent i = new Intent(QuesAns.this,QandA_eighteen.class);
            startActivity(i);
        }
    }
    public void qanda19(View v){
        if(v.getId() == R.id.qanda19){
            Intent i = new Intent(QuesAns.this,QandA_nineteen.class);
            startActivity(i);
        }
    }
    public void qanda20(View v){
        if(v.getId() == R.id.qanda20){
            Intent i = new Intent(QuesAns.this,QandA_twenty.class);
            startActivity(i);
        }
    }
    public void qanda21(View v){
        if(v.getId() == R.id.qanda21){
            Intent i = new Intent(QuesAns.this,QandA_twentyone.class);
            startActivity(i);
        }
    }
    public void qanda22(View v){
        if(v.getId() == R.id.qanda22){
            Intent i = new Intent(QuesAns.this,QandA_twentytwo.class);
            startActivity(i);
        }
    }
    public void qanda23(View v){
        if(v.getId() == R.id.qanda23){
            Intent i = new Intent(QuesAns.this,QandA_twentythree.class);
            startActivity(i);
        }
    }
    public void qanda24(View v){
        if(v.getId() == R.id.qanda24){
            Intent i = new Intent(QuesAns.this,QandA_twentyfour.class);
            startActivity(i);
        }
    }
    public void qanda25(View v){
        if(v.getId() == R.id.qanda25){
            Intent i = new Intent(QuesAns.this,QandA_twentyfive.class);
            startActivity(i);
        }
    }
    public void qanda26(View v){
        if(v.getId() == R.id.qanda26){
            Intent i = new Intent(QuesAns.this,QandA_twentysix.class);
            startActivity(i);
        }
    }
    public void qanda27(View v){
        if(v.getId() == R.id.qanda27){
            Intent i = new Intent(QuesAns.this,QandA_twentyseven.class);
            startActivity(i);
        }
    }
    public void qanda28(View v){
        if(v.getId() == R.id.qanda28){
            Intent i = new Intent(QuesAns.this,QandA_twentyeight.class);
            startActivity(i);
        }
    }
    public void qanda29(View v){
        if(v.getId() == R.id.qanda29){
            Intent i = new Intent(QuesAns.this,QandA_twentynine.class);
            startActivity(i);
        }
    }
    public void qanda30(View v){
        if(v.getId() == R.id.qanda30){
            Intent i = new Intent(QuesAns.this,QandA_thirty.class);
            startActivity(i);
        }
    }
    public void qanda31(View v){
        if(v.getId() == R.id.qanda31){
            Intent i = new Intent(QuesAns.this,QandA_thirtyone.class);
            startActivity(i);
        }
    }
    public void qanda32(View v){
        if(v.getId() == R.id.qanda32){
            Intent i = new Intent(QuesAns.this,QandA_thirtytwo.class);
            startActivity(i);
        }
    }
    public void qanda33(View v){
        if(v.getId() == R.id.qanda33){
            Intent i = new Intent(QuesAns.this,QandA_thirtythree.class);
            startActivity(i);
        }
    }
    public void qanda34(View v){
        if(v.getId() == R.id.qanda34){
            Intent i = new Intent(QuesAns.this,QandA_thirtyfour.class);
            startActivity(i);
        }
    }
    public void qanda35(View v){
        if(v.getId() == R.id.qanda35){
            Intent i = new Intent(QuesAns.this,QandA_thirtyfive.class);
            startActivity(i);
        }
    }
    public void qanda36(View v){
        if(v.getId() == R.id.qanda36){
            Intent i = new Intent(QuesAns.this,QandA_thirtysix.class);
            startActivity(i);
        }
    }


}
