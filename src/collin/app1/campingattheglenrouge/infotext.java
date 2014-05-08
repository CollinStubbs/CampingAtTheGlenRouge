package collin.app1.campingattheglenrouge;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import collin.app1.campingattheglenrouge.R;
 
public class infotext extends Activity implements OnItemSelectedListener{
TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.infotext_activity);
        tv1 = (TextView)findViewById(R.id.dynamText); 
     //create a spinner with options, if option is chosen display below  
        
        Spinner spinner = (Spinner) findViewById(R.id.optionList);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.infoOptions, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        
    }
    public void onItemSelected(AdapterView<?> parent, View view,
    		int pos, long id) {


    	switch((int)id){

    		case 0:
    			String hours = "Office Hours:\n\tSummer: 9:00am - 10:00pm\n\tFall: 10:00am - 6:00pm";
    			tv1.setText(hours);
    			tv1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 35);

    			break;
    		case 1:
    			String products = "Wood - $8/bag (kindling and fuel wood available)\n\n\n" +
    					"Ice - $2.75/bag (crushed and on occasion blocks)";
				tv1.setText(products);
				tv1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25);

    			break;
    		case 2:
    			String bookings = "For future reservations please visit our website:\n\n\n" +
    					"\n<a href='http://www.reservations.trca.on.ca/en/findbyattr.cgi?p=277'>Glen Rouge Reservations</a>\n" +
    					"\n Or give us a call at: \n 1-855-811-0111 (toll free), between 5:30 a.m.  to 10 p.m."+
    					"\n\n\n We can also process a reservation at arrival but please note that it is only for when you arrive and plan to stay that night, the gatehouse cannot do future reservations.";
    			tv1.setText(Html.fromHtml(bookings));
    			tv1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25);
    			tv1.setMovementMethod(LinkMovementMethod.getInstance());
    			

    			break;
    		case 3:
    			String group = "To inquire about Group Camp rentals please call: \n\n<a href='tel:4162872267'>(416) 287-2267</a>";
    			tv1.setText(Html.fromHtml(group));
    			tv1.setMovementMethod(LinkMovementMethod.getInstance());
    			tv1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25);
    			break;
    		}
    	}
    
    public void onNothingSelected(AdapterView<?> parent){
    	
    }


}