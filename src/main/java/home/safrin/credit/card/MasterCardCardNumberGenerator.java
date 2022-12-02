package home.safrin.credit.card;

public class MasterCardCardNumberGenerator extends CreditCardNumberGenerator {

  public MasterCardCardNumberGenerator() {
    super();
  }

  public MasterCardCardNumberGenerator(final long seed) {
    super(seed);
  }

  @Override
  public String generateCardNumber() {
    final short[] digits = new short[16];
    digits[0] = 5;
    digits[1] = this.generateSecondMasterCardCardDigit();

    super.createRemainingDigits(digits, 2);
    digits[15] = super.calculateCheckDigit(digits);

    return super.formatCardNumber(digits, CreditCardType.MASTERCARD.getFormat());
  }

  private short generateSecondMasterCardCardDigit() {
    return (short) (super.getRandomGenerator().nextInt(5) + 1);
  }
}
