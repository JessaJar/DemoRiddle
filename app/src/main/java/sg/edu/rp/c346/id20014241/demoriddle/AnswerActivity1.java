package sg.edu.rp.c346.id20014241.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity1 extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);

        tvAnswer = findViewById(R.id.textView);
        Intent answerReception = getIntent();
        String questionSelected = answerReception.getStringExtra("Question");
        tvAnswer.setText(questionSelected + " answer is: Queue");
    }
}