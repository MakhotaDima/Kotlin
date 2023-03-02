import java.util.Scanner

fun greetings(scanner: Scanner){
    val name = scanner.nextLine()
    println("What a great name you have, $name!")
}

fun getAgeAndRemainders(scanner: Scanner){
    val remainder3 = scanner.nextInt()
    val remainder5 = scanner.nextInt()
    val remainder7 = scanner.nextInt()
    val age = ((remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105)
    println("Your age is $age!")
}
fun outputOfNumbers(scanner: Scanner){
    val number = scanner.nextInt()
    for (i in 0..number) {
        println("$i!")
    }
}

fun test(scanner: Scanner){
    println("Let's test your programming knowledge.\n" +
                "Why do we use methods?\n" +
                "1. To repeat a statement multiple times.\n" +
                "2. To decompose a program into several small subroutines.\n" +
                "3. To determine the execution time of a program.\n" +
                "4. To interrupt the execution of a program.")
    while(true){
        val answ = scanner.nextInt()
        if (answ == 2) {
            println("Completed, have a nice day!\n" +
                        "Congratulations, have a nice day!")
            break
        }else{
            println("Please, try again.")
        }
    }
}

fun main(){
    val scanner = Scanner(System.`in`)
    println("Hello! My name is DICT_Bot.\n" +
                "Please, remind me your name.")
    greetings(scanner)
    println("Let me guess your age.\n" +
            "Enter remainders of dividing your age by 3, 5 and 7.")
    getAgeAndRemainders(scanner)
    println("Now I will prove to you that I can count to any number you want.")
    outputOfNumbers(scanner)
    test(scanner)
}