package co.ga.madlibs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mNoun1Edit;
    private EditText mNoun2Edit;
    private EditText mAdjective1Edit;
    private EditText mAdjective2Edit;
    private EditText mAnimalsEdit;
    private EditText mGameEdit;
    private Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Intent myIntent = new Intent(MainActivity.this, ResultActivity.class);
        mNoun1Edit = (EditText)findViewById(R.id.noun1Edit);
        mNoun2Edit = (EditText)findViewById(R.id.noun2Edit);
        mAdjective1Edit = (EditText)findViewById(R.id.adjective1Edit);
        mAdjective2Edit = (EditText)findViewById(R.id.adjective2Edit);
        mAnimalsEdit = (EditText)findViewById(R.id.animalsEdit);
        mGameEdit = (EditText)findViewById(R.id.gameEdit);
        mButton = (Button)findViewById(R.id.resultButton);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int numOfEmpty = 0;

                String noun1 = mNoun1Edit.getText().toString();
                String noun2 = mNoun2Edit.getText().toString();
                String adjective1 = mAdjective1Edit.getText().toString();
                String adjective2 = mAdjective2Edit.getText().toString();
                String animal = mAnimalsEdit.getText().toString();
                String game = mGameEdit.getText().toString();

                if (noun1.isEmpty()) {
                    mNoun1Edit.setError("Pleas input a noun.");
                    numOfEmpty++;
                }
                if (noun2.isEmpty()) {
                    mNoun2Edit.setError("Pleas input a noun.");
                    numOfEmpty++;
                }
                if (adjective1.isEmpty()) {
                    mAdjective1Edit.setError("Pleas input an adjective.");
                    numOfEmpty++;
                }
                if (adjective2.isEmpty()) {
                    mAdjective2Edit.setError("Pleas input an adjective.");
                    numOfEmpty++;
                }
                if (animal.isEmpty()) {
                    mAnimalsEdit.setError("Pleas input an animal.");
                    numOfEmpty++;
                }
                if (game.isEmpty()) {
                    mGameEdit.setError("Pleas input a game.");
                    numOfEmpty++;
                }

                myIntent.putExtra("Noun 1", noun1);
                myIntent.putExtra("Noun 2", noun2);
                myIntent.putExtra("Adjective 1", adjective1);
                myIntent.putExtra("Adjective 2", adjective2);
                myIntent.putExtra("Animal", animal);
                myIntent.putExtra("Game", game);

                if (numOfEmpty == 0)
                    startActivity(myIntent);
            }
        });
    }
}
