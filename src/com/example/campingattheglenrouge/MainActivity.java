package com.example.campingattheglenrouge;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface t = Typeface.createFromAsset(getAssets(),
                "Fonts/Pinewood.ttf");
        TextView title = (TextView) findViewById(R.id.title2);
        TextView title2 = (TextView) findViewById(R.id.title1);
        title.setTypeface(t);
        title2.setTypeface(t);
        setupButtonClickListener();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    private void setupButtonClickListener(){
    	
    	Button ruleButton = (Button)findViewById(R.id.ruleButton);
    	ruleButton.setOnClickListener(this);
    	
    	
    	Button activityButton = (Button)findViewById(R.id.activityButton);
    	activityButton.setOnClickListener(this);
    	
    	
    	Button calendarButton = (Button)findViewById(R.id.calendarButton);
    	calendarButton.setOnClickListener(this);
    	
    	
    	Button campButton = (Button)findViewById(R.id.campButton);
    	campButton.setOnClickListener(this);
    	
    	
    	Button wildButton = (Button)findViewById(R.id.wildButton);
    	wildButton.setOnClickListener(this);

    	
    	Button touristButton = (Button)findViewById(R.id.touristButton);
    	touristButton.setOnClickListener(this);
    }


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch(v.getId()){
		
		case R.id.ruleButton:
			
			Intent intent = new Intent(v.getContext(), rules.class);
			startActivityForResult(intent, 0);
			
			break;
		case R.id.activityButton:
			
			Intent intent1 = new Intent(v.getContext(), activities.class);
			startActivityForResult(intent1, 0);
			
			break;
		case R.id.calendarButton:
			
			Intent intent2 = new Intent(v.getContext(), calendar.class);
			startActivityForResult(intent2, 0);
			
			break;
		case R.id.campButton:
			
			Intent intent3 = new Intent(v.getContext(), campingtips.class);
			startActivityForResult(intent3, 0);
			
			break;
		case R.id.wildButton:
			
			Intent intent4 = new Intent(v.getContext(), wildlife.class);
			startActivityForResult(intent4, 0);
			
			break;
		case R.id.touristButton:
			
			Intent intent6 = new Intent(v.getContext(), touristinfo.class);
			startActivityForResult(intent6, 0);
			
			break;
		}
		}
		
	}
    

