package com.tpccina.tpcclesson04;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PageOneActivity extends AppCompatActivity {
    private String text1;
    private Button pageoneNext;
    private EditText pageoneText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_one);
        pageoneNext = (Button) findViewById(R.id.pageone_next);
        pageoneText1 = (EditText) findViewById(R.id.pageone_text1);

        pageoneNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageOneActivity.this, PageTwoActivity.class);
                text1 = pageoneText1.getText().toString();
                intent.putExtra("pageoneText1", text1);
                startActivity(intent);
            }
        });




    }
}
