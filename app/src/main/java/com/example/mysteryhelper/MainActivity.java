package com.example.mysteryhelper;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mysteryhelper.databinding.ActivityMainBinding;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    // String array member variable for suggestions
    private String[] list;
    // TextView member variable for displaying suggestions
    private TextView suggestionLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        // instantiate our member variables
        list = getResources().getStringArray(R.array.suggestions);
        suggestionLabel = binding.suggestionLabel;
    }

    // Event handling method for button press
    public void onClickButton(View v){
        pickSuggestion();
    }

    // Method to pick a random suggestion from our list
    public void pickSuggestion(){
        int index = (int) Math.floor(Math.random() * list.length);
        suggestionLabel.setText(list[index]);
    }
}