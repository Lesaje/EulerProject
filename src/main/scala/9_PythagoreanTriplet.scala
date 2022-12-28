def pythagoreanTriplet() : Int =
  val p = 1000
  for
    i <- 1 to p
    j <- 1 to p
  do
    val c = p - (i + j)
    if i*i + j*j == c*c then return i * j * c
  0