package home.safrin.credit.card;

public class AmericanExpressCardNumberGenerator extends CreditCardNumberGenerator {

  public AmericanExpressCardNumberGenerator() {
    super();
  }

  public AmericanExpressCardNumberGenerator(final long seed) {
    super(seed);
  }

  @Override
  public String generateCardNumber() {
    final short[] digits = new short[15];
    digits[0] = 3;
    digits[1] = this.generateSecondAmericanExpressCardDigit();

    super.createRemainingDigits(digits, 2);
    digits[14] = super.calculateCheckDigit(digits);

    return super.formatCardNumber(digits, CreditCardType.AMEX.getFormat());
  }

  private short generateSecondAmericanExpressCardDigit() {
    return (short) (super.getRandomGenerator().nextBoolean() ? 4 : 7);
  }
}
