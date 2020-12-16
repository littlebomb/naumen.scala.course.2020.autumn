object Exercises {


  def reverse[T](seq: Seq[T]): Seq[T] = seq.reverse
  //это какая-то ловушка?
  /**
   * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
   *
   * @param idx
   * @return
   */
  def fibonacci4Index(idx: Int): Int = idx match{
    case 0 => 0
    case 1 => 1
    case _ => fibonacci4Index(idx - 2) + fibonacci4Index(idx - 1)
  }

  def fibonacci(idx: Int): Seq[Int] = idx match{
    case 0 => Seq(0)
    case 1 => Seq(0, 1)
    case _ => fibonacci(idx - 1) :+ fibonacci(idx - 1).last + fibonacci(idx - 2).last
  }

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
                       "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
                       "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
                       "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
                       "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String = text
    .toUpperCase()
    .map(char => if (MORSE.contains(char.toString)) MORSE(char.toString) else char.toString)
    .mkString(" ")

  def wordReverse(text: String): String = text
    .split("(?=[ ,.!?])|(?<=[ ,.!?])")
    .map(word => if (word.charAt(0).isUpper) word.reverse.toLowerCase().capitalize else word.reverse)
    .mkString("")
}
