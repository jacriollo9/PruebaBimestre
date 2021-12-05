def raizCuadrada(n: Int): Double = {
  var x = 1.0
  (1 to 7).foreach(i => x -= (( x * x) - n) / (2 * x))
  x
}
println(raizCuadrada(10))