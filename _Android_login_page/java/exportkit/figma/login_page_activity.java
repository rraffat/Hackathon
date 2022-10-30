
	 
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

public class login_page_activity extends Activity {

	
	private View _bg__login_page_ek2;
	private View rectangle_1;
	private ImageView asset_1_1;
	private ImageView _42_1;
	private View rectangle_2;
	private TextView _login;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_page);

		
		_bg__login_page_ek2 = (View) findViewById(R.id._bg__login_page_ek2);
		rectangle_1 = (View) findViewById(R.id.rectangle_1);
		asset_1_1 = (ImageView) findViewById(R.id.asset_1_1);
		_42_1 = (ImageView) findViewById(R.id._42_1);
		rectangle_2 = (View) findViewById(R.id.rectangle_2);
		_login = (TextView) findViewById(R.id._login);
	
		
		_login.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	