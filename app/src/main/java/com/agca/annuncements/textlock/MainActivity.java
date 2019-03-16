package com.agca.annuncements.textlock;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView btnEncrypt = findViewById(R.id.btnEncrypt);
        ImageView btnDecrypt = findViewById(R.id.btnDecrypt);


        btnEncrypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent encrypt = new Intent(getApplicationContext(), EncryptActivity.class);
                    startActivity(encrypt);

                } catch (Exception e) {
                    Toast.makeText(getBaseContext(), e.toString(), Toast.LENGTH_LONG).show();
                }
            }
        });


        btnDecrypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent decrypt = new Intent(getApplicationContext(), DecryptActivity.class);
                    startActivity(decrypt);
                    finish();

                } catch (Exception e) {
                    Toast.makeText(getBaseContext(), e.toString(), Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}
