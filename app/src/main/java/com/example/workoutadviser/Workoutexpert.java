package com.example.workoutadviser;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Workoutexpert {


    List <String> getWorkouts(String workouttypes){

        List<String> workout = new ArrayList<String>();
        if(workouttypes.equals("Chest")){
            workout.add("Bench Press: Reps of 15: 3 sets.");
            workout.add("Push-ups: Reps of 15: 3 sets.");
            workout.add("Cable Fly: Reps of 15: 3 sets.");
            workout.add("Pull-Ups: Reps of 15: 3 sets.");
        }
        else if(workouttypes.equals("Shoulder")){
            workout.add("Shoulder-Press: Reps of 15: 3 sets.");
            workout.add("Wide Push-Ups: Reps of 15: 3 sets.");
        }
        else if(workouttypes.equals("Biceps")){
            workout.add("DumbBell Curl: Reps of 15: 3 sets.");
            workout.add("Hammer Curl: Reps of 15: 3 sets.");
            workout.add("Straight Bar Curl: Reps of 15: 3 sets.");
            workout.add("Bicep Curl sitting: Reps of 15: 3 sets.");
            workout.add("Cable Curl: Reps of 15: 3 sets.");
        }
        else if(workouttypes.equals("Back")){
            workout.add("Dead lift: Reps of 15: 3 sets.");
            workout.add("Pull-Up: Reps of 15: 3 sets.");
            workout.add("Straight bar Bend Over Row: Reps of 15: 3 sets.");
            workout.add("Dumbbell Row: Reps of 15: 3 sets.");
        }
        else if(workouttypes.equals("Triceps")){
            workout.add("Triceps Dips: Reps of 15: 3 sets.");
            workout.add("Diamond Push-up: Reps of 15: 3 sets.");
            workout.add("Bench Dip: Reps of 15: 3 sets.");
            workout.add("Cable Push-Down: Reps of 15: 3 sets.");
        }
        return workout;
    }

}
