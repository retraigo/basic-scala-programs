// 4. Write a Scala program to find the maximum and minimum value of an array of integers.
import scala.io.StdIn.{readInt};
import scala.collection.mutable.ArrayBuffer;
object MinMaxArray {
  def main(args: Array[String]) = {
    var listOfNumbers = new ArrayBuffer[Int]();
    println("Enter numbers to add. Enter 0 to stop.");
    var current = 1;
    while (current != 0) {
      try {
        current = readInt();
        if(current != 0) listOfNumbers.append(current);
      } catch {
        case e: NumberFormatException => {
          println("Enter only whole numbers.");
        }
        case _: Throwable => {
          println("An error occured.");
        }
      }
    }
    println(
      s"The max of all numbers provided to the array is ${listOfNumbers.max}"
    );
    println(
      s"The min of all numbers provided to the array is ${listOfNumbers.min}"
    );
  }
}

