import scala.io.StdIn.{readLine, readInt};
import scala.collection.mutable.ArrayBuffer;
object SubString {
  def main(args: Array[String]) = {
    println("Enter template string: ");
    val string1 = readLine();
    println("Start of range?")
    val startOfRange = readInt() - 1
    if (startOfRange < 0 || startOfRange >= string1.length)
      println("Start range is out of string range.")
    println("End of range?")
    val endOfRange = readInt()
    if (endOfRange < 0 || endOfRange > string1.length)
      println("End range is out of string range.")
    println(s"Original String: \"$string1\"");
    println(s"Subtring: \"${string1.substring(startOfRange, endOfRange)}\"");
  }
}
