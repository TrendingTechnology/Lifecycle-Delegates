package com.link184.delegates

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner

fun <T> LifecycleOwner.creatable(value: T, onCreate: LifecycleEventAction<T>): LifecycleReleasableDelegate<T> {
    return LifecycleReleasableDelegate(lifecycle, value, Lifecycle.Event.ON_CREATE to onCreate)
}

fun <T> LifecycleOwner.destroyable(value: T, onDestroy: LifecycleEventAction<T>): LifecycleReleasableDelegate<T> {
    return LifecycleReleasableDelegate(lifecycle, value, Lifecycle.Event.ON_DESTROY to onDestroy)
}

fun <T> LifecycleOwner.creatableDestroyable(value: T, onCreate: LifecycleEventAction<T>, onDestroy: LifecycleEventAction<T>): LifecycleReleasableDelegate<T> {
    return LifecycleReleasableDelegate(lifecycle, value, Lifecycle.Event.ON_CREATE to onCreate, Lifecycle.Event.ON_DESTROY to onDestroy)
}

fun <T> LifecycleOwner.pauseable(value: T, onPause: LifecycleEventAction<T>): LifecycleReleasableDelegate<T> {
    return LifecycleReleasableDelegate(lifecycle, value, Lifecycle.Event.ON_PAUSE to onPause)
}

fun <T> LifecycleOwner.resumeable(value: T, onResume: LifecycleEventAction<T>): LifecycleReleasableDelegate<T> {
    return LifecycleReleasableDelegate(lifecycle, value, Lifecycle.Event.ON_RESUME to onResume)
}

fun <T> LifecycleOwner.pauseableResumable(value: T, onPause: LifecycleEventAction<T>, onResume: LifecycleEventAction<T>): LifecycleReleasableDelegate<T> {
    return LifecycleReleasableDelegate(lifecycle, value, Lifecycle.Event.ON_PAUSE to onPause, Lifecycle.Event.ON_RESUME to onResume)
}

fun <T> LifecycleOwner.startable(value: T, onStart: LifecycleEventAction<T>): LifecycleReleasableDelegate<T> {
    return LifecycleReleasableDelegate(lifecycle, value, Lifecycle.Event.ON_START to onStart)
}

fun <T> LifecycleOwner.stoppable(value: T, onStop: LifecycleEventAction<T>): LifecycleReleasableDelegate<T> {
    return LifecycleReleasableDelegate(lifecycle, value, Lifecycle.Event.ON_STOP to onStop)
}

fun <T> LifecycleOwner.stoppableStartable(value: T, onStart: LifecycleEventAction<T>, onStop: LifecycleEventAction<T>): LifecycleReleasableDelegate<T> {
    return LifecycleReleasableDelegate(lifecycle, value, Lifecycle.Event.ON_START to onStart, Lifecycle.Event.ON_STOP to onStop)
}