package com.example.campingattheglenrouge;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

public class flora extends Activity implements OnClickListener {
    PopupWindow pw;
    ImageView profile;
    TextView name;
    TextView height;
    TextView bloom;
    TextView facts;

    Button dis;
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fauna);
        setUpButtonClickListener();
    }
    public void setUpButtonClickListener(){
    	Button aster = (Button)findViewById(R.id.Buttonf1);
    	aster.setOnClickListener(this);
    	Button bracken = (Button)findViewById(R.id.Buttonf2);
    	bracken.setOnClickListener(this);
    	Button chicory = (Button)findViewById(R.id.Buttonf3);
    	chicory.setOnClickListener(this);
    	Button cucumber = (Button)findViewById(R.id.Buttonf4);
    	cucumber.setOnClickListener(this);
    	Button lace = (Button)findViewById(R.id.Buttonf5);
    	lace.setOnClickListener(this);
    	Button maple = (Button)findViewById(R.id.Buttonf6);
    	maple.setOnClickListener(this);
    	Button mustard = (Button)findViewById(R.id.Buttonf7);
    	mustard.setOnClickListener(this);
    	Button periwinkle = (Button)findViewById(R.id.Buttonf8);
    	periwinkle.setOnClickListener(this);
    	Button pine = (Button)findViewById(R.id.Buttonf9);
    	pine.setOnClickListener(this);
    	Button rose = (Button)findViewById(R.id.Buttonf10);
    	rose.setOnClickListener(this);
    	Button susan = (Button)findViewById(R.id.Buttonf11);
    	susan.setOnClickListener(this);
    	Button weed = (Button)findViewById(R.id.Buttonf12);
    	weed.setOnClickListener(this);
    
    	
    }
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		try {
			// We need to get the instance of the LayoutInflater
			LayoutInflater inflater = (LayoutInflater) flora.this
			.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View layout = inflater.inflate(R.layout.florapop,
			(ViewGroup) findViewById(R.id.fpl));
			pw = new PopupWindow(layout, 500, 570, true);
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

			dis = (Button) layout.findViewById(R.id.dismiss);
			dis.setOnClickListener(cancel_button_click_listener);

	
	    	    // The code below assumes that the root container has an id called 'main'
	  switch(v.getId()){
		case R.id.Button1:
			profile = (ImageView) layout.findViewById(R.id.profile);
			profile.setImageResource(R.drawable.aster);//crashes here
						
			name = (TextView) layout.findViewById(R.id.name);
			name.setText("\n\nName:\n\n\t Frost Aster\n\n");
			
			height = (TextView) layout.findViewById(R.id.height);
			height.setText();
			bloom = (TextView) layout.findViewById(R.id.bloom);
			bloom.setText();
			facts = (TextView) layout.findViewById(R.id.facts);
			facts.setText();
		}
		} catch (Exception e) {
			e.printStackTrace();
			}
	}
	private OnClickListener cancel_button_click_listener = new OnClickListener() {
		public void onClick(View v) {
		pw.dismiss();

		}
		};

	
}