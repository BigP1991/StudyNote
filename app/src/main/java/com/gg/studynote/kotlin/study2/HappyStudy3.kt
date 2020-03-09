package com.gg.studynote.kotlin.study2

/**
 * @author created by zhanghaochen
 * @date 2020-03-06 14:34
 * 描述：
 */
class Rect(var width: Int, var height: Int) {
    fun getMianJi() {
        println("面积为：${width * height}")
    }
}

fun main(args: Array<String>) {
    var rect1 = Rect(10, 30)

    println("长：${rect1.height}")
    println("宽：${rect1.width}")
    rect1.getMianJi()
}
