package com.shalitha.core.extensions

import android.view.View

/**
 *  @Author Shalitha Samarasinghe
 *  @Create  2022-03-15 .
 */


/**
 *make the View visible
 */
fun View.makeVisible() {
    this.visibility = View.VISIBLE
}

/**
 *make the View invisible
 */
fun View.makeInVisible() {
    this.visibility = View.INVISIBLE
}


/**
 *make the View Gone
 */
fun View.makeGone() {
    this.visibility = View.GONE
}