package home.safrin.credit.card;

import com.google.common.primitives.Longs;
import java.security.SecureRandom;

public abstract class CreditCardNumberGenerator {

  private final SecureRandom randomGenerator;

  CreditCardNumberGenerator() {
    this(System.nanoTime());
  }

  CreditCardNumberGenerator(final long seed) {
    this.randomGenerator = new SecureRandom(Longs.toByteArray(seed));
  }

  SecureRandom getRandomGenerator() {
    return this.randomGenerator;
  }

  public abstract String generateCardNumber();

  short[] createRemainingDigits(final short[] digits, final int startIndex) {
    for(int index = startIndex; index < digits.length - 2; index++) {
      digits[index] = (short) this.randomGenerator.nextInt(10);
    }

    return digits;
  }

  short calculateCheckDigit(final short[] digits) {
    int sum = 0;

    // Implementation of the Luhn algorithm
    for (int index = 0; index < digits.length - 2; index++) {
      final int multiplier = index % 2 == 0 ? 2 : 1;
      final int value = digits[index] * multiplier;

      if (value > 9) {
        sum += 1 + value % 10;
      } else {
        sum += value;
      }
    }

    return (short) ((10 - sum % 10) % 10);
  }

  String formatCardNumber(final short[] digits, final String format) {
    int digitsIndex = 0;
    final StringBuilder str = new StringBuilder(format.length());

    for (int formatIndex = 0; formatIndex < format.length(); formatIndex++) {
      final char ch = format.charAt(formatIndex);

      if (ch == 'x') {
        if (digitsIndex < digits.length) {
          str.append(digits[digitsIndex++]);
        } else {
          str.append(ch);
        }
      } else {
        str.append(ch);
      }
    }

    return str.toString();
  }
}
