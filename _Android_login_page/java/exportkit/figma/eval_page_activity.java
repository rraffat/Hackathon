
	 
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

public class eval_page_activity extends Activity {

	
	private View _bg__eval_page_ek2;
	private View rectangle_1_ek3;
	private ImageView asset_1_1_ek3;
	private View rectangle_13_ek1;
	private ImageView _42_3_ek1;
	private View rectangle_3_ek2;
	private TextView _manage_slots_ek6;
	private TextView _events_ek4;
	private TextView _evaluation_ek2;
	private TextView _create_event_ek2;
	private TextView _settings_ek2;
	private TextView _logout_ek2;
	private ImageView vector_ek6;
	private TextView evaluation_ek3;
	private ImageView vector_ek7;
	private ImageView vector_ek8;
	private TextView name_of_projects;
	private TextView libft;
	private TextView name_of_students_time;
	private TextView hmohamed;
	private TextView _08_30_pm;
	private TextView in_15_min;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.eval_page);

		
		_bg__eval_page_ek2 = (View) findViewById(R.id._bg__eval_page_ek2);
		rectangle_1_ek3 = (View) findViewById(R.id.rectangle_1_ek3);
		asset_1_1_ek3 = (ImageView) findViewById(R.id.asset_1_1_ek3);
		rectangle_13_ek1 = (View) findViewById(R.id.rectangle_13_ek1);
		_42_3_ek1 = (ImageView) findViewById(R.id._42_3_ek1);
		rectangle_3_ek2 = (View) findViewById(R.id.rectangle_3_ek2);
		_manage_slots_ek6 = (TextView) findViewById(R.id._manage_slots_ek6);
		_events_ek4 = (TextView) findViewById(R.id._events_ek4);
		_evaluation_ek2 = (TextView) findViewById(R.id._evaluation_ek2);
		_create_event_ek2 = (TextView) findViewById(R.id._create_event_ek2);
		_settings_ek2 = (TextView) findViewById(R.id._settings_ek2);
		_logout_ek2 = (TextView) findViewById(R.id._logout_ek2);
		vector_ek6 = (ImageView) findViewById(R.id.vector_ek6);
		evaluation_ek3 = (TextView) findViewById(R.id.evaluation_ek3);
		vector_ek7 = (ImageView) findViewById(R.id.vector_ek7);
		vector_ek8 = (ImageView) findViewById(R.id.vector_ek8);
		name_of_projects = (TextView) findViewById(R.id.name_of_projects);
		libft = (TextView) findViewById(R.id.libft);
		name_of_students_time = (TextView) findViewById(R.id.name_of_students_time);
		hmohamed = (TextView) findViewById(R.id.hmohamed);
		_08_30_pm = (TextView) findViewById(R.id._08_30_pm);
		in_15_min = (TextView) findViewById(R.id.in_15_min);
	
		
		_manage_slots_ek6.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), manage_slots_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_events_ek4.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), event_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_evaluation_ek2.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), eval_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_create_event_ek2.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), creat_event_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_settings_ek2.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), settings_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_logout_ek2.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), login_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	