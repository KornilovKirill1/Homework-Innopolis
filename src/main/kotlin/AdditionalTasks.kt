import java.lang.reflect.Array
import kotlin.math.truncate
import kotlin.math.abs
import kotlin.random.Random


fun main() {
    conditionalStatements1()
    conditionalStatements2()
    conditionalStatements3()
    conditionalStatements4()
    conditionalStatements5()
    conditionalStatements6()
    conditionalStatements7()
    conditionalStatements8()

    cycles1()
    cycles2()
    cycles3()
    cycles4()
    cycles5()

    array1()
    array2()
    array3()
    array4()
    array5()
    array6()
    array7()
    array8()
}
fun conditionalStatements1(){
    print("Введите любое число: ")
    val number: Double = readln().toDouble()
    if(number > 10){
        println("Число больше десяти")
    }
    else if(number == 10.0){
        println("Число равняется десяти")
    }
    else{
        println("Число меньше десяти")
    }
}
fun conditionalStatements2(){
    print("Введите первое число: ")
    val numberFirst: Double = readln().toDouble()

    print("Введите второе число: ")
    val numberSecond: Double = readln().toDouble()

    if(numberFirst > numberSecond) {
        println("Первое число больше, чем второе")
    }
    else if(numberFirst == numberSecond){
        println("Первое число равняется второму числу")
    }
    else{
        println("Первое число меньше, чем второе")
    }
}
fun conditionalStatements3(){
    print("Введите сторону A: ")
    val sideA: Double = readln().toDouble()

    print("Введите сторону B: ")
    val sideB: Double = readln().toDouble()

    print("Введите сторону C: ")
    val sideC: Double = readln().toDouble()

    if(sideA == sideB && sideA == sideC){
        println("Треугольник: равносторонний")
    }
    else if(sideA == sideB || sideA == sideC || sideB == sideC){
        println("Треугольник: равнобедренный")
    }
    else {
        println("Треугольник: разносторонний")
    }
}
fun conditionalStatements4(){
    var negativeNumberCount = 0
    var positiveNumberCount = 0

    while (negativeNumberCount + positiveNumberCount < 4){
        print("Введите число ${negativeNumberCount + positiveNumberCount + 1}: ")
        val number: Double = readln().toDouble()

        if (number == 0.0) continue
        if (number < 0){
            negativeNumberCount++
        }
        else{
            positiveNumberCount++
        }
    }
    println("Положительных чисел: $positiveNumberCount\n" +
            "Отрицательных чисел: $negativeNumberCount")
}
fun conditionalStatements5(){
    var exponent = 1
    var max:Double = Double.NEGATIVE_INFINITY

    while (exponent <= 3) {
        print("Введите число: ")
        val number: Double = readln().toDouble()
        if (max < number) max = number
        exponent++
    }

    val result = if (truncate(max) == max) {
        max.toInt()
    } else {
        max
    }

    println("Максимальное число: $result")
}
fun conditionalStatements6(){
    var exponent = 1
    var max:Double = Double.NEGATIVE_INFINITY
    var min:Double = Double.POSITIVE_INFINITY

    while (exponent <= 3) {
        print("Введите число: ")
        val number: Double = readln().toDouble()
        if (max < number) max = number
        if (min > number) min = number
        exponent++
    }

    val sumMaxAndMin = max + min

    val result = if (truncate(sumMaxAndMin) == sumMaxAndMin) {
        sumMaxAndMin.toInt()
    } else {
        sumMaxAndMin
    }

    println("Сумма максимального и минимального числа: $result")
}
fun conditionalStatements7(){
    val number: Int = readln("Введите целое чило: ").toIntOrNull() ?: return println("Некорректные входные данные")

    if (number % 2 == 0) {
        println("Число $number - чётное")
    } else {
        println("Число $number - нечётное")
    }
}
fun conditionalStatements8(){
    class Goods(val name: String, val price: Double) {
        fun buy(money: Double) {
            if (this.price > money) {
                println("Денег не хватает на покупку \"${this.name}\"")
            } else if (this.price == money) {
                println("Спасибо за покупку \"${this.name}\"")
            } else {
                println("Спасибо за покупку \"${this.name}\". Ваша сдача ${"%.2f".format(money - this.price)}")
            }
        }
    }

    val storeGoods = arrayOf<Goods>(
        Goods("Хлеб", 50.0),
        Goods("Яйца", 65.90),
        Goods("Гречка", 70.95))

    val goodsPriceList = storeGoods.mapIndexed {
            i, value -> "${i+1}: ${value.name} - ${value.price}"
    }.joinToString("\n")

    println("***Добро пожаловать в магазин !!!***\n$goodsPriceList")

    while (true) {
        print("Введите номер позиции для покупки: ")
        val number: Int = readln().toInt()

        if (number !in 1..storeGoods.size) {
            println("Такой позиции товара не существует")
            continue
        }

        print("Введите денежную сумму: ")
        val money: Double = readln().toDouble()

        storeGoods[number-1].buy(money)
        break
    }
}
fun cycles1(){
    for(i in 1..10){
        println("4*$i = ${4*i}")
    }
}
fun cycles2(){
    print("Введите число: ")
    val number: Double = readln().toDouble()

    for (i in 0  until abs(number.toInt())) {
        if (i % 2 == 0) {
            if (number >= 0.0) {
                println(i)
            } else {
                println(-i)
            }
        }
    }
}
fun cycles3(){
    val x: Int = readln("Введите X последовательности фибоначчи: ").toIntOrNull() ?: return println("X может быть только целым числом")
    if (x <= 0) return println("X может быть только положительным числом")

    var fibOne = 0
    var fibTwo = 1

    for (i in 1 until x) {
        val buffer = fibTwo
        fibTwo += fibOne
        fibOne = buffer
    }

    println(fibOne)
}
fun cycles4(){
    val number: Int = readln("Введите N факториал: ").toIntOrNull() ?: return println("N может быть только целым числом")
    if (number < 0) return println("N не может быть отрицательным числом")
    var result: Int = 1

    for (i in 1 .. number) result *= i

    println(result)
}
fun cycles5() {
    readln("Введите любое значение: ").forEach { println(it) }
}
fun array1(){
    val array = Array(Random.nextInt(10,25)){Random.nextInt(-100,100)}

    var countPositiveNumber = 0
    var countNegativeNumber = 0

    array.forEach {
        if (it > 0){
            countPositiveNumber++
        }
        else if (it < 0) {
            countNegativeNumber++
        }
    }

    println("Массив: [${array.joinToString()}]")
    println("Отрицательные: $countNegativeNumber\n" +
            "Положительные: $countPositiveNumber")
}
fun array2(){
    val array = Array(Random.nextInt(5,15)){Random.nextInt(-100,100)}

    var sumOfEvenIndexes = 0
    for (i in array.indices step 2){
        sumOfEvenIndexes += array[i]
    }

    println("Массив: [${array.joinToString()}]")
    println("Сумма элементов с четным индексом: $sumOfEvenIndexes")

}
fun array3() {
    val array = Array(Random.nextInt(5,15)){Random.nextInt(-100,100)}

    var sumOfEven = 0

    array.forEach {
        if (it % 2 == 0) sumOfEven += it
    }

    println("Массив: [${array.joinToString()}]")
    println("Сумма четных элементов: $sumOfEven")
}
fun array4(){
    val array = Array(Random.nextInt(5,15)) { Random.nextInt(-100,100) }

    println("Массив: [${array.joinToString()}]")
    println("Максимальный элемент: ${array.max()}")
}
fun array5(){
    val array = Array(Random.nextInt(15,30)) { Random.nextInt(-50,50) }
    var count = 0
    var value:Int? = null

    for (currentValue in array) {
        var currentCount = 0

        for (it in array) {
            if (currentValue == it) currentCount++
        }

        if (count < currentCount) {
            count = currentCount
            value = currentValue
        } else if (count == currentCount && value?.compareTo(currentValue) == -1) {
            value = currentValue
        }
    }

    println(array.joinToString())
    if (count <= 1) {
        println("В массиве нет повторяющихся элементов")
    } else {
        println("$value повторяется $count раз")
    }
}
fun array6(){
    val matrixSize = 10
    val array = Array(matrixSize) { Array(matrixSize) { Random.nextInt(10,100) } }

    for (row in array) {
        for (column in row) {
            print("$column ")
        }
        print("\n")
    }

    for (i in 0 until matrixSize) {
        println("${"   ".repeat(i)}${array[i][i]}")
    }
}
fun array7() {
    val matrixSize = 10
    val array = Array(matrixSize) { Array(matrixSize) { Random.nextInt(10,100) } }

    for (row in array) {
        for (column in row) {
            print("$column ")
        }
        print("\n")
    }

    for (i in 0 until matrixSize) {
        println("${"   ".repeat(matrixSize - 1 - i)}${array[i][matrixSize - 1 - i ]}")
    }
}
fun array8() {
    val matrixSize = 5
    val array = Array(matrixSize) { Array(matrixSize) { Random.nextInt(10,100) } }
    var maxSum:Int? = null

    for (row in array) {
        for (column in row) {
            print("$column  ")
        }
        print("\n")
    }
    println("-".repeat(matrixSize*4))

    for (i in 0 until matrixSize) {
        var sum:Int = 0

        for (j in 0 until matrixSize) {
            sum += array[j][i]
        }

        if (maxSum?.compareTo(sum) == -1 || maxSum == null) {
            maxSum = sum
        }
        print("$sum ")
    }
    println("\nНаибольшая сумма столбцов: $maxSum")
}


fun readln(inputMessage: String?): String {
    if (inputMessage != null) print(inputMessage)
    return readln()
}