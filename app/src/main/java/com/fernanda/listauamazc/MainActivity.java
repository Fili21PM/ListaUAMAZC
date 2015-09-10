package com.fernanda.listauamazc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//Declaro mi lista
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Relleno mi arreglo
        Octocats octocats_datos[]= new Octocats[]{
            new Octocats(R.mipmap.ic_bouncer,"Bouncer"),
            new Octocats(R.mipmap.ic_dodger, "Dodger"),
            new Octocats(R.mipmap.ic_female, "Female"),
            new Octocats(R.mipmap.ic_filmtocat, "Filmtocat"),
            new Octocats(R.mipmap.ic_gracehoper, "GraceHoperCat"),
            new Octocats(R.mipmap.ic_ninja, "NinjaCat"),
            new Octocats(R.mipmap.ic_pusheen,"PusheenCat"),
            new Octocats(R.mipmap.ic_rainbow, "RainbowCat")
        };

        //Al adaptador le paso el contenido del arreglo lleno
        OctocatsAdapter adapter = new OctocatsAdapter(this,R.layout.listview_item_row,octocats_datos);

        //Me traigo mi lista y la enlazo con su vista, ademas le asigno su adaptador lleno
        lv = (ListView) findViewById(R.id.lv);
        lv.setAdapter(adapter);

        //Escucho los eventos en los items (elementos de la lista)
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?>arg0, View arg1, int arg2, long arg3) {
                TextView v = (TextView)arg1.findViewById(R.id.tv);
                Toast.makeText(getApplicationContext(),v.getText(),Toast.LENGTH_SHORT).show();
                switch (v.getText().toString()){

                    case "Bouncer":
                        Intent i=new Intent(getApplicationContext(),activity1.class);
                        startActivity(i);
                        break;

                    case "Dodger":
                        Intent o=new Intent(getApplicationContext(),activity2.class);
                        startActivity(o);
                        break;

                    case "Female":
                        Intent h=new Intent(getApplicationContext(),activity3.class);
                        startActivity(h);
                        break;

                    case "Filmtocat":
                        Intent j=new Intent(getApplicationContext(),activity4.class);
                        startActivity(j);
                        break;

                    case "GraceHoperCat":
                        Intent k=new Intent(getApplicationContext(),activity5.class);
                        startActivity(k);
                        break;

                    case "NinjaCat":
                        Intent l=new Intent(getApplicationContext(),activity6.class);
                        startActivity(l);
                        break;

                    case "PusheenCat":
                        Intent m = new Intent(getApplicationContext(),activity7.class);
                        startActivity(m);
                        break;

                    case "RainbowCat":
                        Intent n =new Intent(getApplicationContext(),activity8.class);
                        startActivity(n);
                        break;

                }

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
