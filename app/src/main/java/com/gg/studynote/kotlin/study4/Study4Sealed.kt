package com.gg.studynote.kotlin.study4

/**
 * @author created by zhanghaochen
 * @date 2020-03-09 16:44
 * 描述：密封类，子类类型有限的class
 */
sealed class Study4Sealed {
    fun sayHello() {
        println("你好")
    }

    class Frog : Study4Sealed()
    class Lion : Study4Sealed()
}