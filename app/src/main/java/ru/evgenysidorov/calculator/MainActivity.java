package ru.evgenysidorov.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private TextView calcDisplayInput;
    private TextView calcDisplayResult;
    double argument1;
    double argument2;
    double result;
    private static String parcelable_key;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {// инициализируем по ID все вью
        calcDisplayInput = findViewById(R.id.calcDisplayInput);
        calcDisplayResult = findViewById(R.id.calcDisplayResult);
        Button button0=findViewById(R.id.button0);
        Button button1=findViewById(R.id.button1);
        Button button2=findViewById(R.id.button2);
        Button button3=findViewById(R.id.button3);
        Button button4=findViewById(R.id.button4);
        Button button5=findViewById(R.id.button5);
        Button button6=findViewById(R.id.button6);
        Button button7=findViewById(R.id.button7);
        Button button8=findViewById(R.id.button8);
        Button button9=findViewById(R.id.button9);
        Button buttonDot=findViewById(R.id.buttonDot);
        Button buttonDelenie=findViewById(R.id.buttonDelenie);
        Button buttonUmnozh=findViewById(R.id.buttonUmnozh);
        Button buttonPlus=findViewById(R.id.buttonPlus);
        Button buttonMinus=findViewById(R.id.buttonMinus);
        Button buttonRavno=findViewById(R.id.buttonRavno);
        Button buttonSbros=findViewById(R.id.buttonSbros);


        initButtonOperator(buttonPlus); //запускаем методы обработки нажатий кнопок
        initButtonOperator(buttonMinus);
        initButtonOperator(buttonUmnozh);
        initButtonOperator(buttonDelenie);
        initButtonOperator(buttonDot);
        initButtonNumber(button0);
        initButtonNumber(button1);
        initButtonNumber(button2);
        initButtonNumber(button3);
        initButtonNumber(button4);
        initButtonNumber(button5);
        initButtonNumber(button6);
        initButtonNumber(button7);
        initButtonNumber(button8);
        initButtonNumber(button9);
        initSbrosButton(buttonSbros);
        initRavnoButton(buttonRavno);


    }

    private void initButtonNumber(Button btn) {//нажатие числовых кнопок
        btn.setOnClickListener(v -> calcDisplayInput.setText((calcDisplayInput.getText())+String.valueOf(btn.getText())));

    }

    private void initButtonOperator (Button btn){// нажатие кнопок операторов + точка
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence chs = calcDisplayInput.getText();

                if (chs.length()==0){
                    calcDisplayInput.setText(String.valueOf(""));
                    } else {
                    calcDisplayInput.setText(calcDisplayInput.getText()+String.valueOf(btn.getText()));
                }
            }
        });


    }





    private void initSbrosButton  (Button btn){ //нажатие кнопки сброс
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcDisplayInput.setText(String.valueOf(""));
                calcDisplayResult.setText(String.valueOf(""));
            }
        });
    }


    private void initRavnoButton (Button btn){ //нажатие кнопки равно


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence chs;
                chs = calcDisplayInput.getText();

                int ichs = 0;
                for (int i = 0; i < chs.length(); i++) {
                    if ((chs.charAt(i)) == '+' ||
                            chs.charAt(i) == '-' ||
                            chs.charAt(i) == 'x' ||
                            chs.charAt(i) == '/') {
                        ichs = i;
                    }
                }
                argument1 = Double.parseDouble(String.valueOf(chs.subSequence(0, ichs)));
                argument2 = Double.parseDouble(String.valueOf(chs.subSequence(ichs+1, chs.length())));
                calculation (chs);
                calcDisplayResult.setText(String.valueOf(result));
                calcDisplayInput.setText(String.valueOf(' '));



            }
        });

    }
    private void calculation (CharSequence chs){ //вычисление действий с аргументами

        for (int i=0; i<chs.length();i++){
            if (chs.charAt(i)=='+'){
                result =argument1+argument2;
            } else if (chs.charAt(i)=='-'){
                result =argument1-argument2;
            } else if (chs.charAt(i)=='x'){
                result =argument1*argument2;
            } else if (chs.charAt(i)=='/'){
                result =argument1/argument2;
            }
        }

    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle instanceState) { //сохранение состояния TextView
        super.onSaveInstanceState(instanceState);
        SaveInputResult saveInputResult = new SaveInputResult(calcDisplayInput,calcDisplayResult);
        saveInputResult.setCalcDisplayInput(calcDisplayInput);
        saveInputResult.setCalcDisplayResult(calcDisplayResult);
        instanceState.putParcelable(parcelable_key, saveInputResult);


    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle instanceState) {//восстановление состояния TextView
        super.onRestoreInstanceState(instanceState);
        SaveInputResult saveInputResult = new SaveInputResult(calcDisplayInput,calcDisplayResult);
        saveInputResult = instanceState.getParcelable(parcelable_key);
        calcDisplayInput.setText(saveInputResult.getCalcDisplayInput().getText());
        calcDisplayResult.setText(saveInputResult.getCalcDisplayResult().getText());

    }

}

