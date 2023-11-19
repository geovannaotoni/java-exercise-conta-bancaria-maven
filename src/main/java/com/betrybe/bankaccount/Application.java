package com.betrybe.bankaccount;

import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

/**
 * A class.
 */
public class Application {

  /**
   * A simple get method.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe o número da conta: ");
    String unformattedAccountNumber = scanner.nextLine();

    // https://commons.apache.org/proper/commons-lang/apidocs/org/apache/commons/lang3/StringUtils.html
    if (!StringUtils.isNumeric(unformattedAccountNumber)) {
      System.out.println("Número da conta inválido!");
      return;
    }

    AccountNumberFormatter formatter = new AccountNumberFormatter();
    String accountNumber = formatter.formatAccountNumber(
        Integer.parseInt(unformattedAccountNumber)
    );

    System.out.println("Número da conta: " + accountNumber);
    scanner.close();
  }

}
