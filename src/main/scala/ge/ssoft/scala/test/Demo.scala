package ge.ssoft.scala.test

import Array._

/**
  * Created by zviad on 10/18/16.
  */
class Point(val xc: Int, val yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
    println("Point x location : " + x);
    println("Point y location : " + y);
  }
}

class Location(override val xc: Int, override val yc: Int,
               val zc: Int) extends Point(xc, yc) {
  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int) {
    x = x + dx
    y = y + dy
    z = z + dz
    println("Point x location : " + x);
    println("Point y location : " + y);
    println("Point z location : " + z);
  }
}
package pac {

  class Super {
    protected def f() = {
      println("===f")
    }

  }

  class Sub extends Super {


    def yleMethod() {
      f()
    }
  }


}


trait Equal {
  def isEqual(x: Any): Boolean
  def isNotEqual(x: Any): Boolean = !isEqual(x)
}


object Demo {

  def printMe(): Unit = {
    print("hello scala\n");
  }

  var muliplier10 = (i: Int) => i * 10

  def main(args: Array[String]) {
    val loc = new Location(10, 20, 15);
    val p = new pac.Sub()
    printMe()
    val k = "kargis";
    val m = "muteli";
    val t = 3.336;
    p.yleMethod()
    println("multiplier=" + muliplier10(3));
    println(f"mogityan $k%s $m%s yovel $t%2.2f ertkhel")

    var z = Array("Zara", "Nuha", "Ayan")
    var zz: Array[String] = new Array[String](3)
    zz(0) = "Zara";
    zz(1) = "Nuha";
    zz(4 / 2) = "Ayan"
    var myMatrix = ofDim[Int](3, 3)


    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        myMatrix(i)(j) = i + j;
      }
    }
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        print(myMatrix(i)(j)+" ")
      }
      println();
    }

    // Move to a new location
    loc.move(10, 103, 5);
  }
}


