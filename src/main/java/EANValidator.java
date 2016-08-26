/**
 * Created by JuanaRodriguez on 8/26/2016.
 */
public class EANValidator {

    public int newCodeInteger;
    public int constantOne;
    public int constantTwo;

    public EANValidator() {
        constantOne = 1;
        constantTwo = 3;
    }

    public int changeOfStringToInteger(String codeString) {
        int codeInteger = Integer.parseInt(codeString);
        return codeInteger;
    }

    public int verifyLengthOfTheCode(int codeInteger) {
        int lengthOfTheCode = 0;
        while (codeInteger > 0) {
            codeInteger = codeInteger / 10;
            lengthOfTheCode++;
        }
        return lengthOfTheCode;
    }

    public int calculateTheDigitChecksum(int codeInteger) {
        int digitChecksum = codeInteger % 10;
        return digitChecksum;
    }

    public int calculateTheNewCodeInteger(int codeInteger) {
        newCodeInteger = codeInteger / 10;
        return newCodeInteger;
    }

    public int sum(int newCodeInteger) {
        int modCodeInteger;
        int sum = 0;
        int indexCode = 12;
        while (newCodeInteger > 0) {
            modCodeInteger = newCodeInteger % 10;
            newCodeInteger = newCodeInteger / 10;
            if (indexCode % 2 == 0) {
                sum = sum + modCodeInteger * constantTwo;
            } else {
                sum = sum + modCodeInteger * constantOne;
            }
            indexCode--;
        }
        return sum;
    }

    public int calculateTheCheckSum(int digitChecksum, int sum) {
        int digitChecksumFinal = digitChecksum;
        if (digitChecksumFinal == 0) {
            return digitChecksumFinal;
        } else {
            digitChecksumFinal = 10 - (sum % 10);
            return digitChecksumFinal;
        }
    }

    public boolean validate(int digitChecksumFinal) {
        if (digitChecksumFinal == digitChecksumFinal) {
            return true;
        }
        return false;
    }
}

