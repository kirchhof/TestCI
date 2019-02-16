import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {
  @Nested class Add {
    @ParameterizedTest
    @CsvSource({ "1, 2, 3",
        "5, 7, 12"})
    void shouldCalculateSumOfPositiveValues(final int summandA, final int summandB,
        final int expectedSum) {
      //given
      Calculator systemUnderTest = new Calculator();

      //when
      int result = systemUnderTest.add(summandA, summandB);

      //then
      assertThat(result).isEqualTo(expectedSum);
    }

    @ParameterizedTest
    @CsvSource({ "0, 52, 52",
        "34, 0, 34",
        "0, 0, 0"})
    void shouldReturnSummandForZeroAsParameter(final int summandA, final int summandB,
        final int expectedSum) {
      //given
      Calculator systemUnderTest = new Calculator();

      //when
      int result = systemUnderTest.add(summandA, summandB);

      //then
      assertThat(result).isEqualTo(expectedSum);
    }

    @ParameterizedTest
    @CsvSource({ "-1, -5, -6",
        "4, -14, -10",
        "-51, 11, -40",
        "9, -4, 5"})
    void shouldCalculateSumWithNegativeNumbers(final int summandA, final int summandB,
        final int expectedSum) {
      //given
      Calculator systemUnderTest = new Calculator();

      //when
      int result = systemUnderTest.add(summandA, summandB);

      //then
      assertThat(result).isEqualTo(expectedSum);
    }
  }
}
