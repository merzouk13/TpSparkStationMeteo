
import org.scalatest._

class test extends FunSuite  with Matchers {

  val lst = List.empty[String]
  val arr = Array("foo", "bar")

  val x : Int = Carre.Carre(2)

  test("test list methods") {
    assert(lst.size == 0)
  }

  test("test array methods") {
    assert(arr(0) == "foo")
    assertThrows[ArrayIndexOutOfBoundsException] {
      arr(13)
    }
  }

  test("test carre function"){
    x should be (4)
  }
}


