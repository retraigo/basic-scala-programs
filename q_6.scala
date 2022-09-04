// 6. Write a Scala program to print after removing duplicates from a given string. 
import scala.io.StdIn.{readLine};
object MissingNumberInArray {
  def main(args: Array[String]) = {
    println("Enter string: ");
    var string = readLine();
    println(s"Original String: $string");
    var stringWithoutDuplicates = "";
    for (x <- 0 until string.length()) {
      if (string.indexOf(string(x)) == x) stringWithoutDuplicates += string(x);
    }
    println(s"String without duplicates: $stringWithoutDuplicates")
  }
}
