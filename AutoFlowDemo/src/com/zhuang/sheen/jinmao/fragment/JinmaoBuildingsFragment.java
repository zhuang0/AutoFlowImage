package com.zhuang.sheen.jinmao.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.zhuang.sheen.demo.R;

public class JinmaoBuildingsFragment extends Fragment {

	private Button button1;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_jinmao_buildings, container, false);

	}
}
