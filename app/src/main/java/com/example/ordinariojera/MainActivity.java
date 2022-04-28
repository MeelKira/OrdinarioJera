package com.example.ordinariojera;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        //username:ordinario, contraseña: ordinario

        loginbtn.setOnClickListener(v -> {
            if (username.getText().toString().equals("ordinario") && password.getText().toString().equals("ordinario")) {
                //correct
                Toast.makeText(MainActivity.this, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
            } else
                //incorrect
                Toast.makeText(MainActivity.this, "LOGIN FAILED !!!", Toast.LENGTH_SHORT).show();
        });

       public void Loginbtn(View.view){
           Intent loginbtn = new Intent(this, Productos.class);
           startActivity(loginbtn);
        }


    }


}