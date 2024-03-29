package com.example.lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String Extra_Message = "com.example.lab02";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        EditText editText = (EditText) findViewById(R.id.editTextText);
        String message = editText.getText().toString();
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        intent.putExtra(Extra_Message, message);
        startActivity(intent);
    }
}