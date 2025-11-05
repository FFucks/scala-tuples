package com.ffucks

object Tuple {

    val person: (String, Int) = ("Fabio", 36)
    val tuple22: (String, Int, String, Int, String, Int, String, Int, String, Int, String, Int, String, Int, String, Int, String, Int, String, Int, String, Int) =
        ("v1", 1,
        "v2", 2,
        "v3", 3,
        "v4", 4,
        "v5", 5,
        "v6", 6,
        "v7", 7,
        "v8", 8,
        "v9", 9,
        "v10", 10,
        "v11", 11)

    println(person._1)
    println(person._2)

    val (name, age) = person
    println(s"$name is $age years old.")

    val prices = List(
        ("Notebook", 3500.0),
        ("Mouse", 120.0),
        ("Keyboard", 250.0)
    )

    val discount = List(
        ("Notebook", 0.1),
        ("Mouse", 0.05),
        ("Keyboard", 0.08)
    )

    val pricesWithDiscount =
        for {
            (product1, price) <- prices
            (product2, discount) <- discount
            if product1 == product2
        } yield (product1, price * (1 - discount))

    pricesWithDiscount.foreach {
        case (name, finalPrice) =>
            println(f"$name%-10s => R$$$finalPrice%.2f")
    }
}
