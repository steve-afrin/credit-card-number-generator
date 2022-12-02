package home.safrin.credit.card;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AmericanExpressCardNumberGeneratorTest {

  private static final long INITIAL_SEED = 123_456_789L;

  private CreditCardNumberGenerator amexCardNumberGenerator;

  @BeforeEach
  void setUp() {
    this.amexCardNumberGenerator = new AmericanExpressCardNumberGenerator(INITIAL_SEED);
  }

  @Test
  @DisplayName("Validate generateCardNumber() for AmericanExpressCardNumberGenerator")
  void generateCardNumber() {
    assertEquals("3405 375074 88301", this.amexCardNumberGenerator.generateCardNumber());
    assertEquals("3749 000379 10706", this.amexCardNumberGenerator.generateCardNumber());
    assertEquals("3459 615064 83400", this.amexCardNumberGenerator.generateCardNumber());
    assertEquals("3468 347299 97507", this.amexCardNumberGenerator.generateCardNumber());
    assertEquals("3741 305710 39506", this.amexCardNumberGenerator.generateCardNumber());
  }
}