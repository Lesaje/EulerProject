import scala.annotation.tailrec

def sumOfPrimes (until : Int) : Long =
  @tailrec
  def loop(primes : List[Long], iter: Int) : List[Long] =
    if iter == until then primes
    else if isPrime(iter) then loop(iter :: primes, iter + 1)
    else loop(primes, iter+1)
  loop(List(), 0).sum