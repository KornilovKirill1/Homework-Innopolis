import java.lang.Math.abs
fun main() {
    task1()
    task2()
    task3()
    task4()
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
fun task3() {
    var score:Int
    while(true) {
        try {
            print("Введите свой балл: ")
            score = readln().toInt()
            if(score > 100 || score < 0) {
                println("Введено некорректное значение")
            }
            else {
                break
            }
        }
        catch (e: NumberFormatException) {
            println("Для ввода доступно только целое число")
        }
    }

    if(score >= 70) {
        println("Congrats! You’ve passed the test!")
    }
    else {
        println("Sorry, you’ve failed the test.")
    }
}
fun task4() {
    val channel = arrayOf(
        "МатчТВ",
        "ТНТ",
        "СТС",
        "Пятница",
        "2х2"
    )
    while(true) {
        val number:Int
        print("Введите номер канала: ")

        try {
            number = readln().toInt()
            if(number == 0) break

            if(number >= 1 && number <= channel.size) {
                println("Номер канала $number - ${channel[number-1]}")
            }
            else {
                println("Такого канала нет. Введите номер канала в диапазоне от 1 до ${channel.size}")
            }
        }
        catch (e: NumberFormatException){
            println("Для ввода доступно только целое число")
        }
    }
}
