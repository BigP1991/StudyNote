package com.gg.studynote.kotlin.study3

/**
 * @author created by zhanghaochen
 * @date 2020-03-06 15:58
 * 描述：
 */
class Men(name: String) : Humen(name), IMan {
    override fun xiaodd() {
        println("我有小弟弟")
    }

    override fun eat() {
        println("$name 在吃东西")
    }
}
