package com.example.ongor1.checkbox;

import android.app.backup.BackupHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox momCheckBox;
    private CheckBox dadcheckBox;
    private CheckBox grandCheckBox;
    private Button showButton;
    private TextView showTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        momCheckBox = (CheckBox)findViewById(R.id.momCheckBoxID);
        dadcheckBox = (CheckBox)findViewById(R.id.dadID);
        grandCheckBox = (CheckBox)findViewById(R.id.grandpaID);
        showTextview = (TextView) findViewById(R.id.resultID);
        showButton = (Button)findViewById(R.id.showButtonID);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(momCheckBox.getText().toString()+"satus is:"+
                momCheckBox.isChecked()+"\n");
                stringBuilder.append(momCheckBox.getText().toString()+"satus is:"+
                        dadcheckBox.isChecked()+"\n");
                stringBuilder.append(momCheckBox.getText().toString()+"satus is:"+
                        grandCheckBox.isChecked()+"\n");

                showTextview.setText(stringBuilder);

            }
        });

    }
}
