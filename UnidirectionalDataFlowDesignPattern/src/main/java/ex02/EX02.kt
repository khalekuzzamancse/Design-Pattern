package ex02

fun main() {
    average()

}

private val onDataChange = fun(li: MutableList<Int>) {
    //this callback function
    println("List is changed,new List:${li}")

}


private fun average() {
    val list = mutableListOf(10, 20, 30)
    println(list)
    val sum = totalSum(list.toMutableList(), onDataChange)
    println("sum=${sum}")

}

private fun totalSum(list: MutableList<Int>, onDataChange: (MutableList<Int>) -> Unit): Int {
    val sum = list.sumOf { it }
    val initialList = list.toMutableList()//the recevied list size

    //do something
    //do something
    //do something
    list.add(40)
    list.add(50)
    //we are about to end of the function
    val finalList = list.toMutableList()//finding the list size at end
    //now check if the list is modified by compare them
    if (!(initialList.containsAll(finalList) && finalList.containsAll(initialList)))
        onDataChange(list)
    return sum
}
