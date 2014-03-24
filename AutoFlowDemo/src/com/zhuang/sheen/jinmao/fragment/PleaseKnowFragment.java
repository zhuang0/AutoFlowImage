package com.zhuang.sheen.jinmao.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.zhuang.sheen.demo.R;
import com.zhuang.sheen.jinmao.activity.JinmaoIntroduceActivity;

public class PleaseKnowFragment extends Fragment {

	private Button button1;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.fragment_please_know, container, false);
		button1 = (Button) view.findViewById(R.id.btn_jinmao_introduce_back);
		button1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getActivity(), JinmaoIntroduceActivity.class);
				startActivity(intent);

			}
		});
		return view;
	}

}
