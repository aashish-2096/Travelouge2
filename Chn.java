package com.example.reloading.travelouge;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Chn extends Activity {
    Spinner sp2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_chn);
        super.onCreate(savedInstanceState);

        String[] nme = {"Select","San Thome Basilica","Marina Beach","Kapeelashwar Temple","Pulicat Lake ","Semmozhi Poonga"};
        sp2 = (Spinner) findViewById(R.id.spinner3);
        ArrayAdapter<String> adap= new ArrayAdapter<String>(Chn.this,android.R.layout.simple_selectable_list_item,nme);
        sp2.setAdapter(adap);
       sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        Intent c1= new Intent("stp");
                        Toast.makeText(Chn.this, "San Thome Basilica it is", Toast.LENGTH_SHORT).show();
                        startActivity(c1);
                        break;
                    case 2:
                        Intent c2 = new Intent("mar");
                        Toast.makeText(Chn.this, "Marina Beach it is", Toast.LENGTH_SHORT).show();
                        startActivity(c2);
                        break;
                    case 3:
                        Intent c3 = new Intent("kt");
                        Toast.makeText(Chn.this, "Kapeelashwar Temple it is", Toast.LENGTH_SHORT).show();
                        startActivity(c3);
                        break;
                    case 4:
                        Intent c4 = new Intent("pl");
                        Toast.makeText(Chn.this, "Pulicat Lake it is", Toast.LENGTH_SHORT).show();
                        startActivity(c4);
                        break;
                    case 5:
                        Intent c5 = new Intent("sp");
                        Toast.makeText(Chn.this, "Semmozhi Poonga", Toast.LENGTH_SHORT).show();
                        startActivity(c5);
                        break;

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(Chn.this,"Pls select the city ",Toast.LENGTH_SHORT).show();

            }
        });

    }
}
