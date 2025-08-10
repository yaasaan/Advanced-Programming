
import java.util.*;

public class T31 {

    static Scanner input = new Scanner(System.in);
    static String reshteVorodi;
    // i = 3
    // j = 1

    public static void main(String[] args) {

        System.out.println("Enter Number : ");
        reshteVorodi = input.next();
        Thirtheen();

    }

    public static void Thirtheen() {

        char[] arrayeVorodi = reshteVorodi.toCharArray(); //tabdil String be Array az noe Char 
        int x = 0;

        for (int i = 0; i < reshteVorodi.length(); i++) {// 1 & 3 voojood daare ??
            if (arrayeVorodi[i] == '1') {
                for (int j = 0; j < reshteVorodi.length(); j++) {
                    if (arrayeVorodi[j] == '3') {
                        x = 1;
                        break;
                    }
                }
            }
        }

        if (x == 1) {//age 1 & 3 voojood daasht 

            for (int i = 0; i < reshteVorodi.length(); i++) {//bar resi arraye baraaye peyda kardane 3

                //khone aval 3 baashe
                if (arrayeVorodi[0] == '3') {

                    if (arrayeVorodi[reshteVorodi.length() - 1] == '1') {//khone aakhar 1 baashe 
                        for (int j = 0; j < reshteVorodi.length() - 1; j++) {
                            arrayeVorodi[j] = arrayeVorodi[j + 1];
                        }
                        arrayeVorodi[reshteVorodi.length() - 1] = '3';
                        if (arrayeVorodi[0] == '3') {
                            i--;
                            continue;
                        }
                    }

                    if (arrayeVorodi[reshteVorodi.length() - 1] != '1' && arrayeVorodi[reshteVorodi.length() - 1] != '3') {//khone aakhar 1&3 nabaashe 
                        for (int j = 0; j < reshteVorodi.length(); j++) {
                            if (arrayeVorodi[j] == '1' && arrayeVorodi[j + 1] != '3') {
                                char y;
                                y = arrayeVorodi[j + 1];
                                arrayeVorodi[j + 1] = arrayeVorodi[i];
                                arrayeVorodi[i] = y;
                                break;
                            }
                        }
                    }
                    
                    if (arrayeVorodi[reshteVorodi.length() - 1] == '3') {//khone aakhar 3 baashe 
                        for (int j = 0; j < reshteVorodi.length(); j++) {
                            if (arrayeVorodi[j] == '1' && arrayeVorodi[j + 1] != '3') {
                                char y;
                                y = arrayeVorodi[j + 1];
                                arrayeVorodi[j + 1] = arrayeVorodi[i];
                                arrayeVorodi[i] = y;
                                break;
                            }
                        }
                    }
                    
                }

                //khone aval 3 nabaashe ( khone ghablesham 1 nabaashe chon 13 tashkil mishe 
                if (arrayeVorodi[i] == '3' && i != 0 && arrayeVorodi[i - 1] != '1') {

                    if (arrayeVorodi[reshteVorodi.length() - 1] == '1') {// khoone aakhar 1 baashe 
                        for (int j = i; j < reshteVorodi.length() - 1; j++) {
                            arrayeVorodi[j] = arrayeVorodi[j + 1];
                        }
                        arrayeVorodi[reshteVorodi.length() - 1] = '3';
                    }

                    if (arrayeVorodi[reshteVorodi.length() - 1] != '1') {//khoone aakhar 1 nabaashe
                        for (int j = 0; j < reshteVorodi.length() - 1; j++) {
                            if (arrayeVorodi[j] == '1' && arrayeVorodi[j + 1] != '3') {
                                char y;
                                y = arrayeVorodi[j + 1];
                                arrayeVorodi[j + 1] = arrayeVorodi[i];
                                arrayeVorodi[i] = y;
                                break;
                            }
                        }
                    }
                }
            }
            System.out.println(arrayeVorodi);
        }

        if (x == 0) {//age 1 & 3voojood nadaasht
            System.out.println(arrayeVorodi);
        }
    }
}
