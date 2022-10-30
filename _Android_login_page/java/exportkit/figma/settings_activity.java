
	 
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

public class settings_activity extends Activity {

	
	private View _bg__settings_ek5;
	private View rectangle_1_ek4;
	private View rectangle_13_ek2;
	private ImageView _42_3_ek2;
	private View rectangle_3_ek3;
	private TextView _manage_slots_ek7;
	private TextView _events_ek5;
	private TextView _evaluation_ek4;
	private TextView _create_event_ek3;
	private TextView _settings_ek6;
	private TextView _logout_ek3;
	private ImageView vector_ek9;
	private ImageView asset_1_1_ek4;
	private TextView settings_ek7;
	private ImageView asset_1_1_ek5;
	private ImageView black_key_symbol_icon_6;
	private ImageView lock_icon_11;
	private ImageView satellite_png_18;
	private TextView _notifications;
	private TextView _information;
	private TextView _change_password;
	private TextView _a__g__u;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.settings);

		
		_bg__settings_ek5 = (View) findViewById(R.id._bg__settings_ek5);
		rectangle_1_ek4 = (View) findViewById(R.id.rectangle_1_ek4);
		rectangle_13_ek2 = (View) findViewById(R.id.rectangle_13_ek2);
		_42_3_ek2 = (ImageView) findViewById(R.id._42_3_ek2);
		rectangle_3_ek3 = (View) findViewById(R.id.rectangle_3_ek3);
		_manage_slots_ek7 = (TextView) findViewById(R.id._manage_slots_ek7);
		_events_ek5 = (TextView) findViewById(R.id._events_ek5);
		_evaluation_ek4 = (TextView) findViewById(R.id._evaluation_ek4);
		_create_event_ek3 = (TextView) findViewById(R.id._create_event_ek3);
		_settings_ek6 = (TextView) findViewById(R.id._settings_ek6);
		_logout_ek3 = (TextView) findViewById(R.id._logout_ek3);
		vector_ek9 = (ImageView) findViewById(R.id.vector_ek9);
		asset_1_1_ek4 = (ImageView) findViewById(R.id.asset_1_1_ek4);
		settings_ek7 = (TextView) findViewById(R.id.settings_ek7);
		asset_1_1_ek5 = (ImageView) findViewById(R.id.asset_1_1_ek5);
		black_key_symbol_icon_6 = (ImageView) findViewById(R.id.black_key_symbol_icon_6);
		lock_icon_11 = (ImageView) findViewById(R.id.lock_icon_11);
		satellite_png_18 = (ImageView) findViewById(R.id.satellite_png_18);
		_notifications = (TextView) findViewById(R.id._notifications);
		_information = (TextView) findViewById(R.id._information);
		_change_password = (TextView) findViewById(R.id._change_password);
		_a__g__u = (TextView) findViewById(R.id._a__g__u);
	
		
		_manage_slots_ek7.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), manage_slots_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_events_ek5.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), event_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_evaluation_ek4.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), eval_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_create_event_ek3.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), creat_event_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_settings_ek6.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), settings_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_logout_ek3.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), login_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_notifications.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), notification_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_information.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), information_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_change_password.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), security_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_a__g__u.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), agu_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	