object bucketiseArray {

  def findBucket(num: Double): (Double, Double) = {
    var v1 = (num/0.050).floor * 0.050
    var v2 = (num/0.050).floor * 0.050 + 0.049

    (v1 - (v1 % 0.001), v2 - (v2 % 0.001))

  }

  def main(args: Array[String]): Unit =
  {
    var n = scala.io.StdIn.readInt()

    var arr1 = new Array[Double](n)

    for(i <- 0 to n-1)
      {
        var num = scala.io.StdIn.readDouble()
        arr1(i) = num
      }

    for(i <- 0 to n-1)
      {
        println(findBucket(arr1(i)))
      }
  }
}
