package com.rollingalgo.design.creationModel.BluesSinglePattern;

/**
 * Created by qishoudong on 2017/7/18.
 * type:单例模式
 */

public class BluesLazySingletonPattern {

    public BluesLazySingletonPattern() {
        
    }

    private static BluesLazySingletonPattern mBlueSingleton;

    public static BluesLazySingletonPattern getIntance() {
        if (mBlueSingleton == null) {
            mBlueSingleton = new BluesLazySingletonPattern();
        }
        return mBlueSingleton;
    }

}
