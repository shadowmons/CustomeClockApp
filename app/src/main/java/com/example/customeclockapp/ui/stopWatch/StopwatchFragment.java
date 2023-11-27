package com.example.customeclockapp.ui.stopWatch;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.customeclockapp.databinding.FragmentStopwatchBinding;

public class StopwatchFragment extends Fragment {

    private FragmentStopwatchBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        StopwatchViewModel stopwatchViewModel =
                new ViewModelProvider(this).get(StopwatchViewModel.class);

        binding = FragmentStopwatchBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textStopwatch;
        stopwatchViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}