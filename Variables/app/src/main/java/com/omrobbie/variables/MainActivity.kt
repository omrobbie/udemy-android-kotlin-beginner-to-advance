package com.omrobbie.variables

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var1()
        var2()
        var3()
        var4()
        var5()
        var6()
        var7()
        var8()
        var9()
        var10()
        var11()
        var12()
        var13()
        var14()
        var15()
        var16()
        var17()
        var18()
        var19()
        var20()
        var21()
        var22()
        var23()
        var24()
        var25()
        var26()
        var27()
        var28()
        var29()
        var30()
        var31()
        var32()

        simple()
        simple()
        simple()
        simple()

        sum(5, 10)
        product(23, 2.34f, 2.65)
        product(12, 23.54f, 23.45)

        println(calculator(1))

        println(sum2(12, 13))

        var33()

        var34()
        var35()
        var36()
        var37()
        var38()
        var39()
        var40()
        var41()
        var42()
        var43()
        var44()
        var45()
        var46()
    }

    fun var1() {
        var num1 = 8
        var num2 = 9
        var name = "omrobbie"
        var f = 2.1

        var sum = num1 + num2 + f
        println(sum)
        println(name)
    }

    fun var2() {
        var num1: Int
        var name: String

        num1 = 87
        name = "omrobbie"

        println(num1)
        println(name)
    }

    fun var3() {
        // ? for allowing null value
        var num1: Int?
        var name: String?

        num1 = null
        name = null
        println(num1 + " | " + name)

        num1 = 9
        name = "omrobbie"
        println("$num1 | $name")
    }

    fun var4() {
        var name: String = "Kotlin"
        val num1: Int = 10 //val = cannot update the value

        name = "omrobbie"
        //num1 = 8

        println(num1)
        println(name)
    }

    fun var5() {
        println("Enter the name")
        var name: String? = "Kotlin" //readLine().toString()
        println("Enter age")
        var age: Int? = 22 //readLine()!!.toInt()
        println("Enter date of birth")
        var dob: Int? = 1//readLine()!!.toInt()

        print("Name: $name, Age: $age, DateOfBirth: $dob")
    }

    fun var6() {
        var num1: Int = 10
        var name: String = "Kotlin"
        var f: Float = 2.34f
        var name2: String = "10"

        var res1 = f.toInt()
        var res2 = num1.toFloat()
        var res3 = name2.toInt()

        println("Float to Int: $res1")
        println("Int to Float: $res2")
        println("String to Int: $res3")
    }

    fun var7() {
        var num1: Int = 10
        var num2: Int = 8
        var name: String = "Kotlin"

        var res1 = num1 == num2
        println(res1)

        var res2 = num1 > num2
        var res3 = num1 < num2

        var res4 = num1 >= num2
        var res5 = num1 <= num2

        println("\n$res2 \n$res3 \n$res4 \n$res5")
    }

    fun var8() {
        var name1: String = "Kotlin"
        var name2: String = "kotlin"

        var res1 = name1 == name2
        println(res1)

        var name3: String = "abc"
        var name4: String = "abcd"

        var res2 = name3.length <= name4.length
        println(res2)
    }

    fun var9() {
        var res1 = 7 < 6 && 8 > 10 && 3 > 2
        var res2 = 7 > 6 && 5 < 3 && 2 > 10
        println(res1)
        println(res2)

        var res3 = 5 > 6 || 7 > 3 || 2 > 10
        var res4 = 5 > 10 || 5 > 12 || 5 < 3
        println(res3)
        println(res4)
    }

    fun var10() {
        var res1 = 10 % 4
        println("Reminder is $res1")

        var res2 = 12.34 % 3.45
        println("Reminder is $res2")

        var res3 = 12 % 23
        println("Reminder is $res3")
    }

    fun var11() {
        var mul = 12 * 4
        var div = 9 / 78
        var sub = 12 - 23
        var add = 12 + 23

        println("Multiple $mul")
        println("Divider $div")
        println("Substraction $sub")
        println("Addition $add")
    }

    fun var12() {
        var age: Int

        print("Enter the age: ")
        //age = readLine()!!.toInt()
        age = 12
        println(age)

        if (age >= 45) {
            println("You are old")
        } else {
            println("You are young")
        }
    }

    fun var13() {
        var age: Int

        print("Enter the age: ")
        //age = readLine()!!.toInt()
        age = 14
        println(age)

        if (age <= 45) {
            if (age >= 1 && age <= 10) {
                println("You are child")
            }

            if (age >= 13 && age <= 19) {
                println("You are teenager")
            }
        } else {
            println("You are old")
        }
    }

    fun var14() {
        var grade: Int = 90
        println("Your current point: $grade")

        if (grade >= 90) {
            println("Your grade is A+")
        } else if (grade >= 80 && grade <= 90) {
            println("Your grade is A")
        } else if (grade >= 70 && grade <= 80) {
            println("Your grade is B")
        } else if (grade >= 60 && grade <= 70) {
            println("Your grade is C")
        } else if (grade < 50) {
            println("Your grade is D")
        } else {
            println("Wrong current point")
        }
    }

    fun var15() {
        var ch: Char

        print("Enter char: ")
        //ch = readLine()!!.get(0)
        ch = 'a'
        println(ch)

        when (ch) {
            'a' -> {
                println("You entered a vowel " + ch)
            }
            'i' -> {
                println("You entered a vowel " + ch)
            }
            'u' -> {
                println("You entered a vowel " + ch)
            }
            'e' -> {
                println("You entered a vowel " + ch)
            }
            'o' -> {
                println("You entered a vowel " + ch)
            }
            else -> {
                println("You entered a consonant " + ch)
            }
        }
    }

    fun var16() {
        var num1: Int = 1
        var num2: Int = 2
        println("num1: $num1, num2: $num2")

        var request: Int
        request = 1
        println("Command request is $request")

        when (request) {
            1 -> {
                println("Addition " + (num1 + num2))
            }
            2 -> {
                println("Substraction " + (num1 - num2))
            }
            3 -> {
                println("Multiplication " + (num1 * num2))
            }
            4 -> {
                println("Division " + (num1 / num2))
            }
            else -> {
                println("Wrong option request")
            }
        }
    }

    fun var17() {
        for (i in 1..10) {
            println("Hello World!")
        }
    }

    fun var18() {
        var num: Int = 5
        var fact: Int = 1

        for (i in 1..num) {
            fact = fact * i
        }
        println("Factorial: $fact")
    }

    fun var19() {
        for (i in 1..5) {
            for (j in 1..5) {
                println("Hello World!")
            }
        }
    }

    fun var20() {
        for (i in 1..5) {
            for (j in 1..i) {
                print("*")
            }
            println()
        }
    }

    fun var21() {
        for (i in 1..5) {
            if (i == 2) break
            println("inside for-loop")
        }
        println("outside for-loop")
    }

    fun var22() {
        for (i in 1..5) {
            if (i == 2) continue
            println("inside for-loop")
        }
        println("outside for-loop")
    }

    fun var23() {
        var counter: Int = 1

        while (counter <= 10) {
            println("Hello World!")
            counter++
        }
    }

    fun var24() {
        var number: Int = 12
        println("Number: $number")

        var counter: Int = 1

        while (counter <= 10) {
            println("$number * $counter = " + (number * counter))
            counter++
        }
    }

    fun var25() {
        var counter: Int = 1

        do {
            println("Hello World!")
            counter++
        } while (counter >= 10)
    }

    fun var26() {
        var array = Array<Int>(5) { 0 }

//        array[0] = 11
//        array[1] = 12
//        array[2] = 13
//        array[3] = 14
//        array[4] = 15

        for (i in 0..4) {
            print("Enter element at $i location: ")
            //var element = readLine()!!.toInt()
            var element = i + 10
            println(element)

            array[i] = element
        }

        for (items in array) {
            println("Array element $items")
        }
    }

    fun var27() {
        var array = Array(3, { IntArray(3) })

//        array[0][0] = 12

        for (i in 0..2) {
            for (j in 0..2) {
                print("Enter a number for row $i and column $j: ")
                array[i][j] = i + 10
                println(array[i][j])
            }
        }
    }

    fun var28() {
        var arrayList = ArrayList<String>()

        arrayList.add("Kotlin")
        arrayList.add("Java")
        arrayList.add("Python")
        arrayList.add("C#")

        arrayList.removeAt(2)

        for (items in arrayList) {
            println(items)
        }

        println(arrayList.get(1))
    }

    fun var29() {
        var map = HashMap<Int, String>()

        map.put(1, "Kotlin")
        map.put(2, "Java")
        map.put(3, "Python")
        map.put(4, "C#")

        for (k in map) {
            println(k.key.toString() + " | " + k.value)
        }
    }

    fun var30() {
        var map = hashMapOf(1 to "Kotlin", 2 to "Java")
        map.put(3, "C#")

        for (items in map) {
            println(items)
        }
    }

    fun var31() {
//        var listOf = listOf(1, 2, "kotlin", true, 2.34)
        var listOf = mutableListOf(1, 2, "kotlin", true, 2.34)

        listOf[0] = "Kotlin"
        listOf[1] = "Java"

        for (items in listOf) {
            println(items)
        }
    }

    fun var32() {
        var arrayOf = arrayOf(1, 3, 4, "kotlin", true, 2.34)

        println(arrayOf.get(3))

        for (items in arrayOf) {
            println(items)
        }
    }

    fun simple() {
        println("Hello World!")
    }

    fun sum(num1: Int, num2: Int) {
        var sum = num1 + num2
        println("The sum is $sum")
    }

    fun product(num1: Int, num2: Float, num3: Double) {
        var product = num1 * num2 * num3
        println("The product $product")
    }

    // 1st example
    /*fun calculator(option: Int): Int {
        when (option) {
            1 -> {
                return 12 + 13
            }
            2 -> {
                return 12 - 13
            }
            3 -> {
                return 12 / 13
            }
            else -> {
                throw IllegalArgumentException("Enter the right option")
            }
        }
    }*/

    // 2nd example
    /*fun calculator(option: Int): Int {
        return when (option) {
            1 -> {
                12 + 13
            }
            2 -> {
                12 - 13
            }
            3 -> {
                12 / 13
            }
            else -> {
                throw IllegalArgumentException("Enter the right option")
            }
        }
    }*/

    // 3rd example
    fun calculator(option: Int) = when (option) {
        1 -> {
            12 + 13
        }
        2 -> {
            12 - 13
        }
        3 -> {
            12 / 13
        }
        else -> {
            throw IllegalArgumentException("Enter the right option")
        }
    }

    // 1st example
    /*fun sum2(num1: Int, num2: Int): Int {
        var sum = num1 + num2
        return sum
    }*/

    // 2nd example
    /*fun sum2(num1: Int, num2: Int): Int {
        return num1 + num2
    }*/

    // 3rd example
    fun sum2(num1: Int, num2: Int) = num1 + num2

    fun var33() {
        var str1 = "How"
        var str2 = "Are"
        var str3 = "You"

        println(str1.concat(str2, str3))
        println("Kotlin".concat(str2, str3))

        println(7.sum(12, 13))

        println(7.prod(8))
    }

    fun String.concat(str2: String, str3: String): String {
        return this + str2 + str3
    }

    fun Int.sum(num1: Int, num2: Int): Int {
        return this + num1 + num2
    }

    infix fun Int.prod(num1: Int): Int {
        return this * num1
    }


    fun var34() {
        var dog = Dog("German Shepherd", "Black", 7)
        var dog2 = Dog("Lucy", "Brown", 10)

//        dog.name = "German Shepherd"
//        dog.color = "Black"
//        dog.weight = 7

        println(dog.name + ", " + dog.color + ", " + dog.weight)
        println(dog.dogPrice("$3000"))

        println(dog2.name + ", " + dog2.color + ", " + dog2.weight)
        println(dog2.dogPrice("$4000"))
    }

    fun var35() {
        var dog = Dog("Female", 12)
        var dog2 = Dog("Lucy", "Black", 13)

        println(dog.gender + ", " + dog.age)
        println(dog2.name + ", " + dog2.color + ", " + dog2.weight)
    }

    fun var36() {
        var player1 = Player1("John", 0, 100, "Axe")

        player1.killEnemy()
        player1.killEnemy()

        player1.damage(12)
        player1.showAll()


        var player2 = Player2("Siddique", 0, 100, "Pistol")
        player2.killEnemy()
        player2.showAll()
    }

    fun var37() {
        var player1 = Player1("John", 0, 100, "Axe")
        var player2 = Player2("Siddique", 0, 100, "Pistol")

        player1.damage(12)
        player2.damage(12)
    }

    fun var38() {
        var player1 = Player1("John", 0, 100, "Axe")
        var player2 = Player2("Siddique", 0, 100, "Pistol")
        var player3 = Player3("Saad", 0, 100, "Rifle")

        player3.killEnemy()
        player3.damage(16)
    }

    fun var39() {
        var dataModel = DataModel()

        dataModel.addVehicle("Fzr", 2012, "$3000", Company.TOYOTA)
        dataModel.addVehicle("GLI", 2013, "$2000", Company.SUZUKI)

        dataModel.addVehicle("XLi", 2017, "$20000", Company.HONDA)
        dataModel.addVehicle("Ferrari", 2016, "$30000", Company.SUZUKI)

        dataModel.sellVehicle(1)

        dataModel.showAll()
    }

    fun var40() {
        var overload = Overload()

        println(overload.sum(12))
        println(overload.sum(12, 13))
        println(overload.sum(12, 13, 14))
    }

    fun var41() {
        var car = Car()

        car.name = "public variable"
    }

    fun var42() {
        var info = Info()
        info.getInfo()
    }

    fun var43() {
        var s1 = Singleton.single
        var s2 = Singleton.single
        var s3 = Singleton.single
    }

    fun var44() {
        var person = Person()

        var array = Array<Person>(2) { person }
        array[0] = Teacher()
        array[1] = Student()

        var res1 = array[0].myInfo("Teacher", 23, "PHD")
        var res2 = array[1].myInfo("Student", 12, "Matriculation")
    }

    fun var45() {
        var teacher = TeacherClass("Kotlin", 12)
        teacher.info("Siddique", 23, 123)
        teacher.experience("Programming", 5)

        var student = StudentClass("Learn", 11)
        student.info("omrobbie", 33, 1234)
        student.experience("Programming", 5)
    }

    fun var46() {
        var num1: Int = 1
        var num2: Int = 2

        var res = try {
            println("Enter num1")
            //num1 = readLine()!!.toInt()

            println("Enter num2")
            //num2 = readLine()!!.toInt()

            num1 + num2

            println("This is after the exception")
        } catch (e: Exception) {
            println("There is an exception " + e.message)
        } finally {
            println("I am in finally block")
        }
    }

}
