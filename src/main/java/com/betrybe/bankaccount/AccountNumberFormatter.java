package com.betrybe.bankaccount;

import org.apache.commons.lang3.StringUtils;

/**
 * AccountNumberFormatter.
 */
public class AccountNumberFormatter {

  /**
   * Formata o número da conta.
   * utiliza o pacote StringUtils da dependência Apache Commons Lang,
   * é uma classe de utilitários que fornece vários métodos para trabalhar com strings em Java.
   *
   * @param literalAccountNumber número da conta
   *
   */
  public String formatAccountNumber(int literalAccountNumber) {
    String accountNumber = String.valueOf(literalAccountNumber);
    if (accountNumber.length() > 6) {
      // retorna os últimos 6 caracteres da string
      return StringUtils.right(accountNumber, 6);
    } else if (accountNumber.length() < 6) {
      // adiciona caracteres de preenchimento à esquerda até que a string atinja o tamanho
      return StringUtils.leftPad(accountNumber, 6, '0');
    }
    return accountNumber;
  }

}