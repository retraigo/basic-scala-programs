import scala.io.StdIn.{readInt};
import scala.collection.mutable.ArrayBuffer;
object MissingNumberInArray {
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
    println(s"Original Array: $listOfNumbers");
    var missingNumbers = new ArrayBuffer[Int]();
    for(i <- listOfNumbers.min to listOfNumbers.max) {
      if(listOfNumbers.indexOf(i) == -1) missingNumbers.append(i);
    }
    println(s"Missing Numbers: $missingNumbers");
  }
}

