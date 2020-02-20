package day35;

import java.util.*;

public class WrapperTypePrimitiveTypeConversion {

    public static void main(String[] args) {

        Integer num1 = 100; // auto-boxing 100 -->> new Integer(100) -->> object, actionlary bar
        // num1. yazsan hemme variantlary gorkezyar

        int num2 = Integer.valueOf("200"); // auto-unboxing into 200

        // THIS CAN NOT HAPPEN BY ITSELF
        // int num3 = "200";
        int num3 = Integer.parseInt("200");

        /*
         *   Integer.parseInt("numberHere")
         *   it return an int value converted from String
         *
         *   Integer.valueOf("numberHere")
         *   it return an Integer Object by wrapping up the number
         *
         *   YOU MAY USE WHICHEVER YOU WANT BECAUSE:
         *   Auto-boxing and Auto-unboxing will take care of the conversion anyway
         *
         */

        // Use this number IPR2012-00001 and store the year into an int variable
        // This case number always start with 3 character either IPR, PGR, CBM, DER
        // followed by year, followed by dash and 5 digit number
        String caseNumber = "IPR2012-00001";
        int year;  // -->> get 2012 out of String

        year = Integer.valueOf("IPR2012-00001".substring(3, 7));
        System.out.println("year = " + year);

        // second way
        int year2 = Integer.parseInt(caseNumber.substring(caseNumber.indexOf("-") - 4,
                caseNumber.indexOf("-")));
        System.out.println("year2 = " + year2);

        System.out.println(getYearOutOfCaseNumber("DER2019-00034"));
        System.out.println(getYearOutOfCaseNumber("IPR2009-01042"));
        System.out.println(getYearOutOfCaseNumber("CBM2001-10133"));

    }

    public static int getYearOutOfCaseNumber(String caseNumber) {

        //do validation on case number
        //TODO: Case number should always start with either
        // CBM, IPR, PGR, DER
        // FOLLOWED BY 4 DIGIT
        // FOLLOWED BY -
        // FOLLOWED BY 5 DIGIT

        return Integer.parseInt(caseNumber.substring(3, 7));

    }

}
