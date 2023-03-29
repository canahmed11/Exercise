package com.ahmeturunveren.odev2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity2_au extends AppCompatActivity {

    String[] textColors_au,bgColors_au,fontSize_au;

    Spinner spinner_au,spinner2_au,spinner3_au;

    TextView textView4_au,textView5_au,textView6_au;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textColors_au = new String[]{"YELLOW", "RED", "BLUE", "GREEN", "GRAY"};

        bgColors_au = new String[]{"YELLOW", "RED", "BLUE", "GREEN", "GRAY"};

        fontSize_au = new String[]{"5","10","15","20","25"};

        spinner_au = findViewById(R.id.spinner);
        spinner2_au=findViewById(R.id.spinner2);
        spinner3_au=findViewById(R.id.spinner3);

        textView4_au=findViewById(R.id.textView4);
        textView5_au=findViewById(R.id.textView5);
        textView6_au=findViewById(R.id.textView6);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, textColors_au);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_au.setAdapter(adapter);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, bgColors_au);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2_au.setAdapter(adapter2);

        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, fontSize_au);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3_au.setAdapter(adapter3);
        //
        spinner_au.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String selectedColor = adapterView.getItemAtPosition(position).toString();

                switch (selectedColor) {
                    case "YELLOW":
                        textView4_au.setTextColor(Color.YELLOW);
                        textView5_au.setTextColor(Color.YELLOW);
                        textView6_au.setTextColor(Color.YELLOW);
                        break;
                    case "RED":
                        textView4_au.setTextColor(Color.RED);
                        textView5_au.setTextColor(Color.RED);
                        textView6_au.setTextColor(Color.RED);
                        break;
                    case "BLUE":
                        textView4_au.setTextColor(Color.BLUE);
                        textView5_au.setTextColor(Color.BLUE);
                        textView6_au.setTextColor(Color.BLUE);
                        break;
                    case "GREEN":
                        textView4_au.setTextColor(Color.GREEN);
                        textView5_au.setTextColor(Color.GREEN);
                        textView6_au.setTextColor(Color.GREEN);
                        break;
                    case "GRAY":
                        textView4_au.setTextColor(Color.GRAY);
                        textView5_au.setTextColor(Color.GRAY);
                        textView6_au.setTextColor(Color.GRAY);
                        break;
                    default:
                        textView4_au.setTextColor(Color.YELLOW);
                        textView5_au.setTextColor(Color.YELLOW);
                        textView6_au.setTextColor(Color.YELLOW);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // handle no selection case if needed
            }
        });
        //
        spinner2_au.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String selectedBg = adapterView.getItemAtPosition(position).toString();

                switch (selectedBg) {
                    case "YELLOW":
                        textView4_au.setBackgroundColor(Color.YELLOW);
                        textView5_au.setBackgroundColor(Color.YELLOW);
                        textView6_au.setBackgroundColor(Color.YELLOW);
                        break;
                    case "RED":
                        textView4_au.setBackgroundColor(Color.RED);
                        textView5_au.setBackgroundColor(Color.RED);
                        textView6_au.setBackgroundColor(Color.RED);
                        break;
                    case "BLUE":
                        textView4_au.setBackgroundColor(Color.BLUE);
                        textView5_au.setBackgroundColor(Color.BLUE);
                        textView6_au.setBackgroundColor(Color.BLUE);
                        break;
                    case "GREEN":
                        textView4_au.setBackgroundColor(Color.GREEN);
                        textView5_au.setBackgroundColor(Color.GREEN);
                        textView6_au.setBackgroundColor(Color.GREEN);
                        break;
                    case "GRAY":
                        textView4_au.setBackgroundColor(Color.GRAY);
                        textView5_au.setBackgroundColor(Color.GRAY);
                        textView6_au.setBackgroundColor(Color.GRAY);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // handle no selection case if needed
            }
        });
        //
        spinner3_au.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String selectedSize = adapterView.getItemAtPosition(position).toString();

                switch (selectedSize) {
                    case "5":
                        textView4_au.setTextSize(5);
                        textView5_au.setTextSize(5);
                        textView6_au.setTextSize(5);

                        break;
                    case "10":
                        textView4_au.setTextSize(10);
                        textView5_au.setTextSize(10);
                        textView6_au.setTextSize(10);
                        break;
                    case "15":
                        textView4_au.setTextSize(15);
                        textView5_au.setTextSize(15);
                        textView6_au.setTextSize(15);
                        break;
                    case "20":
                        textView4_au.setTextSize(20);
                        textView5_au.setTextSize(20);
                        textView6_au.setTextSize(20);
                        break;
                    case "25":
                        textView4_au.setTextSize(25);
                        textView5_au.setTextSize(25);
                        textView6_au.setTextSize(25);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // handle no selection case if needed
            }
        });
    }


    public void btnGecis2_au(View view){
        Intent intent=new Intent(MainActivity2_au.this, MainActivity_au.class);
        startActivity(intent);
    }



}
