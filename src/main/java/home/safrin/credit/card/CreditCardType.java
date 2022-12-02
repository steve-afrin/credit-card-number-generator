package home.safrin.credit.card;

public enum CreditCardType {
  AMEX("American Express", "xxxx xxxxxx xxxxx"),
  DISCOVER("Discover", "xxxx xxxx xxxx xxxx"),
  MASTERCARD("MasterCard", "xxxx xxxx xxxx xxxx"),
  VISA("Visa", "xxxx xxxx xxxx xxxx");

  private String name;
  private String format;

  CreditCardType(final String name, final String format) {
    this.name = name;
    this.format = format;
  }

  public String getName() {
    return this.name;
  }

  public String getFormat() {
    return this.format;
  }
}
