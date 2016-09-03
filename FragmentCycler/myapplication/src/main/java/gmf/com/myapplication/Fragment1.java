package gmf.com.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Evan on 16/8/13 上午11:42.
 */
public class Fragment1 extends Fragment {
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("BBBB", "Fragment1 onAttach");
    }

    @Override
    public void onAttachFragment(Fragment childFragment) {
        super.onAttachFragment(childFragment);
        Log.e("BBBB", "Fragment1 onAttachFragment1");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e("BBBB", "Fragment1 onActivityCreated");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("BBBB", "Fragment1 onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.e("BBBB", "Fragment1 onCreateView");
        return inflater.inflate(R.layout.frag_content, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.e("BBBB", "Fragment1 onViewCreated");
//                if (getView() != null) {
//                    setUserVisibleHint(true);
//                }
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("BBBB", "Fragment1 onStart");
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        Log.e("BBBB", "Fragment1 setUserVisibleHint");
        Log.e("BBBB", "Fragment1 isVisibleToUser=" + isVisibleToUser);
        Log.e("BBBB", "Fragment1 getView()=" + getView());
        if (isVisibleToUser && getView() != null) {
            Log.e("BBBB", "Fragment1 getView()!=null isVisibleToUser=" + isVisibleToUser);
            Log.e("BBBB", "Fragment1 getView()!=null getView()=" + getView());
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("BBBB", "Fragment1 onPause");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("BBBB", "Fragment1 onResume");
    }


    @Override
    public void onStop() {
        super.onStop();
        Log.e("BBBB", "Fragment1 onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("BBBB", "Fragment1 onDestroy");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("BBBB", "Fragment1 onDestroyView");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("BBBB", "Fragment1 onDetach");
    }

}
