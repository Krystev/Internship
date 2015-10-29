package com.vratsasoftware.tito.tictactoeapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class SinglePlayer extends AppCompatActivity implements View.OnClickListener {


    boolean isThereAWinner;
    private Button fieldA1, fieldA2, fieldA3, fieldB1, fieldB2, fieldB3, fieldC1, fieldC2, fieldC3;
    private Button[] buttons;
    private boolean isXTurn;
    private int turn_count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_player);

        fieldA1 = (Button) findViewById(R.id.field_a1);
        fieldA2 = (Button) findViewById(R.id.field_a2);
        fieldA3 = (Button) findViewById(R.id.field_a3);
        fieldB1 = (Button) findViewById(R.id.field_b1);
        fieldB2 = (Button) findViewById(R.id.field_b2);
        fieldB3 = (Button) findViewById(R.id.field_b3);
        fieldC1 = (Button) findViewById(R.id.field_c1);
        fieldC2 = (Button) findViewById(R.id.field_c2);
        fieldC3 = (Button) findViewById(R.id.field_c3);
        this.isXTurn = true;
        this.turn_count = 0;
        createArray();
        this.isThereAWinner = false;
    }

    private void createArray() {
        buttons = new Button[]{fieldA1, fieldA2, fieldA3, fieldB1, fieldB2, fieldB3, fieldC1, fieldC2, fieldC3};

        for (Button b : buttons) {
            b.setOnClickListener(this);
            b.setText("");

        }

    }

    @Override
    public void onClick(View v) {
        Button b = (Button) v;
        buttonClicked(b);
        computerPlay();

    }

    private void buttonClicked(Button b) {
        if (isXTurn) {
            b.setText("X");
        } else {
            b.setText("O");
        }
        turn_count++;
        isXTurn = !isXTurn;
        b.setBackgroundColor(Color.LTGRAY);
        b.setClickable(false);
        checkForWinner();
    }

    private void computerPlay() {
        boolean isPlayed = false;
        Random random = new Random();
        Button b = buttons[random.nextInt(9)];

        while (isPlayed == false && isThereAWinner == false) {

            if (b.getText() == "") {
                buttonClicked(b);
                isPlayed = true;
            } else {
                b = buttons[random.nextInt(9)];
            }

        }
    }

    private void checkForWinner() {

        if (fieldA1.getText() == fieldA2.getText() && fieldA2.getText() == fieldA3.getText()
                && !fieldA1.isClickable()) {
            isThereAWinner = true;
        } else if (fieldB1.getText() == fieldB2.getText() && fieldB2.getText() == fieldB3.getText()
                && !fieldB1.isClickable()) {
            isThereAWinner = true;
        } else if (fieldC1.getText() == fieldC2.getText() && fieldC2.getText() == fieldC3.getText()
                && !fieldC1.isClickable()) {
            isThereAWinner = true;
        } else if (fieldA1.getText() == fieldB1.getText() && fieldB1.getText() == fieldC1.getText()
                && !fieldA1.isClickable()) {
            isThereAWinner = true;
        } else if (fieldA2.getText() == fieldB2.getText() && fieldB2.getText() == fieldC2.getText()
                && !fieldA2.isClickable()) {
            isThereAWinner = true;
        } else if (fieldA3.getText() == fieldB3.getText() && fieldB3.getText() == fieldC3.getText()
                && !fieldA3.isClickable()) {
            isThereAWinner = true;
        } else if (fieldA1.getText() == fieldB2.getText() && fieldB2.getText() == fieldC3.getText()
                && !fieldA1.isClickable()) {
            isThereAWinner = true;
        } else if (fieldA3.getText() == fieldB2.getText() && fieldB2.getText() == fieldC1.getText()
                && !fieldA3.isClickable()) {
            isThereAWinner = true;
        }

        if (turn_count == 9 && isThereAWinner == false) {
            dialogForWinner("Draw!");
        }

        if (isThereAWinner) {
            if (!isXTurn) {
                dialogForWinner("X Wins");
            } else {
                dialogForWinner("O Wins");
            }

            enableAllButtons(false);
        }
    }

    private void enableAllButtons(boolean enable) {
        for (Button b : buttons) {
            b.setClickable(enable);

        }
    }


    private void dialogForWinner(String text) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(SinglePlayer.this);
        dialog.setMessage(text);
        dialog.setPositiveButton("New Game", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                enableAllButtons(true);
                isThereAWinner = false;
                turn_count = 0;
                isXTurn = true;
                for (Button b : buttons) {
                    b.setText("");
                    b.setBackgroundResource(android.R.color.darker_gray);
                }
            }
        });
        dialog.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        dialog.create().show();
    }

    @Override
    public void finish() {
        super.finish();
    }
}
