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

public class Programs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs);


        ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#7369F8")));
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        bar.setElevation(13);

        bar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        bar.setCustomView(R.layout.programactionbar);

        Typeface myTypeface = Typeface.createFromAsset(getAssets(),"Prompt-Regular.ttf");

        TextView mytext1 = (TextView)findViewById(R.id.prog1);
        TextView mytext2 = (TextView)findViewById(R.id.prog2);
        TextView mytext3 = (TextView)findViewById(R.id.prog3);
        TextView mytext4 = (TextView)findViewById(R.id.prog4);
        TextView mytext5 = (TextView)findViewById(R.id.prog5);
        TextView mytext6 = (TextView)findViewById(R.id.prog6);
        TextView mytext7 = (TextView)findViewById(R.id.prog7);
        TextView mytext8 = (TextView)findViewById(R.id.prog8);
        TextView mytext9 = (TextView)findViewById(R.id.prog9);
        TextView mytext10 = (TextView)findViewById(R.id.prog10);
        TextView mytext11 = (TextView)findViewById(R.id.prog11);
        TextView mytext12 = (TextView)findViewById(R.id.prog12);
        TextView mytext13 = (TextView)findViewById(R.id.prog13);
        TextView mytext14 = (TextView)findViewById(R.id.prog14);
        TextView mytext15 = (TextView)findViewById(R.id.prog15);
        TextView mytext16 = (TextView)findViewById(R.id.prog16);
        TextView mytext17 = (TextView)findViewById(R.id.prog17);
        TextView mytext18 = (TextView)findViewById(R.id.prog18);
        TextView mytext19 = (TextView)findViewById(R.id.prog19);
        TextView mytext20 = (TextView)findViewById(R.id.prog20);
        TextView mytext21 = (TextView)findViewById(R.id.prog21);
        TextView mytext22 = (TextView)findViewById(R.id.prog22);
        TextView mytext23 = (TextView)findViewById(R.id.prog23);


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


    }
    public void prog1(View v){
        if(v.getId() == R.id.prog1){
            Intent i = new Intent(Programs.this,Program_first.class);
            startActivity(i);
        }
    }
    public void prog2(View v){
        if(v.getId() == R.id.prog2){
            Intent i = new Intent(Programs.this,Program_second.class);
            startActivity(i);
        }
    }
    public void prog3(View v){
        if(v.getId() == R.id.prog3){
            Intent i = new Intent(Programs.this,Program_third.class);
            startActivity(i);
        }
    }
    public void prog4(View v){
        if(v.getId() == R.id.prog4){
            Intent i = new Intent(Programs.this,Program_four.class);
            startActivity(i);
        }
    }
    public void prog5(View v){
        if(v.getId() == R.id.prog5){
            Intent i = new Intent(Programs.this,Program_five.class);
            startActivity(i);
        }
    }
    public void prog6(View v){
        if(v.getId() == R.id.prog6){
            Intent i = new Intent(Programs.this,Program_six.class);
            startActivity(i);
        }
    }
    public void prog7(View v){
        if(v.getId() == R.id.prog7){
            Intent i = new Intent(Programs.this,Program_seven.class);
            startActivity(i);
        }
    }
    public void prog8(View v){
        if(v.getId() == R.id.prog8){
            Intent i = new Intent(Programs.this,Program_eight.class);
            startActivity(i);
        }
    }
    public void prog9(View v){
        if(v.getId() == R.id.prog9){
            Intent i = new Intent(Programs.this,Program_nine.class);
            startActivity(i);
        }
    }
    public void prog10(View v){
        if(v.getId() == R.id.prog10){
            Intent i = new Intent(Programs.this,Program_ten.class);
            startActivity(i);
        }
    }
    public void prog11(View v){
        if(v.getId() == R.id.prog11){
            Intent i = new Intent(Programs.this,Program_eleven.class);
            startActivity(i);
        }
    }
    public void prog12(View v){
        if(v.getId() == R.id.prog12){
            Intent i = new Intent(Programs.this,Program_twelve.class);
            startActivity(i);
        }
    }
    public void prog13(View v){
        if(v.getId() == R.id.prog13){
            Intent i = new Intent(Programs.this,Program_thirteen.class);
            startActivity(i);
        }
    }
    public void prog14(View v){
        if(v.getId() == R.id.prog14){
            Intent i = new Intent(Programs.this,Program_fourteen.class);
            startActivity(i);
        }
    }
    public void prog15(View v){
        if(v.getId() == R.id.prog15){
            Intent i = new Intent(Programs.this,Program_fifteen.class);
            startActivity(i);
        }
    }
    public void prog16(View v){
        if(v.getId() == R.id.prog16){
            Intent i = new Intent(Programs.this,Program_sixteen.class);
            startActivity(i);
        }
    }
    public void prog17(View v){
        if(v.getId() == R.id.prog17){
            Intent i = new Intent(Programs.this,Program_seventeen.class);
            startActivity(i);
        }
    }
    public void prog18(View v){
        if(v.getId() == R.id.prog18){
            Intent i = new Intent(Programs.this,Program_eighteen.class);
            startActivity(i);
        }
    }
    public void prog19(View v){
        if(v.getId() == R.id.prog19){
            Intent i = new Intent(Programs.this,Program_nineteen.class);
            startActivity(i);
        }
    }
    public void prog20(View v){
        if(v.getId() == R.id.prog20){
            Intent i = new Intent(Programs.this,Program_twenty.class);
            startActivity(i);
        }
    }
    public void prog21(View v){
        if(v.getId() == R.id.prog21){
            Intent i = new Intent(Programs.this,Program_twentyone.class);
            startActivity(i);
        }
    }
    public void prog22(View v){
        if(v.getId() == R.id.prog22){
            Intent i = new Intent(Programs.this,Program_twentytwo.class);
            startActivity(i);
        }
    }
    public void prog23(View v){
        if(v.getId() == R.id.prog23){
            Intent i = new Intent(Programs.this,Program_twentythree.class);
            startActivity(i);
        }
    }


}
