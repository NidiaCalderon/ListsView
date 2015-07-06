package com.nidia.listsview;

import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class WindowListsView extends Activity {

    String[] datos = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lists_view);

        //lista = (ListView)findViewById(R.id.Lista1);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               // Toast t = Toast.makeText(getApplicationContext(), datos[i], Toast.LENGTH_LONG);
               // t.show();
            }
        });

    }
}