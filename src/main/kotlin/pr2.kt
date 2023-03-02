import java.util.Calendar
import java.util.Scanner
fun intNumber(scanner: Scanner){
    val n = scanner.nextInt()
    if (n % 2 == 0){
        println("Even")
    }
    else println("Odd")
}
fun multiplication(scanner: Scanner){
    val n = scanner.nextInt()
    if (n % 2 == 0) println(n * 4)
    else println(n * 5)
}
fun negativeNumber(scanner: Scanner){
    val n = scanner.nextInt()
    println(-n)
}
fun yourAge(scanner: Scanner){
    val currentYear = Calendar.getInstance().get(Calendar.YEAR)
    val year = scanner.nextInt()
    println(currentYear - year)
}
fun minimumNumber(){
    val arr1 = readln()
    val array1 = arr1.split(" ").map{it.toInt()}.toIntArray()
    var minimum = array1[0]
    for (i in array1) if (i < minimum) minimum = i
    println(minimum)
}
fun maximumNumbers(){
    val arr2 = readln()
    val array2 = arr2.split(" ").map{it.toInt()}.toIntArray()
    var max1 = Int.MIN_VALUE
    var max2 = Int.MIN_VALUE
    for (i in array2){
        if (i > max1){
            max2 = max1
            max1 = i
        }else
            if (i > max2) max2 = i
    }
    println(listOf(max1, max2))
}
fun arrayNumbers(){
    val arr3 = readln()
    val array3 = arr3.split(" ").map{it.toInt()}.toIntArray()
    if (array3 == null || array3.isEmpty()){
        println(intArrayOf())
    }
    var p = 0
    var n = 0
    for (i in array3) if (i > 0) p++
    else if (i < 0) n += i
    println(arrayListOf(p, n))
}
fun vowels(){
    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'y')
    var i = 0
    val string = readln()
    val charArray = string.toCharArray()
    for (j in charArray) if (j in vowels) i++
    println(i)

}
fun middleValue(){
    val string = readln()
    val middle = string.length / 2
    if (string.length % 2 == 0) println(string.substring(middle -1, middle +1))
    else println(string.substring(middle, middle +1))
}
fun table():Array<IntArray>{
    val size = readln().toInt()
    val table = Array(size) {IntArray(size)}
    for (i in 0 until size) for (j in 0 until size) table[i][j] = (i + 1) * (j + 1)
    return table
}
fun main(){
    val scanner = Scanner(System.`in`)
    intNumber(scanner)
    println()
    multiplication(scanner)
    println()
    negativeNumber(scanner)
    println()
    yourAge(scanner)
    println()
    minimumNumber()
    println()
    maximumNumbers()
    println()
    arrayNumbers()
    println()
    vowels()
    println()
    middleValue()
    println()
    print(table().contentDeepToString())
}