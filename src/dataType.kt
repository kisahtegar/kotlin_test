fun dataType() {
    // 1) Byte Type
    val byteNumber: Byte = 127
    val maxByteValue = Byte.MAX_VALUE
    val minByteValue = Byte.MIN_VALUE
    println("Byte maximum value is $maxByteValue")
    println("Byte minimum value is $minByteValue")
    // Output:
    // Byte maximum value is 127
    // Byte minimum value is -128

    // 2) Short Type
    val shortNumber: Short = 32767
    val maxShortValue = Short.MAX_VALUE
    val minShortValue = Short.MIN_VALUE
    println("Short maximum value is $maxShortValue")
    println("Short minimum value is $minShortValue")
    // Output:
    // Short maximum value is 32767
    // Short minimum value is -32768

    // 2) Long Type
    val longNumber: Long = 9223372036854775807
    val maxLongValue = Long.MAX_VALUE
    val minLongValue = Long.MIN_VALUE
    println("Long maximum value is $maxLongValue")
    println("Long minimum value is $minLongValue")
    // Output:
    // Long maximum value is 9223372036854775807
    // Long minimum value is -9223372036854775808
}