package com.zhuang.sheen.jinmao.activity;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.zhuang.sheen.demo.R;

public class JinmaoIntroduceImageDetailActivity extends Activity {

	private ImageView imageView;

	private int imageId;
	private Button btnSave;
	private Button btnBack;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_jinmao_introduce_image_detail);

		Bundle extras = getIntent().getExtras();
		imageId = extras.getInt("image_id");

		imageView = (ImageView) findViewById(R.id.imageview_jinmao_introduce_image_detail);
		Drawable drawable = getResources().getDrawable(imageId);
		showImg(imageView, drawable, getApplicationContext());

		btnBack = (Button) findViewById(R.id.btn_jinmao_introduce_image_back);
		btnBack.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				JinmaoIntroduceImageDetailActivity.this.finish();
			}
		});

		btnSave = (Button) findViewById(R.id.btn_jinmao_introduce_image_save);
		btnSave.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// 此处完成金茂简介的图片保存功能
			}
		});
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.jinmao_introduce_image_detail, menu);
		return true;
	}
	// 显示大图的方法
	public static void showImg(ImageView view, Drawable img, Context context) {

		WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);

		int width = wm.getDefaultDisplay().getWidth();
		int w = img.getIntrinsicWidth();
		int h = img.getIntrinsicHeight();

		LayoutParams para = view.getLayoutParams();
		para.width = w;
		para.height = h;
		view.setLayoutParams(para);

		view.setImageDrawable(img);

	}

}
