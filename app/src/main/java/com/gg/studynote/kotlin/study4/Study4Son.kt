package com.gg.studynote.kotlin.study4

/**
 * @author created by zhanghaochen
 * @date 2020-03-09 15:38
 * 描述：object 修饰符表示该类直接在内存中创建，有且只有一个。调用时不带括号，带括号表示new一个改对象
 */
object Study4Son : IWashBow {
    override fun washBow() {
        println("我是大头儿子，洗碗一次1元")
    }

}