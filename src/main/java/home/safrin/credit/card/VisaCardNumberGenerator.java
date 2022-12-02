package home.safrin.credit.card;

public class VisaCardNumberGenerator extends CreditCardNumberGenerator {

  public VisaCardNumberGenerator() {
    super();
  }

  public VisaCardNumberGenerator(final long seed) {
    super(seed);
  }

  @Override
  public String generateCardNumber() {
    final short[] digits = new short[16];
    digits[0] = 4;

    super.createRemainingDigits(digits, 1);
    final short checkDigit = super.calculateCheckDigit(digits);

    digits[15] = checkDigit;

    return super.formatCardNumber(digits, CreditCardType.DISCOVER.getFormat());
  }
}
