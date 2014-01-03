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

public class fauna extends Activity implements OnClickListener {
    PopupWindow pw;
    ImageView profile;
    TextView name;
    TextView live;
    ImageView spread;
    TextView eat;
    TextView lifespan;
    TextView size;
    TextView relatives;
    Button dis;
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fauna);
        setUpButtonClickListener();
    }
    public void setUpButtonClickListener(){
    	Button deer = (Button)findViewById(R.id.Button1);
    	deer.setOnClickListener(this);
    	Button rac = (Button)findViewById(R.id.Button2);
    	rac.setOnClickListener(this);
    	Button hog = (Button)findViewById(R.id.Button3);
    	hog.setOnClickListener(this);
    	Button esq = (Button)findViewById(R.id.Button4);
    	esq.setOnClickListener(this);
    	Button rsq = (Button)findViewById(R.id.Button5);
    	rsq.setOnClickListener(this);
    	Button jay = (Button)findViewById(R.id.Button6);
    	jay.setOnClickListener(this);
    	Button wood = (Button)findViewById(R.id.Button7);
    	wood.setOnClickListener(this);
    	Button chick = (Button)findViewById(R.id.Button8);
    	chick.setOnClickListener(this);
    	Button finch = (Button)findViewById(R.id.Button9);
    	finch.setOnClickListener(this);
    	
    
    	
    }
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		try {
			// We need to get the instance of the LayoutInflater
			LayoutInflater inflater = (LayoutInflater) fauna.this
			.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View layout = inflater.inflate(R.layout.faunapop,
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
			profile.setImageResource(R.drawable.deer);//crashes here
						
			name = (TextView) layout.findViewById(R.id.name);
			name.setText("Name:\n\n\t White-Tailed Deer\n\n");
			
			live = (TextView) layout.findViewById(R.id.live);
			live.setText("Where They Live:\n\n\t All throughout central North America\n\n");
			
			//spread = (ImageView) findViewById(R.id.spread);
			//spread.setImageResource(R.drawable.)
			
			eat = (TextView) layout.findViewById(R.id.eat);
			eat.setText("What They Eat:\n\n\t White Tailed Deer primarily eat, in the summer, nuts and green plants, and in the winter, tree vegetation.\n\n");
			
			lifespan = (TextView) layout.findViewById(R.id.lifespan);
			lifespan.setText("Lifespan:\n\n\t They live for approximately 10 years.\n\n");
			
			relatives = (TextView) layout.findViewById(R.id.relatives);
			relatives.setText("Relatives:\n\n\t black-tailed deer, elk, moose, reindeer\n\n");
			
			size = (TextView) layout.findViewById(R.id.size);
			size.setText("Size:\n\n\t 68-114 cm\n\n ");
			

			
			break;
			
		case R.id.Button2:
			
			profile = (ImageView) layout.findViewById(R.id.profile);
			profile.setImageResource(R.drawable.raccoon);
						
			name = (TextView) layout.findViewById(R.id.name);
			name.setText("Name:\n\n\t Raccoon\n\n");
			
			live = (TextView) layout.findViewById(R.id.live);
			live.setText("Where They Live:\n\n\t All throughout the sourthern Canadian Provinces, the rest of North America, and various European and Asian countries.\n\n");
			
			//spread = (ImageView) findViewById(R.id.spread);
			//spread.setImageResource(R.drawable.)
			
			eat = (TextView) layout.findViewById(R.id.eat);
			eat.setText("What They Eat:\n\n\t Raccoons eat almost anything edibile that they can get their paws on. This ranges from wild bird eggs, vegetables, and fruit to worms, frogs, and whatever they can pick out of the garbage (so remember to keep your site clean)! \n\n");
			
			lifespan = (TextView) layout.findViewById(R.id.lifespan);
			lifespan.setText("Lifespan:\n\n\t They live for approximately 10 years.\n\n");
			
			relatives = (TextView) layout.findViewById(R.id.relatives);
			relatives.setText("Relatives:\n\n\t black-tailed deer, elk, moose, reindeer\n\n");
			
			size = (TextView) layout.findViewById(R.id.size);
			size.setText("Size:\n\n\t 68-114 cm\n\n ");
			break;
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