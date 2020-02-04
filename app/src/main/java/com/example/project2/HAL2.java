 package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.inputmethodservice.ExtractEditText;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HAL2 extends AppCompatActivity implements View.OnClickListener {
    Button kali, bagi, tambah, kurang, balik;
    EditText ET1, ET2;
    Integer angka1, angka2, hasil;
    String sa1, sa2;
    TextView tvh, tvuser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal2);
        kali = findViewById(R.id.kali);
        bagi = findViewById(R.id.bagi);
        tambah = findViewById(R.id.tambah);
        kurang = findViewById(R.id.kurang);
        tvh =findViewById(R.id.TV);
        ET1 = findViewById(R.id.ET1);
        ET2 = findViewById(R.id.ET2);
        tvuser = findViewById(R.id.tvuser);
        kali.setOnClickListener(this);
        bagi.setOnClickListener(this);
        tambah.setOnClickListener(this);
        kurang.setOnClickListener(this);

        String username;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                username = "ini kosong";
            } else {
                username = extras.getString("firstname");
            }
        }else
        {
            username = (String) savedInstanceState.getSerializable("firstname");
        }

        tvuser.setText("HALO " + username);

    }
    public void onClick(View view) {
    switch(view.getId()){
        case R.id.kali:
            sa1=ET1.getText().toString();
            sa2=ET2.getText().toString();
            angka1=Integer.parseInt(sa1);
            angka2=Integer.parseInt(sa2);
            tvh.setText("Hasil "+(angka1*angka2));
            break;
        case R.id.bagi:
            sa1=ET1.getText().toString();
            sa2=ET2.getText().toString();
            angka1=Integer.parseInt(sa1);
            angka2=Integer.parseInt(sa2);
            tvh.setText("hasil"+(angka1/angka2));
            break;
        case R.id.tambah:
            sa1=ET1.getText().toString();
            sa2=ET2.getText().toString();
            angka1=Integer.parseInt(sa1);
            angka2=Integer.parseInt(sa2);
            tvh.setText("hasil"+(angka1+angka2));
            break;
        case R.id.kurang:
            sa1=ET1.getText().toString();
            sa2=ET2.getText().toString();
            angka1=Integer.parseInt(sa1);
            angka2=Integer.parseInt(sa2);
            tvh.setText("hasil"+(angka1-angka2));
            break;


    }
    }
}
