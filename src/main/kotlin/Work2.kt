import java.lang.Math.abs
import java.util.Calendar

fun main() {
    task1()
    task2()
    task3()
    task4()
    additionalTask()
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
fun additionalTask() {
    val list: String = ("1. Ввести имя\n" +
            "2. Ввести фамилию\n" +
            "3. Ввести год рождения\n" +
            "4. Вывести информацию\n" +
            "0. Выход\n" +
            "Введите значение из списка: ")

    var name: String? = null
    var surname: String? = null
    var yearOfBirth: Int? = null

    fun OnlyLetters(str: String): Boolean {
        val regex = "^[a-zA-Zа-яА-Я]+$".toRegex()
        return  regex.matches(str)
    }

    fun setName() {
        print("Введите имя: ")
        val valueName = readln()
        if (OnlyLetters(valueName)) {
            name = valueName
            println("Имя введено!")
        }
        else {
            println("Имя не внесено. Введены некоректные данные")
        }
    }

    fun setSurname() {
        print("Введите фамилию: ")
        val valueSurname = readln()
        if (OnlyLetters(valueSurname)) {
            surname = valueSurname
            println("Фамилия введена!")
        }
        else {
            println("Фамилия не внесена. Введены некоректные данные")
        }
    }

    fun setYearBirth() {
        try {
            print("Введите год рождения: ")
            val valueYearOfBirth = readln().toInt()
            if (valueYearOfBirth >= 1950 && valueYearOfBirth <= Calendar.getInstance().get(Calendar.YEAR)) {
                yearOfBirth = valueYearOfBirth
                println("Год рождения введен!")
            }
            else {
                println("Год рождения задан некорректно")
            }
        }
        catch (e: NumberFormatException) {
            println("Для ввода доступно только целое число")
        }
    }

    fun outputUserInformation() {
        if (name != null && surname != null && yearOfBirth != null) {
            println("Имя: $name\n" +
                    "Фамилия: $surname\n" +
                    "Год рождения: $yearOfBirth")
        }
        else if(name == null){
            println("Вы не указали имя")
        }
        else if(surname == null) {
            println("Вы не указали фамилию")
        }
        else if(yearOfBirth == null) {
            println("Вы не указали год рождения")
        }
    }

    while (true) {
        val choiceNumber: Int
        print(list)
        try {
            choiceNumber = readln().toInt()
            when(choiceNumber) {
                1 -> setName()
                2 -> setSurname()
                3 -> setYearBirth()
                4 -> outputUserInformation()
                0 -> break
            }
        }
        catch (e: NumberFormatException) {
            println("Для ввода доступно только целое число")
        }
    }
}