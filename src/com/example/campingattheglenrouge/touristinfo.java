package com.example.campingattheglenrouge;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;

public class touristinfo extends Activity implements OnClickListener{
	PopupWindow pw;
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
    }

	@Override
	public void onClick(View v) {
		LayoutInflater inflater = (LayoutInflater) touristinfo.this
		.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View layout = inflater.inflate(R.layout.faunapop,
		(ViewGroup) findViewById(R.id.fpl));
		pw = new PopupWindow(layout, 600, 670, true);
        pw.setBackgroundDrawable(new BitmapDrawable());
		pw.showAtLocation(layout, Gravity.CENTER, 0, 0);
		title = (TextView) layout.findViewById(R.id.tpoptitle);
		location = (TextView) layout.findViewById(R.id.tpoploc);
		trans = (TextView) layout.findViewById(R.id.tpoptran);
		dir = (TextView) layout.findViewById(R.id.tpopdir);
		desc = (TextView) layout.findViewById(R.id.tpopdesc);
		// TODO Auto-generated method stub
		switch(v.getId()){
			case R.id.wonderland:
				title.setText("Canada's Wonderland");
				location.setText("Address: 9580 Jane St, Vaughan (48.5 km from the campground)");
				trans.setText("Accessible through public transit? Yes!");
				dir.setText("Directions on Public Transport:\n\n\t Walk to the GO Bus stop on the North-East corner of the intersection at Kingston and Port Union. Get on the Westbound route 92 GO Bus to York Mills, get off and get on the Northbound route 60 GO Bus to Wonderland.");
				desc.setText("Description of the Venue:\n\n\t Canada's Wonderland is a family oriented amusement park. There may be steep and thrilling rides but there is also a large childrens section as well as a theatre and many other activities for a fun day!");
				break;
			case R.id.rom:
				title.setText("Royal Ontario Museum");
				location.setText("Address: 100 Queens Park, Toronto (32.3 km from the campground)");
				trans.setText("Accessible through public transit? Yes!");
				dir.setText("Directions on Public Transport:\n\n\t Walk to the GO Bus stop on the North-East corner of the intersection at Kingston and Port Union. Get on the Westbound route 92 GO Bus to Yorkdale, get off and get on the southbound TTC yellow line subway route. Take the subway to Museum Station and get off, upstairs is the museum!");
				desc.setText("Description of the Venue:\n\n\t The Royal Ontario Museum is one of the largest and best museums in the world. It has everything from dinosaurs to mummified Egyptian remains to ancient Chinese pottery.");
				break;
			case R.id.tower:
				title.setText("CN Tower");
				location.setText("Address: 301 Front St W, Toronto (35.9 km's from the campground)");
				trans.setText(" Accessible through public transit? Yes!  " );
				dir.setText("Directions on Public Transport: \n\n\tWalk to the TTC bus stop on the North-Wast corner of the intersection at Kingston and Port Union. Get on the bus and go to the Rouge Hill Train Station (any bus from this location will go to the train station). Buy a roundtrip ticket to Union Station, get on the train, get off at Union Station, and take the Skywalk straigh to the CN Tower!");
				desc.setText("Description of the Venue:\n\n\t The CN Tower is one of the worlds largest towers, it has a great viewing deck, a glass floor, a restaurant, and the SkyWalk activity which allows you to walk outside!");
				break;
			case R.id.science:
				title.setText("");
				location.setText("");
				trans.setText("");
				dir.setText("");
				desc.setText("");
				break;
			case R.id.aquarium:
				title.setText("");
				location.setText("");
				trans.setText("");
				dir.setText("");
				desc.setText("");
				break;
			case R.id.rogers:
				title.setText("");
				location.setText("");
				trans.setText("");
				dir.setText("");
				desc.setText("");
				break;
			case R.id.zoo:
				title.setText("");
				location.setText("");
				trans.setText("");
				dir.setText("");
				desc.setText("");
				break;
		}
	}


}