package home.safrin.credit.card;

public class DiscoverCardNumberGenerator extends CreditCardNumberGenerator {

  public DiscoverCardNumberGenerator() {
    super();
  }

  public DiscoverCardNumberGenerator(final long seed) {
    super(seed);
  }

  @Override
  public String generateCardNumber() {
    final short[] digits = new short[16];
    digits[0] = 6;

    super.createRemainingDigits(digits, 1);
    digits[15] = super.calculateCheckDigit(digits);

    return super.formatCardNumber(digits, CreditCardType.DISCOVER.getFormat());
  }
}
