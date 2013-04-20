package com.baidu.mobads.demo.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BaiduSDKDemo extends Activity {
	Button advanced;
	Button simpleDeclaring;
	Button simpleCoding;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);		
		setContentView(R.layout.main);

		simpleDeclaring = (Button) findViewById(R.id.simple_declaring);
		simpleDeclaring.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// startActivity(new Intent(Intent.ACTION_CALL));
				// , Uri.parse("tel:"+ "13651844963")
				Intent intent = new Intent(simpleDeclaring.getContext(), SimpleDeclaringLayout.class);
				startActivity(intent);
			}
		});

		simpleCoding = (Button) findViewById(R.id.simple_coding);
		simpleCoding.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(simpleCoding.getContext(), SimpleCodingLayout.class);
				startActivity(intent);
			}
		});
	}
}

//       /:~