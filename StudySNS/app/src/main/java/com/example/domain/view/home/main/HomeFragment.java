package com.example.domain.view.home.main;

import android.view.View;
import android.widget.Button;

import com.example.asset.domain.AbstractFragment;
import com.example.domain.view.home.setting.R;

public class HomeFragment extends AbstractFragment {

    // Associate
        // View
        private Button loginButton, settingButton, MenuButton;

    @Override protected int getViewId() { return R.layout.fragment_home; }

    @Override
    protected void associateView(View view) {
        this.loginButton = view.findViewById(R.id.loginButton);
        this.settingButton = view.findViewById(R.id.settingButton);
        this.MenuButton = view.findViewById(R.id.menu1);
    }

    @Override
    protected void initialize() {
        this.loginButton.setOnClickListener(v -> this.navigateTo(R.id.action_homeFragment_to_loginFragment));
        this.settingButton.setOnClickListener(v -> this.navigateTo(R.id.action_homeFragment_to_settingsFragment));
        this.MenuButton.setOnClickListener(v -> this.navigateTo(R.id.action_homeFragment_to_home_Communtiy));
    }
}