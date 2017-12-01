package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
int pa = 0, pb = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void threepa(View view) {
        pa = pa + 3;
        TextView scoreView = (TextView) findViewById(R.id.pointsa);
        scoreView.setText("" + pa);
    }

    public void twopa(View view) {
        pa = pa + 2;
        TextView scoreView = (TextView) findViewById(R.id.pointsa);
        scoreView.setText("" + pa);
    }

    public void onepa(View view) {
        pa = pa + 1;
        TextView scoreView = (TextView) findViewById(R.id.pointsa);
        scoreView.setText("" + pa);
    }



    public void threepb(View view) {
        pb = pb + 3;
        TextView scoreView = (TextView) findViewById(R.id.pointsb);
        scoreView.setText("" + pb);
    }

    public void twopb(View view) {
        pb = pb + 2;
        TextView scoreView = (TextView) findViewById(R.id.pointsb);
        scoreView.setText("" + pb);
    }

    public void onepb(View view) {
        pb = pb + 1;
        TextView scoreView = (TextView) findViewById(R.id.pointsb);
        scoreView.setText("" + pb);
    }


    public void result(View view) {
        if (pa > pb) {
            TextView scoreView = (TextView) findViewById(R.id.result);
            scoreView.setText("The winner is Team A");
        }
        else if( pa < pb ){
            TextView scoreView = (TextView) findViewById(R.id.result);
            scoreView.setText("The winner is Team B");
        }
        else if( pa == pb ){
            TextView scoreView = (TextView) findViewById(R.id.result);
            scoreView.setText("It's a tie");
        }
    }

    public void reset(View view){
        pb = 0;
        pa = 0;
        TextView reseta= (TextView) findViewById(R.id.pointsa);
        TextView resetb= (TextView) findViewById(R.id.pointsb);
        TextView result= (TextView) findViewById(R.id.result);

        reseta.setText("0");
        resetb.setText("0");
        result.setText("The game is on");
    }
}
