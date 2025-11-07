package com.ffucks

object Triple {

    val product: (String, Double, Boolean) = ("Notebook", 3500, true)

    val (name, price, inStock) = product
    println(s"Product: $name, Price: $$${price}, In Stock: $inStock")

    def split(divide: Int, number: Int): (Int, Int) =  (divide / number, divide % number)


    val persons = List(
        ("Fabio", 36),
        ("Renata", 41),
        ("Bernardo", 10)
    )


    for ((name, age) <- persons) {
        println(s"$name have $age years old")
    }

    val orders = List(
        ("Fabio", "Notebook", 2),
        ("Renata", "Mouse", 1),
        ("Bernardo", "Keyboard", 3)
    )

    for ((client, product, quantity) <- orders)
        println(s"$client buyed $quantity unit(s) of $product")

    // Same example
    for ((name, age) <- persons if age > 30) yield name
    val test = persons.filter(_._2 > 30).map(_._1)

}
