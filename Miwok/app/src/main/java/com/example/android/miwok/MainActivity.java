/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout
        // filesetContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);

        TextView numbers = findViewById(R.id.numbers);
        // Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                //Create new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                //Start the new activity
                startActivity(numbersIntent);
            }
        });

        TextView family = findViewById(R.id.family);
        // Set a click listener on that View
        family.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                //Create new intent to open the {@link NumbersActivity}
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                //Start the new activity
                startActivity(familyIntent);
            }
        });


        TextView colors = findViewById(R.id.colors);
        // Set a click listener on that View
        colors.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                //Create new intent to open the {@link NumbersActivity}
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                //Start the new activity
                startActivity(colorsIntent);
            }
        });


        TextView phrases = findViewById(R.id.phrases);
        // Set a click listener on that View
        phrases.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                //Create new intent to open the {@link NumbersActivity}
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                //Start the new activity
                startActivity(phrasesIntent);
            }
        });
    }

}