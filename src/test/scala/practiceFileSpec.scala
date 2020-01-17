/**
 * Date: 16/01/2020
 * This file is created to test some functions.
 *
 */
import org.scalatest._

class practiceFileSpec extends  FunSuite{
  test("Check the last number of a list"){
    //This will test whether function returning the correct element.
    assert(practiceFile.lastElem(List(1,2,3,4,5,6)) === 6)
  }
}