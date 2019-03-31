package com.example.zhangbiao.design;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import android.widget.Toast;

import br.tiagohm.markdownview.MarkdownView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String path = getIntent().getStringExtra("path");
        if(TextUtils.isEmpty(path)){
            Toast.makeText(this,"数据错误",Toast.LENGTH_LONG).show();
            finish();
        }
        MarkdownView markdownView = findViewById(R.id.markdown_view);
        markdownView.loadMarkdownFromAsset(path);

    }
}
