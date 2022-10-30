
	 
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

public class security_activity extends Activity {

	
	private View _bg__security_ek2;
	private View rectangle_1_ek7;
	private View rectangle_13_ek5;
	private ImageView _42_3_ek5;
	private View rectangle_3_ek6;
	private TextView _manage_slots_ek10;
	private TextView _events_ek8;
	private TextView _evaluation_ek7;
	private TextView _create_event_ek6;
	private TextView _settings_ek10;
	private TextView _logout_ek6;
	private ImageView vector_ek12;
	private TextView change_password_ek1;
	private ImageView asset_1_1_ek8;
	private TextView _12_characters_minimum_only_in_uppercases__lowercases__digits_or_these_special_characters________________________________and_at_least_one_of_each_;
	private View rectangle_19_ek1;
	private View rectangle_20_ek1;
	private View rectangle_21_ek1;
	private TextView old_password;
	private TextView new_password;
	private TextView password_confirmation;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.security);

		
		_bg__security_ek2 = (View) findViewById(R.id._bg__security_ek2);
		rectangle_1_ek7 = (View) findViewById(R.id.rectangle_1_ek7);
		rectangle_13_ek5 = (View) findViewById(R.id.rectangle_13_ek5);
		_42_3_ek5 = (ImageView) findViewById(R.id._42_3_ek5);
		rectangle_3_ek6 = (View) findViewById(R.id.rectangle_3_ek6);
		_manage_slots_ek10 = (TextView) findViewById(R.id._manage_slots_ek10);
		_events_ek8 = (TextView) findViewById(R.id._events_ek8);
		_evaluation_ek7 = (TextView) findViewById(R.id._evaluation_ek7);
		_create_event_ek6 = (TextView) findViewById(R.id._create_event_ek6);
		_settings_ek10 = (TextView) findViewById(R.id._settings_ek10);
		_logout_ek6 = (TextView) findViewById(R.id._logout_ek6);
		vector_ek12 = (ImageView) findViewById(R.id.vector_ek12);
		change_password_ek1 = (TextView) findViewById(R.id.change_password_ek1);
		asset_1_1_ek8 = (ImageView) findViewById(R.id.asset_1_1_ek8);
		_12_characters_minimum_only_in_uppercases__lowercases__digits_or_these_special_characters________________________________and_at_least_one_of_each_ = (TextView) findViewById(R.id._12_characters_minimum_only_in_uppercases__lowercases__digits_or_these_special_characters________________________________and_at_least_one_of_each_);
		rectangle_19_ek1 = (View) findViewById(R.id.rectangle_19_ek1);
		rectangle_20_ek1 = (View) findViewById(R.id.rectangle_20_ek1);
		rectangle_21_ek1 = (View) findViewById(R.id.rectangle_21_ek1);
		old_password = (TextView) findViewById(R.id.old_password);
		new_password = (TextView) findViewById(R.id.new_password);
		password_confirmation = (TextView) findViewById(R.id.password_confirmation);
	
		
		_manage_slots_ek10.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), manage_slots_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_events_ek8.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), event_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_evaluation_ek7.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), eval_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_create_event_ek6.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), creat_event_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_settings_ek10.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), settings_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_logout_ek6.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), login_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	