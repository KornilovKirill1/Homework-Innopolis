import java.lang.Math.abs
fun main() {
    task1()
    task2()
}
fun task1() {
    var inputInfo: String = ""

    while(true) {
        print("Напишите что-нибудь: ")
        var word = readln()
        if(word.lowercase() == "exit") break
        inputInfo += "\n $word"
    }
    println(inputInfo)
}
fun task2() {
    var sum:Int = 0
    val number:Int

    print("Напишите число: ")

    try {
        number = readln().toInt()
    }
    catch(e: NumberFormatException) {
        return println("Для ввода доступно только целое число")
    }

    for(i in 0..abs(number)){
        sum += i
    }

    if(number < 0) sum = -sum

    if(number > 0 ) {
        println("Сумма от 0 до $number равна $sum")
    }
    else {
        println("Сумма от $number до 0 равна $sum")
    }
}
