import com.datastax.driver.core.Cluster

/**
  * Created by knoldus on 10/4/17.
  */
class QueryResult {

  val cluster = Cluster.builder().addContactPoint("127.0.0.1").build()


  val session = cluster.connect("database")

  def userByEmail(email:String) = {

    val res = session.execute(s"SELECT * FROM user where email='$email'")

    val iterate = res.iterator()

    while (iterate.hasNext) {

      println(iterate.next())

    }
    println()
  }

  def videoByName(name:String) = {

    val res = session.execute(s"SELECT * FROM video_for_name where video_name='$name'")

    val iterate = res.iterator()

    while (iterate.hasNext) {

      println(iterate.next())

    }
    println()
  }

  def videoByUseridYear(id:Int,year:Int) = {

    val res = session.execute(s"SELECT * FROM video_for_year_id where user_id=$id AND year>$year")

    val iterate = res.iterator()

    while (iterate.hasNext) {

      println(iterate.next())

    }
    println()
    //cluster.close()
  }

  def videoByUseridYearDesc(id:Int,year:Int) = {

    val res = session.execute(s"SELECT * FROM video_for_year_id where user_id=$id AND year>$year ORDER BY year DESC")

    val iterate = res.iterator()

    while (iterate.hasNext) {

      println(iterate.next())

    }
    println()
    cluster.close()
  }

}
