package com.ruiqin.pickerviewdemo.module.demo;

import android.widget.TextView;

import com.bigkoo.pickerview.OptionsPickerView;
import com.ruiqin.pickerviewdemo.R;
import com.ruiqin.pickerviewdemo.base.BaseActivity;
import com.ruiqin.pickerviewdemo.util.TimeUtil;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import butterknife.BindView;
import butterknife.OnClick;

public class PickerViewDemoActivity extends BaseActivity {


    @BindView(R.id.show_time_tv)
    TextView mShowTimeTv;

    @Override
    protected void initData() {
        TimeUtil.initOptionData(10, 50, 11, 20, options1Items, options2Items);
    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_picker_view_demo;
    }

    @Override
    protected int getFragmentContentId() {
        return 0;
    }

    @OnClick(R.id.select_time_btn)
    public void onViewClicked() {
        showOptionsPickerView();
    }

    /**
     * 一级选择器
     */
    private ArrayList<String> options1Items = new ArrayList<>();

    /**
     * 二级选择器
     */
    private ArrayList<ArrayList<String>> options2Items = new ArrayList<>();

    OptionsPickerView optionsPickerView;

    SimpleDateFormat mSimpleDateFormat = new SimpleDateFormat("HH:mm");


    /**
     * 显示pickerView
     */
    private void showOptionsPickerView() {
        if (optionsPickerView == null) {
            Calendar calendar = Calendar.getInstance();

            optionsPickerView = new OptionsPickerView.Builder(mContext, (options1, options2, options3, v) -> {
                calendar.set(Calendar.HOUR_OF_DAY, Integer.parseInt(options1Items.get(options1)));
                calendar.set(Calendar.MINUTE, Integer.parseInt(options2Items.get(options1).get(options2)));
                mShowTimeTv.setText(mSimpleDateFormat.format(calendar.getTime()));
            }).build();
            optionsPickerView.setPicker(options1Items, options2Items);
        }
        optionsPickerView.show();
    }

}
