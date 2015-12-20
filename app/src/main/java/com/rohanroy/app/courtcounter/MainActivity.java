package com.rohanroy.app.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int teamAScore=0;
    private int teamBScore=0;
    final int POINTS_FOR_FREE_THROW = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * This method add 3 point to the score of A when the button is clicked.
     */
    public void show3(View view) {
        teamAScore += 3;
        displayTeamAScore(teamAScore);
    }

    /**
     * This method add 2 points to the score of A when the button is clicked.
     */
    public void show2(View view) {
        teamAScore += 2;
        displayTeamAScore(teamAScore);
    }

    /**
     * This method add 1 points to the score of A when the button is clicked.
     */
    public void freeThrow(View view) {
        teamAScore += POINTS_FOR_FREE_THROW;
        displayTeamAScore(teamAScore);
    }
    /**
     * This method displays the Team A score on the screen.
     */

    private void displayTeamAScore(int number) {
        TextView teamATextView = (TextView) findViewById(
                R.id.team_a_score
        );
        teamATextView.setText("" + number);
    }
    /**
     * This method add 3 point to the score of A when the button is clicked.
     */
    public void show3B(View view) {
        teamBScore += 3;
        displayTeamBScore(teamBScore);
    }

    /**
     * This method add 2 points to the score of B when the button is clicked.
     */
    public void show2B(View view) {
        teamBScore += 2;
        displayTeamBScore(teamBScore);
    }

    /**
     * This method add 1 points to the score of B when the button is clicked.
     */
    public void freeThrowB(View view) {
        teamBScore += POINTS_FOR_FREE_THROW;
        teamBScore += 1;
        displayTeamBScore(teamBScore);
    }
    /**
     * This method displays the Team B score on the screen.
     */

    private void displayTeamBScore(int number) {
        TextView teamATextView = (TextView) findViewById(
                R.id.team_b_score
        );
        teamATextView.setText(""+number);
    }

    /**
     * This method will reset the score for both team.
     */
    public void reset(View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayTeamAScore(teamAScore);
        displayTeamBScore(teamBScore);
    }
}
