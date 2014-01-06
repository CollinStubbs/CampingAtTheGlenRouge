package com.example.campingattheglenrouge;

import java.io.*;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.*;

public class activities extends Activity implements OnClickListener{
	PopupWindow pw;
	Button dis;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activities_activity);
        
       Button map =(Button)findViewById(R.id.mappop);
       map.setOnClickListener(this);
    }
	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.mappop:
			LayoutInflater inflater = (LayoutInflater) activities.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View layout = inflater.inflate(R.layout.imagepop,
			(ViewGroup) findViewById(R.id.im));
			pw = new PopupWindow(layout, 600, 670, true);
			pw.showAtLocation(layout, Gravity.CENTER, 0, 0);
			pw.setTouchInterceptor(new View.OnTouchListener() {

		        @Override
		        public boolean onTouch(View v, MotionEvent event) {
		            // TODO Auto-generated method stub
		            if (event.getAction() == MotionEvent.ACTION_DOWN) {
		                pw.dismiss();
		            }
		            return true;
		        }
		    });

			dis = (Button) layout.findViewById(R.id.dismiss2);
			dis.setOnClickListener(cancel_button_click_listener);
			break;
		}
		// TODO Auto-generated method stub
		
	}
	private OnClickListener cancel_button_click_listener = new OnClickListener() {
		public void onClick(View v) {
		pw.dismiss();

		}
		};


}