package com.gg.studynote.kotlin.study2

/**
 * @author created by zhanghaochen
 * @date 2020-03-05 11:10
 * 描述：
 */
fun main(args: Array<String>) {
    var a = "11"
    var b = 11

    a = b.toString()
    b = a.toInt()

    println("请输入第一个数字")
    var num1 = readLine()
    println("请输入第二个数字")
    var num2 = readLine()

    // 1.？：在非空的情况下执行语句，为空时直接返回null
    // 1.!!：表示忽略语言的判空检查，即允许程序报NullPointerException（在kotlin中一般不建议这种写法，除非使用处一定不为空）
    var num11 = num1!!.toInt()
    var num22 = num2!!.toInt()
    println("输出的结果为")
    println("$num1 + $num2 = ${num11 + num22}")
}
