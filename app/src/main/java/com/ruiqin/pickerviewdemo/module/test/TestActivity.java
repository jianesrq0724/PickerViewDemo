package com.ruiqin.pickerviewdemo.module.test;

import android.app.AlertDialog;

import com.ruiqin.pickerviewdemo.R;
import com.ruiqin.pickerviewdemo.base.BaseActivity;
import com.ruiqin.pickerviewdemo.commonality.view.PermissionTipDialog;
import com.ruiqin.pickerviewdemo.commonality.view.ShareDialog;
import com.ruiqin.pickerviewdemo.commonality.view.TipCustomDialog;

import butterknife.OnClick;

public class TestActivity extends BaseActivity {

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_test;
    }

    @Override
    protected int getFragmentContentId() {
        return 0;
    }


    @OnClick(R.id.button)
    public void onViewClicked() {
        showShareDialog();
//        showPermissionDialog();
    }

    ShareDialog mShareDialog;

    private void showShareDialog() {
        if (mShareDialog == null) {
            mShareDialog = new ShareDialog(mContext, "http://www.baidu.com");
        }
        mShareDialog.show();

        AlertDialog mAlertDialog = new AlertDialog.Builder(mContext).show();
        mAlertDialog.show();
    }

    PermissionTipDialog mPermissionTipDialog;

    private void showPermissionDialog() {
        if (mPermissionTipDialog == null) {
            mPermissionTipDialog = new PermissionTipDialog(mContext);
        }
        mPermissionTipDialog.show();
    }

    private TipCustomDialog mTipCustomDialog;

    private void showTipDialog() {
        if (mTipCustomDialog == null) {
            mTipCustomDialog = new TipCustomDialog(mContext);
        }
        mTipCustomDialog.show();
    }

}
