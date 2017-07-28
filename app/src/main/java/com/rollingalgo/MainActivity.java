package com.rollingalgo;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rollingalgo.commonview.BaseFragmentPagerAdapter;
import com.rollingalgo.commonview.PagerSlidingTabStrip;

public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {
    private PagerSlidingTabStrip mParentSlidingTabView;
    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        intView();

    }

    private void intView() {
        mParentSlidingTabView=(PagerSlidingTabStrip)findViewById(R.id.scrollIndicator);
        mViewPager=(ViewPager) findViewById(R.id.viewPager);
        mViewPager.setAdapter(new BaseFragmentPagerAdapter.Holder(getSupportFragmentManager()).add(
                new Fragment()).add(new Fragment()).add(new Fragment()).build(
                new String[]{"新闻头条", "笑话大全", "微信精选"}));

        mViewPager.addOnPageChangeListener(this);
        mParentSlidingTabView.setShouldExpand(true);
        mParentSlidingTabView.setTextSize(52);
        mParentSlidingTabView.setIndicatorColor(getResources().getColor(R.color.colorAccent));
        mParentSlidingTabView.setIndicatorHeight(5);
        mParentSlidingTabView.setViewPager(mViewPager);
    }


    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
