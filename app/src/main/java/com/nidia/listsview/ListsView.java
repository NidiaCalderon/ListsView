package com.nidia.listsview;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;


public class ListsView extends Activity {

    Spinner lista;
    String[] datos = {"January, February, ListView "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lists_view);

        lista = (Spinner)findViewById(R.id.Lista1);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, datos);
        lista.setAdapter(adaptador);

        lista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                switch (i) {
                    case 1:
                        Toast to = Toast.makeText(getApplicationContext(), datos[i], Toast.LENGTH_LONG);
                        to.show();
                        break;
                    case 2:
                        Intent in = new Intent(ListsView.this,WindowListsView.class);
                        startActivity(in);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}