package com.londonappbrewery.destini;

import android.opengl.Visibility;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Model_ForDatabase[] mModel_forDatabase = new Model_ForDatabase[]{
            new Model_ForDatabase(R.string.T1_Story,R.string.T1_Ans1,R.string.T1_Ans2),
            new Model_ForDatabase(R.string.T2_Story,R.string.T2_Ans1,R.string.T2_Ans2),
            new Model_ForDatabase(R.string.T3_Story,R.string.T3_Ans1,R.string.T3_Ans2)
    };
    private Model_ForStoryEnding mModel_forStoryEndings = new Model_ForStoryEnding (
            R.string.T4_End,R.string.T5_End,R.string.T6_End
    );

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mstorytextview;
    Button   mbuttonTop;
    Button   mbuttonBottom;
    static   int mstoryIndex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mstorytextview = findViewById(R.id.storyTextView);
        mbuttonTop     = findViewById(R.id.buttonTop);
        mbuttonBottom  = findViewById(R.id.buttonBottom);

        mstoryIndex=0;//T1_story

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mbuttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mstoryIndex==0 || mstoryIndex==1)//If Story 1 or 2
                {
                    mstoryIndex=2;//Story 3 to be displayed
                    mstorytextview.setText(mModel_forDatabase[2].getMstoryLine());
                    mbuttonTop.setText(mModel_forDatabase[2].getMbuttonTopText());
                    mbuttonBottom.setText(mModel_forDatabase[2].getMbuttonBottomText());
                }
                else if(mstoryIndex==2)//If story 3
                {
                    mstorytextview.setText(mModel_forStoryEndings.mending3);
                    mbuttonTop.setVisibility(View.INVISIBLE);
                    mbuttonBottom.setVisibility(View.INVISIBLE);
                }

            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mbuttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mstoryIndex==0)//If story 1
                {
                    mstoryIndex = 1; //Second story to be displayed
                    mstorytextview.setText(mModel_forDatabase[1].getMstoryLine());
                    mbuttonTop.setText(mModel_forDatabase[1].getMbuttonTopText());
                    mbuttonBottom.setText(mModel_forDatabase[1].getMbuttonBottomText());
                }
                else if(mstoryIndex==1)//If Story 2
                {
                    mstorytextview.setText(mModel_forStoryEndings.getMending1());
                    mbuttonTop.setVisibility(View.INVISIBLE);
                    mbuttonBottom.setVisibility(View.INVISIBLE);
                }
                else if(mstoryIndex==2)//If Story 3
                {
                    mstorytextview.setText(mModel_forStoryEndings.getMending2());
                    mbuttonTop.setVisibility(View.INVISIBLE);
                    mbuttonBottom.setVisibility(View.INVISIBLE);
                }

            }
        });

    }
}
