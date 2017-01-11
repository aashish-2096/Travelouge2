package com.example.reloading.travelouge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);

        String[] nme = {"Select","Bangalore", "Chennai", "Kolkata", "Mumbai", "New Delhi"};
        sp = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adap = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_selectable_list_item, nme);
        sp.setAdapter(adap);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        Intent b = new Intent("bl");
                        Toast.makeText(MainActivity.this, "Bangalore it is", Toast.LENGTH_SHORT).show();
                        startActivity(b);
                        break;
                    case 2:
                        Intent c = new Intent("ch");
                        Toast.makeText(MainActivity.this, "Chennai it is", Toast.LENGTH_SHORT).show();
                        startActivity(c);
                        break;

                    case 3:
                        Intent d = new Intent("kl");
                        Toast.makeText(MainActivity.this, "Kolkata it is", Toast.LENGTH_SHORT).show();
                        startActivity(d);
                        break;
                    case 4:
                        Intent e = new Intent("mb");
                        Toast.makeText(MainActivity.this, "Mumbai it is", Toast.LENGTH_SHORT).show();
                        startActivity(e);
                        break;

                    case 5:
                        Intent f = new Intent("nd");
                        Toast.makeText(MainActivity.this, "New Delhi it is", Toast.LENGTH_SHORT).show();
                        startActivity(f);
                        break;


                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(MainActivity.this,"Pls select the city ",Toast.LENGTH_SHORT).show();

            }
        });

    }

    }

