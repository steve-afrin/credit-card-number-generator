package home.safrin.credit.card;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VisaCardNumberGeneratorTest {

  private static final long INITIAL_SEED = 123_456_789L;

  private CreditCardNumberGenerator visaCardNumberGenerator;

  @BeforeEach
  void setUp() {
    this.visaCardNumberGenerator = new VisaCardNumberGenerator(INITIAL_SEED);
  }

  @Test
  @DisplayName("Validate generateCardNumber() for VisaCardNumberGenerator")
  void generateCardNumber() {
    assertEquals("4905 3750 7488 3004", this.visaCardNumberGenerator.generateCardNumber());
    assertEquals("4490 0037 9107 8507", this.visaCardNumberGenerator.generateCardNumber());
    assertEquals("4961 5064 8349 6803", this.visaCardNumberGenerator.generateCardNumber());
    assertEquals("4347 2999 7514 1302", this.visaCardNumberGenerator.generateCardNumber());
    assertEquals("4057 1039 5287 1107", this.visaCardNumberGenerator.generateCardNumber());
  }
}