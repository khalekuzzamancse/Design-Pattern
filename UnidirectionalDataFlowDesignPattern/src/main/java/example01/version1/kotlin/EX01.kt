package example01.version1.kotlin

fun main() {
    average()

}

fun average() {
    val list = mutableListOf(10, 20, 30)
    println(list)
    val avg = totalSum(list) / totalItem(list)
    println("avg=${avg}")
    println(list)

}

fun totalSum(list:List<Int>): Int {
    val sum = list.sumOf { it }
    //list.add(40)//Error:there is no add method to immutable list
    // list.add(50)//Error:there is no add method to immutable list
    return sum
}

fun totalItem(list:List<Int>): Int {
    return list.size
}