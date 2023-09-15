fun main() {
    val trip = DriveCar()
    trip.ignite()
    trip.checkNeedReverse("front")
    trip.removeHandBreak()
//    val divider = 4.5
//    val division = printVariables(34,17,5.6)
//    /*
//    * println("This is Fred")
//    * */
//    greeting("Victor Amwollo","Good afternoon",10)
//
//    println("Result is: "+division)

}

/**
 * This function accepts two parameters
 *   @var firstName this is customers first name
 *   @var great The greeting for the customer
 * */
fun greeting(firstName:String, greet:String,age:Int):Unit{
    println(greet+" "+ firstName)

    println("Your age is "+ age)
}

fun printVariables(firstNumber:Int, secondNumber:Int,divider:Double = 1.2) : Double{
   return (firstNumber * secondNumber)/divider
}