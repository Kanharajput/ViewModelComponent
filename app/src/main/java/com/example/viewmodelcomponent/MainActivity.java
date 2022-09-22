package com.example.viewmodelcomponent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// normally we use model to create tables in database
// here viewmodel is used to store data related with view only
// viewmodel is also lifecycle aware

// now if change the orientation then also count value will not change
// because it is save in viewmodel

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView count_displayer;
    MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        // get the ViewModel
        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        count_displayer = findViewById(R.id.countDisplayerTxt);
        count_displayer.setText(mainViewModel.getCountVal());      // set the current value of count

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainViewModel.incrementCountVal();          // this will increment count value
                count_displayer.setText(mainViewModel.getCountVal());      // set the current value of count
            }
        });
    }
}