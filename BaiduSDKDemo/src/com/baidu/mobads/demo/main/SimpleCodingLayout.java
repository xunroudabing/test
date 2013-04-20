package com.baidu.mobads.demo.main;

import android.os.Bundle;
import android.view.ViewGroup;

import com.baidu.mobads.AdView;

public class SimpleCodingLayout extends DemoActivity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// 如果需要编码方式控制AppSid和Appsec请在AdView实例化前执行如下代码
		// AdView.setAppSid("debug1");
		// AdView.setAppSec("debug1");
		
		// 人群属性
		// AdSettings.setKey(new String[]{"baidu", "中 国 "});
		// AdSettings.setSex(AdSettings.Sex.FEMALE);
		// AdSettings.setBirthday(Calendar.getInstance());
		// AdSettings.setCity("上海");
		// AdSettings.setZip("123456");
		// AdSettings.setJob("工程师");
		// AdSettings.setEducation(AdSettings.Education.BACHELOR);
		// AdSettings.setSalary(AdSettings.Salary.F10kT15k);
		// AdSettings.setHob(new String[]{"羽毛球", "足球", "baseball"});
		// AdSettings.setUserAttr("k1","v1");
		// AdSettings.setUserAttr("k2","v2");

		// 实例化
		AdView adView = new AdView(this);
		
		// 设置adView为当前Activity的View
		setContentView(adView, new ViewGroup.LayoutParams(-1, -2));		
	}
}