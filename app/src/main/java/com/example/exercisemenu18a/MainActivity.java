package com.example.exercisemenu18a;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Display;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button btn;

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        username = (EditText) findViewById(R.id.editUN);
        password = (EditText) findViewById(R.id.editPass);
        btn = (Button) findViewById(R.id.btnok);

        final EditText username = (EditText) findViewById(R.id.editUN);
        final EditText password = (EditText) findViewById(R.id.editPass);
        Button login = (Button) findViewById(R.id.btnok);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user_name = username.getText().toString();
                String pass_ = password.getText().toString();
                if (user_name.equals("admin") && pass_.equals("123")) {
                    startActivity(new Intent(MainActivity.this, SecondActivity.class));
                    Toast.makeText(getApplicationContext(), "LOGIN SUKSES",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Username dan Password Anda Salah!",
                            Toast.LENGTH_SHORT).show();


                }

            }
        });

    }

//    public void Pindah(View view) {
//        Intent intent = new Intent(MainActivity.this, Menu.class);
//        startActivity(intent);
//    }

//    public void onClick(View view) {
//        startActivity(new Intent(MainActivity.this, ActivityYgDituju.class));
//    }
}