package com.inerdstack.coodinatorlayoutdemo;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * FloatingActionButton是最简单的使用CoordinatorLayout的例子
 *
 * FloatingActionButton默认使用FloatingActionButton.Behavior
 */
public class FloatingActionButtonActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_action_button);

        findViewById(R.id.fab).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fab:
                Snackbar.make(v, "FAB", Snackbar.LENGTH_LONG)
                        .setAction("cancel", new View.OnClickListener(){
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(FloatingActionButtonActivity.this, "You clicked cancel", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
                break;
        }
    }
}
