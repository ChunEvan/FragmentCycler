package gmf.com.fragmentcycler;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private ViewPager mPager;

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.e("BBBB", "MainActivity onAttachedToWindow");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("BBBB", "MainActivity onCreate");
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {
        mPager = (ViewPager) findViewById(R.id.pager);
    }

    private void initData() {
        mPager.setAdapter(new ContentAdapter(getSupportFragmentManager()));
    }

    private class ContentAdapter extends FragmentPagerAdapter {

        public ContentAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0)
                return new ContentFragment();
            else if (position == 1) {
                return new SubFragment();
            }
            return null;
        }

        @Override
        public int getCount() {
            return 2;
        }
    }

    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        Log.e("BBBB", "MainActivity onCreateView");
        return super.onCreateView(name, context, attrs);
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        Log.e("BBBB", "MainActivity onAttachFragment");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("BBBB", "MainActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("BBBB", "MainActivity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("BBBB", "MainActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("BBBB", "MainActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("BBBB", "MainActivity onDestroy");
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.e("BBBB", "MainActivity onDetachedFromWindow");
    }
}
