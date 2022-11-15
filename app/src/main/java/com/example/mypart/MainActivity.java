package com.example.mypart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    Button galleryButton,achievementsButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//给btn1，btn2赋值，即设置布局文件中的Button按钮id进行关联
        galleryButton = (Button) findViewById(R.id.galleryButton);
        achievementsButton = (Button) findViewById(R.id.achievementsButton);
        //为button绑定事件
        galleryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,M_Gallery.class);
                startActivity(intent);
            }
        });
        achievementsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Achievements.class);
                startActivity(intent);
            }
        });
    }
}