package com.example.campingattheglenrouge;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

public class touristinfo extends Activity implements OnClickListener{
	PopupWindow pw;
	ImageView im;
	TextView title;
	TextView location;
	TextView trans;
	TextView dir;
	TextView desc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.touristinfo_activity);
        
        Button wonder = (Button) findViewById(R.id.wonderland);
        wonder.setOnClickListener(this);
        
        Button rom = (Button) findViewById(R.id.rom);
        rom.setOnClickListener(this);
        
        Button tower = (Button) findViewById(R.id.tower);
        tower.setOnClickListener(this);
        
        Button sci = (Button) findViewById(R.id.science);
        sci.setOnClickListener(this);
        
        Button aqua = (Button) findViewById(R.id.aquarium);
        aqua.setOnClickListener(this);
        
        Button rogers = (Button) findViewById(R.id.rogers);
        rogers.setOnClickListener(this);
        
        Button zoo = (Button) findViewById(R.id.zoo);
        zoo.setOnClickListener(this);
        
      ImageButton tour = (ImageButton) findViewById(R.id.tour);
        tour.setOnClickListener(this);
  
        
        ImageButton sights = (ImageButton) findViewById(R.id.pass);
        sights.setOnClickListener(this); 
   
        
        
    }

	@Override
	public void onClick(View v) {
		
		if(v.getId() != R.id.pass && v.getId() != R.id.tour){
			LayoutInflater inflater = (LayoutInflater) touristinfo.this
			.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View layout = inflater.inflate(R.layout.tourpop,
			(ViewGroup) findViewById(R.id.tpl));
			pw = new PopupWindow(layout, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, true);
	        pw.setBackgroundDrawable(new BitmapDrawable());
			pw.showAtLocation(layout, Gravity.CENTER, 0, 0);
			im = (ImageView) layout.findViewById(R.id.tpi);
			title = (TextView) layout.findViewById(R.id.tpoptitle);
			location = (TextView) layout.findViewById(R.id.tpoploc);
			trans = (TextView) layout.findViewById(R.id.tpoptran);
			dir = (TextView) layout.findViewById(R.id.tpopdir);
			desc = (TextView) layout.findViewById(R.id.tpopdesc);
			// TODO Auto-generated method stub
			switch(v.getId()){
				case R.id.wonderland:
					im.setImageResource(R.drawable.wonderland);
					title.setText("Canada's Wonderland");
					location.setText("Address: \n\n\t\t 9580 Jane St, Vaughan (48.5 km from the campground)\n");
					trans.setText("Accessible through public transit? \n\n\t\tYes!\n");
					dir.setText("Directions on Public Transport:\n\n\t\t Walk to the GO Bus stop on the North-East corner of the intersection at Kingston and Port Union. Get on the Westbound route 92 GO Bus to York Mills, get off and get on the Northbound route 60 GO Bus to Wonderland.\n");
					desc.setText("Description of the Venue:\n\n\t\t Canada's Wonderland is a family oriented amusement park. There may be steep and thrilling rides but there is also a large childrens section as well as a theatre and many other activities for a fun day!\n\n");
					break;
				case R.id.rom:
					im.setImageResource(R.drawable.rom);
					title.setText("Royal Ontario Museum");
					location.setText("Address: \n\n\t\t 100 Queens Park, Toronto (32.3 km from the campground)\n");
					trans.setText("Accessible through public transit?\n\n\t\t Yes!\n");
					dir.setText("Directions on Public Transport:\n\n\t\t Walk to the GO Bus stop on the North-East corner of the intersection at Kingston and Port Union. Get on the Westbound route 92 GO Bus to Yorkdale, get off and get on the southbound TTC yellow line subway route. Take the subway to Museum Station and get off, upstairs is the museum!\n");
					desc.setText("Description of the Venue:\n\n\t\t The Royal Ontario Museum is one of the largest and best museums in the world. It has everything from dinosaurs to mummified Egyptian remains to ancient Chinese pottery.\n\n");
					break;
				case R.id.tower:
					im.setImageResource(R.drawable.tower);
					title.setText("CN Tower");
					location.setText("Address: \n\n\t\t 301 Front St W, Toronto (35.9 km's from the campground)\n");
					trans.setText("Accessible through public transit?\n\n\t\t Yes! \n " );
					dir.setText("Directions on Public Transport: \n\n\t\t Walk to the TTC bus stop on the North-West corner of the intersection at Kingston and Port Union. Get on the southbound route 85 bus and go to the Rouge Hill Train Station (any bus from this location will go to the train station). Buy a roundtrip ticket to Union Station, get on the train, get off at Union Station, and take the Skywalk straight to the CN Tower!\n");
					desc.setText("Description of the Venue:\n\n\t\t The CN Tower is one of the worlds largest towers, it has a great viewing deck, a glass floor, a restaurant, and the SkyWalk activity which allows you to walk outside!\n\n");
					break;
				case R.id.science:
					im.setImageResource(R.drawable.science);
					title.setText("Ontario Science Centre");
					location.setText("Address: \n\n\t\t 770 Don Mills Rd, Toronto (23.7 km's from the campground)\n");
					trans.setText("Accessible through public transit?\n\n\t\t Yes!\n");
					dir.setText("Directions on Public Transport: \n\n\t\t Walk to the TTC bus stop on the North-East corner of the intersection at Kingston and Port Union. Get on the route 85A bus going Northbound to Don Mills Station. Get off at Don Mills Station and get on the Southbound route 25 bus to Rochefort Drive, you have arrived infront of the parking lot, follow the sidewalk southbound for a little bit and it will be right there!\n ");
					desc.setText("Description of the Venue:\n\n\t\t The Ontario Science Centre is a very large facility dedicated to teaching about science, there's many fun things to do with and entertain the whole family!\n\n");
					break;
				case R.id.aquarium:
					im.setImageResource(R.drawable.aquarium);
					title.setText("Ripleys Aquarium of Canada");
					location.setText("Address: \n\n\t\t 288 Bremner Blvd, Toronto (35.9 km's from the campground)\n");
					trans.setText("Accessible through public transit?\n\n\t\t Yes!\n");
					dir.setText("Directions on Public Transport: \n\n\t\t Walk to the TTC bus stop on the North-West corner of the intersection at Kingston and Port Union. Get on the southbound route 85 bus and go to the Rouge Hill Train Station (any bus from this location will go to the train station). Buy a roundtrip ticket to Union Station, get on the train, get off at Union Station, and take the Skywalk straight to the Aquarium!\n");
					desc.setText("\n\nDescription of the Venue:\n\n\t\t The aquarium is one of Toronto's newest attractions, it is a great place to take the family and it is right beside the CN Tower which would make for a great outing!\n\n");
					break;
				case R.id.rogers:
					
					title.setText("Rogers Centre");
					location.setText("Address:\n\n\t\t1 Blue Jays Way, Toronto (36.7 km's from the campground)\n");
					trans.setText("Accessible through public transit?\n\n\t\t Yes!\n");
					dir.setText("Directions on Public Transport: \n\n\t Walk to the TTC bus stop on the North-West corner of the intersection at Kingston and Port Union. Get on the southbound route 85 bus and go to the Rouge Hill Train Station (any bus from this location will go to the train station). Buy a roundtrip ticket to Union Station, get on the train, get off at Union Station, and take the Skywalk straight to the Roger's Centre!\n ");
					desc.setText("Description of the Venue:\n\n\t The Rogers Centre is a stadium where sports games (baseball and football mostly) are held!\n\n");
					break;
				case R.id.zoo:
					title.setText("Toronto Zoo");
					location.setText("Address:\n\n\t\t2000 Meadowvale Road, Toronto (5.1 km's from the campground)\n");
					trans.setText("Accessible through public transit? \n\n\t\t Yes!\n");
					dir.setText("Directions on Public Transport: \n\n\t Walk to the TTC bus stop on the North-East corner of the intersection at Kingston and Port Union. Get on the route 85A bus going Northbound to the zoo.\n");
					desc.setText("Description of the Venue:\n\n\t The Toronto Zoo is one of the largest and best zoos in the world, a great place for a family adventure!\n\n");
					break;
			}
		}
		else{
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            
            
			switch(v.getId()){
			case R.id.pass:
				intent.setData(Uri.parse("http://www.citypass.com/toronto"));
				break;
			case R.id.tour:
				intent.setData(Uri.parse("http://www.citysightseeingtoronto.com/"));
				break;
				
			}
			startActivity(intent);
		}
		
		
	}


}