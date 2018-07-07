package com.londonappbrewery.magiceightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView mBackground,mPredict;
    private Button mAsk;

    int[] mMagicBall = {
            R.drawable.magic_ball_yes,
            R.drawable.magic_ball_no,
            R.drawable.magic_ball_may_be,
            R.drawable.magic_ball_no_idea,
            R.drawable.magic_ball_not_sure
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAsk = (Button) findViewById(R.id.button_ask);
        mPredict = (ImageView) findViewById(R.id.image_predict);


        mAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int number = random.nextInt(5);

                mPredict.setImageResource(mMagicBall[number]);
            }
        });



    }
}
