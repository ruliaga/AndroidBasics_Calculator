package ru.evgenysidorov.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import com.google.android.material.radiobutton.MaterialRadioButton;

public class SettingsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(getAppTheme(R.style.DayTheme));
        setContentView(R.layout.activity_settings);
        initThemeChooser();
        Button buttonBack = findViewById(R.id.backButton);
        initBackButton(buttonBack);
    }
    private void initThemeChooser() {
        initRadioButton(findViewById(R.id.dayThemeRadio),
                DayTheme);
        initRadioButton(findViewById(R.id.nightThemeRadio),
                NightTheme);
        RadioGroup rg = findViewById(R.id.radioGroup);
        ((MaterialRadioButton)rg.getChildAt(getCodeStyle(DayTheme))).setChecked(true);
    }
    private void initRadioButton(View button, final int codeStyle){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAppTheme(codeStyle);
                recreate();
            }
        });

    }
    private void initBackButton(Button btn){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }







}