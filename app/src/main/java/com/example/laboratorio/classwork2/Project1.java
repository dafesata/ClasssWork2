package com.example.laboratorio.classwork2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Project1 extends AppCompatActivity {

    private EditText Funcionalidad,Presentacion,Usabilidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project1);
        Funcionalidad = (EditText) findViewById(R.id.FuncionalidadText);
        Presentacion = (EditText) findViewById(R.id.PresentacionText);
        Usabilidad = (EditText) findViewById(R.id.UsabilidadText);


    }


    public void Back(View v) {


        if (!Funcionalidad.getText().toString().equals("") && !Presentacion.getText().toString().equals("") && !Usabilidad.getText().toString().equals("")) {
            double Func = Double.parseDouble(Funcionalidad.getText().toString());
            double Pres = Double.parseDouble(Presentacion.getText().toString());
            double Usa = Double.parseDouble(Usabilidad.getText().toString());
            double Def = (Func *0.5)+(Pres*0.25)+(Usa*0.25);
            String value = String.valueOf(Def);
            Intent returnintent = new Intent();
            returnintent.putExtra("value", value);
            setResult(Activity.RESULT_OK, returnintent);
            finish();
        }else{
            Toast toast1 =
                    Toast.makeText(getApplicationContext(),
                            "LLene todos los campos para continuar", Toast.LENGTH_SHORT);
            toast1.show();
        }
    }
}
