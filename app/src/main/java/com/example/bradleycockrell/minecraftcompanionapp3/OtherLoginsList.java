package com.example.bradleycockrell.minecraftcompanionapp3;

import android.os.Bundle;
import android.widget.Button;

public class OtherLoginsList extends MainActivity {

    private Button nintendoNetwork;
    private Button windows10;
    private Button xboxOne;
    private Button psn;
    private Button goBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_other_logins_list);
    }
}
