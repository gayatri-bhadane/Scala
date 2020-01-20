/**
 * Date: 17/01/2020
 * This file is created to test some functions.
 *
 * Function Name: FindElementSuite
 * Purpose: This function tests success & failure case of nth, last and calculate_length function.
 */
import FindElement.nth
import FindElement.last
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

  /**
   * This will test happy and failure case for last function.
   */
  test("Find the last element from the list."){
    assert(last[Char](List('a', 'b', 'c', 'd') ) == 'd')
  }

  test("If we are trying to find out last element in empty list."){
    assertThrows[NoSuchElementException]{
      last(List())
    }
  }

  /**
   * This will test happy and failure case for calculate_length function.
   */
  test("Find the length of the list."){
    assert(FindElement.calculate_length(List('a', 'b', 'c', 'd'), 0) == 4)
  }

  test("If we are trying to find out length of empty list."){
    assert(FindElement.calculate_length(List(), 0) == 0)
  }
}
