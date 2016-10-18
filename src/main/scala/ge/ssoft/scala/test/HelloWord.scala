package ge.ssoft.scala.test

object HelloWorld {
  def main(args: Array[String]) {
    val s :String ="yle";
    var t=1;
    t+=3;
    println(s+t);

    val obj=new MyfirstScalaPoint(4,2);

    println(obj.x+" "+obj.y);
    obj.move(2,50);
    println(obj.x+" "+obj.y);


  }
}