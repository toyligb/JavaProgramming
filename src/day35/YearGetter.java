package day35;

public class YearGetter {

    public static int getYearOutOfCaseNumber(String caseNumber) {
        // do validation on case number
        //TODO : Case number should always start with either
        // CBM , IPR, PGR , DER
        // FOLLOWED BY 4 DIGIT NUMBER
        // FOLLOWED BY -
        // AND FOLLOWED BY 5 DIGIT

        String[] split = caseNumber.split("-");

//        int year ; //-- get 2012 out of it
//        String strYear = caseNumber.substring(3,7);
//        year = Integer.parseInt(strYear);
//        return year ;
        if (!(split[0].startsWith("DER") || split[0].startsWith("CBM") || split[0].startsWith("IPR") || split[0].startsWith("PGR"))) {
            return 0;
        }
        if (split[0].length() != 7 || split[1].length() != 5) {
            return 0;
        }
        if (!(Character.isDigit(split[0].charAt(3)) && Character.isDigit(split[0].charAt(4)) && Character.isDigit(split[0].charAt(5)) && Character.isDigit(split[0].charAt(6)))) {
            return 0;
        }
        if (!(Character.isDigit(split[1].charAt(0)) && Character.isDigit(split[1].charAt(1)) && Character.isDigit(split[1].charAt(2)) && Character.isDigit(split[1].charAt(3)) && Character.isDigit(split[1].charAt(4)))) {
            return 0;
        }

        return Integer.parseInt(caseNumber.substring(3, 7));

    }

}
