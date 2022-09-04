// 3. Write a Scala program to rotate one element left of an given array (length 1 or more) of integers

import scala.io.StdIn.{readInt};
import scala.collection.mutable.ArrayBuffer;

object RotateArrayLeft {
  def main(args: Array[String]) = {
    var listOfItems = new ArrayBuffer[Int]();
    println("Enter elements to add to array. Enter 0 to stop.");
    var current = 1;
    while (current != 0) {
      try {
        current = readInt();
        if(current != 0) listOfItems.append(current);
      } catch {
        case _: Throwable => {
          println("An error occured.");
        }
      }
    }
    println(s"Original Array: $listOfItems");
    listOfItems = listOfItems.tail :+ listOfItems.head;
    println(s"Rotate left: $listOfItems");
  }
}
