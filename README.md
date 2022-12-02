# Credit Card Number Generator

This project was just a fun little side project to quick generate pseudo-valid credit card numbers.

The term _pseudo-valid_ is used to describe the generated credit card numbers because
while the generated card numbers might be valid card numbers, it is purely by random
chance. There is no way to discover the associated details with any such cards like:

* the issuing financial institution
* the account number backing the credit line
* the CVV or CVV2
* the expiration date
* the accountholder's name
* the primary zip code associated with the account for that credit card

The term _pseudo-valid_ is used to mean only that the generated credit card numbers
conform to the known, well-defined rules for each type of credit card and that the
generated number _could_ potentially be a valid credit card number.

### Valid credit card numbers in practice

The only way to ever know if a credit card is valid is to submit a transaction to a
credit card clearinghouse service provider with a valid credit card number, CVV,
expiration date, and potentially some other related data. Credit card clearinghouses
are part of a secure financial transaction network that have the ability to use the 
provided data to validate active credit cards and available balances against which
charges may be made.

### Types of cards

For simplicity this project implements only a few of the most common types of card:

* American Express
* Discover
* MasterCard
* Visa

Are there other types of credit cards? Yes! The reality is that there are many
different types of credit cards, and they all conform to much more complex rules than
what is provided in this silly demo project. Only the most basic rules of credit card
number format were applied to the example credit card types used in this demo.

## What is the CVV?

CVV is a common financial industry term to mean the Card Verification Value and it is
designed to help prevent credit card fraud.

The CVV is normally a three digit value that is computationally associated with the
issued credit card number, expiration date, account for the credit line, and the issuing
financial institution. Some cards like American Express use a four digit CVV code instead
of a three digit value.

Generation of a CVV code is much more complex than generating a credit card number and
can be very proprietary to each issuing financial institution. It generally contains
much more associated information about the account number, the cardholder, the expiration
date, and the issuing financial institution than the actual credit card number provides.

Sometimes a CVV2 code is provided with a credit card and the 2 simply means that the
CVV code is a second-generation CVV number that was designed to provide additional
protection against credit card fraud.

## The Check Digit

Normally the first several digits are defined by the type of credit card
(e.g., American Express, MasterCard, or Visa) and then the remaining numbers are somewhat
randomly generated except for the very last digit.

The purpose of the check digit is to quickly identify if a potential data entry error
occurred while entering the credit number into a system. With longer numbers, it is very
easy to accidentally omit a digit or to transpose two adjacent digits. When this happens,
it is the intention of the check digit to be able to quickly identify that there is an
error in the complete number that was entered so the error can be rectified before
submitting the transaction to the financial network via a credit card clearinghouse.

The last digit is deterministic via a specific computation. Most commonly
[the Luhn algorithm](https://datagenetics.com/blog/july42013/index.html) is used to calculate
that check digit, and the main exercise of this entire project was to implement the Luhn
algorithm in Java to generate these pseudo-valid credit card numbers.

More details may be added to this readme at a later time.
