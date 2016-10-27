package com.inerdstack.coodinatorlayoutdemo;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by wangjie on 2016/10/27.
 */
public class FollowBehavior extends CoordinatorLayout.Behavior {

    private int mTargetId;

    public FollowBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.Follow);
        for (int i = 0; i < ta.getIndexCount(); i++) {
            int attr = ta.getIndex(i);
            if (attr == R.styleable.Follow_target) {
                mTargetId = ta.getResourceId(attr, -1);
            }
        }
        ta.recycle();
    }

    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, View child, View dependency) {
//        child.setY();
        return super.onDependentViewChanged(parent, child, dependency);
    }
}
