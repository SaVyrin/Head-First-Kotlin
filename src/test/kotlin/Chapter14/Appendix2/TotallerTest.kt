package Chapter14.Appendix2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class TotallerTest {

    @Test
    fun shouldBeAbleToAdd3And4() {
        val totaller = Totaller()

        assertEquals(3, totaller.add(3))
        assertEquals(7, totaller.add(4))
        assertEquals(7, totaller.total)
    }
}