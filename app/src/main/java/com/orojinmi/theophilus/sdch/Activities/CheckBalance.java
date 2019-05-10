package com.orojinmi.theophilus.sdch.Activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.orojinmi.theophilus.sdch.MainMenuBoard;
import com.orojinmi.theophilus.sdch.R;

public class CheckBalance extends AppCompatActivity {

    Typeface mTypeface, mTypefaceBlack, mTypefaceBold, mTypefaceRegular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_balance);
        Toolbar toolbar         = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        getSupportActionBar().setTitle("Check Balance");

        mTypefaceBold   = Typeface.createFromAsset(getAssets(),"fonts/hurme-geometric-bold.ttf");
        mTypefaceBlack  = Typeface.createFromAsset(getAssets(),"fonts/ProximaNova-Black.ttf");
        init();
    }

    private void init(){
        TextView merchantText   = findViewById(R.id.merchantTxt);
        TextView todaysDate     = findViewById(R.id.todaysDate);
        TextView amountText     = findViewById(R.id.amountText);

        amountText.setText(getIntent().getStringExtra("balance"));
        merchantText.setText(getIntent().getStringExtra("fullname"));
        todaysDate.setText(getIntent().getStringExtra("todaysDate"));

        merchantText.setTypeface(mTypefaceBold);
        todaysDate.setTypeface(mTypefaceBold);
        amountText.setTypeface(mTypefaceBlack);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            Intent intent   = new Intent(this, MainMenuBoard.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP  | Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
