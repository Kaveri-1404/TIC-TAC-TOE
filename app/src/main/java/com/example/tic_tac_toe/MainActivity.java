package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.net.sip.SipSession;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
       EditText email,pass;
       Button login,Register;
       TextView btn;



       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email=findViewById(R.id.email);
        pass=findViewById(R.id.pass);

        login=findViewById(R.id.login);


         login.SetOnClickListener(new View.OnClickListener(){
         @Override
             public void onClick(View v){
             String mail,pas;
             mail= email.getText().toString;
             pass=pass.getText().toString();
             btn=btn.getText().toString();


             if (mail.equals("")) {
                 Toast.makeText(context : MainActivity.this, resid:"Email is Blank.Toast.LENGTH_LONG").SHOW();
             }
             else if (pas.equals("")) {
                 Toast.makeText(context : MainActivity.this, resid:"Password is Blank.Toast.LENGTH_LONG").SHOW();
         }
             else{
             });
         Register.setOnClickListener(new View.OnClickListener(){
             @Override
             public void onClick(View v){
                 Intent i=new Intent(packageContext:MainActivity.this,Register.class);
                 startActivity(i);
                 finish();

             }
         }

         });
}