package ru.evgenysidorov.calculator;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.TextView;

public class SaveInputResult implements Parcelable {

    private TextView calcDisplayInput;
    private TextView calcDisplayResult;

    public SaveInputResult(TextView calcDisplayInput, TextView calcDisplayResult) {
        this.calcDisplayInput = calcDisplayInput;
        this.calcDisplayResult = calcDisplayResult;
    }
    public void setCalcDisplayResult(TextView calcDisplayResult) {
        this.calcDisplayResult = calcDisplayResult;
    }
    public TextView getCalcDisplayResult(){
        return calcDisplayResult;
    }
    public TextView getCalcDisplayInput() {
        return calcDisplayInput;
    }

    public void setCalcDisplayInput(TextView calcDisplayInput) {
        this.calcDisplayInput = calcDisplayInput;
    }



    protected SaveInputResult(Parcel in) {
        }

        public static final Creator<SaveInputResult> CREATOR = new Creator<SaveInputResult>() {
            @Override
            public SaveInputResult createFromParcel(Parcel in) {
                return new SaveInputResult(in);
            }

            @Override
            public SaveInputResult[] newArray(int size) {
                return new SaveInputResult[size];
            }
        };

        @Override
        public int describeContents () {
            return 0;
        }

        @Override
        public void writeToParcel (Parcel dest,int flags){
        }

    }

