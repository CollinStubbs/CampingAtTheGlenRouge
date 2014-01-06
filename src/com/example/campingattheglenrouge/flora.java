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
    TextView life;
    TextView facts;

    Button dis;
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flora);
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

			dis = (Button) layout.findViewById(R.id.dismiss);
			dis.setOnClickListener(cancel_button_click_listener);

	
	    	    // The code below assumes that the root container has an id called 'main'
	  switch(v.getId()){
		case R.id.Buttonf1:
			profile = (ImageView) layout.findViewById(R.id.profile);
			profile.setImageResource(R.drawable.aster);//crashes here
						
			name = (TextView) layout.findViewById(R.id.name);
			name.setText("\n\nName:\n\n\t Frost Aster\n\n");
			
			height = (TextView) layout.findViewById(R.id.height);
			height.setText("\n\nHeight:\n\n\t They grow to be around 1 metre tall.\n\n");
			bloom = (TextView) layout.findViewById(R.id.bloom);
			bloom.setText("\n\nWhen They Bloom:\n\n\t They bloom in the Autumn.\n\n");
			life = (TextView) layout.findViewById(R.id.life);
			life.setText("\n\nHow Long Do They Live?\n\n\t They are perennials so they live for greater than 2 years.\n\n ");
			facts = (TextView) layout.findViewById(R.id.facts);
			facts.setText("\n\nFun Facts:\n\n\t  The name comes from the greek word \"astér\" which means star (like the shape of the flowers head).\n\n");
			break;
		case R.id.Buttonf2:
			profile = (ImageView) layout.findViewById(R.id.profile);
			profile.setImageResource(R.drawable.bracken);//crashes here
						
			name = (TextView) layout.findViewById(R.id.name);
			name.setText("\n\nName:\n\n\t Eastern Bracken\n\n");
			
			height = (TextView) layout.findViewById(R.id.height);
			height.setText("\n\nHeight:\n\n\t They grow to be around 2 metres tall.\n\n");
			bloom = (TextView) layout.findViewById(R.id.bloom);
			bloom.setText("\n\nWhen They Bloom:\n\n\t They are a type of fern so they do not have flowers to bloom.\n\n");
			life = (TextView) layout.findViewById(R.id.life);
			life.setText("\n\nHow Long Do They Live?\n\n\t They are perennials so they live for greater than 2 years.\n\n ");
			facts = (TextView) layout.findViewById(R.id.facts);
			facts.setText("\n\nFun Facts:\n\n\t  They reproduce using spores and deep stems.\n\n");
			break;
		case R.id.Buttonf3:
			profile = (ImageView) layout.findViewById(R.id.profile);
			profile.setImageResource(R.drawable.chicory);//crashes here
						
			name = (TextView) layout.findViewById(R.id.name);
			name.setText("\n\nName:\n\n\t Chicory\n\n");
			
			height = (TextView) layout.findViewById(R.id.height);
			height.setText("\n\nHeight:\n\n\t They grow to be 30-100 cm's tall.\n\n");
			bloom = (TextView) layout.findViewById(R.id.bloom);
			bloom.setText("\n\nWhen They Bloom:\n\n\t They bloom in the late spring.\n\n");
			life = (TextView) layout.findViewById(R.id.life);
			life.setText("\n\nHow Long Do They Live?\n\n\t They are perennials so they live for greater than 2 years.\n\n ");
			facts = (TextView) layout.findViewById(R.id.facts);
			facts.setText("\n\nFun Facts:\n\n\t  Chicory has been known to be used in alternative medicines.\n\n");
			break;
			
		case R.id.Buttonf4:
			profile = (ImageView) layout.findViewById(R.id.profile);
			profile.setImageResource(R.drawable.cucumber);//crashes here
						
			name = (TextView) layout.findViewById(R.id.name);
			name.setText("\n\nName:\n\n\t Wild Cucumber\n\n");
			
			height = (TextView) layout.findViewById(R.id.height);
			height.setText("\n\nHeight:\n\n\t They are a vine so they do not necessarily grow up and range from very long to very short.\n\n");
			bloom = (TextView) layout.findViewById(R.id.bloom);
			bloom.setText("\n\nWhen They Bloom:\n\n\t They bloom in July-September.\n\n");
			life = (TextView) layout.findViewById(R.id.life);
			life.setText("\n\nHow Long Do They Live?\n\n\t They are perennials so they live for greater than 2 years.\n\n ");
			facts = (TextView) layout.findViewById(R.id.facts);
			facts.setText("\n\nFun Facts:\n\n\t  Although they are called cucumbers they are not like they kind you buy at the store and if eaten can make you very sick.\n\n");
			break;
		case R.id.Buttonf5:
			profile = (ImageView) layout.findViewById(R.id.profile);
			profile.setImageResource(R.drawable.lace);//crashes here
						
			name = (TextView) layout.findViewById(R.id.name);
			name.setText("\n\nName:\n\n\t Queen Anne's Lace\n\n");
			
			height = (TextView) layout.findViewById(R.id.height);
			height.setText("\n\nHeight:\n\n\t They grow up to 1- 1.5 metres. \n\n");
			bloom = (TextView) layout.findViewById(R.id.bloom);
			bloom.setText("\n\nWhen They Bloom:\n\n\t They bloom from May-October.\n\n");
			life = (TextView) layout.findViewById(R.id.life);
			life.setText("\n\nHow Long Do They Live?\n\n\t They are biennials so the live for only 2 years.\n\n ");
			facts = (TextView) layout.findViewById(R.id.facts);
			facts.setText("\n\nFun Facts:\n\n\t  They are called wild carrots and are related to domestic carrots (note: if seen please do not eat, although they are realted to carrots they are not necessarily edible.\n\n");
			break;
		case R.id.Buttonf6:
			profile = (ImageView) layout.findViewById(R.id.profile);
			profile.setImageResource(R.drawable.maple);//crashes here
						
			name = (TextView) layout.findViewById(R.id.name);
			name.setText("\n\nName:\n\n\t Maple Tree\n\n");
			
			height = (TextView) layout.findViewById(R.id.height);
			height.setText("\n\nHeight:\n\n\t They grow up to 45 metre's tall.\n\n");
			bloom = (TextView) layout.findViewById(R.id.bloom);
			bloom.setText("\n\nWhen They Bloom:\n\n\t The type of the maple will give a more specific timespan but they generally bloom between March and June.\n\n");
			life = (TextView) layout.findViewById(R.id.life);
			life.setText("\n\nHow Long Do They Live?\n\n\t They are perennials so they live for greater than 2 years.\n\n ");
			facts = (TextView) layout.findViewById(R.id.facts);
			facts.setText("\n\nFun Facts:\n\n\t  These tree's have a sap (a sugary and salty fluid from the tree's vascular system) that can be used to make maple syrup (note: the process takes many hours to boil and evaporate the sap into syrup so it will taste nothing like it does from the bottle). \n\n");
			break;
		case R.id.Buttonf7:
			profile = (ImageView) layout.findViewById(R.id.profile);
			profile.setImageResource(R.drawable.mustard);//crashes here
						
			name = (TextView) layout.findViewById(R.id.name);
			name.setText("\n\nName:\n\n\t Garlic Mustard\n\n");
			
			height = (TextView) layout.findViewById(R.id.height);
			height.setText("\n\nHeight:\n\n\t They grow to be 1.2 metres tall.\n\n");
			bloom = (TextView) layout.findViewById(R.id.bloom);
			bloom.setText("\n\nWhen They Bloom:\n\n\t They bloom in April and May.\n\n");
			life = (TextView) layout.findViewById(R.id.life);
			life.setText("\n\nHow Long Do They Live?\n\n\t They are biennials so the live for only 2 years.\n\n ");
			facts = (TextView) layout.findViewById(R.id.facts);
			facts.setText("\n\nFun Facts:\n\n\t  Garlic Mustard is neither a garlic nor is it used to make mustard, it is however an invasive species. \n\n");
			break;
		case R.id.Buttonf8:
			profile = (ImageView) layout.findViewById(R.id.profile);
			profile.setImageResource(R.drawable.perwinkle);//crashes here
						
			name = (TextView) layout.findViewById(R.id.name);
			name.setText("\n\nName:\n\n\t Periwinkle\n\n");
			
			height = (TextView) layout.findViewById(R.id.height);
			height.setText("\n\nHeight:\n\n\t They grow to be 0.1-0.15 metres tall.\n\n");
			bloom = (TextView) layout.findViewById(R.id.bloom);
			bloom.setText("\n\nWhen They Bloom:\n\n\t They bloom in May and June.\n\n");
			life = (TextView) layout.findViewById(R.id.life);
			life.setText("\n\nHow Long Do They Live?\n\n\t They are perennials so they live for greater than 2 years.\n\n ");
			facts = (TextView) layout.findViewById(R.id.facts);
			facts.setText("\n\nFun Facts:\n\n\t  Periwinkle can refer to two North American flowers, vinca major and vinca minor. Both are invasive species.  \n\n");
			break;
		case R.id.Buttonf9:
			profile = (ImageView) layout.findViewById(R.id.profile);
			profile.setImageResource(R.drawable.pine);//crashes here
						
			name = (TextView) layout.findViewById(R.id.name);
			name.setText("\n\nName:\n\n\t White Pine\n\n");
			
			height = (TextView) layout.findViewById(R.id.height);
			height.setText("\n\nHeight:\n\n\t They grow to be 25-33 metres tall.\n\n");
			bloom = (TextView) layout.findViewById(R.id.bloom);
			bloom.setText("\n\nWhen They Bloom:\n\n\t They don't necessarily have a set time that they bloom. To ripen, the cones sometimes take 3 years.\n\n");
			life = (TextView) layout.findViewById(R.id.life);
			life.setText("\n\nHow Long Do They Live?\n\n\t They are perennials so they live for greater than 2 years.\n\n ");
			facts = (TextView) layout.findViewById(R.id.facts);
			facts.setText("\n\nFun Facts:\n\n\t  Pine tree's have needles instead of typical leaves and to distinguish a white pine look at the number of needles per grouping, if there are five (the number of letters in \"white\") then it is a white pine.  \n\n");
			break;
		case R.id.Buttonf10:
			profile = (ImageView) layout.findViewById(R.id.profile);
			profile.setImageResource(R.drawable.rose);//crashes here
						
			name = (TextView) layout.findViewById(R.id.name);
			name.setText("\n\nName:\n\n\t Prickly Wild Rose\n\n");
			
			height = (TextView) layout.findViewById(R.id.height);
			height.setText("\n\nHeight:\n\n\t They grow to be 1-3 metres tall.\n\n");
			bloom = (TextView) layout.findViewById(R.id.bloom);
			bloom.setText("\n\nWhen They Bloom:\n\n\t They bloom in June and July.\n\n");
			life = (TextView) layout.findViewById(R.id.life);
			life.setText("\n\nHow Long Do They Live?\n\n\t They are perennials so they live for greater than 2 years.\n\n ");
			facts = (TextView) layout.findViewById(R.id.facts);
			facts.setText("\n\nFun Facts:\n\n\t  The Prickly Wild Rose has rosebuds that are used for jelly and tea (note: please do not eat or attempt to cook with.  \n\n");
			break;
		case R.id.Buttonf11:
			profile = (ImageView) layout.findViewById(R.id.profile);
			profile.setImageResource(R.drawable.susan);//crashes here
						
			name = (TextView) layout.findViewById(R.id.name);
			name.setText("\n\nName:\n\n\t Black-Eyed Susan\n\n");
			
			height = (TextView) layout.findViewById(R.id.height);
			height.setText("\n\nHeight:\n\n\t They grow to be 0.3-1 metres tall.\n\n");
			bloom = (TextView) layout.findViewById(R.id.bloom);
			bloom.setText("\n\nWhen They Bloom:\n\n\t They bloom in July-September.\n\n");
			life = (TextView) layout.findViewById(R.id.life);
			life.setText("\n\nHow Long Do They Live?\n\n\t They are perennials so they live for greater than 2 years.\n\n ");
			facts = (TextView) layout.findViewById(R.id.facts);
			facts.setText("\n\nFun Facts:\n\n\t  There are many flowers that have the name \"Black-eyed Susan\" but the specific one I am referring to has the scientific name Rudbeckia hirta .  \n\n");
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