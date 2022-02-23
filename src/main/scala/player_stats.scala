object player_stats {

  def print_player(yr:Int, name:String, ctry: String, mtcs: Int, rns:Int, wkts: Int): Unit =  {
    var label = Array("Year", "Name", "Country", "Matches", "Runs", "Wickets")
    var player = Array(yr,name,ctry,mtcs,rns,wkts)
    for(i <- 0 to 5)  {
      println(s"${label(i)}:  ${player(i)}")
    }
  }

  def main(args: Array[String]): Unit =
  {
    var arr = Array((2021, "Sam", "India", 23, 197, 3),(2021, "Ram", "India", 23, 300, 30),(2021, "Mano", "India", 23, 300, 13),
      (2021, "Mukesh", "India", 23, 410, 18),(2021, "Suresh", "India", 23, 567, 11),(2021, "Ramesh", "India", 23, 322, 9),
      (2021, "Harish", "India", 23, 730, 21),(2021, "David", "India", 23, 212, 2),(2021, "Rahul", "India", 23, 900, 6))

    //t1
    println("\nPlayer with highest runs: ")
    var t1 = arr.sortWith(_._5 > _._5).take(1)(0)
    print_player(t1._1,t1._2,t1._3,t1._4,t1._5,t1._6)

    //t2
    println("\nTop 5 players by their runs scored: ")
    var t2 = arr.sortWith(_._5 > _._5).take(5)
    for(data <- t2)  {
      println("")
      print_player(data._1,data._2,data._3,data._4,data._5,data._6)
    }

    //t3
    println("\nTop 5 players by their wickets taken: ")
    var t3 = arr.sortWith(_._6 > _._6).take(5)
    for(data <- t3)  {
      println("")
      print_player(data._1,data._2,data._3,data._4,data._5,data._6)
    }

    //t4
    println("\nPlayers sorted by rank: ")
    var t4 = arr.sortBy(x => x._5 * 0.05 + x._6*5).reverse
    for(data <- t4) {
      println("")
      print_player(data._1,data._2,data._3,data._4,data._5,data._6)
    }
  }
}
