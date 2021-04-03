package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class Register extends AppCompatActivity {
    EditText name,email,pass;
    Button Reg;
    TextView lbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentVieRegw(R.layout.activity_register);
        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        pass=findViewById(R.id.pass);
        lbtn=findViewById(R.id.lbtn);

        Reg=findViewById(R.id.login);
        Reg.SetOnClickListener(new View.OnClickListener(){
        @Override
        protected void onClick(View v)
         String name,email,pass;

            name= name.getText().toString;
            mail= email.getText().toString;
            pas=pass.getText().toString();

            if (name.equals(""))

            {
                Toast.makeText(context :Register.this, resid:"name is Blank.Toast.LENGTH_LONG").
                SHOW();
            }
             if (mail.equals(""))

            {
                Toast.makeText(context :Register.this, resid:"email is Blank.Toast.LENGTH_LONG").
                SHOW();
            }
              if (pass.equals(""))

            {
                Toast.makeText(context :Register.this, resid:"Password is Blank.Toast.LENGTH_LONG").
                SHOW();
            }
               lbtn.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent i=new Intent(packageContext:Rgister.this,GameActivity.class);
                    startActivity(i);
                    finish();

    }
    });
}