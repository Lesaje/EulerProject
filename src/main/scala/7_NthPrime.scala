import scala.annotation.tailrec

def nthPrime(n : Int) : Int = {
  @tailrec
  def loop(i : Int, target : Int, acc : Int) : Int = {
    if      isPrime(acc) && i == target then acc
    else if isPrime(acc) && i != target then loop (i+1, target, acc+1)
    else loop(i, target, acc+1)
  }
  loop(1, n, 2)
}