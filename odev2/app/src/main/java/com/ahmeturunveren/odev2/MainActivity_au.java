package com.ahmeturunveren.odev2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity_au extends AppCompatActivity {

    TextView textView_au,textView2_au,textView3_au;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_au=findViewById(R.id.textView);
        textView2_au=findViewById(R.id.textView2);
        textView3_au=findViewById(R.id.textView3);

    }
    public void btnRenk_au(View view){
        textView_au.setTextColor(Color.BLUE);
        textView2_au.setTextColor(Color.YELLOW);
        textView3_au.setTextColor(Color.GREEN);
    }

    public void btnSize_au(View view){
        textView_au.setTextSize(15);
        textView2_au.setTextSize(20);
        textView3_au.setTextSize(25);
    }
    public void btnBgColor_au(View view){
        textView_au.setBackgroundColor(Color.BLACK);
        textView2_au.setBackgroundColor(Color.BLACK);
        textView3_au.setBackgroundColor(Color.GREEN);

        int textColor = textView3_au.getCurrentTextColor();
        int backgroundColor = ((ColorDrawable)textView3_au.getBackground()).getColor();

        if (textColor == backgroundColor) {//textColor ve backgroundColor aynı ise textColor WHİTE olsun!
            textView3_au.setTextColor(Color.WHITE);
        }

    }
    public void btnChange_au(View view){
        Random rnd=new Random();
        int flag1=rnd.nextInt(3);
        int flag2=rnd.nextInt(3);
        if(flag1==0){//textView
            if(flag2==0){//textColor
                textView_au.setTextColor(Color.YELLOW);
            } else if (flag2==1) {//textSize
                textView_au.setTextSize(rnd.nextInt(30));
            }else{//backgroundColor
                textView_au.setBackgroundColor(Color.RED);
            }
        } else if (flag1==1) {//textView2
            if(flag2==0){//textColor
                textView2_au.setTextColor(Color.BLUE);
            } else if (flag2==1) {//textSize
                textView2_au.setTextSize(rnd.nextInt(30));
            }else{//backgroundColor
                textView2_au.setBackgroundColor(Color.GREEN);
            }
        }else{//textView3
            if(flag2==0){//textColor
                textView3_au.setTextColor(Color.GRAY);
            } else if (flag2==1) {//textSize
                textView3_au.setTextSize(rnd.nextInt(30));
            }else{//backgroundColor
                textView3_au.setBackgroundColor(Color.BLACK);
            }
        }
    }

    public void btnGecis_au(View view){
        Intent intent=new Intent(MainActivity_au.this, MainActivity2_au.class);
        startActivity(intent);
    }

}