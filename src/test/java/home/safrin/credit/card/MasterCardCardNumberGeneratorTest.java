package home.safrin.credit.card;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MasterCardCardNumberGeneratorTest {

  private static final long INITIAL_SEED = 123_456_789L;

  private CreditCardNumberGenerator masterCardCardNumberGenerator;

  @BeforeEach
  void setUp() {
    this.masterCardCardNumberGenerator = new MasterCardCardNumberGenerator(INITIAL_SEED);
  }

  @Test
  @DisplayName("Validate generateCardNumber() for MasterCardCardNumberGenerator")

  void generateCardNumber() {
    assertEquals("5505 3750 7488 3005", this.masterCardCardNumberGenerator.generateCardNumber());
    assertEquals("5590 0037 9107 8503", this.masterCardCardNumberGenerator.generateCardNumber());
    assertEquals("5561 5064 8349 6804", this.masterCardCardNumberGenerator.generateCardNumber());
    assertEquals("5447 2999 7514 1308", this.masterCardCardNumberGenerator.generateCardNumber());
    assertEquals("5157 1039 5287 1103", this.masterCardCardNumberGenerator.generateCardNumber());
  }
}