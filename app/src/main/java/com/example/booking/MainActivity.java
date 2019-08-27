package com.example.booking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText from;
    private EditText to;
    private EditText date;
    private EditText name;
    private RadioGroup radioGroup;
    private RadioButton student;
    private RadioButton defence;
    private RadioButton senior;
    private Button submit;
    private TextView tv;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private TextView tv5;
    private TextView tv6;
    private TextView tv7;
    private TextView tv8;
    private TextView tv9;
    private TextView tv10;
    String Type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        from = (EditText) findViewById(R.id.et1);
        to = (EditText) findViewById(R.id.et2);
        date = (EditText) findViewById(R.id.et3);
        name = (EditText) findViewById(R.id.et4);
        student = (RadioButton) findViewById(R.id.radioButton);
        defence = (RadioButton) findViewById(R.id.radioButton2);
        senior = (RadioButton) findViewById(R.id.radioButton3);
        submit = (Button) findViewById(R.id.button);
        tv = (TextView) findViewById(R.id.textView5);
        tv1 = (TextView) findViewById(R.id.textView);
        tv2 = (TextView) findViewById(R.id.textView6);
        tv3 = (TextView) findViewById(R.id.textView7);
        tv4 = (TextView) findViewById(R.id.textView8);
        tv5 = (TextView) findViewById(R.id.textView9);
        tv6 = (TextView) findViewById(R.id.textView10);
        tv7 = (TextView) findViewById(R.id.textView11);
        tv8 = (TextView) findViewById(R.id.textView12);
        tv9 = (TextView) findViewById(R.id.textView13);
        tv10 = (TextView) findViewById(R.id.textView14);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check();
                capture(from.getText().toString(),to.getText().toString(),date.getText().toString(),name.getText().toString());
            }
        });
    }
    private void capture(String From,String To,String Date,String Name)
    {
        tv.setText("Ticket Details:");
        tv1.setText("Name");
        tv6.setText(Name);
        tv2.setText("Date");
        tv7.setText(String.valueOf(Date));
        tv3.setText("Ticketing type");
        tv4.setText("Boarding At");
        tv9.setText(From);
        tv5.setText("Arrival At");
        tv10.setText(To);
    }
    public void check(){
        if(student.isChecked()){
            Type = student.getText().toString();
        }
        else if(defence.isChecked()){
            Type = defence.getText().toString();
        }
        else if(senior.isChecked()){
            Type = senior.getText().toString();
        }
        tv8.setText(Type);
    }

}
