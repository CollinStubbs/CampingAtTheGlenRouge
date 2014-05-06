package collin.app1.campingattheglenrouge;

import java.io.*;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.*;
import collin.app1.campingattheglenrouge.R;

public class activities extends Activity implements OnClickListener{
    PopupWindow pw;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activities_activity);
        
       Button map =(Button)findViewById(R.id.mappop);
       map.setOnClickListener(this);
       
       Button bb =(Button)findViewById(R.id.beachpop);
       bb.setOnClickListener(this);
       
       Button cp =(Button)findViewById(R.id.cedarpop);
       cp.setOnClickListener(this);
       
       Button ep =(Button)findViewById(R.id.eaglepop);
       ep.setOnClickListener(this);
       
       Button msp =(Button)findViewById(R.id.mastpop);
       msp.setOnClickListener(this);
       
       Button meap =(Button)findViewById(R.id.meanderpop);
       meap.setOnClickListener(this);
       
       Button op =(Button)findViewById(R.id.orchardpop);
       op.setOnClickListener(this);
       
       Button vp =(Button)findViewById(R.id.vistapop);
       vp.setOnClickListener(this);
       
       Button wp =(Button)findViewById(R.id.woodlandpop);
       wp.setOnClickListener(this);
       
       
       Button gp =(Button)findViewById(R.id.guidepop);
       gp.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        LayoutInflater inflater = (LayoutInflater) activities.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.imagepop,
        (ViewGroup) findViewById(R.id.im));
        pw = new PopupWindow(layout, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, true);
        pw.setBackgroundDrawable(new BitmapDrawable());
        pw.showAtLocation(layout, Gravity.TOP, 0, 0);
      
        TouchImageView touch = (TouchImageView)layout.findViewById(R.id.imageView1);
        TextView title = (TextView)layout.findViewById(R.id.textTitle);
        title.setTextSize(26);
        TextView abs = (TextView)layout.findViewById(R.id.abst);
        TextView bullets = (TextView)layout.findViewById(R.id.bullets);
        String mystring;
        SpannableString content;
        switch(v.getId()){
        case R.id.mappop:
                touch.setImageResource(R.drawable.map);
            break;
        case R.id.beachpop:
        		mystring = "Rouge Beach Trail";
        		content = new SpannableString(mystring);
        		content.setSpan(new UnderlineSpan(), 0, mystring.length(), 0);
        		title.setText(content);
        		abs.setText("\t\tMake a splash in Lake Ontario! Where the Rouge River meets Lake "+ 
				"Ontario, there’s a sandy beach and a wetland full of wildlife waiting for "+
				"you. The marshes at Rouge Beach are the best and biggest in Toronto and "+
				"the sandy beach is a popular summer spot for neighbours and visitors "+
				"alike. Enjoy the 1km Rouge Beach trail.");
        		bullets.setText("\t\t•  A view of Lake Ontario, shoreline to the east, and the mouth of the "+
				"Rouge River.\n"+
				"\t\t•  A variety of wetland and shoreline plants and animals.\n\n"+ 
				"\t\t•  Tranquil canoeing on river. No motorized boating permitted.\n\n"+
				"\t\t•  Fishing access. Seasonal provincial licence required.\n\n"+
				"\t\t•  Easily accessible boardwalk and pathway near marshes.\n\n"+
				"\t\t•  Access to Lake Ontario Waterfront Trail.\n\n"+
				"\t\t•  Washrooms, drinking water .\n\n"+
				"\t\t•  Swimming - the beach is open in accordance with Toronto Public "+
				"Health approval, lifeguard on duty when officially open.");
                touch.setImageResource(R.drawable.beach1);
            break;
        case R.id.cedarpop:
        		mystring = "Cedar Trail";
        		content = new SpannableString(mystring);
        		content.setSpan(new UnderlineSpan(), 0, mystring.length(), 0);
        		title.setText(content);
        		abs.setText("\t\tExperience the cool green of mature forest as it shelters the "+ 
        		"lush valley lands, see butterflies fluttering through a meadow, and "+
        		"listen for frogs at the wetlands");
        		bullets.setText("\t\t•  Small streams that flow into Little Rouge Creek, and Little Rouge Creek itself.\n"+
        						"\n\t\t•  Wetland and meadow species near southern sections of the trail, forest species in northern sections.\n"+
        						"\n\t\t•  From the south trailhead, you can see the hill from an old landfill site that is being renaturalized, and wetlands created in the excavated areas where soil was removed to cover the site.");
                touch.setImageResource(R.drawable.cedar1);
            break;
        case R.id.eaglepop:
        	mystring = "Glen Eagles Vista Trail";
        	content = new SpannableString(mystring);
    		content.setSpan(new UnderlineSpan(), 0, mystring.length(), 0);
    		title.setText(content);
        	abs.setText("\t\tOutstanding scenery all year, but especially pretty in autumn."
        			+" From this viewpoint you can see the Rouge River and Little Rouge Creek"
        			+" valleys and a provincially-significant geologic feature. This easy trail"
        			+" is flat and accessible for wheelchairs and other mobility devices.");
        	bullets.setText("\t\t•  An outdoor interpretive exhibit provides visitors with information on the scenery and some background on the history of the site.\n"+
        				"\n\t\t•  Outstanding views of river valleys and natural erosion.\n"+
        				"\n\t\t•  Short trail with interpretive signs and native vegetation.");
                touch.setImageResource(R.drawable.eagle1);
            break;
        case R.id.mastpop:
        	mystring = "Mast Trail";
        	content = new SpannableString(mystring);
    		content.setSpan(new UnderlineSpan(), 0, mystring.length(), 0);
    		title.setText(content);
        	abs.setText("\t\tWalk a 200 year old logging route. Over a century ago large trees were cut and floated down the river to the lake, bound for ship building yards in Europe. The trail leads over the “hog’s back”, or ridge, to Twyn Rivers Drive");
        	bullets.setText("\t\t•  A variety of forest plants and animals.\n"+
"\n\t\t•  Mature forests with lush understorey of ferns and other plants.\n"+
"\n\t\t•  Steep grades and stairs, but worth the climb!\n"+
"\n\t\t•  If you’re lucky, you can spot interior forest birds like the ovenbird.\n");
        	
                touch.setImageResource(R.drawable.mast1);
            break;
        case R.id.meanderpop:
        	mystring = "Finch Meander Trail";
        	content = new SpannableString(mystring);
    		content.setSpan(new UnderlineSpan(), 0, mystring.length(), 0);
    		title.setText(content);
        	abs.setText("\t\tThis short trail immediately immerses you into the wilderness. Nestled in along a curve in the Rouge River, enjoy the sights and sounds of nature.");
        	bullets.setText("\t\t•  A colourful selection of wildflowers and ancient maple trees along the trail.\n"+
"\n\t\t•  Ancient maple trees offering shade.\n"+
"\n\t\t•  Look carefully and you may spot the serenading songbirds.\n"+
"\n\t\t•  Listen to the Rouge River as it flows over a rocky riverbed.");
                touch.setImageResource(R.drawable.meander1);
            break;
        case R.id.orchardpop:
        	mystring = "Orchard Trail";
        	content = new SpannableString(mystring);
    		content.setSpan(new UnderlineSpan(), 0, mystring.length(), 0);
    		title.setText(content);
        	abs.setText("\t\tWitness nature reclaiming the land as regenerating forests merge with remnants of an agricultural past.");
        	bullets.setText("\t\t•  From the north trailhead, you can see the hill from an old landfill site that is being revegetated, and wetlands created in the excavated areas where soil was removed to cover the garbage."+
"\n\t\t•  From the south trailhead at Twyn Rivers Drive, you can see an old ski hill and the pieces of an old concrete dam that was once used to back up the river for swimming when a hotel stood on the site.");
                touch.setImageResource(R.drawable.orchard1);
            break;
        case R.id.vistapop:
        	mystring = "Vista trail";
        	content = new SpannableString(mystring);
    		content.setSpan(new UnderlineSpan(), 0, mystring.length(), 0);
    		title.setText(content);
        	abs.setText("\t\tPanoramic bluffs, view of the Little Rouge Creek and Rouge River valleys. From the north trailhead you’ll find an easily accessible 1.5 km loop route, offering panoramic view of the Little Rouge Creek valley");
        	bullets.setText("\t\t•  A mix of forest and meadow offers a variety of plant and animal life."+
"\n\t\t•  Steep bluffs provide breathtaking views of the river valleys. "+
"\n\t\t•  Be sure to check out the Ontario Power Generation viewing deck!");
                touch.setImageResource(R.drawable.vista1);
            break;
        case R.id.woodlandpop:
        	mystring = "Woodland Trail";
        	abs.setText("\t\tEasy trail, flat and relatively accessible for mobility devices for 1.5 km. Follow the entire 2.5 km trail for a moderately challenging hike. The mix of forest and meadow views offers opportunities for a variety of plant and animal spotting");
        	bullets.setText("\t\t•  Little Rouge Creek and the valley."+
"\n\t\t•  Young trees planted to build new forests."+
"\n\t\t•  Remnants of a cottage area flooded by Hurricane Hazel in 1954. "+
"\n\t\t•  Wildlife viewing opportunities");
                touch.setImageResource(R.drawable.woodland1);
            break;
        case R.id.guidepop:
        		touch.setImageResource(R.drawable.parkguide);
        	break;
            
        }
        // TODO Auto-generated method stub
        
    }


}