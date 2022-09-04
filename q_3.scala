import scala.io.StdIn.{readLine};
import scala.collection.mutable.ArrayBuffer;

object RotateArrayLeft {
  def main(args: Array[String]) = {
    var listOfItems = new ArrayBuffer[String]();
    println("Enter elements to add to array. Enter 0 to stop.");
    var current = "";
    while (current != "0") {
      try {
        current = readLine();
        if(current != "0") listOfItems.append(current);
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
