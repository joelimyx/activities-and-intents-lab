package co.ga.madlibs;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.text.Html;

/**
 * Created by james on 12/7/15.
 */
public class ResultActivity extends AppCompatActivity {
    private Button mBackButton;
    private TextView mResultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent myIntent = getIntent();
        String noun1 = myIntent.getStringExtra("Noun 1");
        String noun2 = myIntent.getStringExtra("Noun 2");
        String adjective1 = myIntent.getStringExtra("Adjective 1");
        String adjective2 = myIntent.getStringExtra("Adjective 2");
        String animal= myIntent.getStringExtra("Animal");
        String game = myIntent.getStringExtra("Game");

        mBackButton = (Button) findViewById(R.id.back_button);
        mResultText = (TextView) findViewById(R.id.result_textview);

        mResultText.setText(Html.fromHtml("In a world, where <b>"+adjective1+"</b> is not illegal but would raise some eyebrows. <b>" +
                            noun1 +"</b> is here to save the day. Together with his partner in crime, <b>" + noun2 +
                            "</b>, they will help their fellow <b>" + animal + "</b>. In a game of <b>"+ game +
                            "</b> where they <b>"+adjective1 +"</b> in addition to <b>"+ adjective2 + "</b>."));

        //mResultText.setTypeface(Typeface.DEFAULT_BOLD);

        mBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
