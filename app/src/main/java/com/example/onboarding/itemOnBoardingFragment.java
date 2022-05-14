package com.example.onboarding;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.onboarding.databinding.FragmentItemOnBoardingBinding;
import com.google.android.material.tabs.TabLayoutMediator;


public class itemOnBoardingFragment extends Fragment {
    private FragmentItemOnBoardingBinding binding;

    private static final String ARG_TITLE = "title";
    private static final String ARG_DESCRIPTION = "description";
    private static final String ARG_ILLUSTRATION = "illustration";


    private String title;
    private String description;
    private int illustration;

    public itemOnBoardingFragment() {

    }


    public static itemOnBoardingFragment newInstance(String title, String description, int illustration) {
        itemOnBoardingFragment fragment = new itemOnBoardingFragment();

        Bundle args = new Bundle();
        args.putString(ARG_TITLE, title);
        args.putString(ARG_DESCRIPTION, description);
        args.putInt(ARG_ILLUSTRATION, illustration);
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            title = getArguments().getString(ARG_TITLE);
            description = getArguments().getString(ARG_DESCRIPTION);
            illustration = getArguments().getInt(ARG_ILLUSTRATION);
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentItemOnBoardingBinding.inflate(inflater);
        binding.txtTitle.setText(title);
        binding.txtDescription.setText(description);
        binding.ivOnBoarding.setImageResource(illustration);
        return binding.getRoot();

    }
}