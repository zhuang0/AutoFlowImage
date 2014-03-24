package com.zhuang.sheen.jinmao.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Window;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

import com.zhuang.sheen.demo.R;
import com.zhuang.sheen.jinmao.holder.Constant.ConValue;

public class MainActivity extends FragmentActivity {

	// 声明一个tabhost的引用
	private TabHost tabHost;

	private RadioGroup radioGroup;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// 设置无标题模式
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);

		// 该方法用于设置各个fragment初始化
		initFragment();

		// 该方法用于响应用户的点击事件
		changeLayout();
	}

	private void changeLayout() {
		// 根据用户的点击位置的tab显示相应的fragment
		radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
		radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
					case R.id.RadioButton0 :
						tabHost.setCurrentTab(0);
						break;
					case R.id.RadioButton1 :
						tabHost.setCurrentTab(1);
						break;
					case R.id.RadioButton2 :
						tabHost.setCurrentTab(2);
						break;
					case R.id.RadioButton3 :
						tabHost.setCurrentTab(3);
						break;
					default :
						break;

				}
			}
		});

		((RadioButton) radioGroup.getChildAt(0)).toggle();
	}

	private void initFragment() {
		// 通过组件的id初始化tabHost的实例
		tabHost = (TabHost) findViewById(android.R.id.tabhost);
		tabHost.setup();

		int count = ConValue.tabContentArray.length;
		for (int i = 0; i < count; i++) {

			TabSpec tabSpec = tabHost
					.newTabSpec(ConValue.tabTitleArray[i])
					.setIndicator(ConValue.tabTitleArray[i],
							this.getResources().getDrawable(ConValue.tabImageArray[i]))
					.setContent(ConValue.tabContentArray[i]);
			tabHost.addTab(tabSpec);
		}

		// 设置默认显示布局
		tabHost.setCurrentTab(0);
	}
}
