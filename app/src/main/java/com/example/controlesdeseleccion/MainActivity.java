package com.example.controlesdeseleccion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements  AdapterView.OnItemSelectedListener,
        AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //DATOS
        final String[] datos =                new
                        String[]{"Elem1","Elem2","Elem3","Elem4","Elem5"};
        //Nombres Compañeros
        final String[] listaCompañeros =                new
                String[]{"WENDY MARGOTH ACOSTA MESTANZA1","ALLISSON ANDREA ACURIO BUSTAMANTE  ","DARLEY STEVEN ALAVA LARA"
                ,"ANDERSON GUSTAVO ANDRADE CORONADO","KEVIN ANDRES BELTRAN ESPINOZA"};

        //ADAPTADOR 1
        ArrayAdapter<String> adaptador =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item, datos);
        //ADAPTADOR 2
        ArrayAdapter<String> adaptador2 =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item, listaCompañeros);

        //Asignar el adaptador a la vista (spiner)
        Spinner cmbOpciones=
                (Spinner)findViewById(R.id.cbLista);
         adaptador.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item
        );
        cmbOpciones.setAdapter(adaptador);
        cmbOpciones.setOnItemSelectedListener(this);

        ListView lstOpciones =(ListView)findViewById(R.id.lstLista); lstOpciones.setAdapter(adaptador2);
        lstOpciones.setAdapter(adaptador2);
        lstOpciones.setOnItemClickListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        TextView txtItem = (TextView) findViewById(R.id.textItem);
        txtItem.setText("Seleccionado: " + adapterView.getItemAtPosition(i));

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        TextView txtItem = (TextView) findViewById(R.id.textItem);
        txtItem.setText("Click ListVIew: " + adapterView.getItemAtPosition(i));


    }
}