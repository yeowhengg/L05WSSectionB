package sg.edu.rp.c346.id20042741.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnPassInt;
    Button btnPassChar;
    TextView passTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPassInt = findViewById(R.id.btnInt);
        btnPassChar = findViewById(R.id.btnChar);
        passTv = findViewById(R.id.tvPass);

        btnPassInt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("intvalue", 1);
                intent.putExtra("doublevalue",0.2);
                startActivity(intent);
            }
        });

        btnPassChar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("stringvalue","hello world");
                intent.putExtra("charvalue",'b');
                startActivity(intent);
            }
        });

        passTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("stringvalue","hello world");
                intent.putExtra("charvalue",'b');
                intent.putExtra("doublevalue",99.4);
                intent.putExtra("charvalue",'c');
                intent.putExtra("intvalue",53);
                startActivity(intent);
            }
        });

    }
}