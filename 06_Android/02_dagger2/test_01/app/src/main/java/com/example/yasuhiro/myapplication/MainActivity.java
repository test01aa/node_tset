package com.example.yasuhiro.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.yasuhiro.myapplication.di.AppComponent;
import butterknife.Bind;
import javax.inject.Inject;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {
    @Inject
    WeatherFacade facade;

    @Bind(R.id.editText)
    EditText editText;

    @Bind(R.id.button)
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        getApplicationComponent().inject(this);
    }

    @OnClick(R.id.button)
    void aaa(){
        facade.fetchWeather(editText.getText().toString());
    }

    private AppComponent getApplicationComponent() {
        return ((AppApplication)getApplication()).getApplicationComponent();
    }
}

