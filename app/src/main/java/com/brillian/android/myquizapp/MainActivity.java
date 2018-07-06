package com.brillian.android.myquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //global variables
    RadioGroup radioGroup;
    RadioButton selectedRadioButton;
    Button buttonSubmit;
    CheckBox cb1, cb2, cb3, cb4;
    EditText editName, editPassword;
    TextView result;
    Button Submit, buttonReset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonSubmit = (Button) findViewById(R.id.btnSubmit);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        cb1 = (CheckBox) findViewById(R.id.cb1);
        cb2 = (CheckBox) findViewById(R.id.cb2);
        cb3 = (CheckBox) findViewById(R.id.cb3);
        cb4 = (CheckBox) findViewById(R.id.cb4);
        editName  = (EditText) findViewById(R.id.editName);
        result = (TextView) findViewById(R.id.tvResult);
        buttonSubmit = (Button) findViewById(R.id.btnSubmit);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // get text from EditText name view
                String name = editName.getText().toString();
                result.setText("Name:\t" + name );
                //GetSelectedButton
                selectedRadioButton  = (RadioButton)findViewById(radioGroup.getCheckedRadioButtonId());
                //getRadioButton text
                String yourVote = selectedRadioButton.getText().toString();
                Toast.makeText(MainActivity.this, "Selected Radio Button is:" + yourVote , Toast.LENGTH_LONG).show();
                String checkBoxChoices = "";

                if (cb1.isChecked()) {
                    checkBoxChoices += cb1.getText().toString() + "\tYES";
                }
                else{
                    checkBoxChoices += cb1.getText().toString() + "\tNO";
                }

                if (cb2.isChecked()) {
                    checkBoxChoices += cb2.getText().toString() + "\tYES";
                }
                else{
                    checkBoxChoices += cb2.getText().toString() + "\tNO";
                }

                if (cb3.isChecked()) {
                    checkBoxChoices += cb3.getText().toString() + "\tYES";
                }
                else{
                    checkBoxChoices += cb3.getText().toString() + "\tNO";
                }

                if (cb4.isChecked()) {
                    checkBoxChoices += cb4.getText().toString() + "\tYES";
                }
                else{
                    checkBoxChoices += cb4.getText().toString() + "\tNO";
                }

                Toast.makeText(MainActivity.this, "Selected Check Box is:" + yourVote +"\n Checkbox Choices: \n" +checkBoxChoices, Toast.LENGTH_LONG).show();
            }
        });
    }


    }
