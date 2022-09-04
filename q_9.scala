import scala.io.StdIn.{readLine, readChar};
import scala.collection.mutable.ArrayBuffer;
object ReplaceString {
  def main(args: Array[String]) = {
    println("Enter template string: ");
    val string1 = readLine();
    println("Character to replace?");
    val characterToReplace = readChar();
    println("Character to replace with?");
    val characterToReplaceWith = readChar();
    val string2 = string1.map((c: Char) =>
      if (c == characterToReplace) characterToReplaceWith else c
    )
    println(s"Original String: \"$string1\"");
    println(s"Edited String: \"$string2\"");
  }
}
