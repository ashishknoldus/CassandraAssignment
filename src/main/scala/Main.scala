/**
  * Created by knoldus on 10/4/17.
  */
object Main extends App{

  val queryResult=new QueryResult
  queryResult.userByEmail("ashish1269@gmail.com")
  queryResult.videoByName("Scala Tutorial")
  queryResult.videoByUseridYear(100,2015)
  queryResult.videoByUseridYearDesc(100,2015)

}
