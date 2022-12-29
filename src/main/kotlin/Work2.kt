fun main() {
    task1()
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
