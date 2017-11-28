package com.ruiqin.pickerviewdemo.module.home;

import com.ruiqin.pickerviewdemo.base.BaseModel;
import com.ruiqin.pickerviewdemo.base.BasePresenter;
import com.ruiqin.pickerviewdemo.base.BaseView;
import com.ruiqin.pickerviewdemo.module.home.adapter.MainRecyclerAdapter;
import com.ruiqin.pickerviewdemo.module.home.bean.MainRecyclerData;

import java.util.List;

/**
 * Created by ruiqin.shen
 * 类说明：
 */

public interface MainContract {
    interface Model extends BaseModel {
        List<MainRecyclerData> initData();
    }

    interface View extends BaseView {
        void setRecyclerAdapterSuccess(MainRecyclerAdapter mainRecyclerAdapter);
    }

    abstract class Presenter extends BasePresenter<View, Model> {
        abstract void setAdapter();
    }
}
