package com.ruiqin.pickerviewdemo.module.home;

import com.ruiqin.pickerviewdemo.module.demo.PickerViewDemoActivity;
import com.ruiqin.pickerviewdemo.module.home.bean.MainRecyclerData;
import com.ruiqin.pickerviewdemo.module.test.TestActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ruiqin.shen
 * 类说明：
 */

public class MainModel implements MainContract.Model {
    @Override
    public List<MainRecyclerData> initData() {
        List<MainRecyclerData> recyclerDataList = new ArrayList<>();
        recyclerDataList.add(new MainRecyclerData("PickerViewDemo", PickerViewDemoActivity.class));
        return recyclerDataList;
    }
}
