package com.a1.praktikum.praktikum_struktur_data;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Scanner;





public class MainActivity extends AppCompatActivity {

    Button klick;
    EditText nama;
    EditText tgl;
    EditText no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        klick = (Button) findViewById(R.id.klik);
        klick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = (EditText) findViewById(R.id.nama);
                tgl = (EditText) findViewById(R.id.tgl_lahir);
                no = (EditText) findViewById(R.id.no_tlp);
                Toast.makeText(MainActivity.this, nama.getText().toString() + "\n" + tgl.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
