package home.safrin.credit.card;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscoverCardNumberGeneratorTest {

  private static final long INITIAL_SEED = 123_456_789L;

  private CreditCardNumberGenerator discoverCardNumberGenerator;

  @BeforeEach
  void setUp() {
    this.discoverCardNumberGenerator = new DiscoverCardNumberGenerator(INITIAL_SEED);
  }

  @Test
  @DisplayName("Validate generateCardNumber() for DiscoverCardNumberGenerator")
  void generateCardNumber() {
    assertEquals("6905 3750 7488 3009", this.discoverCardNumberGenerator.generateCardNumber());
    assertEquals("6490 0037 9107 8502", this.discoverCardNumberGenerator.generateCardNumber());
    assertEquals("6961 5064 8349 6808", this.discoverCardNumberGenerator.generateCardNumber());
    assertEquals("6347 2999 7514 1307", this.discoverCardNumberGenerator.generateCardNumber());
    assertEquals("6057 1039 5287 1102", this.discoverCardNumberGenerator.generateCardNumber());
  }
}