package com.zhuang.sheen.jinmao.activity;

import org.taptwo.android.widget.CircleFlowIndicator;
import org.taptwo.android.widget.ViewFlow;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

import com.zhuang.sheen.demo.R;
import com.zhuang.sheen.jinmao.holder.ImageAdapter;
import com.zhuang.sheen.jinmao.holder.Constant.ConValue;

public class JinmaoIntroduceActivity extends Activity {

	private Button btnBack;
	private ViewFlow viewFlow;
	private WebView webView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jinmao_introduce);

		viewFlow = (ViewFlow) findViewById(R.id.viewflow);
		viewFlow.setAdapter(new ImageAdapter(this));
		viewFlow.setmSideBuffer(ConValue.jinmaoIntroduceImageArray.length); // 实际图片张数，
																			// 我的ImageAdapter实际图片张数为3

		CircleFlowIndicator indic = (CircleFlowIndicator) findViewById(R.id.circleFlowIndicator1);
		viewFlow.setFlowIndicator(indic);
		viewFlow.setTimeSpan(4000); // 设置时间间隔为4s
		viewFlow.setSelection(3 * 1000); // 设置初始位置
		viewFlow.startAutoFlowTimer(); // 启动自动播放

		webView = (WebView) findViewById(R.id.webView1);
		webView.loadUrl("file:///android_asset/jinmao_introduce.html");

		btnBack = (Button) findViewById(R.id.btn_jinmao_introduce_back);
		btnBack.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				JinmaoIntroduceActivity.this.finish();
			}
		});

	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.jinmao_introduce, menu);
		return true;
	}

}
