package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.net.sip.SipSession;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
       EditText Email,Password;
       Button Login,Register;
       TextView btn;



       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email=findViewById(R.id.Email);
        pass=findViewById(R.id.Password);

        login=findViewById(R.id.Login);


         login.SetOnClickListener(new View.OnClickListener(){
         @Override
             public void onClick(View v){
             String mail,pass;
             mail= Email.getText().toString;
             pass=Password.getText().toString();
             btn=btn.getText().toString();


             if (mail.equals("")) {
                 Toast.makeText( MainActivity.this,"Email is Blank.Toast.LENGTH_LONG").show();
             }
             else if (pas.equals("")) {
                 Toast.makeText( MainActivity.this,"Password is Blank.Toast.LENGTH_LONG").show();
         }
             else{
             };
         Register.setOnClickListener(new View.OnClickListener(){
             @Override
             public void onClick(View v){
                 Intent i=new Intent(MainActivity.this,Register.class);
                 startActivity(i);
                 finish();

             }
         });


         }
