package org.kasapbasi.week201911004;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
ProgressBar bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bar=(ProgressBar) findViewById(R.id.progressBar);

    }

public void myClick(View v){

        bar.setVisibility(View.VISIBLE);


}
    public void myClick1(View v){

        bar.setVisibility(View.GONE);


    }

}
