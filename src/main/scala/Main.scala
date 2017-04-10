/**
  * Created by knoldus on 10/4/17.
  */
class Main {

  val queryResult=new QueryResult
  queryResult.userByEmail("akhil@gmail.com")
  queryResult.videoByName("Jio Offer")
  queryResult.videoByUseridYear(100,2015)
  queryResult.videoByUseridYearDesc(100,2015)

}
