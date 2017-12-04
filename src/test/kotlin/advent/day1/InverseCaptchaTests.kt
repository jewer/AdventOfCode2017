package advent.day1

import org.junit.jupiter.api.Test as test
import io.kotlintest.matchers.shouldEqual

class InverseCaptchaTests {
    @test fun `should pass test cases`() {
        InverseCaptcha.solve("1122".toInts()) shouldEqual 3
        InverseCaptcha.solve("1111".toInts()) shouldEqual 4
        InverseCaptcha.solve("1234".toInts()) shouldEqual 0
        InverseCaptcha.solve("91212129".toInts()) shouldEqual 9
    }
}