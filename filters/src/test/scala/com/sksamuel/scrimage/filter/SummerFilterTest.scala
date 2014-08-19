package com.sksamuel.scrimage.filter

import org.scalatest.{ OneInstancePerTest, BeforeAndAfter, FunSuite }
import com.sksamuel.scrimage.{ Format, Image }

/** @author Stephen Samuel */
class SummerFilterTest extends FunSuite with BeforeAndAfter with OneInstancePerTest {

  val original = Image(getClass.getResourceAsStream("/bird_small.png"))

  test("summer filter output matches expected") {
    val expected = Image(getClass.getResourceAsStream("/com/sksamuel/scrimage/filters/bird_small_summer.png"))
    assert(original.filter(SummerFilter()) === expected)
  }
}
