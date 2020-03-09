package com.example.apap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.apap.R.layout.activity_add_card;

public class AddCardActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(activity_add_card);


        findViewById(R.id.cancelButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        findViewById(R.id.saveButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            String newQuestion = ((EditText) findViewById(R.id.questionInput)).getText().toString(); // create a new Intent, this is where we will put our data
                String newAnswer = ((EditText) findViewById(R.id.questionAnswer)).getText().toString();
                Intent data = new Intent();
            data.putExtra("string1", newQuestion); // puts one string into the Intent, with the key as 'string1'
            data.putExtra("string2", newAnswer); // puts another string into the Intent, with the key as 'string2
            setResult(RESULT_OK, data); // set result code and bundle data for response
            finish();
    }
});





    }
}