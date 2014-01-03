package com.example.campingattheglenrouge;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class rules extends Activity implements OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rules_activity);
        
        setUpButtonClickListener();
    }
    public void setUpButtonClickListener(){
    	Button rutext = (Button)findViewById(R.id.ruleC);
    	rutext.setOnClickListener(this);
    	
    	Button intext = (Button)findViewById(R.id.infoC);
    	intext.setOnClickListener(this);
    	
    }
    public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch(v.getId()){
		
		case R.id.ruleC:
			
			Intent intent = new Intent(v.getContext(), ruletext.class);
			startActivityForResult(intent, 0);
			
			break;
		case R.id.infoC:
			Intent intent2 = new Intent(v.getContext(), infotext.class);
			startActivityForResult(intent2, 0);
			
			break;
		
		}
		}
}