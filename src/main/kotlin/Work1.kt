fun main() {
    //Задание 1
    val name = "Кирилл"
    val surname = "Корнилов"
    val profession = "Программист"
    println("$name $surname, $profession")

    //Задание 2
    val variableByte: Byte = 100
    val variableShort: Short = 30000
    val variableInt: Int = 555
    val variableLong: Long = 64345375368568634

    val variableFloat: Float = 5.63F

    val variableDouble: Double = 7.4324

    val variableStr: String = "<3"

    val variableChar: Char = 'H'

    val variableBooleanTrue: Boolean = true
    val variableBooleanFalse: Boolean = false
    val variableNull: Boolean? = null

    println("Byte: $variableByte\n" +
            "Short: $variableShort\n" +
            "Int: $variableInt\n" +
            "Long: $variableLong\n" +
            "Float: $variableFloat\n" +
            "Double: $variableDouble\n" +
            "String: $variableStr\n" +
            "Char: $variableChar\n" +
            "Boolean true: $variableBooleanTrue\n" +
            "Boolean false: $variableBooleanFalse\n" +
            "Null: $variableNull")

    //Задание 3
    print("Введите любое значение: ")
    val anyString: String = readln()

    println("isEmpty: ${anyString.isEmpty()}\n" +
            "charAt(8): ${anyString[8]}\n" +
            "equals(\"С новым годом\"): ${anyString == "С новым годом"}\n" +
            "equalsIgnoreCase(\"С НОВЫМ ГОДОМ\"): ${anyString.equals("С НОВЫМ ГОДОМ", ignoreCase = true)}\n" +
            "startsWith(\"С новым\"): ${anyString.startsWith("С новым")}\n" +
            "startsWith(\"годом\", 8): ${anyString.startsWith("годом", 8)}\n" +
            "endsWith(\"дом\"): ${anyString.endsWith("дом")}\n" +
            "contains(\"м го\"): ${anyString.contains("м го")}\n" +
            "concat(\", друзья!\"): ${anyString.plus(", друзья!")}\n" +
            "replace(\"С новым\", \"Со старым\"): ${anyString.replace("С новым", "Со старым")}\n" +
            "toLowerCase: ${anyString.lowercase()}"
    )
    val builderString = StringBuilder("Моя профессия: ")
    builderString.append(profession)
    println(builderString)
}
