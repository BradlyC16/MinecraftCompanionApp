package com.example.bradleycockrell.minecraftcompanionapp3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
    }
}
