package com.vitalytyrenko.dialogsandnotifications;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class DialogActivity extends AppCompatActivity {

    public final static String TITLE_TEXT = "TITLE_TEXT";
    public final static String DESCRIPTION_TEXT = "DESCRIPTION_TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void buttonCancelClicked(View view) {
        setResult(RESULT_CANCELED);
        finish();
    }

    public void buttonNotifyClicked(View view) {
        EditText editTextTitle = findViewById(R.id.edittext_title);
        EditText editTextDescription = findViewById(R.id. edittext_description);

        Intent intent = new Intent();
        intent.putExtra(TITLE_TEXT, editTextTitle.getText().toString());
        intent.putExtra(DESCRIPTION_TEXT, editTextDescription.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }

}
