/**
 * Date: 17/01/2020
 * This file is created to practice some functions.
 *
 * Function Name: FindElement
 * Purpose: This function accepts list and k number and returns kth element of list.
 * Eg. Inputs: num = 2 & nums = List(2,6,8,4)
 *     Output: 8
 */

object FindElement  extends App {

  def nth[A] (num: Int, nums: List[A] ) : A = {
    num match {
      //This case will return head if num=0
      case 0 => nums.head
      //This case executes recursion till the element found
      case num if(num > 0 && nums.length > 1) => nth(num-1, nums.tail)
      //This case will throw exception if none of the above case executed successfully.
      case _ => throw  new NoSuchElementException
    }
  }

  val results = nth[Char](1, List('a', 'b', 'c', 'd') )

  //Print results.
  println(results)
}
