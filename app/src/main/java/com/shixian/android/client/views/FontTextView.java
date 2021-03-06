package com.shixian.android.client.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by tangtang on 15/3/2.
 */
public class FontTextView extends TextView {


    public FontTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public FontTextView(Context context) {
        super(context);
        init();
    }

    public FontTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }



    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "Roboto-Regular.ttf");
            setTypeface(tf);
        }
    }

}
