package com.example.viewmodelcomponent;

/*Why do we need ViewModelFactory
* Because ViewModelProvide only sending us the ViewModel
* We are not creating that ViewModel so we can't do anythink with that ViewModel.
* But by using ViewModelFactory we can send data to ViewModelFactory
* and according to that we get the ViewModel.
* For Example we want to start the counter from a user prefered value
* but there is no thing through which we can initialise the counter value in ViewModel=
 */

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class MainViewModelFactory implements ViewModelProvider.Factory {
    int counter;

    public MainViewModelFactory(int counter) {
        this.counter = counter;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new MainViewModel(counter);
    }
}
