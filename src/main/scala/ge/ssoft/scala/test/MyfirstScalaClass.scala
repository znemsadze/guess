package ge.ssoft.scala.test

/**
  * Created by zviad on 10/18/16.
  */
class MyfirstScalaPoint(xc:Integer,yc:Integer) {

  var x: Integer=xc;

  var y: Integer=yc;

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
    println ("Point x location : " + x);
    println ("Point y location : " + y);
  }

}
