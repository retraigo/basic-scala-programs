// 7. Write a Scala program to reverse every word in a given string.
import scala.io.StdIn.{readLine};
import scala.collection.mutable.ArrayBuffer;
object ReverseWordsInString {
  def main(args: Array[String]) = {
    println("Enter string: ");
    var string = readLine();
    println(s"Original String: $string");
    var stringWithReversed = ArrayBuffer.from(string.split(" ")).map((s: String) => s.reverse).mkString(" ")
    println(s"String with reversed words: $stringWithReversed")
  }
}
