package com.loiseauelegante.relationshiplog;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		((Button) findViewById(R.id.add_button)).setOnClickListener(new View.OnClickListener()
	    {
			public void onClick(View paramAnonymousView)
			{
			    Intent localIntent = new Intent(MainActivity.this, AddEntryActivity.class);
			    MainActivity.this.startActivity(localIntent);
			} 
	    });
		
	    ((Button) findViewById(R.id.log_button)).setOnClickListener(new View.OnClickListener()
	    {
			public void onClick(View paramAnonymousView)
			{
			    Intent localIntent = new Intent(MainActivity.this, CalendarLogActivity.class);
			    MainActivity.this.startActivity(localIntent);
			} 
	    });
	    
	    ((Button) findViewById(R.id.procon_button)).setOnClickListener(new View.OnClickListener()
	    {
			public void onClick(View paramAnonymousView)
			{
			    Intent localIntent = new Intent(MainActivity.this, ProConActivity.class);
			    MainActivity.this.startActivity(localIntent);
			} 
	    });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
