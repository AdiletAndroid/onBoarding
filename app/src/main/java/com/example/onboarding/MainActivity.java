package com.example.onboarding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.onboarding.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initViews();

        binding.txtNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.viewPager.setCurrentItem(binding.viewPager.getCurrentItem() + 1);
            }
        });

        binding.txtSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextScreenIntent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(nextScreenIntent);
            }
        });

        new TabLayoutMediator(binding.tabLayout, binding.viewPager, (((tab, position) -> tab.setIcon(R.drawable.selector)))).attach();
    }


    private void initViews() {

        List<OnBoardModel> list = new ArrayList<>();

        list.add(new OnBoardModel("Welcome to Surf.", "I provide essential stuff for your\n" +
                "ui designs every tuesday!", R.drawable.illustration));
        list.add(new OnBoardModel("Design Template uploads\n" +
                "Every Tuesday!", "Make sure to take a look my uplab\n" +
                "profile every tuesday", R.drawable.illustration2));
        list.add(new OnBoardModel("Download now!", "You can follow me if you wantand comment\n" +
                "on any to get some freebies", R.drawable.illustration3));

        ViewPagerAdapter adapter = new ViewPagerAdapter();
        binding.viewPager.setAdapter(adapter);
        adapter.setList(list);

    }

}