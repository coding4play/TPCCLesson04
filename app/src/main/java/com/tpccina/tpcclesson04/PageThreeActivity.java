package com.tpccina.tpcclesson04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PageThreeActivity extends AppCompatActivity {
    private String text1;
    private EditText pagethreeText1;
    private Button pagethreeBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_three);

        Button pagethreeBack = (Button) findViewById(R.id.pagethree_back);
        pagethreeText1 = (EditText) findViewById(R.id.pagethree_text1);

        pagethreeBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PageThreeActivity.this, PageTwoActivity.class);
                text1 = String.valueOf(pagethreeText1.getText());
                intent.putExtra("pagethreeText1", text1);
                startActivity(intent);
            }
        });
    }
}
