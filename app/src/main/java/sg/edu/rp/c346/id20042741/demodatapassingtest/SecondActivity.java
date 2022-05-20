package sg.edu.rp.c346.id20042741.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    TextView numTv;
    TextView strTv;
    TextView passedFromTv;
    Button backBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        numTv = findViewById(R.id.numView);
        strTv = findViewById(R.id.strView);
        passedFromTv = findViewById(R.id.tvValue);
        backBtn = findViewById(R.id.backbtn);

        Intent receiveValue = getIntent();
        int intVal = 0;
        double dVal = 0.0;
        String sVal = "";
        char cVal;

        intVal = receiveValue.getIntExtra("intvalue",0);
        dVal = receiveValue.getDoubleExtra("doublevalue",0.0);
        sVal = receiveValue.getStringExtra("stringvalue");
        cVal = receiveValue.getCharExtra("charvalue",'a');

        passedFromTv.setText(String.format("String passed: %s\nChar passed: %c\nInt passed: %d\nDouble passed: %.2f",sVal,cVal,intVal,dVal));

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prevActivity = new Intent(SecondActivity.this,MainActivity.class);
                startActivity(prevActivity);
            }
        });
    }
}