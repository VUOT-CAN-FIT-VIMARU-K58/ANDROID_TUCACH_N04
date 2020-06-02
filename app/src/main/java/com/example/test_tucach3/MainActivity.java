package com.example.test_tucach3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView Red_L1_L2_1,Red_L1_L2_2,Red_L1_L2_3,Red_L1_L2_4,RedL2_1,RedL2_2,RedL2_3,RedL2_4;
    private int flag = 0;
    private int C = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.registerControlandEvents();
    }
    @Override
    protected void onStop() {
        TienIch.Generate();
        if(TienIch.NotInClass(C) == false)
            Toast.makeText(MainActivity.this,C + " - Có",Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(MainActivity.this,C + " - Không",Toast.LENGTH_SHORT).show();
        C = 0;
        super.onStop();
    }
    private void registerControlandEvents(){
        this.Red_L1_L2_1 = (TextView)findViewById(R.id.red_l1_l2_1);
        this.Red_L1_L2_2 = (TextView)findViewById(R.id.red_l1_l2_2);
        this.Red_L1_L2_3 = (TextView)findViewById(R.id.red_l1_l2_3);
        this.Red_L1_L2_4 = (TextView)findViewById(R.id.red_l1_l2_4);

        this.RedL2_1 = (TextView)findViewById(R.id.Red_L2_1);
        this.RedL2_2 = (TextView)findViewById(R.id.Red_L2_2);
        this.RedL2_3 = (TextView)findViewById(R.id.red_L2_3);
        this.RedL2_4 = (TextView)findViewById(R.id.red_L2_4);
    }

    public void Click(View view){
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag++;
                C++;
                if(flag==1){
                    Red_L1_L2_1.setBackgroundColor(Color.parseColor("#FF0000"));
                    Red_L1_L2_2.setBackgroundColor(Color.parseColor("#FF0000"));
                    Red_L1_L2_3.setBackgroundColor(Color.parseColor("#FF0000"));
                    Red_L1_L2_4.setBackgroundColor(Color.parseColor("#FF0000"));
                }
                else if (flag==2){
                    RedL2_1.setBackgroundColor(Color.parseColor("#FF0000"));
                    RedL2_2.setBackgroundColor(Color.parseColor("#FF0000"));
                    RedL2_3.setBackgroundColor(Color.parseColor("#FF0000"));
                    RedL2_4.setBackgroundColor(Color.parseColor("#FF0000"));
                }
                else if(flag==3){
                    Red_L1_L2_1.setBackgroundColor(Color.parseColor("#8BC34A"));
                    Red_L1_L2_2.setBackgroundColor(Color.parseColor("#8BC34A"));
                    Red_L1_L2_3.setBackgroundColor(Color.parseColor("#8BC34A"));
                    Red_L1_L2_4.setBackgroundColor(Color.parseColor("#8BC34A"));

                    RedL2_1.setBackgroundColor(Color.parseColor("#3F51B5"));
                    RedL2_2.setBackgroundColor(Color.parseColor("#3F51B5"));
                    RedL2_3.setBackgroundColor(Color.parseColor("#3F51B5"));
                    RedL2_4.setBackgroundColor(Color.parseColor("#3F51B5"));

                    flag = 0;
                }
            }
        });
    }
}