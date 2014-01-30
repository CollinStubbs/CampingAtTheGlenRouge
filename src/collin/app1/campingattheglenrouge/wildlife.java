package collin.app1.campingattheglenrouge;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import collin.app1.campingattheglenrouge.R;

public class wildlife extends Activity implements OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wildlife_activity);
        Button fauna = (Button)findViewById(R.id.faunaButton);
        fauna.setOnClickListener(this);
        Button flora = (Button)findViewById(R.id.floraButton);
        flora.setOnClickListener(this);
    }
    @Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch(v.getId()){
		
		case R.id.faunaButton:
			
			Intent intent = new Intent(v.getContext(), fauna.class);
			startActivityForResult(intent, 0);
			
			break;
		case R.id.floraButton:
			
			Intent intent1 = new Intent(v.getContext(), flora.class);
			startActivityForResult(intent1, 0);
			
			break;
		
		}
		}

}