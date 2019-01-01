package com.example.nasam.choicebeer;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    Button button1;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent =getIntent();
        final String name = intent.getStringExtra("Name");
        final String kind = intent.getStringExtra("Kind");
        button1 = (Button)findViewById(R.id.bitter);
        button2 = (Button)findViewById(R.id.nonbitter);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Main3Activity.this,Main4Activity.class);
                intent.putExtra("Name",name);
                intent.putExtra("Kind",kind);
                intent.putExtra("Bit","쓴");
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Main3Activity.this,Main4Activity.class);
                intent.putExtra("Name",name);
                intent.putExtra("Kind",kind);
                intent.putExtra("Bit","안 쓴");
                startActivity(intent);
            }
        });
    }

}
