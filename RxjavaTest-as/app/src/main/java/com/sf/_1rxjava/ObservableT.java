package com.sf._1rxjava;

import android.os.Parcelable;

import java.io.Serializable;

import rx.Observable;
import rx.Observer;

/**
 * Created by Finltop on 2017/8/14.
 */

public   class ObservableT extends Observable implements Serializable{
    protected ObservableT(OnSubscribe f) {
        super(f);
    }
}
