package com.app;

import java.math.BigDecimal;
import java.util.Scanner;

import pl.allegro.finance.tradukisto.MoneyConverters;

public class MoneyConverterUtil {

	public static final String INVALID_INPUT_GIVEN = "Invalid input given";

	public static final String[] ones = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
			"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen" };

	public static final String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
			"Ninety" };

	public static String getMoneyIntoWords(String input) {
		MoneyConverters converter = MoneyConverters.ENGLISH_BANKING_MONEY_VALUE;
		return converter.asWords(new BigDecimal(input));
	}

	public static String getMoneyIntoWords(final double money) {
		long dollar = (long) money;
		long cents = Math.round((money - dollar) * 100);
		if (money == 0D) {
			return "";
		}
		if (money < 0) {
			return INVALID_INPUT_GIVEN;
		}
		String dollarPart = "";
		if (dollar > 0) {
			dollarPart = convert(dollar) + " dollar" + (dollar == 1 ? "" : "s");
		}
		String centsPart = "";
		if (cents > 0) {
			if (dollarPart.length() > 0) {
				centsPart = " and ";
			}
			centsPart += convert(cents) + " cent" + (cents == 1 ? "" : "s");
		}
		return dollarPart + centsPart;
	}

	private static String convert(final long n) {
		if (n < 0) {
			return INVALID_INPUT_GIVEN;
		}
		if (n < 20) {
			return ones[(int) n];
		}
		if (n < 100) {
			return tens[(int) n / 10] + ((n % 10 != 0) ? " " : "") + ones[(int) n % 10];
		}
		if (n < 1000) {
			return ones[(int) n / 100] + " Hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
		}
		if (n < 1_000_000) {
			return convert(n / 1000) + " Thousand" + ((n % 1000 != 0) ? " " : "") + convert(n % 1000);
		}
		if (n < 1_000_000_000) {
			return convert(n / 1_000_000) + " Million" + ((n % 1_000_000 != 0) ? " " : "") + convert(n % 1_000_000);
		}
		return convert(n / 1_000_000_000) + " Billion" + ((n % 1_000_000_000 != 0) ? " " : "")
				+ convert(n % 1_000_000_000);
	}

	public static String getMoneyConvert(Double amount) {

		String str = getMoneyIntoWords(amount);
		String[] strArr = str.split(" ");
		String result = "";
		for (String strword : strArr) {
			if (strword.equalsIgnoreCase("dollars")) {
				result = result + " " + "Ruppes";
			} else if (strword.equalsIgnoreCase("cents")) {
				result = result + " " + "Paisa Only";
			} else {
				result = result + " " + strword;
			}
		}
		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Pls Enter Amount : ");

		Double amt = sc.nextDouble();

		String str = getMoneyIntoWords(amt);
		String[] strArr = str.split(" ");
		String result = "";
		for (String strword : strArr) {
			if (strword.equalsIgnoreCase("dollars")) {
				result = result + " " + "Ruppes";
			} else if (strword.equalsIgnoreCase("cents")) {
				result = result + " " + "Paisa Only";
			} else {
				result = result + " " + strword;
			}
		}

		System.out.println(result);
	}
}
