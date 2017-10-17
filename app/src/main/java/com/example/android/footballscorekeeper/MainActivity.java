package com.example.android.footballscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int goalTeamA = 0;
    int goalTeamB = 0;

    int foulTeamA = 0;
    int foulTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Displays the given goal for Team A.
     */
    public void goalForTeamA(int goal) {
        TextView goalView = (TextView) findViewById(R.id.team_a_goal);
        goalView.setText(String.valueOf(goal));
    }

    /**
     * Displays the given goal for Team B.
     */
    public void goalForTeamB(int goal) {
        TextView goalView = (TextView) findViewById(R.id.team_b_goal);
        goalView.setText(String.valueOf(goal));
    }

    /**
     * Displays the given foul for Team A.
     */
    public void foulForTeamA(int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_a_foul);
        foulView.setText(String.valueOf(foul));
    }

    /**
     * Displays the given foul for Team B.
     */
    public void foulForTeamB(int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_b_foul);
        foulView.setText(String.valueOf(foul));
    }

    public void displayGoalA(View view) {
        goalTeamA = goalTeamA + 1;
        goalForTeamA(goalTeamA);
    }

    public void displayFoulA(View view) {
        foulTeamA = foulTeamA + 1;
        foulForTeamA(foulTeamA);
    }

    public void displayGoalB(View view) {
        goalTeamB = goalTeamB + 1;
        goalForTeamB(goalTeamB);
    }

    public void displayFoulB(View view) {
        foulTeamB = foulTeamB + 1;
        foulForTeamB(foulTeamB);
    }


    public void reset(View view) {
        goalTeamA = 0;
        goalTeamB = 0;

        foulTeamA = 0;
        foulTeamB = 0;
        goalForTeamA(goalTeamA);
        goalForTeamB(goalTeamB);

        foulForTeamA(foulTeamA);
        foulForTeamB(foulTeamB);
    }
}
