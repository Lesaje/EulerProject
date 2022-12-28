def sumSquareDifference(target: Int) : Int =
  val sumOfSquares = mapReduce(x => x*x, (x, y) => x+y, 0)(1, target)
  val sumOfFirstNumbers = (target * (target + 1)) / 2
  val squareOfSums = sumOfFirstNumbers * sumOfFirstNumbers
  
  squareOfSums - sumOfSquares