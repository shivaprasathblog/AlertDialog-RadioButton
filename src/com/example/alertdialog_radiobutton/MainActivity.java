package com.example.alertdialog_radiobutton;

import com.example.alertdialog_checkbox.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	Button alert;
	String[] level = { "Easy", "Diffcult", "Very Diffcult" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		alert = (Button) findViewById(R.id.button1);

		alert.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);	
				dialog.setTitle("Diffculty Level");
				// dialog.setSingleChoiceItems(items, checkedItem, listener)
				dialog.setSingleChoiceItems(level, -1,new DialogInterface.OnClickListener()
						 
				{

							@Override
							public void onClick(DialogInterface dialog,int which)
									
							{
								// TODO Auto-generated method stub

							}
						});
				
				dialog.setPositiveButton("OK",new DialogInterface.OnClickListener() 
						
				{

							@Override
							public void onClick(DialogInterface dialog,
									int which)
							{
								// TODO Auto-generated method stub

							}
						});
				dialog.setNegativeButton("Cancel",new DialogInterface.OnClickListener() 
				{
	
					@Override
					public void onClick(DialogInterface dialog, int which) 
					{
						// TODO Auto-generated method stub
		
					}
				});
				dialog.create();
				dialog.show();

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
