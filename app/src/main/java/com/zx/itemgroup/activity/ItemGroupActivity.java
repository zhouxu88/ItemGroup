package com.zx.itemgroup.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.zx.itemgroup.R;
import com.zx.itemgroup.widget.ItemGroup;

/**
 * 组合控件封装（提交信息及编辑信息界面及功能）
 */
public class ItemGroupActivity extends AppCompatActivity {

    private Context mContext;
    private ItemGroup nameIG, idCardIG, birthdayIG, cityIG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_group);

        mContext = this;
        initView();
    }

    private void initView() {
        nameIG = (ItemGroup) findViewById(R.id.name_ig);
        idCardIG = (ItemGroup) findViewById(R.id.id_card_ig);
        birthdayIG = (ItemGroup) findViewById(R.id.select_birthday_ig);
        cityIG = (ItemGroup) findViewById(R.id.select_city_ig);
        birthdayIG.setItemOnClickListener(new ItemGroup.ItemOnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "点击了选择出生日期", Toast.LENGTH_SHORT).show();
            }
        });
        cityIG.setItemOnClickListener(new ItemGroup.ItemOnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "点击了选择城市", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
