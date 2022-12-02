package home.safrin;

import home.safrin.credit.card.AmericanExpressCardNumberGenerator;
import home.safrin.credit.card.CreditCardNumberGenerator;
import home.safrin.credit.card.DiscoverCardNumberGenerator;
import home.safrin.credit.card.MasterCardCardNumberGenerator;
import home.safrin.credit.card.VisaCardNumberGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>This class is just a convenient way to generate some random pseudo-valid credit card numbers. The
 * generated credit card numbers are <em>pseudo-valid</em> because they are legitimate credit card numbers
 * in that they conform to the proper rules and format for the defined card types, but they are not
 * legitimate in that they are not likely active credit card numbers backed by active accounts at real
 * financial institutions.</p>
 * <p>Even if this module were to generate a valid credit card number that is actually valid, that would
 * be statistically amazing, however we would not be able to discover the associated account information for
 * that card like CVV, CVV2, expiration date, cardholder name, or zip code for that credit card account.</p>
 */
public class Main {

  private static final Logger LOG = LoggerFactory.getLogger(Main.class);

  public static void main(final String[] args) {
    final CreditCardNumberGenerator amexCardNumberGenerator = new AmericanExpressCardNumberGenerator();
    final CreditCardNumberGenerator discoverCardNumberGenerator = new DiscoverCardNumberGenerator();
    final CreditCardNumberGenerator masterCardCardNumberGenerator = new MasterCardCardNumberGenerator();
    final CreditCardNumberGenerator visaCardNumberGenerator = new VisaCardNumberGenerator();
    LOG.info("The generated American Express card number is {}", amexCardNumberGenerator.generateCardNumber());
    LOG.info("The generated Discover card number is {}", discoverCardNumberGenerator.generateCardNumber());
    LOG.info("The generated MasterCard card number is {}", masterCardCardNumberGenerator.generateCardNumber());
    LOG.info("The generated Visa card number is {}", visaCardNumberGenerator.generateCardNumber());
  }
}