package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Register extends AppCompatActivity {
    private EditText etName;
    private EditText Email;
    private EditText Password;
    private TextView info1;
    private TextView info2;
    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        etName=(EditText)findViewById(R.id.editTextTextPersonName4);
        Email=(EditText)findViewById(R.id.editTextTextPersonName5);
        Password=(EditText)findViewById(R.id.editTextTextPersonName6);
        info1=(TextView)findViewById(R.id.textView);
        info2=(TextView)findViewById(R.id.textView2);
        button=(Button)findViewById(R.id.button3);
        Button.SetOnClickListener(new View.OnClickListener(){





            protected void onClick(View v);
            String Name= Name.getText().toString;
            String Email= Email.getText().toString;
            String Password=Password.getText().toString();


            if(Name=="user")

            {
                Toast.makeText(Register.this,"name is Blank.Toast.LENGTH_LONG").
                show();
            }
             if (Email=="")

            {
                Toast.makeText(Register.this, "email is Blank.Toast.LENGTH_LONG").
                SHOW();
            };
              if (Password=="")

            {
                Toast.makeText(Register.this, "Password is Blank.Toast.LENGTH_LONG").
                SHOW();
            }
               .setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent in=new Intent(Rgister.this,GameActivity.class);
                    startActivity(in);
                    finish();

    }
    });
}