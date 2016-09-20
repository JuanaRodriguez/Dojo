package org.fundacionjala.dojo;

/**
 * @autor JuanaRodriguez on 8/29/2016.
 */
public class Validator {

    public boolean validate(final String numberString) {
        int lastNumber = Character.getNumericValue(numberString.charAt(numberString.length()-1));
        int sum = 0;
        for (int i = 0; i < numberString.length()-1; i++) {
            int numberInteger = Character.getNumericValue(numberString.charAt(i));
            sum += ((i+1) % 2 == 0) ? 3 * numberInteger : numberInteger;
        }
        sum = sum % 10 == 0 ? 0 : 10 - (sum % 10);
        return sum==lastNumber;
    }


}