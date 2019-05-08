package com.example.justsimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button submit;
        final EditText name ,age;
        name = (EditText) findViewById(R.id.name_editText);
        age = (EditText) findViewById(R.id.age_editText);
        submit=(Button) findViewById(R.id.button_view);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(name.getText().toString().isEmpty()||age.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"enter the data",Toast.LENGTH_SHORT).show();
                }else {
                    TextView output = (TextView) findViewById(R.id.output_view);
                    String myName = name.getText().toString();
                    String  myAge = age.getText().toString();
                    int finalage =Integer.parseInt(myAge);

                    String myInformation = "Name: " +myName +"\nage: " +finalage;
                    output.setText(myInformation);

                }
            }
        });

    }
}
