package com.example.reloading.travelouge;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Kol extends Activity {
    Spinner sp5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_kol);
        super.onCreate(savedInstanceState);
        String[] nme = {"Select", "Howrah Bridge","National Library","Marble Palace ","St.PaulCathedral"};
        sp5 = (Spinner) findViewById(R.id.spinner5);
        ArrayAdapter<String> adap= new ArrayAdapter<String>(Kol.this,android.R.layout.simple_selectable_list_item,nme);
        sp5.setAdapter(adap);
        sp5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        Intent k2 = new Intent("hb");
                        Toast.makeText(Kol.this, "Howrah Bridge it is", Toast.LENGTH_SHORT).show();
                        startActivity(k2);
                        break;
                    case 2:
                        Intent k3 = new Intent("nl");
                        Toast.makeText(Kol.this, "National Library it is", Toast.LENGTH_SHORT).show();
                        startActivity(k3);
                        break;
                    case 3:
                        Intent k4 = new Intent("mp");
                        Toast.makeText(Kol.this, "Marble Palace it is", Toast.LENGTH_SHORT).show();
                        startActivity(k4);
                        break;
                    case 4:
                        Intent k5 = new Intent("spc");
                        Toast.makeText(Kol.this, "St. Paul Cathedral it is ", Toast.LENGTH_SHORT).show();
                        startActivity(k5);
                        break;

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(Kol.this,"Pls select the city ",Toast.LENGTH_SHORT).show();

            }
        });

    }
    }

