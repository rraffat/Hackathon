
	 
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

public class information_activity extends Activity {

	
	private View _bg__information_ek3;
	private View rectangle_1_ek5;
	private View rectangle_13_ek3;
	private ImageView _42_3_ek3;
	private View rectangle_3_ek4;
	private TextView _manage_slots_ek8;
	private TextView _events_ek6;
	private TextView _evaluation_ek5;
	private TextView _create_event_ek4;
	private TextView _settings_ek8;
	private TextView _logout_ek4;
	private ImageView vector_ek10;
	private TextView information_ek4;
	private ImageView asset_1_1_ek6;
	private View rectangle_15;
	private View rectangle_23;
	private View rectangle_17;
	private View rectangle_19;
	private View rectangle_21;
	private View rectangle_16;
	private View rectangle_27;
	private View rectangle_18;
	private View rectangle_20;
	private View rectangle_22;
	private TextView first_name;
	private TextView birth_date;
	private TextView pool_month;
	private TextView email;
	private TextView address;
	private TextView birth_city;
	private TextView pool_year;
	private TextView phone;
	private TextView city;
	private TextView last_name;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.information);

		
		_bg__information_ek3 = (View) findViewById(R.id._bg__information_ek3);
		rectangle_1_ek5 = (View) findViewById(R.id.rectangle_1_ek5);
		rectangle_13_ek3 = (View) findViewById(R.id.rectangle_13_ek3);
		_42_3_ek3 = (ImageView) findViewById(R.id._42_3_ek3);
		rectangle_3_ek4 = (View) findViewById(R.id.rectangle_3_ek4);
		_manage_slots_ek8 = (TextView) findViewById(R.id._manage_slots_ek8);
		_events_ek6 = (TextView) findViewById(R.id._events_ek6);
		_evaluation_ek5 = (TextView) findViewById(R.id._evaluation_ek5);
		_create_event_ek4 = (TextView) findViewById(R.id._create_event_ek4);
		_settings_ek8 = (TextView) findViewById(R.id._settings_ek8);
		_logout_ek4 = (TextView) findViewById(R.id._logout_ek4);
		vector_ek10 = (ImageView) findViewById(R.id.vector_ek10);
		information_ek4 = (TextView) findViewById(R.id.information_ek4);
		asset_1_1_ek6 = (ImageView) findViewById(R.id.asset_1_1_ek6);
		rectangle_15 = (View) findViewById(R.id.rectangle_15);
		rectangle_23 = (View) findViewById(R.id.rectangle_23);
		rectangle_17 = (View) findViewById(R.id.rectangle_17);
		rectangle_19 = (View) findViewById(R.id.rectangle_19);
		rectangle_21 = (View) findViewById(R.id.rectangle_21);
		rectangle_16 = (View) findViewById(R.id.rectangle_16);
		rectangle_27 = (View) findViewById(R.id.rectangle_27);
		rectangle_18 = (View) findViewById(R.id.rectangle_18);
		rectangle_20 = (View) findViewById(R.id.rectangle_20);
		rectangle_22 = (View) findViewById(R.id.rectangle_22);
		first_name = (TextView) findViewById(R.id.first_name);
		birth_date = (TextView) findViewById(R.id.birth_date);
		pool_month = (TextView) findViewById(R.id.pool_month);
		email = (TextView) findViewById(R.id.email);
		address = (TextView) findViewById(R.id.address);
		birth_city = (TextView) findViewById(R.id.birth_city);
		pool_year = (TextView) findViewById(R.id.pool_year);
		phone = (TextView) findViewById(R.id.phone);
		city = (TextView) findViewById(R.id.city);
		last_name = (TextView) findViewById(R.id.last_name);
	
		
		_manage_slots_ek8.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), manage_slots_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_events_ek6.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), event_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_evaluation_ek5.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), eval_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_create_event_ek4.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), creat_event_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_settings_ek8.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), settings_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_logout_ek4.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), login_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	