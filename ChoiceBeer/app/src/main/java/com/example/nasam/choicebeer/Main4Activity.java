package com.example.nasam.choicebeer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Intent intent = getIntent();
        final String name = intent.getStringExtra("Name");
        final String kind = intent.getStringExtra("Kind");
        final String bit = intent.getStringExtra("Bit");

        textView = findViewById(R.id.result);
        button = findViewById(R.id.comeback);
        textView.setText(name + "님은 " + bit + " " + kind + " 를 좋아하시는군요 찾아서 맛있게 드세요");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
}
