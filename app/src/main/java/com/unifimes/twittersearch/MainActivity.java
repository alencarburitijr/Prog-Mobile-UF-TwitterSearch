package com.unifimes.twittersearch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText txtPesquisa;
    private ArrayList<String> tags;

    private ListView lstViewPesquisa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtPesquisa = (EditText) findViewById(R.id.txtPesquisa);
        lstViewPesquisa = (ListView) findViewById(R.id.lstViewPesquisa);

        String item1 = "Teste 1";
        String item2 = "Teste 2";

        tags = new ArrayList<>();
        tags.add(item1);
        tags.add(item2);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tags);

        lstViewPesquisa.setAdapter(adapter);
    }
}