package com.example.onboarding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.onboarding.databinding.FragmentItemOnBoardingBinding;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends RecyclerView.Adapter<ViewPagerAdapter.ViewHolder> {
    private List<OnBoardModel> list = new ArrayList<>();

    public void setList(List<OnBoardModel> list){
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(FragmentItemOnBoardingBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.binding.txtTitle.setText(list.get(position).getTitle());
        holder.binding.txtDescription.setText(list.get(position).getDescriptiion());
        holder.binding.ivOnBoarding.setImageResource(list.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        FragmentItemOnBoardingBinding binding;
        public ViewHolder(@NonNull FragmentItemOnBoardingBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

        }
    }
}
