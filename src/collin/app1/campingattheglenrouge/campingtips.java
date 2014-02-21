package collin.app1.campingattheglenrouge;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Spinner;
import android.widget.TextView;
import collin.app1.campingattheglenrouge.R;

public class campingtips extends Activity implements OnItemSelectedListener {
	TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.campingtips_activity);
        Spinner spinner = (Spinner) findViewById(R.id.ctspin1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.campOptions, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        tv1= (TextView)findViewById(R.id.tvCamp);
    }

	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
			switch((int) arg3){
				case 0:
					tv1.setText("\n Things People Forget to Bring:\n\n\t - metal grill (for cooking over the fire)"+
				"\n\n\t - bug spray \n\n\t - marshmallows \n\n\t - matches or lighters"+
							"\n\n\t - utility knife \n\n\t - camp chairs");
					break;
				case 1:
					tv1.setText("How to Make a Fire:\n\n\t 1. Come to the front office and buy wood! (kindling and larger wood)\n\n\t 2."
							+" Locate your firepit (if you do not have a pit find a worker and ask them to dig you one)." +
							"\n\n\t 3. Crumple up sheets of newspaper into tightly packed balls and then pile the balls together ontop of the pit."+
							"\n\n\t 4. Put pieces of kindling (with one end touching the ground and the other over the centre of the pile) around the whole paper pile. Try to make sure there are a few air holes but still a significant amount of kindling."+
							"\n\n\t 5. Light the newspaper on fire close to the ground on all sides."+
							"\n\n\t 6. When the flames get somewhat high and the kindling on fire, add the larger pieces one at a time until satisfied with your fire."+
							"\n\n\n\n\t **This is only one way to make a fire, there are many more ways.");

					break;
				case 2:
					tv1.setText("How to Set Up a Tent:\n\n\t 1. Open the tent bag and take the poles out. Put together the poles and lay them down."+
				"\n\n\t 2. Take the tent out of the bag, unfold it, and lay it down flat in the position you want it."+
							"\n\n\t 3. While still flat to the ground, run the poles through the \"pockets\" (these pockets or pole slots should follow the edges of the tent)." +
									"\n\n\t 4. When all the poles are in their slots, insert the thick metal pins on the corners of the tent in the ends of the respective poles."+
							"\n\n\t 5. Now that your tent has taken shape, peg the corners into the ground."+
									"\n\n\t 6. If you still have a tarp-like thing in your bag (called a fly) then find the clips or hooks that connect it over the mesh part of the tent (if you think it will rain or want to stay warmer)."+
							"\n\n\n\n **note: Not all tents are set up this way. Although this may be the most common method, please refer to any instruction guides or pictures for refernce when constructing.");

					break;
				case 3:
					tv1.setText("Tips For Cooking on the Fire:\n\n\t - there are 3 common ways to cook with a fire: tinfoil in the coals, on a fire grill, or on a cast iron pot in the coals"+
				"\n\n\t - fires/coals typically take longer than an oven or bbq to cook meat"+
							"\n\n\t - when cooking in tinfoil remember it gets very hot, use gloves");

					break;

			}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}
}