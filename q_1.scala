// 1. Write a Scala program to sum values of a given array.
import scala.io.StdIn.{readDouble};
import scala.collection.mutable.ArrayBuffer;
object SumArray {
  def main(args: Array[String]) = {
    var listOfNumbers = new ArrayBuffer[Double]();
    println("Enter numbers to add. Enter 0 to stop.");
    var current = 1.0;
    while (current != 0.0) {
      try {
        current = readDouble();
        listOfNumbers.append(current);
      } catch {
        case e: NumberFormatException => {
          println("Enter only numbers.");
        }
        case _: Throwable => {
          println("An error occured.");
        }
      }
    }
    println(
      s"The sum of all numbers provided to the array is ${listOfNumbers.sum}"
    );
  }
}

