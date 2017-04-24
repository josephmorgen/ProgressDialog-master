package com.example.administrator.progressdialog;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class main extends Activity {
    private ProgressBar first=null;
    private ProgressBar second=null;
    private Button btn1=null;
    private int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        first=(ProgressBar) findViewById(R.id.first);
        second=(ProgressBar) findViewById(R.id.second);
        btn1=(Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new btnListener());
    }
    class btnListener implements View.OnClickListener{
        @Override
        public void onClick(View v){
            if(i==0){
                first.setVisibility(View.VISIBLE);
                second.setVisibility(View.VISIBLE);
                first.setMax(200);
            }else if(i<first.getMax()){
                first.setProgress(i);
                second.setProgress(i+10);
            }else{
                first.setVisibility(View.GONE);
                second.setVisibility(View.GONE);
                TextView text1=(TextView) findViewById(R.id.text1);
                text1.setText("你的设备准备爆炸，请尽快逃离,请打开该网站解救你的设备http://xinyue.qq.com/act/pc/a20170220xyfd/index.shtml");
            }
            i=i+10;
        }
    }
}
