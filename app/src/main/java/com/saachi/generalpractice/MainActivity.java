package com.saachi.generalpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View v){
        switch(v.getId()){
            case R.id.btn1: {
                Toast.makeText(MainActivity.this, "Button 1", Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.btn2: {
                Toast.makeText(MainActivity.this, "Button 2", Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.btn3: {
                Toast.makeText(MainActivity.this, "Button 3", Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.btn4: {
                Toast.makeText(MainActivity.this, "Button 4", Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.btn5: {
                Toast.makeText(MainActivity.this, "Button 5", Toast.LENGTH_LONG).show();
                break;
            }
        }
    }
}
