package com.gg.studynote.kotlin.study3

/**
 * @author created by zhanghaochen
 * @date 2020-03-06 14:51
 * 描述：
 */
class WashMashion(var module: String, var size: Int) {
    fun openDoor() {
        println("洗衣机的门开了")
    }

    fun closeDoor() {
        println("洗衣机的门关了")
    }

    fun start() {
        println("开始洗衣服")
    }
}
