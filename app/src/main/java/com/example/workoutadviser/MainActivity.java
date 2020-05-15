package com.example.workoutadviser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends Activity {
    private Workoutexpert expert=new Workoutexpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindWorkout(View view) {
        TextView workouts = (TextView) findViewById(R.id.workout);
        //Button showworkout =(Button)findViewById(R.id.showworkout);
        Spinner bodyparts= (Spinner) findViewById(R.id.bodyParts);
        String type = String.valueOf(bodyparts.getSelectedItem());
        List<String> workoutList = expert.getWorkouts(type);
        StringBuilder workoutFormatted = new StringBuilder();
        for(String work:workoutList) {
            workoutFormatted.append(work).append("\n");
        }

        workouts.setText(workoutFormatted);
    }
}
