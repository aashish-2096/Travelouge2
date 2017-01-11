package com.example.reloading.travelouge;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Mum extends Activity {

    Spinner sp3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_mum);
        super.onCreate(savedInstanceState);

        String[] nme = {"Select","Gateway of India ","Siddhivinayak Temple","Elephanta Caves","Haji Ali Dargah ","Essel World"};
        sp3 = (Spinner) findViewById(R.id.spinner4);
        ArrayAdapter<String> adap= new ArrayAdapter<String>(Mum.this,android.R.layout.simple_selectable_list_item,nme);
        sp3.setAdapter(adap);
        sp3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        Intent m1 = new Intent("gti");
                        Toast.makeText(Mum.this, " Gateway of India it is", Toast.LENGTH_SHORT).show();
                        startActivity(m1);
                        break;
                    case 2:
                        Intent m2 = new Intent("sdv");
                        Toast.makeText(Mum.this, "Siddhivinayak Temple it is", Toast.LENGTH_SHORT).show();
                        startActivity(m2);
                        break;
                    case 3:
                        Intent m3 = new Intent("ec");
                        Toast.makeText(Mum.this, "Elephanta Caves it is", Toast.LENGTH_SHORT).show();
                        startActivity(m3);
                        break;
                    case 4:
                        Intent m4 = new Intent("had");
                        Toast.makeText(Mum.this, "Haji Ali Dargah it is", Toast.LENGTH_SHORT).show();
                        startActivity(m4);
                        break;
                    case 5:
                        Intent m5 = new Intent("ew");
                        Toast.makeText(Mum.this, "Essel World it is ", Toast.LENGTH_SHORT).show();
                        startActivity(m5);
                        break;

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(Mum.this,"Pls select the city ",Toast.LENGTH_SHORT).show();

            }
        });

    }
}
