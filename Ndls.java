package com.example.reloading.travelouge;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Ndls extends Activity {
    Spinner sp4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_ndls);
        super.onCreate(savedInstanceState);


        String[] nme = {"Select","Akshardham Mandir","India Gate","Lotus Temple","Qutub Minar ","Jama Masjid"};
        sp4 = (Spinner) findViewById(R.id.spinner6);
        ArrayAdapter<String> adap= new ArrayAdapter<String>(Ndls.this,android.R.layout.simple_selectable_list_item,nme);
        sp4.setAdapter(adap);
      sp4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        Intent n1= new Intent("akd");
                        Toast.makeText(Ndls.this, "Akshardham it is", Toast.LENGTH_SHORT).show();
                        startActivity(n1);
                        break;
                    case 2:
                        Intent n2 = new Intent("ind");
                        Toast.makeText(Ndls.this, "India Gate it is", Toast.LENGTH_SHORT).show();
                        startActivity(n2);
                        break;
                    case 3:
                        Intent n3= new Intent("lt");
                        Toast.makeText(Ndls.this, "Lotus Temple it is", Toast.LENGTH_SHORT).show();
                        startActivity(n3);
                        break;
                    case 4:
                        Intent n4 = new Intent("qm");
                        Toast.makeText(Ndls.this, "Qutub Minar it is", Toast.LENGTH_SHORT).show();
                        startActivity(n4);
                        break;
                    case 5:
                        Intent n5 = new Intent("jm");
                        Toast.makeText(Ndls.this, "Jama Masjid it is ", Toast.LENGTH_SHORT).show();
                        startActivity(n5);
                        break;

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(Ndls.this,"Pls select the city ",Toast.LENGTH_SHORT).show();

            }
        });


    }
}
