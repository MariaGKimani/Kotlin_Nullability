fun main() {
//    nulls()
//    nullable()
//    xx()
//    replacement()
//    nulllaaa()
//    nullable1()
//    name()
//    readNumber()
//    elvis()
    greeting()
}
fun nulls(){
    val herName:String = "lilly"
    val hisName:String? = null
    println(hisName)
    println(herName)
    var catName: String? ="chockers"
    catName = null
//this code below shows null cannot be a value of a non-null type string
//    var dogName :String = "Lex"
//    dogName = null
}
///How to access values of  variables that may be null

fun nullable(){
    //nullable operator
    var catType:String?= "Chonkers"
   println( catType?.length)
    catType =null
    println( catType?.length)
}
///////Null safe calls///////////////////////Null safe calls////////////////////////////Null safe calls

fun xx(){
    var catType:String?= "Chonker"
    println( catType?.length?.toString())
    catType =null
    println( catType?.length.toString())
}

////////////////////////Arithmetic Operators/////////////////////////////////
fun replacement(){
    val a: Int? =100
    println(a?.plus(3))
    println(a?.minus(2))
    println(a?.times(8))
    println(a?.div(10))
    println(a?.rem(3))
}

//Declare a nullable variable of type String and give it a value
//Print out a substring of it,from position 3 to 6
fun nulllaaa(){
    var clothes: String? = "Fashion Cop"
    println(clothes?.substring(3,7))

}
//Declare a nullable variable  of type double
//multiply it by6 ,convert it to a float n print it to the console
fun nullable1(){
    var vardob: Double?= 10.0
    var time = ( vardob?.times(6)?.toFloat())
    println(time)
    println(time is Float)
}

//Receive the name of the user from the console
//Print out the length of the name
fun name(){
//    println("Enter your name : ")
    ///the line above is optional used when you want to pass a message or prompt
    val userName = readLine()?:""
    println("The length of your name is ${userName.length}")
}

//Read a number from the console and convert it to double
//Multiply it by 7,and convert the result into a string
//print the length of that string to the console
fun readNumber(){
    var number = readLine()?:""
    var multiply = number?.toDouble()?.times(7)
    println("Length of $multiply is ${multiply?.toString()?.length} ")
}


//////////////////////Elvis operator////////////////////////////////
fun elvis(){
    val catName :String? =null
    println(catName?:"This cat has no name")
    println(catName?:"This cat has no name".length)

    var dogName :String? =null
     dogName ="lex"
    println(dogName?:"This dog has no name")
}

//read a message from the console
//print out either the message or a default greeting
fun greeting(){
    println("Input a message")
    var userGreeting = readLine()
    println(userGreeting?:"Hi how are you?")
}

///Read a number from the console
//Assume you knw that the user has entered a value
//and the read variable is not null
//Multiply that number by 5 and print the result
fun numbers(){
    println("enter n.o: ")
    val userNum = readLine()
    val number = userNum?.toInt()
    println("$number multiplied by 5 is ${number!! *5}")

}


///A product costs 29.99.
//
//Ask a user at the console how many products they want to buy.
//
//If the read value is null, use the default of one.
//
//Print the total of the purchase.
fun cost(){

}
