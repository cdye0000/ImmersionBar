package com.gyf.immersionbar.activity;

import android.webkit.WebView;
import android.widget.LinearLayout;

import com.gyf.immersionbar.R;

import butterknife.BindView;

/**
 * Created by geyifeng on 2017/6/19.
 */

public class WebActivity extends BaseActivity {
    @BindView(R.id.web)
    WebView web;
    @BindView(R.id.line)
    LinearLayout layout;


    @Override
    protected int setLayoutId() {
        return R.layout.activity_web;
    }

    @Override
    protected void initImmersionBar() {
        super.initImmersionBar();
        mImmersionBar.titleBar(R.id.toolbar)
                .keyboardEnable(true)  //解决软键盘与底部输入框冲突问题
                .init();
    }

    @Override
    protected void initView() {
        web.loadUrl("file:///android_asset/input_webview.html");
    }
}
