package com.example.mariuszkraus.quest;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;


public class Quest extends ActionBarActivity {

    private Button mTrueButton;
    private Button mFalseButton;
    private TextView mQuestionTextViwe;
    private TrueFalse[] mAnswerKey;
    private int mCurrentIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest);
        mTrueButton = (Button) findViewById(R.id.button1);

        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Quest.this, R.string.corr_toast,Toast.LENGTH_LONG).show();

            }
        });

        mFalseButton = (Button) findViewById(R.id.button2);

        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Quest.this, R.string.incorr_toast,Toast.LENGTH_LONG).show();

            }
        });

        TrueFalse[]mAnswerKey;
        mAnswerKey = new TrueFalse[] {
                new TrueFalse(R.string.frage_text, false),
                new TrueFalse(R.string.frage_text, true)
        };
        int mCurrentIndex = 0;
        Log.d("Hallo Welt", "OnCreate");
        Gson gson = new Gson();
        }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_quest, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    protected void onPause(){
        super.onPause();
        Log.d("Hallo Welt", "onPause");
    }

}
