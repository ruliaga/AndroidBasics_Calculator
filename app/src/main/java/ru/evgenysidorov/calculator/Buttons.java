package ru.evgenysidorov.calculator;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class Buttons implements Serializable {

    private int button1=1;
    private int button2=2;
    private int button3=3;
    private int button4=4;
    private int button5=5;
    private int button6=6;
    private int button7=7;
    private int button8=8;
    private int button9=9;
    private int button0=0;
    private String buttonRavno="=";
    private String buttonUmnozh="x";
    private String buttonDelenie="/";
    private String buttonPlus="+";
    private String buttonMinus="-";
    private String buttonDot=".";

    public Buttons(){

    }




    public int getButton1() {
        return button1;
    }

    public int getButton2() {
        return button2;
    }

    public int getButton3() {
        return button3;
    }

    public int getButton4() {
        return button4;
    }

    public int getButton5() {
        return button5;
    }

    public int getButton6() {
        return button6;
    }

    public int getButton7() {
        return button7;
    }

    public int getButton8() {
        return button8;
    }

    public int getButton9() {
        return button9;
    }

    public int getButton0() {
        return button0;
    }


    public String getButtonRavno() {
        return buttonRavno;
    }

    public String getButtonUmnozh() {
        return buttonUmnozh;
    }

    public String getButtonDelenie() {
        return buttonDelenie;
    }

    public String getButtonPlus() {
        return buttonPlus;
    }

    public String getButtonMinus() {
        return buttonMinus;
    }

    public String getButtonDot() {
        return buttonDot;
    }


}

