package com.tpccina.tpcclesson04;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PageTwoActivity extends AppCompatActivity {
    private Button pagetwoBack;
    private Button pagetwoNext;
    private TextView pagetwoOutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_two);

        pagetwoBack = (Button) findViewById(R.id.pagetwo_back);
        pagetwoNext = (Button) findViewById(R.id.pagetwo_next);
        pagetwoOutput = (TextView) findViewById(R.id.pagetwo_output);

        Intent intent = getIntent();
        String parcelText1 = intent.getStringExtra("pageoneText1");
        String parcelText3 = intent.getStringExtra("pagethreeText1");

        /*Log.i("Page Two Message", "parcelText" + parcelText);
        Toast.makeText(this, "Page Two Message "+  parcelText, Toast.LENGTH_SHORT).show();*/
        if (parcelText1 != null)
            pagetwoOutput.setText(parcelText1);
        if (parcelText3 != null)
            pagetwoOutput.setText(parcelText3);

        pagetwoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageTwoActivity.this, PageOneActivity.class);
                startActivity(intent);
            }
        });

        pagetwoNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageTwoActivity.this, PageThreeActivity.class);
                startActivity(intent);
            }
        });
    }
}
