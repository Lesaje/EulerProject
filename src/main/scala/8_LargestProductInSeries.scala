import scala.annotation.tailrec

def largestProductInNumber (number : String, digits : Int) : Long =
  @tailrec
  def loop(start : Int, maxAcc : Long) : Long =
    if start == (number.length - digits) then maxAcc
    else loop (start + 1, getMultiplication(number.slice(start, start+digits)).max(maxAcc))
  loop(0, 0)

def getMultiplication(seq : String) : Long = seq.toList.map(c => c.toLong - 48).product
