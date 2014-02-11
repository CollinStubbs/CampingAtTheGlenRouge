package collin.app1.campingattheglenrouge;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import collin.app1.campingattheglenrouge.R;
 
public class calendar extends Activity implements OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar_activity);
        Button b1 = (Button) findViewById(R.id.even);
        b1.setOnClickListener(this);
        
        Button b2 = (Button) findViewById(R.id.maps);
        b2.setOnClickListener(this);
    }

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId()){
		case R.id.maps:
			Intent intent = new Intent(arg0.getContext(), maps.class);
			startActivityForResult(intent, 0);
			Toast.makeText(getApplicationContext(), "Sorry, Maps is currently unavailable.",
					   Toast.LENGTH_LONG).show();
			
			break;
		case R.id.even:
			Intent intent1 = new Intent(arg0.getContext(), events.class);
			startActivityForResult(intent1, 0);
			break;
			
		}
		
		
	}


}