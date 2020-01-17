/**
 * Date: 16/01/2020
 * This file is created to practice some functions.
 *
 * Function Name: lastElem
 * Purpose: This function accepts list and returns last element of list.
 */
object practiceFile extends App {
  //Created val list to store integer list
  val list = List(1, 2, 3, 4, 5, 6)

  def lastElem(nums: List[Int]): Int = {
    //returns last element of list
    return nums.last
  }

  //printing results of lastElem function
  println("Last element of list is: " + lastElem(list))
}

