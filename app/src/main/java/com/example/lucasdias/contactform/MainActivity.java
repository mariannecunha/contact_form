package com.example.lucasdias.contactform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Contact Form");
        intent = new Intent(this, SecondActivity.class);

        Button conectActivityButton = findViewById(R.id.button);
        conectActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                EditText subject = findViewById(R.id.editText2);

                String subjectText = subject.getText().toString();
                bundle.putString("subjectAnswer", subjectText);
                EditText to = findViewById(R.id.editText1);
                String toText = to.getText().toString();
                bundle.putString("toAnswer", toText);
                EditText msg = findViewById(R.id.editText5);
                String msgText = msg.getText().toString();
                bundle.putString("msgAnswer", msgText);
                intent.putExtras(bundle);

                startActivity(intent);

            }
        });
    }
}
