package com.example.rahulprajapati.higherlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.number);
    }

    public void check(View view) {

        Double doublenumber = Double.parseDouble(editText.getText().toString());
        Random rand = new Random();
        int  n = rand.nextInt(20) + 1;
        if(doublenumber>n){
            Toast.makeText(this,"Higher!",Toast.LENGTH_LONG).show();
        }else if(doublenumber<n){
            Toast.makeText(this,"Lower!",Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this,"Try!",Toast.LENGTH_LONG).show();
        }

    }
}
