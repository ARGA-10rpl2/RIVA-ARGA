package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button tombol; // Membuat Variable Button
    Button btn, btn2;
    EditText txtfirstname, txtlastname;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tombol = findViewById(R.id.testing);
        btn = (Button) findViewById(R.id.btn);
        btn2 = (Button)findViewById(R.id.btn2);
        txtfirstname = findViewById(R.id.txt);
        txtlastname = findViewById(R.id.txt2);
        textView = findViewById(R.id.tvname);
        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
               if(txtfirstname.getText().toString().equalsIgnoreCase("arga") || txtfirstname.getText().toString().equalsIgnoreCase("123") ){
                   Toast.makeText(MainActivity.this, "Login sukses", Toast.LENGTH_SHORT).show();
                   Intent in = new Intent(MainActivity.this, HAL2.class);
                   in.putExtra("firstname", txtfirstname.getText().toString());

                   startActivity(in);
               }

            }
        });

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });

        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "DI BILANGI JANGAN DI PENCET NGEYEL", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void pdh(View view) {
        Intent itn = new Intent(MainActivity.this, DATA.class);
        startActivities(new Intent[]{itn});
    }

    public void kembali(View view) {

    }
}

