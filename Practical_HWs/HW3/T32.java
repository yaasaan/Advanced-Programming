
import java.util.*;

public class T32 {

    static Scanner input = new Scanner(System.in);
    static String finalMookh;
    //i = int
    //j = char

    public static void main(String[] args) {

        System.out.println("adade 5 raghami vaared koni : ");
        String mookhString = input.nextLine();
        
        char[] mookhArray = mookhString.toCharArray();
        int[] x = new int[5];
        
        for (int i = 0, j = 0; i < 5; i++, j++) {//Char be Int

            if (Character.isWhitespace(mookhArray[j]) == true) {
                ++j;
            }
            if (mookhArray[j] == '-') {
                ++j;
                x[i] = Integer.parseInt(String.valueOf(mookhArray[j]));
                x[i] *= -1;
                continue;
            }
            x[i] = Integer.parseInt(String.valueOf(mookhArray[j]));
        }

        System.out.println(complexCale(x[0], x[1], x[2], x[3], x[4]));
    }

    public static String complexCale(double real1, double img1, double real2, double img2, int operator) {

        double finalReal, finalIMG;

        switch (operator) {//amalgarha

            case 0: {//jam = 0
                finalReal = real1 + real2;
                finalIMG = img1 + img2;

                if (finalIMG >= 0) {
                    finalMookh = finalReal + " + " + finalIMG + "i";
                } else {
                    finalMookh = finalReal + "   " + finalIMG + "i";
                }
                return finalMookh;
            }

            case 1: {//tafrigh = 1 
                finalReal = real1 - real2;
                finalIMG = img1 - img2;

                if (finalIMG >= 0) {
                    finalMookh = finalReal + " + " + finalIMG + "i";
                } else {
                    finalMookh = finalReal + "   " + finalIMG + "i";
                }
                return finalMookh;
            }

            case 2: {//zarb = 2
                finalReal = (real1 * real2) - (img1 * img2);
                finalIMG = (real1 * img2) + (img1 * real2);

                if (finalIMG >= 0) {
                    finalMookh = finalReal + " + " + finalIMG + "i";
                } else {
                    finalMookh = finalReal + "   " + finalIMG + "i";
                }
                return finalMookh;
            }

            case 3: {//taghsim = 3
                finalReal = (real1 * real2 + img1 * img2) / ((real2 * real2) + (img2 * img2));
                finalIMG = ((real2 * img1) - (img2 * real1)) / ((real2 * real2) + (img2 * img2));

                if (finalIMG >= 0) {
                    finalMookh = finalReal + " + " + finalIMG + "i";
                } else {
                    finalMookh = finalReal + "   " + finalIMG + "i";
                }
                return finalMookh;
            }

        }
        return "Wrong";
    }

}
