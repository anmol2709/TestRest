
import org.apache.http.client.methods.{HttpGet, HttpPost}
import org.apache.http.entity.{ContentType, StringEntity}
import org.apache.http.impl.client.HttpClients
import org.apache.http.util.EntityUtils

object TestRest extends App {
//GET CALL
  /*
  private val httpClient = HttpClients.createDefault

  val request = new HttpGet("")
  val response = httpClient.execute(request)

  val entity = response.getEntity
  if (entity != null) { // return it as a String
    val result = EntityUtils.toString(entity)
    println(result)


  }
*/

  // POST WITHOUT DATA
  private val httpClient = HttpClients.createDefault

  val request = new HttpPost("")

  val response = httpClient.execute(request)

  val entity = response.getEntity
  if (entity != null) { // return it as a String
    val result = EntityUtils.toString(entity)
    println(result)

  }


  //POST WITH DATA
 /* private val httpClient = HttpClients.createDefault

  val request = new HttpPost("")

  val json = s"""{"systemId": ""}"""

  //  val request = new HttpPost("")

  val a = new StringEntity(json, ContentType.APPLICATION_JSON)
  request.setEntity(a)

  val response = httpClient.execute(request)

  val entity = response.getEntity
  if (entity != null) { // return it as a String
    val result = EntityUtils.toString(entity)
    println(result)

  }*/
}
