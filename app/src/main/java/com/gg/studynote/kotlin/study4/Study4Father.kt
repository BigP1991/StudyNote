package com.gg.studynote.kotlin.study4

/**
 * @author created by zhanghaochen
 * @date 2020-03-09 15:39
 * 描述：使用by关键字实现代理和委托，可以重写对应方法，也可以不重写
 */
class Study4Father : IWashBow by Study4Son {
    override fun washBow() {
        println("我是爸爸，我来找儿子洗碗")
        // 儿子代理来完成
        Study4Son.washBow()
        println("我看着儿子洗完了，赚了9块")
    }
}