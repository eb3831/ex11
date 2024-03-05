package com.example.ex11;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView tv1, tv2, tv3, tv4, tv5, tv6;
    EditText et1, et2, et3;
    ImageView iv1, iv2, iv3;
    Button btn1, btn2, btn3, btn4;
    int n1, n2, sum1, answer1;
    int n4, sum2, answer2;
    int n6, sum3, answer3;
    int count = 0;

    public static Random rnd = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);

        iv1 = findViewById(R.id.iv1);
        iv2 = findViewById(R.id.iv2);
        iv3 = findViewById(R.id.iv3);

        start();

    }

    public void start()
    {

        n1 = rnd.nextInt(89) + 10;
        n2 = rnd.nextInt(89) + 10;
        n4 = rnd.nextInt(89) + 10;
        n6 = rnd.nextInt(89) + 10;

        sum1 = n1 + n2;
        sum2 = sum1 + n4;
        sum3 = sum2 + n6;

        tv1.setText(""+n1);
        tv2.setText(""+n2);

        et1.setVisibility(View.VISIBLE);
        btn1.setVisibility(View.VISIBLE);

    }

    public void clicked1(View view)
    {

        String st1 = et1.getText().toString();
        answer1 = Integer.parseInt(st1);

        iv1.setVisibility(View.VISIBLE);

        if (sum1==answer1)
        {
            count++;
            iv1.setImageResource(R.drawable.v);
        }
        else
        {
            iv1.setImageResource(R.drawable.x);
        }

        tv3.setText(""+sum1);
        tv4.setText(""+n4);

        tv3.setVisibility(View.VISIBLE);
        tv4.setVisibility(View.VISIBLE);

        et2.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);

    }


    public void clicked2(View view)
    {

        String st2 = et2.getText().toString();
        answer2 = Integer.parseInt(st2);

        iv2.setVisibility(View.VISIBLE);

        if (sum2==answer2)
        {
            count++;
            iv2.setImageResource(R.drawable.v);
        }
        else
        {
            iv2.setImageResource(R.drawable.x);
        }

        tv5.setText(""+sum2);
        tv6.setText(""+n6);

        tv5.setVisibility(View.VISIBLE);
        tv6.setVisibility(View.VISIBLE);

        et3.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);

    }


    public void clicked3(View view)
    {

        String st3 = et3.getText().toString();
        answer3 = Integer.parseInt(st3);

        iv3.setVisibility(View.VISIBLE);

        if (sum3==answer3)
        {
            count++;
            iv3.setImageResource(R.drawable.v);
        }
        else
        {
            iv3.setImageResource(R.drawable.x);
        }

        btn4.setVisibility(View.VISIBLE);

        switch(count)
        {
            case 0: btn4.setText("your score: 0/3, 0%");
                break;
            case 1: btn4.setText("your score: 1/3, 33%");
                break;
            case 2: btn4.setText("your score: 2/3, 66%");
                break;
            case 3: btn4.setText("your score: 3/3, 100%");
                break;
        }



    }


    public void clicked4(View view)
    {
        count = 0;

        tv3.setVisibility(View.INVISIBLE);
        tv4.setVisibility(View.INVISIBLE);
        tv5.setVisibility(View.INVISIBLE);
        tv6.setVisibility(View.INVISIBLE);

        btn1.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        et1.setVisibility(View.INVISIBLE);
        et2.setVisibility(View.INVISIBLE);
        et3.setVisibility(View.INVISIBLE);

        et1.setText("");
        et2.setText("");
        et3.setText("");

        iv1.setVisibility(View.INVISIBLE);
        iv2.setVisibility(View.INVISIBLE);
        iv3.setVisibility(View.INVISIBLE);

        start();

    }
}

