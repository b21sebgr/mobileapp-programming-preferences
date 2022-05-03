package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private SharedPreferences.Editor myPreferenceEditor;
    private EditText input;
    private Button setPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        myPreferenceEditor = getSharedPreferences("myPrefs", MODE_PRIVATE).edit();

        input = findViewById(R.id.input_view);
        setPref = findViewById(R.id.set_pref);
        setPref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPreferenceEditor.putString("TextPref", input.getText().toString());
                myPreferenceEditor.commit();
            }
        });
    }
}