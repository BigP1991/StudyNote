package com.gg.studynote.kotlin.study3

/**
 * @author created by zhanghaochen
 * @date 2020-03-06 16:00
 * 描述：
 */
class Women(name: String) : Humen(name) {
    override fun eat() {
        println("$name 在吃东西")
    }
}
