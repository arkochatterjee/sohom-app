package org.envision.oiarki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mButton, mButton2, mButton3, mButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mButton = findViewById(R.id.button1);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Do so
                String buttonText = mButton.getText().toString();
                Intent intent = new Intent(MainActivity.this, soham.class);
                intent.putExtra("key",buttonText);
                startActivity(intent);

            }
        });


        mButton2 = findViewById(R.id.button2);
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Do so
                String buttonText = mButton2.getText().toString();
                Intent intent = new Intent(MainActivity.this, soham.class);
                intent.putExtra("key",buttonText);
                startActivity(intent);

            }
        });


        mButton3 = findViewById(R.id.button3);
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Do so
                String buttonText = mButton3.getText().toString();
                Intent intent = new Intent(MainActivity.this, soham.class);
                intent.putExtra("key",buttonText);
                startActivity(intent);

            }
        });


        mButton4 = findViewById(R.id.button4);
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Do so
                String buttonText = mButton4.getText().toString();
                Intent intent = new Intent(MainActivity.this, soham.class);
                intent.putExtra("key",buttonText);
                startActivity(intent);

            }
        });


    }
}

