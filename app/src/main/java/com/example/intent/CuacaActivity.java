package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CuacaActivity extends AppCompatActivity {
    Button btn_list, btn_login, btn_ui, btn_abc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuaca);

        btn_list =(Button)findViewById(R.id.btn_listview);
        btn_ui =(Button)findViewById(R.id.btn_inputUser);
        btn_login =(Button)findViewById(R.id.btn_login);
        btn_abc =(Button)findViewById(R.id.btn_abc);


        btn_ui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(CuacaActivity.this, InputUserActivity.class);
                startActivity(move);
            }
        });


        btn_abc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(CuacaActivity.this, abcActivity.class);
                startActivity(move);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(CuacaActivity.this, MainActivity.class);
                startActivity(move);
            }
        });

        btn_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(CuacaActivity.this, ListViewActivity.class);
                startActivity(move);
            }
        });
    }
}
