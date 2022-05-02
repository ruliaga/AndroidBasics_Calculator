package ru.evgenysidorov.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private TextView calcDisplay;
    private Buttons buttons;//инициализируем экземпляр класса Buttons
    private final static String keyButtons = "Buttons";// переменная для сериализации

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttons = new Buttons(); //создаем экземпляр класса Buttons
        initView();
    }

    private void initView() {// инициализируем по ID текст вью
        calcDisplay = findViewById(R.id.calcDisplay);
        initButton1ClickListener();
        initButton2ClickListener();
        initButton3ClickListener();
        initButton4ClickListener();
        initButton5ClickListener();
        initButton6ClickListener();
        initButton7ClickListener();
        initButton8ClickListener();
        initButton9ClickListener();
        initButton0ClickListener();
        initButtonRavnoClickListener();
        initButtonPlusClickListener();
        initButtonMinusClickListener();
        initButtonUmnozhClickListener();
        initButtonDelenieClickListener();
        initButtonDotClickListener();

    }

    private void initButton1ClickListener() { // слушатель для Button1
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDisplayText(buttons.getButton1());
            }
        });

    }


    private void initButton2ClickListener() { // слушатель для Button3
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDisplayText(buttons.getButton2());
            }
        });

    }

    private void initButton3ClickListener() { // слушатель для Button3
        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDisplayText(buttons.getButton3());
            }
        });

    }


    private void initButton4ClickListener() {
        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDisplayText(buttons.getButton4());
            }
        });
    }
    private void initButton5ClickListener() {
        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDisplayText(buttons.getButton5());
            }
        });
    }
    private void initButton6ClickListener() {
        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDisplayText(buttons.getButton6());
            }
        });
    }
    private void initButton7ClickListener() {
        Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDisplayText(buttons.getButton7());
            }
        });
    }
    private void initButton8ClickListener() {
        Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDisplayText(buttons.getButton8());
            }
        });
    }
    private void initButton9ClickListener() {
        Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDisplayText(buttons.getButton9());
            }
        });
    }
    private void initButton0ClickListener() {
        Button button0 = findViewById(R.id.button0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDisplayText(buttons.getButton0());
            }
        });
    }
    private void initButtonRavnoClickListener() {
        Button buttonRavno = findViewById(R.id.buttonRavno);
        buttonRavno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDisplayTextString(buttons.getButtonRavno());
            }
        });
    }
    private void initButtonPlusClickListener() {
        Button buttonPlus = findViewById(R.id.buttonPlus);
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDisplayTextString(buttons.getButtonPlus());
            }
        });
    }
    private void initButtonMinusClickListener() {
        Button buttonMinus = findViewById(R.id.buttonMinus);
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDisplayTextString(buttons.getButtonMinus());
            }
        });
    }
    private void initButtonUmnozhClickListener() {
        Button buttonUmnozh = findViewById(R.id.buttonUmnozh);
        buttonUmnozh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDisplayTextString(buttons.getButtonUmnozh());
            }
        });
    }
    private void initButtonDelenieClickListener() {
        Button buttonDelenie = findViewById(R.id.buttonDelenie);
        buttonDelenie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDisplayTextString(buttons.getButtonDelenie());
            }
        });
    }
    private void initButtonDotClickListener() {
        Button buttonDot = findViewById(R.id.buttonDot);
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDisplayTextString(buttons.getButtonDot());
            }
        });
    }

    private void setDisplayText(int button) {
        calcDisplay.setText(String.format(Locale.getDefault(), "%d", button));

    }
    private void setDisplayTextString(String button) {
        calcDisplay.setText(String.format(Locale.getDefault(), "%s", button));
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle instanceState) {
        super.onSaveInstanceState(instanceState);
        instanceState.putSerializable(keyButtons,buttons);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle instanceState) {
        super.onRestoreInstanceState(instanceState);
        buttons = (Buttons) instanceState.getSerializable(keyButtons);
        setDisplayTexts();

    }
    private void setDisplayTexts(){
        setDisplayText(buttons.getButton1());
        setDisplayText(buttons.getButton2());
        setDisplayText(buttons.getButton3());
        setDisplayText(buttons.getButton4());
        setDisplayText(buttons.getButton5());
        setDisplayText(buttons.getButton6());
        setDisplayText(buttons.getButton7());
        setDisplayText(buttons.getButton8());
        setDisplayText(buttons.getButton9());
        setDisplayText(buttons.getButton0());
        setDisplayTextString(buttons.getButtonPlus());
        setDisplayTextString(buttons.getButtonMinus());
        setDisplayTextString(buttons.getButtonPlus());
        setDisplayTextString(buttons.getButtonMinus());
        setDisplayTextString(buttons.getButtonPlus());
        setDisplayTextString(buttons.getButtonMinus());

    }

}

