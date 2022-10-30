
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		login_page
	 *	@date 		Sunday 30th of October 2022 09:52:07 AM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package exportkit.figma;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class agu_activity extends Activity {

	
	private View _bg__agu_ek2;
	private View rectangle_1_ek8;
	private View rectangle_13_ek6;
	private ImageView _42_3_ek6;
	private View rectangle_3_ek7;
	private TextView _manage_slots_ek11;
	private TextView _events_ek9;
	private TextView _evaluation_ek8;
	private TextView _create_event_ek7;
	private TextView _settings_ek11;
	private TextView _logout_ek7;
	private ImageView vector_ek13;
	private TextView a_g_u;
	private ImageView asset_1_1_ek9;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.agu);

		
		_bg__agu_ek2 = (View) findViewById(R.id._bg__agu_ek2);
		rectangle_1_ek8 = (View) findViewById(R.id.rectangle_1_ek8);
		rectangle_13_ek6 = (View) findViewById(R.id.rectangle_13_ek6);
		_42_3_ek6 = (ImageView) findViewById(R.id._42_3_ek6);
		rectangle_3_ek7 = (View) findViewById(R.id.rectangle_3_ek7);
		_manage_slots_ek11 = (TextView) findViewById(R.id._manage_slots_ek11);
		_events_ek9 = (TextView) findViewById(R.id._events_ek9);
		_evaluation_ek8 = (TextView) findViewById(R.id._evaluation_ek8);
		_create_event_ek7 = (TextView) findViewById(R.id._create_event_ek7);
		_settings_ek11 = (TextView) findViewById(R.id._settings_ek11);
		_logout_ek7 = (TextView) findViewById(R.id._logout_ek7);
		vector_ek13 = (ImageView) findViewById(R.id.vector_ek13);
		a_g_u = (TextView) findViewById(R.id.a_g_u);
		asset_1_1_ek9 = (ImageView) findViewById(R.id.asset_1_1_ek9);
	
		
		_manage_slots_ek11.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), manage_slots_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_events_ek9.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), event_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_evaluation_ek8.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), eval_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_create_event_ek7.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), creat_event_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_settings_ek11.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), settings_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_logout_ek7.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), login_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	