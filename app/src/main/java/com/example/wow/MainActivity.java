package com.example.wow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int displayResult = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreepoints(View view) {

        if (displayResult == 100) {
            Toast.makeText(MainActivity.this, "Team A wins this Match", Toast.LENGTH_LONG).show();
            return;


    }else {
            displayResult = displayResult + 3;
            displayForTeamA(displayResult);

            Toast.makeText(MainActivity.this, "Boom, that's a three pointer for team A", Toast.LENGTH_SHORT).show();
        }
    }

    public void addTwoPoints(View view) {

        if(displayResult == 100){
            Toast.makeText(MainActivity.this,"Team A wins this Match",Toast.LENGTH_LONG).show();
            return;
        }
        else {

            displayResult = displayResult + 2;
            displayForTeamA( displayResult);

            Toast.makeText(MainActivity.this,"Two points for team A",Toast.LENGTH_SHORT).show();
        }
    }

    public void addOnePoint(View view) {
        if(displayResult == 100){
            Toast.makeText(MainActivity.this,"Team A wins this Match",Toast.LENGTH_LONG).show();
            return;

        } else {

            displayResult = displayResult + 1;
            displayForTeamA(displayResult);

            Toast.makeText(MainActivity.this, "One point free throw for team A", Toast.LENGTH_SHORT).show();
        }
     }

    public void addThreePointsForTeamB(View view) {
        if(scoreTeamB == 100){
            Toast.makeText(MainActivity.this,"Team B wins this Match",Toast.LENGTH_LONG).show();
            return;
        }
        else {
            scoreTeamB = scoreTeamB + 3;
            displayForTeamB(scoreTeamB);


            Toast.makeText(MainActivity.this,"Boom, that's a three pointer for team B",Toast.LENGTH_SHORT).show();
        }
    }

    public void addTwoPointsForTeamB(View view) {
        if(scoreTeamB == 100){
            Toast.makeText(MainActivity.this,"Team B wins this Match",Toast.LENGTH_LONG).show();
            return;
        }
        else {

            scoreTeamB = scoreTeamB + 2;
            displayForTeamB(scoreTeamB);

            Toast.makeText(MainActivity.this,"Two points for team B",Toast.LENGTH_SHORT).show();
        }
    }

    public void addOnePointForTeamB(View view) {
        if(scoreTeamB == 100){
            Toast.makeText(MainActivity.this,"Team B wins this Match",Toast.LENGTH_LONG).show();
            return;
        }
        else {

            scoreTeamB = scoreTeamB + 1;
            displayForTeamB(scoreTeamB);

            Toast.makeText(MainActivity.this,"One point free throw for team B",Toast.LENGTH_SHORT).show();
        }
    }

    public void resetScore(View view) {
        displayResult = 0;
        scoreTeamB = 0;
        displayForTeamA(displayResult);
        displayForTeamB(scoreTeamB);

        Toast.makeText(MainActivity.this,"Reset Team scores to 0",Toast.LENGTH_LONG).show();
    }
}