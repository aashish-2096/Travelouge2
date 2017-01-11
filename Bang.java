package com.example.reloading.travelouge;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class Bang extends Activity {
    Spinner sp1;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_bang);
        super.onCreate(savedInstanceState);

        String[] nme = {"Select","Bangalore Palace", "Cubbon Park", "Bannerghatta National Park", "Nandi Hills", "Lal Bagh "};
        sp1 = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<String> adap = new ArrayAdapter<String>(Bang.this, android.R.layout.simple_selectable_list_item, nme);
        sp1.setAdapter(adap);
        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        Intent b1 = new Intent("bp");
                        Toast.makeText(Bang.this, "Bangalore Palace it is", Toast.LENGTH_SHORT).show();
                        startActivity(b1);
                        break;
                    case 2:
                        Intent b2 = new Intent("cp");
                        Toast.makeText(Bang.this, "Cubbon Park it is", Toast.LENGTH_SHORT).show();
                        startActivity(b2);
                        break;
                    case 3:
                        Intent b3 = new Intent("bnp");
                        Toast.makeText(Bang.this, "Bannerghatta National Park it is", Toast.LENGTH_SHORT).show();
                        startActivity(b3);
                        break;
                    case 4:
                        Intent b4= new Intent("nh");
                        Toast.makeText(Bang.this, "Nandi Hills  it is", Toast.LENGTH_SHORT).show();
                        startActivity(b4);
                        break;
                    case 5:
                        Intent b5 = new Intent("lb");
                        Toast.makeText(Bang.this, "Lalbagh it is", Toast.LENGTH_SHORT).show();
                        startActivity(b5);
                        break;

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(Bang.this, "Pls select the city ", Toast.LENGTH_SHORT).show();

            }
        });


    }




}
