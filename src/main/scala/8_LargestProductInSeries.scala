def largestProductInNumber (number : String, digits : Int) : Int =
  def loop(start : Int, maxAcc : Int) : Int =
    if start == (number.length - digits) then maxAcc
    else loop (start + 1, getMultiplication(number.slice(start, start+digits)).max(maxAcc))
  loop(0, 0)

def getMultiplication(seq : String) : Int = seq.toList.map(c => c.toInt - 48).product
