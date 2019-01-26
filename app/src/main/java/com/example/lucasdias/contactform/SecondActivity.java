package com.example.lucasdias.contactform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getSupportActionBar().setTitle("Contact Form");
        Intent intentObject = getIntent();
        Bundle bundle = intentObject.getExtras();
        String subject = bundle.getString("subjectAnswer");
        String to = bundle.getString("toAnswer");
        String msg = bundle.getString("msgAnswer");
        Log.i("keepMsg","msg: " + msg);

        TextView warning = findViewById(R.id.textView);
        warning.setText("A mensagem com o título '" + subject + "' foi enviada para " + to + " com sucesso.");

    }
}
