// 8. Write a Scala program to compare two strings lexicographically.

import scala.io.StdIn.{readLine};
import scala.collection.mutable.ArrayBuffer;
object CompareStrings {
  def main(args: Array[String]) = {
    println("Enter first string: ");
    val string1 = readLine();
    println("Enter second string: ");
    val string2 = readLine();
    if (string1 == string2) {
      println(s"\"$string1\" is equal to \"$string2\"");
    } else {
      if (string1.compareTo(string2) > 0) {
        println(s"\"$string1\" is less than \"$string2\"");
      } else {
        println(s"\"$string1\" is greater than \"$string2\"");
      }
    }
  }
}
