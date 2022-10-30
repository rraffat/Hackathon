
	 
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

public class creat_event_activity extends Activity {

	
	private View _bg__creat_event_ek2;
	private View rectangle_1_ek10;
	private ImageView asset_1_1_ek11;
	private View rectangle_13_ek8;
	private ImageView _42_3_ek8;
	private View rectangle_3_ek9;
	private TextView _manage_slots_ek13;
	private TextView _events_ek12;
	private TextView _evaluation_ek10;
	private TextView _create_event_ek9;
	private TextView _settings_ek13;
	private TextView _logout_ek9;
	private ImageView vector_ek15;
	private TextView create_event_ek10;
	private TextView begin_at_ek1;
	private TextView end_at_ek1;
	private TextView name_of_event;
	private TextView place_of_event;
	private TextView number_of_event;
	private TextView discriotion_of_event;
	private View line_7_ek1;
	private View line_5_ek1;
	private View line_8_ek1;
	private View line_6_ek1;
	private TextView day_month_year_ek2;
	private TextView time_ek4;
	private TextView time_ek5;
	private TextView day_month_year_ek3;
	private View rectangle_14_ek1;
	private TextView _create_ek1;
	private View rectangle_29;
	private View rectangle_31;
	private View rectangle_32;
	private View rectangle_30;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.creat_event);

		
		_bg__creat_event_ek2 = (View) findViewById(R.id._bg__creat_event_ek2);
		rectangle_1_ek10 = (View) findViewById(R.id.rectangle_1_ek10);
		asset_1_1_ek11 = (ImageView) findViewById(R.id.asset_1_1_ek11);
		rectangle_13_ek8 = (View) findViewById(R.id.rectangle_13_ek8);
		_42_3_ek8 = (ImageView) findViewById(R.id._42_3_ek8);
		rectangle_3_ek9 = (View) findViewById(R.id.rectangle_3_ek9);
		_manage_slots_ek13 = (TextView) findViewById(R.id._manage_slots_ek13);
		_events_ek12 = (TextView) findViewById(R.id._events_ek12);
		_evaluation_ek10 = (TextView) findViewById(R.id._evaluation_ek10);
		_create_event_ek9 = (TextView) findViewById(R.id._create_event_ek9);
		_settings_ek13 = (TextView) findViewById(R.id._settings_ek13);
		_logout_ek9 = (TextView) findViewById(R.id._logout_ek9);
		vector_ek15 = (ImageView) findViewById(R.id.vector_ek15);
		create_event_ek10 = (TextView) findViewById(R.id.create_event_ek10);
		begin_at_ek1 = (TextView) findViewById(R.id.begin_at_ek1);
		end_at_ek1 = (TextView) findViewById(R.id.end_at_ek1);
		name_of_event = (TextView) findViewById(R.id.name_of_event);
		place_of_event = (TextView) findViewById(R.id.place_of_event);
		number_of_event = (TextView) findViewById(R.id.number_of_event);
		discriotion_of_event = (TextView) findViewById(R.id.discriotion_of_event);
		line_7_ek1 = (View) findViewById(R.id.line_7_ek1);
		line_5_ek1 = (View) findViewById(R.id.line_5_ek1);
		line_8_ek1 = (View) findViewById(R.id.line_8_ek1);
		line_6_ek1 = (View) findViewById(R.id.line_6_ek1);
		day_month_year_ek2 = (TextView) findViewById(R.id.day_month_year_ek2);
		time_ek4 = (TextView) findViewById(R.id.time_ek4);
		time_ek5 = (TextView) findViewById(R.id.time_ek5);
		day_month_year_ek3 = (TextView) findViewById(R.id.day_month_year_ek3);
		rectangle_14_ek1 = (View) findViewById(R.id.rectangle_14_ek1);
		_create_ek1 = (TextView) findViewById(R.id._create_ek1);
		rectangle_29 = (View) findViewById(R.id.rectangle_29);
		rectangle_31 = (View) findViewById(R.id.rectangle_31);
		rectangle_32 = (View) findViewById(R.id.rectangle_32);
		rectangle_30 = (View) findViewById(R.id.rectangle_30);
	
		
		_manage_slots_ek13.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), manage_slots_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_events_ek12.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), event_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_evaluation_ek10.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), eval_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_create_event_ek9.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), creat_event_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_settings_ek13.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), settings_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_logout_ek9.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), login_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_create_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), event_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	