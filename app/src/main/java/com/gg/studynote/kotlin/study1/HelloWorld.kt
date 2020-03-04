package com.gg.studynote.kotlin.study1

fun main(args: Array<String>) {
    println("hello kotlin  dd")

    var a = "Andy"
    var b = "andy"
    var c = "Andy"

    // kotlin可以直接使用==判断字符串
    println(a == c)
    // 第二个参数表示是否忽略大小写
    println(a.equals(b, false))

    var d = heat("ss")
    println(d)
    println(heat(null))

    // 具名参数
    println(whenTest(mmr = 2333))

    rangeTest()

    listTest()

    // 函数表达式
    var aa = { x: Int, y: Int -> x + y }
    // 函数表达式另一种写法，两个int入参，返回Int = {两个入参是t和y，返回t-y}
    var bb: (Int, Int) -> Int = { t, y -> t - y }
    println(aa(4, 2))
}

// ？代表该参数可以为空
fun heat(string: String?): String = "热$string"

fun whenTest(mmr: Int): String {
    var result = when (mmr) {
        2000 ->
            "统帅"
        3000 ->
            "传奇"
        4000 ->
            "万古流芳"
        else ->
            "弟弟"
    }
    return result
}

fun rangeTest() {
    // 区间，表示[1,100]
    var nums = 1..100

    // 区间，[1,100)
    var nums2 = 1 until 100

    for (num in nums step 2) {
        print("$num,")
    }
}

fun listTest() {
    var list = listOf<String>("1", "2", "3")
    for (item in list) {
        println(item)
    }

    for ((i, item) in list.withIndex()) {
        println("$i.$item")
    }

    var map = HashMap<String, String>()
    map["god"] = "神"
    map["sad"] = "伤心"

    println(map["sad"])
}