package com.example.nasam.choicebeer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    AutoCompleteTextView autotextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        autotextview = (AutoCompleteTextView) findViewById(R.id.name);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = autotextview.getText().toString();
                Intent intent =new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("Name",name);
                startActivity(intent);
            }
        });
    }
}
