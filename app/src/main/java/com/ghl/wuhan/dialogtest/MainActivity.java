package com.ghl.wuhan.dialogtest;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ghl.wuhan.dialogtest.dialog.DialogUIUtils;

public class MainActivity extends AppCompatActivity {
private Dialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        Dialog progressDialog = CustomProgressTransDialog.createLoadingDialog(context, showMes);
//        progressDialog.show(); //显示
//
//        //如果想隐藏，则：
//        if(null != progressDialog ){
//            progressDialog.dismiss();
//        }

        //设置进度条
        progressDialog = DialogUIUtils.showLoadingDialog(MainActivity.this,"正在查询中，请耐心等待......");
        progressDialog.show();
        //点击物理返回键是否可取消dialog
        progressDialog.setCancelable(true);
        //点击dialog之外 是否可取消
        progressDialog.setCanceledOnTouchOutside(false);
    }
}
