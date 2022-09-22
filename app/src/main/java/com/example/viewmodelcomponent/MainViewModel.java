package com.example.viewmodelcomponent;


import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    // variable to store count value
    private int count = 0;

    public String getCountVal() {
        return Integer.toString(count);
    }

    public void incrementCountVal() {
        count++;
    }
}
