def smallestMultiple (from : Int, to : Int) : Int =
  def loop (acc : Int, lowerBound : Int, upperBound : Int) : Int =
    if lowerBound == upperBound then acc
    else loop(acc * lowerBound/gcd(lowerBound, acc), lowerBound+1, upperBound)
  loop(1, from, to)