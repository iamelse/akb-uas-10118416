package com.lana.purwakartaku.decoration;

import android.content.Context;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

/**
 * Lana Septiana
 * IF10
 * 10118416
 * 14/08/2021
 */

public interface OnClickLayoutMarginItemListener {
    void onClick(Context context, View v, int position, int spanIndex, RecyclerView.State state);
}
