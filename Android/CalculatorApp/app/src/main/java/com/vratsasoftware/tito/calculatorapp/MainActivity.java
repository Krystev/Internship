package com.vratsasoftware.tito.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText textField;
    private double num1;

    private int plus;
    private int minus;
    private int divider;
    private int multiplier;
    private int onPower;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus = 0;
        minus = 0;
        divider = 0;
        multiplier = 0;
        onPower = 0;

        initialize();
    }

    private void initialize() {
        textField = (EditText) findViewById(R.id.edit_text_field);
        Button btnFactorial = (Button) findViewById(R.id.button_factorial);
        Button btnSquareRoot = (Button) findViewById(R.id.button_square);
        Button btnOnPower = (Button) findViewById(R.id.button_on_power);
        Button btnAC = (Button) findViewById(R.id.button_ac);
        Button btnOne = (Button) findViewById(R.id.button_1);
        Button btnTwo = (Button) findViewById(R.id.button_2);
        Button btnThree = (Button) findViewById(R.id.button_3);
        Button btnDivision = (Button) findViewById(R.id.button_divide);
        Button btnFour = (Button) findViewById(R.id.button_4);
        Button btnFive = (Button) findViewById(R.id.button_5);
        Button btnSix = (Button) findViewById(R.id.button_6);
        Button btnMultiplier = (Button) findViewById(R.id.button_multiplier);
        Button btnSeven = (Button) findViewById(R.id.button_7);
        Button btnEight = (Button) findViewById(R.id.button_8);
        Button btnNine = (Button) findViewById(R.id.button_9);
        Button btnMinus = (Button) findViewById(R.id.button_minus);
        Button btnNull = (Button) findViewById(R.id.button_0);
        Button btnDot = (Button) findViewById(R.id.button_dot);
        Button btnResult = (Button) findViewById(R.id.button_result);
        Button btnPlus = (Button) findViewById(R.id.button_plus);

        textField.setText("");
        btnAC.setOnClickListener(this);
        btnFactorial.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);
        btnNull.setOnClickListener(this);
        btnDivision.setOnClickListener(this);
        btnSquareRoot.setOnClickListener(this);
        btnResult.setOnClickListener(this);
        btnOnPower.setOnClickListener(this);
        btnDot.setOnClickListener(this);
        btnMultiplier.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        String currentText;
        StringBuilder stringBuilder;
        double num2;
        double result;

        switch (v.getId()) {
            case R.id.button_ac:

                textField.setText("");
                num1 = 0;
                break;

            case R.id.button_plus:
                if (TextUtils.isEmpty(textField.getText())) {
                    num1 = 0;
                    plus = 1;
                } else {
                    num1 = Double.parseDouble(textField.getText().toString());
                    textField.setText("");
                    plus = 1;
                }
                break;

            case R.id.button_square:
                if (TextUtils.isEmpty(textField.getText())) {
                    num1 = 0;
                } else {
                    num1 = Double.parseDouble(textField.getText().toString());
                }
                result = Math.sqrt(num1);

                if (result % 1 == 0) {
                    textField.setText(String.valueOf((long) result));
                } else {
                    textField.setText(String.valueOf(result));
                }
                break;

            case R.id.button_minus:
                if (TextUtils.isEmpty(textField.getText())) {
                    num1 = 0;
                    minus = 1;
                } else {
                    num1 = Double.parseDouble(textField.getText().toString());
                    minus = 1;
                    textField.setText("");
                }
                break;

            case R.id.button_divide:
                if (TextUtils.isEmpty(textField.getText())) {
                    num1 = 0;
                    divider = 1;
                } else {
                    num1 = Double.parseDouble(textField.getText().toString());
                    divider = 1;
                    textField.setText("");
                }
                break;

            case R.id.button_multiplier:
                if (TextUtils.isEmpty(textField.getText())) {
                    num1 = 0;
                    multiplier = 1;
                } else {
                    num1 = Double.parseDouble(textField.getText().toString());
                    multiplier = 1;
                    textField.setText("");
                }
                break;

            case R.id.button_on_power:
                if (TextUtils.isEmpty(textField.getText())) {
                    num1 = 0;
                    onPower = 1;
                } else {
                    num1 = Double.parseDouble(textField.getText().toString());
                    onPower = 1;
                    textField.setText("");
                }
                break;

            case R.id.button_factorial:
                if (TextUtils.isEmpty(textField.getText())) {
                    num1 = 0;
                } else {
                    num1 = Double.parseDouble(textField.getText().toString());
                }
                if (num1 < 1000) {
                    result = factorial((int) num1);
                    textField.setText(String.valueOf((long)result));
                } else {
                    textField.setText("");
                }


                break;

            case R.id.button_result:
                if (TextUtils.isEmpty(textField.getText())) {
                    break;
                }
                num2 = Double.parseDouble(textField.getText().toString());

                if (plus > 0) {
                    result = num1 + num2;
                    if (result % 1 == 0) {
                        textField.setText(String.valueOf((long) result));
                    } else {
                        textField.setText(String.valueOf(result));
                    }
                    plus = 0;
                }

                if (minus > 0) {
                    result = num1 - num2;
                    if (result % 1 == 0) {
                        textField.setText(String.valueOf((long) result));
                    } else {
                        textField.setText(String.valueOf(result));
                    }
                    minus = 0;
                }

                if (divider > 0) {
                    result = num1 / num2;
                    if (result % 1 == 0) {
                        textField.setText(String.valueOf((long) result));
                    } else {
                        textField.setText(String.valueOf(result));
                    }
                    divider = 0;
                }

                if (multiplier > 0) {
                    result = num1 * num2;
                    if (result % 1 == 0) {
                        textField.setText(String.valueOf((long) result));
                    } else {
                        textField.setText(String.valueOf(result));
                    }
                    multiplier = 0;
                }

                if (onPower > 0) {
                    result = Math.pow(num1, num2);
                    if (result % 1 == 0) {
                        textField.setText(String.valueOf((long) result));
                    } else {
                        textField.setText(String.valueOf(result));
                    }
                    onPower = 0;
                }

                break;

            case R.id.button_dot:
                currentText = String.valueOf(textField.getText());
                stringBuilder = new StringBuilder(currentText);
                textField.setText(stringBuilder.append("."));
                break;

            case R.id.button_1:
                currentText = String.valueOf(textField.getText());
                stringBuilder = new StringBuilder(currentText);
                textField.setText(stringBuilder.append(1));
                break;

            case R.id.button_2:
                currentText = String.valueOf(textField.getText());
                stringBuilder = new StringBuilder(currentText);
                textField.setText(stringBuilder.append(2));
                break;

            case R.id.button_3:
                currentText = String.valueOf(textField.getText());
                stringBuilder = new StringBuilder(currentText);
                textField.setText(stringBuilder.append(3));
                break;

            case R.id.button_4:
                currentText = String.valueOf(textField.getText());
                stringBuilder = new StringBuilder(currentText);
                textField.setText(stringBuilder.append(4));
                break;

            case R.id.button_5:
                currentText = String.valueOf(textField.getText());
                stringBuilder = new StringBuilder(currentText);
                textField.setText(stringBuilder.append(5));
                break;

            case R.id.button_6:
                currentText = String.valueOf(textField.getText());
                stringBuilder = new StringBuilder(currentText);
                textField.setText(stringBuilder.append(6));
                break;

            case R.id.button_7:
                currentText = String.valueOf(textField.getText());
                stringBuilder = new StringBuilder(currentText);
                textField.setText(stringBuilder.append(7));
                break;

            case R.id.button_8:
                currentText = String.valueOf(textField.getText());
                stringBuilder = new StringBuilder(currentText);
                textField.setText(stringBuilder.append(8));
                break;

            case R.id.button_9:
                currentText = String.valueOf(textField.getText());
                stringBuilder = new StringBuilder(currentText);
                textField.setText(stringBuilder.append(9));
                break;

            case R.id.button_0:
                currentText = String.valueOf(textField.getText());
                stringBuilder = new StringBuilder(currentText);
                textField.setText(stringBuilder.append(0));
                break;
        }
    }

    private long factorial(int n) {
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }


}
