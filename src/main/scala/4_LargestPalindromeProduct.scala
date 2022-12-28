def largestPalindrome(digits : Int) : Int =
  val lowerBound = Math.pow(10, digits-1).toInt
  val upperBound = (Math.pow(10, digits) - 1).toInt
  
  val list =
    for
    i <- lowerBound to upperBound
    j <- lowerBound to upperBound
  yield i*j
  list.filter(n => isPalindrome(n)).max



def isPalindrome (n : Int) : Boolean = n.toString.reverse == n.toString
