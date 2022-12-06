package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class second extends AppCompatActivity {
 TextView name,no,email,location,home,dob,gender,twon,xll,x,lfa,csw,pl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        name=findViewById(R.id.name);
        no=findViewById(R.id.no);
        email=findViewById(R.id.email);
        location=findViewById(R.id.location);
        home=findViewById(R.id.home);
        dob=findViewById(R.id.dob);
        gender=findViewById(R.id.gender);
        twon=findViewById(R.id.twon);
        xll=findViewById(R.id.xll);
        x=findViewById(R.id.x);
        lfa=findViewById(R.id.lfa);
        csw=findViewById(R.id.csw);
        pl=findViewById(R.id.pl);


        String Name=getIntent().getStringExtra("name");
        String No=getIntent().getStringExtra("no");
        String Email=getIntent().getStringExtra("email");
        String Location=getIntent().getStringExtra("location");
        String Home=getIntent().getStringExtra("home");
        String Dob=getIntent().getStringExtra("dob");
        String Gender=getIntent().getStringExtra("gender");
        String Twon=getIntent().getStringExtra("twon");
        String Xll=getIntent().getStringExtra("xll");
        String X=getIntent().getStringExtra("x");
        String Lfa=getIntent().getStringExtra("lfa");
        String Csw=getIntent().getStringExtra("csw");
        String Pl=getIntent().getStringExtra("pl");


        name.setText(""+Name);
        no.setText(""+No);
        email.setText(""+Email);
        location.setText(""+Location);
        home.setText(""+Home);
        dob.setText(""+Dob);
        gender.setText(""+Gender);
        twon.setText(""+Twon);
        xll.setText(""+Xll);
        x.setText(""+X);
        lfa.setText(""+Lfa);
        csw.setText(""+Csw);
        pl.setText(""+Pl);

    }
}