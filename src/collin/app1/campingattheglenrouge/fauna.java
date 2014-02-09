package collin.app1.campingattheglenrouge;

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
import collin.app1.campingattheglenrouge.R;

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
			pw = new PopupWindow(layout, getApplicationContext().getResources().getDisplayMetrics().widthPixels, getApplicationContext().getResources().getDisplayMetrics().heightPixels, true);
	        pw.setBackgroundDrawable(new BitmapDrawable());
			pw.showAtLocation(layout, Gravity.CENTER, 0, 0);
			

			

	
	    	    // The code below assumes that the root container has an id called 'main'
	  switch(v.getId()){
		case R.id.Button1:
			profile = (ImageView) layout.findViewById(R.id.profile);
			profile.setImageResource(R.drawable.deer1);//crashes here
						
			name = (TextView) layout.findViewById(R.id.name);
			name.setText("\n\nName:\n\n\t White-Tailed Deer\n\n");
			
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
			size.setText("Mass:\n\n\t 41-141 kg's depending on age and gender \n\n ");
			

			
			break;
			
		case R.id.Button2:
			
			profile = (ImageView) layout.findViewById(R.id.profile);
			profile.setImageResource(R.drawable.raccoon1);
						
			name = (TextView) layout.findViewById(R.id.name);
			name.setText("\n\nName:\n\n\t Raccoon\n\n");
			
			live = (TextView) layout.findViewById(R.id.live);
			live.setText("Where They Live:\n\n\t All throughout the sourthern Canadian Provinces, the rest of North America, and various European and Asian countries.\n\n");
			
			//spread = (ImageView) findViewById(R.id.spread);
			//spread.setImageResource(R.drawable.)
			
			eat = (TextView) layout.findViewById(R.id.eat);
			eat.setText("What They Eat:\n\n\t Raccoons eat almost anything edibile that they can get their paws on. This ranges from wild bird eggs, vegetables, and fruit to worms, frogs, and whatever they can pick out of the garbage (so remember to keep your site clean)! \n\n");
			
			lifespan = (TextView) layout.findViewById(R.id.lifespan);
			lifespan.setText("Lifespan:\n\n\t They live for approximately 5 years.\n\n");
			
			relatives = (TextView) layout.findViewById(R.id.relatives);
			relatives.setText("Relatives:\n\n\t olingos, coatis, ring-tailed cats\n\n");
			
			size = (TextView) layout.findViewById(R.id.size);
			size.setText("Mass:\n\n\t 5-12 kg's depending on age\n\n ");
			break;
			
		case R.id.Button3:
			
			profile = (ImageView) layout.findViewById(R.id.profile);
			profile.setImageResource(R.drawable.groundhog1);
						
			name = (TextView) layout.findViewById(R.id.name);
			name.setText("\n\nName:\n\n\t Groundhog\n\n");
			
			live = (TextView) layout.findViewById(R.id.live);
			live.setText("Where They Live:\n\n\t All throughout Canada and the east side of the U.S.A\n\n");
			
			//spread = (ImageView) findViewById(R.id.spread);
			//spread.setImageResource(R.drawable.)
			
			eat = (TextView) layout.findViewById(R.id.eat);
			eat.setText("What They Eat:\n\n\t Groundhogs eat grasses, grubs, insects, snails, and nuts. They are mostly herbivorous. \n\n");
			
			lifespan = (TextView) layout.findViewById(R.id.lifespan);
			lifespan.setText("Lifespan:\n\n\t They live for approximately 3 years.\n\n");
			
			relatives = (TextView) layout.findViewById(R.id.relatives);
			relatives.setText("Relatives:\n\n\t squirrels, chipmunks, marmots\n\n");
			
			size = (TextView) layout.findViewById(R.id.size);
			size.setText("Mass:\n\n\t 2-14 kg's depending on age and the number of predators in the habitat\n\n ");
			break; 
			
		case R.id.Button4:
			
			profile = (ImageView) layout.findViewById(R.id.profile);
			profile.setImageResource(R.drawable.egsquirrel1);
						
			name = (TextView) layout.findViewById(R.id.name);
			name.setText("\n\nName:\n\n\t Eastern Grey Squirrel\n\n");
			
			live = (TextView) layout.findViewById(R.id.live);
			live.setText("Where They Live:\n\n\t Southern Ontario, parts of southern Manitoba and Saskatchewan, and the eastern half of the U.S.A\n\n");
			
			//spread = (ImageView) findViewById(R.id.spread);
			//spread.setImageResource(R.drawable.)
			
			eat = (TextView) layout.findViewById(R.id.eat);
			eat.setText("What They Eat:\n\n\t Eastern Grey Squirrels eat primarily bark, berries, seeds, nuts, and fungi.  \n\n");
			
			lifespan = (TextView) layout.findViewById(R.id.lifespan);
			lifespan.setText("Lifespan:\n\n\t They live for approximately 12.5 years.\n\n");
			
			relatives = (TextView) layout.findViewById(R.id.relatives);
			relatives.setText("Relatives:\n\n\t groundhogs, chipmunks, marmots\n\n");
			
			size = (TextView) layout.findViewById(R.id.size);
			size.setText("Mass:\n\n\t .4-.6 kg's depending on age \n\n ");
			break; 
			
		case R.id.Button5:
			
			profile = (ImageView) layout.findViewById(R.id.profile);
			profile.setImageResource(R.drawable.redsquirrel1);
						
			name = (TextView) layout.findViewById(R.id.name);
			name.setText("\n\nName:\n\n\t American Red Squirrel\n\n");
			
			live = (TextView) layout.findViewById(R.id.live);
			live.setText("Where They Live:\n\n\t Anywhere in North America where there are Pine tree's, except near the Pacific Ocean.\n\n");
			
			//spread = (ImageView) findViewById(R.id.spread);
			//spread.setImageResource(R.drawable.)
			
			eat = (TextView) layout.findViewById(R.id.eat);
			eat.setText("What They Eat:\n\n\t American Red Squirrels eat primarily seeds, nuts, and fungi.   \n\n");
			
			lifespan = (TextView) layout.findViewById(R.id.lifespan);
			lifespan.setText("Lifespan:\n\n\t They live for approximately 3 years.\n\n");
			
			relatives = (TextView) layout.findViewById(R.id.relatives);
			relatives.setText("Relatives:\n\n\t groundhogs, chipmunks, marmots\n\n");
			
			size = (TextView) layout.findViewById(R.id.size);
			size.setText("Mass:\n\n\t .2-.25 kg's depending on age \n\n ");
			break; 
			
		case R.id.Button6:
			
			profile = (ImageView) layout.findViewById(R.id.profile);
			profile.setImageResource(R.drawable.bluejay1);
						
			name = (TextView) layout.findViewById(R.id.name);
			name.setText("\n\nName:\n\n\t Blue Jay\n\n");
			
			live = (TextView) layout.findViewById(R.id.live);
			live.setText("Where They Live:\n\n\t Southern Canadian provinces and the eastern half of the U.S.A\n\n");
			
			//spread = (ImageView) findViewById(R.id.spread);
			//spread.setImageResource(R.drawable.)
			
			eat = (TextView) layout.findViewById(R.id.eat);
			eat.setText("What They Eat:\n\n\t Blue Jays eat primarily seeds, nuts, legumes, berries, and grains.  \n\n");
			
			lifespan = (TextView) layout.findViewById(R.id.lifespan);
			lifespan.setText("Lifespan:\n\n\t They live for approximately 7 years.\n\n");
			
			relatives = (TextView) layout.findViewById(R.id.relatives);
			relatives.setText("Relatives:\n\n\t crows, ravens, rooks, magpies \n\n");
			
			size = (TextView) layout.findViewById(R.id.size);
			size.setText("Mass:\n\n\t .07-.1 kg's depending on age \n\n ");
			break; 
		case R.id.Button7:
			
			profile = (ImageView) layout.findViewById(R.id.profile);
			profile.setImageResource(R.drawable.woodpecker1);
						
			name = (TextView) layout.findViewById(R.id.name);
			name.setText("\n\nName:\n\n\t Downy Woodpecker\n\n");
			
			live = (TextView) layout.findViewById(R.id.live);
			live.setText("Where They Live:\n\n\t All over North America. \n\n");
			
			//spread = (ImageView) findViewById(R.id.spread);
			//spread.setImageResource(R.drawable.)
			
			eat = (TextView) layout.findViewById(R.id.eat);
			eat.setText("What They Eat:\n\n\t Downy Woodpeckers primarily eat insects but a small portion of their diet also consists of berries, seeds, and grains.  \n\n");
			
			lifespan = (TextView) layout.findViewById(R.id.lifespan);
			lifespan.setText("Lifespan:\n\n\t They live for approximately 2 years.\n\n");
			
			relatives = (TextView) layout.findViewById(R.id.relatives);
			relatives.setText("Relatives:\n\n\t piculets, wrynecks, sapsuckers\n\n");
			
			size = (TextView) layout.findViewById(R.id.size);
			size.setText("Mass:\n\n\t .02-.033 kg's depending on age \n\n ");
			break; 
			
		case R.id.Button8:
			
			profile = (ImageView) layout.findViewById(R.id.profile);
			profile.setImageResource(R.drawable.chick1);
						
			name = (TextView) layout.findViewById(R.id.name);
			name.setText("\n\nName:\n\n\t Black-Capped Chickadee \n\n");
			
			live = (TextView) layout.findViewById(R.id.live);
			live.setText("Where They Live:\n\n\t The southern Canadian provinces and northern American States. \n\n");
			
			//spread = (ImageView) findViewById(R.id.spread);
			//spread.setImageResource(R.drawable.)
			
			eat = (TextView) layout.findViewById(R.id.eat);
			eat.setText("What They Eat:\n\n\t Black-Capped Chickadee's eat insects, seeds, grains, and berries.  \n\n");
			
			lifespan = (TextView) layout.findViewById(R.id.lifespan);
			lifespan.setText("Lifespan:\n\n\t They live for approximately 6 years.\n\n");
			
			relatives = (TextView) layout.findViewById(R.id.relatives);
			relatives.setText("Relatives:\n\n\t tits, titmice \n\n");
			
			size = (TextView) layout.findViewById(R.id.size);
			size.setText("Mass:\n\n\t .009-.014 kg's depending on age \n\n ");
			break; 
			
		case R.id.Button9:
			
			profile = (ImageView) layout.findViewById(R.id.profile);
			profile.setImageResource(R.drawable.finch1);
						
			name = (TextView) layout.findViewById(R.id.name);
			name.setText("\n\nName:\n\n\t American Goldfinch \n\n");
			
			live = (TextView) layout.findViewById(R.id.live);
			live.setText("Where They Live:\n\n\t The southern Canadian provinces, the U.S.A, and parts of Mexico. \n\n");
			
			//spread = (ImageView) findViewById(R.id.spread);
			//spread.setImageResource(R.drawable.)
			
			eat = (TextView) layout.findViewById(R.id.eat);
			eat.setText("What They Eat:\n\n\t American Goldfinch's eat many types of seeds from trees and plants.  \n\n");
			
			lifespan = (TextView) layout.findViewById(R.id.lifespan);
			lifespan.setText("Lifespan:\n\n\t They live for approximately 4.5 years.\n\n");
			
			relatives = (TextView) layout.findViewById(R.id.relatives);
			relatives.setText("Relatives:\n\n\t rosefinches, grosbeaks, bullfinches \n\n");
			
			size = (TextView) layout.findViewById(R.id.size);
			size.setText("Mass:\n\n\t .011-.020 kg's depending on age \n\n ");
			break; 
		}
		} catch (Exception e) {
			e.printStackTrace();
			}
	}

	
}