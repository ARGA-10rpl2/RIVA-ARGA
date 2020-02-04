package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;

public class DATA extends AppCompatActivity {
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dat);
        btn =(Button)findViewById(R.id.btn_keluar);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });
    }

    public void pindah(View view) {
        Intent itn = new Intent(DATA.this,HAL2.class);
        startActivities(new Intent[]{itn});

    }
    public void pdh(View view){
        Intent itn2 = new Intent(DATA.this,LOGIN.class);
        startActivities(new Intent[]{itn2});
    }
}
