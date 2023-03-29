import java.util.Scanner
class CoffeeMachine(private var water: Int, private var milk: Int, private var beans: Int, private var cup: Int, private var money: Int){
    fun remaining(){
        println("The coffee machine has:\n" +
                    "$water of water\n" +
                    "$milk of milk\n" +
                    "$beans of coffee beans\n" +
                    "$cup of disposable cups\n" +
                    "$money of money")
    }

    fun buy(type: String){
        when(type){
            "1" -> {
                when {
                    water < 250 -> println("Sorry, not enough water!")
                    beans < 16 -> println("Sorry, not enough coffee beans!")
                    cup < 1 -> println("Sorry, not enough disposable cups!")
                    else -> {
                        println("I have enough resources, making you a coffee!")
                        water -= 250
                        beans -= 16
                        cup -= 1
                        money += 4
                    }
                }
            }
            "2" -> {
                when {
                    water < 350 -> println("Sorry, not enough water!")
                    milk < 75 -> println("Sorry, not enough milk!")
                    beans < 20 -> println("Sorry, not enough coffee beans!")
                    cup < 1 -> println("Sorry, not enough disposable cups!")
                    else -> {
                        println("I have enough resources, making you a coffee!")
                        water -= 350
                        milk -= 75
                        beans -= 20
                        cup -= 1
                        money += 7
                    }
                }
            }
            "3" -> {
                when {
                    water < 200 -> println("Sorry, not enough water!")
                    milk < 100 -> println("Sorry, not enough milk!")
                    beans < 12 -> println("Sorry, not enough coffee beans!")
                    cup < 1 -> println("Sorry, not enough disposable cups!")
                    else -> {
                        println("I have enough resources, making you a coffee!")
                        water -= 200
                        milk -= 100
                        beans -= 12
                        cup -= 1
                        money += 6
                    }
                }
            }
            "back" -> return
        }
    }

    fun fill(wAdd: Int, mAdd: Int, bAdd: Int,cAdd: Int){
        water += wAdd
        milk += mAdd
        beans += bAdd
        cup += cAdd
    }

    fun take(){
        println("I gave you $money.")
        money = 0
    }
}

fun main(){
    val scanner = Scanner(System.`in`)
    val coffeeMachine = CoffeeMachine(400, 540, 120, 9,550)
    while (true){
        println("Write action (buy, fill, take, remaining, exit): ")
        when(scanner.nextLine()){
            "buy" -> {
                println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu")
                val type = scanner.nextLine()
                coffeeMachine.buy(type)
            }
            "fill" -> {
                try{
                    println("Write how many ml of water you want to add:")
                    val wAdd = scanner.nextInt()
                    println("Write how many ml of milk you want to add:")
                    val mAdd = scanner.nextInt()
                    println("Write how many grams of coffee beans you want to add:")
                    val bAdd = scanner.nextInt()
                    println("Write how many disposable coffee cups you want to add:")
                    val cAdd = scanner.nextInt()
                    coffeeMachine.fill(wAdd, mAdd, bAdd, cAdd)
                }
                catch (e: NumberFormatException){
                    println("Invalid input! Please enter a number.")
                }

            }
            "take" -> coffeeMachine.take()
            "remaining" -> coffeeMachine.remaining()
            "exit" -> break
        }
    }
}