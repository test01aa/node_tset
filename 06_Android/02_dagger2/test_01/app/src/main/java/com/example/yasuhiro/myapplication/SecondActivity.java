package com.example.yasuhiro.myapplication;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import butterknife.Bind;

import javax.inject.Inject;

import butterknife.ButterKnife;

/**
 * Created by yasuhiro on 18/01/04.
 */

public class SecondActivity extends Activity {
    @Inject
    WeatherFacade facade;

    @Bind(R.id.editText)
    EditText editText;

    @Bind(R.id.button)
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);

        getApplicationComponent().inject(this);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                facade.fetchWeather(editText.getText().toString());
            }
        });

    }

    private AppComponent getApplicationComponent() {
        return ((AppApplication)getApplication()).getApplicationComponent();
    }
}

