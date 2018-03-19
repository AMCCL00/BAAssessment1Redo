package com.example.rodneytressler.week1assessment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    private Button mButton;
    private EditText mEditText;
    private Button bonusButton;
    private String textInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.text_view);
        mButton = findViewById(R.id.button_submit);
        mEditText = findViewById(R.id.edit_text);


        setclickListener();
        setClickListener();
    }

    private void setclickListener() {
        bonusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AndroidActivity.class);
                startActivity(intent);
            }
        });

    }

    private void setClickListener() {
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textInput = mEditText.getText().toString();
                mTextView.setText(textInput);
                mEditText.setText("");
            }
        });


    }
}
