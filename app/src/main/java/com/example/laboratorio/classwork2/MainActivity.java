package com.example.laboratorio.classwork2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText resultado1,resultado2,resultado3,resultado4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultado1 = (EditText) findViewById(R.id.ResultadoP1);
        resultado2 = (EditText) findViewById(R.id.ResultadoP2);
        resultado3 = (EditText) findViewById(R.id.ResultadoP3);
        resultado4 = (EditText) findViewById(R.id.ResultadoP4);

    }

    public void OnClickirP1(View view){
        Intent i= new Intent(this,Project1.class);
        i.putExtra("value", new String());
        startActivityForResult(i, 1);
    }
    public void OnClickirP2(View view){
        Intent i= new Intent(this,Project1.class);
        i.putExtra("value", new String());
        startActivityForResult(i, 2);
    }
    public void OnClickirP3(View view){
        Intent i= new Intent(this,Project1.class);
        i.putExtra("value", new String());
        startActivityForResult(i, 3);
    }
    public void OnClickirP4(View view){
        Intent i= new Intent(this,Project1.class);
        i.putExtra("value", new String());
        startActivityForResult(i, 4);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

            if (resultCode ==  RESULT_OK){
                String result= data.getStringExtra("value");
                if(requestCode == 1){
                    resultado1.setText(String.valueOf(result));
                }else{
                    if(requestCode == 2) {
                        resultado2.setText(String.valueOf(result));
                    }else{
                        if(requestCode == 3) {
                            resultado3.setText(String.valueOf(result));
                        }else{
                            resultado4.setText(String.valueOf(result));
                        }
                    }
                }

                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                "La Nota es: " + result, Toast.LENGTH_SHORT);
                toast1.show();
            }

    }


}
