package com.gg.studynote.kotlin.study2

import java.math.BigInteger

/**
 * @author created by zhanghaochen
 * @date 2020-03-05 15:27
 * 描述：
 */
fun main(args: Array<String>) {
    println(diguiTest(BigInteger("20")))
    println(digui3Test(100, 0))
}

fun diguiTest(num: BigInteger): BigInteger {
    // 计算阶乘
    if (num == BigInteger.ONE) {
        return BigInteger.ONE
    } else {
        return num * diguiTest(num - BigInteger.ONE)
    }
}

/**
 * 使用尾递归优化，必须return自己本身
 */
tailrec fun digui2Test(num: Int): Int {
    if (num == 1) {
        return 1
    } else {
        return digui2Test(num - 1) + num
    }
}

/**
 * 使用尾递归优化，必须return自己本身
 */
tailrec fun digui3Test(num: Int, result: Int): Int {
    if (num == 1) {
        return result + 1
    } else {
        return digui3Test(num - 1, result + num)
    }
}
