package com.gg.studynote.kotlin.study4

/**
 * @author created by zhanghaochen
 * @date 2020-03-09 15:40
 * 描述：
 */
fun main(args: Array<String>) {
    var son = Study4Son
    son.washBow()

    var father = Study4Father()
    father.washBow()

    println(Week.oneday.ordinal)

    var animal1 = Study4Sealed.Frog()
    var animal2 = Study4Sealed.Lion()
    var animal3 = Study4Sealed.Frog()
    var animal4 = Study4Sealed.Frog()
    var aniList = listOf<Study4Sealed>(animal1, animal2, animal3, animal4)
    for (animal in aniList) {
        if (animal is Study4Sealed.Frog) {
            animal.sayHello()
        }
    }
}