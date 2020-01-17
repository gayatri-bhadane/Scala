/**
 * Date: 17/01/2020
 * This file is created to test some functions.
 *
 * Function Name: FindElementSuite
 * Purpose: This function tests success & failure case of nth function.
 */
import FindElement.nth
import org.scalatest.funsuite.AnyFunSuite

class FindElementSuite extends AnyFunSuite{
  //This will test success case
  test("Find kth element from the list."){
    assert(nth[Char](1, List('a', 'b', 'c', 'd') ) === 'b')
  }

  //This will test failure case
  test("If element is not found in the list."){
    assertThrows[NoSuchElementException]{
      nth[Int](6, List(1, 5, 8, 9))
    }
  }
}
