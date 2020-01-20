import scala.annotation.tailrec

/**
 * Date: 17/01/2020
 * This file is created to practice some functions.
 *
 * Function Name: nth
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
      case _ => throw new NoSuchElementException
    }
  }

  /**
   * Function Name: last
   * Purpose: This function accepts list and returns last element of list.
   * @param input
   * @tparam A
   * @return last element of list
   */
  @tailrec
  def last[A](input: List[A]) : A = input match {
      case h :: Nil => h
      case _ :: tail => last(tail)
      case _ => throw new NoSuchElementException
    }

  /**
   * Function Name: calculate_length
   * Purpose: This function accepts list and accumulator and returns length of list.
   * @param input
   * @param calc_length
   * @tparam A
   * @return length of a list
   */
  @tailrec
  def calculate_length[A](input: List[A], calc_length: Int) : Int= {
      input match {
        case Nil => calc_length
        case x :: xs => calculate_length(xs, 1+ calc_length)
      }
    }

  val results = nth[Char](1, List('a', 'b', 'c', 'd') )

}
