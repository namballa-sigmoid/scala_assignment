object player_stats {
  def main(args: Array[String]): Unit =
  {
    var arr = Array((2021, "Sam", "India", 23, 2300, 3),(2021, "Ram", "India", 23, 300, 30),(2021, "Mano", "India", 23, 300, 13))

    var t1 = arr.sortWith(_._5 > _._5).take(1)(0)._2
    //t1
    println(t1)
    //t2
    for(data <- arr.sortWith(_._5 > _._5).take(5))  {
      println(data._2)
    }
    //t3
    for(data <- arr.sortWith(_._6 > _._6).take(5))  {
      println(data._2)
    }
    //t4
    var t4 = arr.sortBy(x => x._5 * 0.05 + x._6*5).reverse

    println(t4)
  }
}
