fun main(args: Array<String>) {
    print("Enter first number: ")
    var x=Integer.valueOf(readln())
    print("Choose sign: ")
    var si= readln()
    print("Enter second number: ")
    var y=Integer.valueOf(readln())
    if (si=="+"){
        var ans=x+y
        println("The answwer is: "+ans)
    }else if (si=="-"){
        var ans=x-y
        println("The answer is: "+ans)
    }else if (si=="/"){
        var ans=x/y
        println("The answer is: "+ans)
    }else if (si=="*"){
        var ans=x*y
        println("The answer is: "+ans)
    }
}