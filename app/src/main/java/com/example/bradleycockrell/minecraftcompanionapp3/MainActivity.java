package com.example.bradleycockrell.minecraftcompanionapp3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button loginButton1;
    private Button otherButton;
    public EditText pcPassword;
    public EditText mcUsernameOrEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton1 = findViewById(R.id.login_button1);
        otherButton = findViewById(R.id.other_logins_button);
        pcPassword = findViewById(R.id.pc_password);
        mcUsernameOrEmail = findViewById(R.id.mc_username_or_email);

        setListener();
        
    }

    private void setListener() {

        loginButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void
//    TODO try to figure of how to do a account logins
}
