
fun main() {

    val X = readLine()!!.toInt()


    val Y = readLine()!!.toFloat()


    val averageConsumption = X / Y


    println("%.3f km/l".format(averageConsumption))
}