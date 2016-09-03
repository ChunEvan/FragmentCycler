package gmf.com.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mButton1;
    private Button mButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("BBBB", "MainActivity onCreate");
        mButton1 = (Button) findViewById(R.id.btn1);
        mButton2 = (Button) findViewById(R.id.btn2);
        init();
        initData();
    }

    private void initData() {
        FragmentTransaction transition = getSupportFragmentManager().beginTransaction();
        transition.replace(R.id.fragment_container, new Fragment1(), Fragment1.class.getSimpleName());
        transition.commit();
    }

    private void init() {
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentTransaction transition = getSupportFragmentManager().beginTransaction();
                transition.replace(R.id.fragment_container, new Fragment1(), Fragment1.class.getSimpleName());
                transition.commit();
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentTransaction transition = getSupportFragmentManager().beginTransaction();
                transition.replace(R.id.fragment_container, new Fragment2(), Fragment2.class.getSimpleName());
                transition.commit();
            }
        });

    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.e("BBBB", "MainActivity onAttachedToWindow");
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
