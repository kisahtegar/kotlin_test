fun integerType() {
    var number = 22
    val maxIntegerValue = Int.MAX_VALUE
    val minIntegerValue = Int.MIN_VALUE
    println("Int maximum value is $maxIntegerValue")
    println("Int minimum value is $minIntegerValue")

    // Output:
    // Int maximum value is 2147483647
    // Int minimum value is -2147483648

    // This would be throw error because it out maximum value
    // number = 2147483648
}