package de.sciss.synth

import org.scalatest.FunSpec

/*
  To run only this test:

  test-only de.sciss.synth.Si7436
 */
class Si7436 extends FunSpec {
  describe("An OSC message") {
    val msg = message.Sync(1234)
    it("should not fucking crash the compiler") {
      val id = msg.id
      assert(id === 1234)
    }
  }
}