fun main() {
    val name = "Кирилл"
    val surname = "Корнилов"
    val profession = "Программист"
    println("$name $surname, $profession")
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
}
