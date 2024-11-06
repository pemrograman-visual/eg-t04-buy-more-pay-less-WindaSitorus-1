// 12S24001 - Fredrick Aritonang 
// 12S24019 - Winda N.V. Sitorus
import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] isbn = new String[3];
        double[] price = new double[3];
        int[] eksemplar = new int[3];
        int n, i;

        for (i = 0; i <= 2; i++) {
            isbn[i] = "0";
            price[i] = 0;
            eksemplar[i] = 0;
        }
        n = 0;
        int eksemplartotal1, eksemplartotal2, eksemplartotal3;
        double pricetotal1, pricetotal2, pricetotal3;
        double hargatotal1, hargatotal2, hargatotal3;

        eksemplartotal1 = 0;
        eksemplartotal2 = 0;
        eksemplartotal3 = 0;
        pricetotal1 = 0;
        pricetotal2 = 0;
        pricetotal3 = 0;
        hargatotal1 = 0;
        hargatotal2 = 0;
        hargatotal3 = 0;
        double hargatotal;
        String isbnpembanding;

        do {
            isbnpembanding = input.nextLine();
            if (isbnpembanding.equals("---")) {
            } else {
                if (isbnpembanding.equals(isbn[0])) {
                    price[0] = Double.parseDouble(input.nextLine());
                    eksemplar[0] = Integer.parseInt(input.nextLine());
                    eksemplartotal1 = eksemplartotal1 + eksemplar[0];
                    pricetotal1 = price[0] * eksemplartotal1;
                } else {
                    if (isbnpembanding.equals(isbn[1])) {
                        price[1] = Double.parseDouble(input.nextLine());
                        eksemplar[1] = Integer.parseInt(input.nextLine());
                        eksemplartotal2 = eksemplartotal2 + eksemplar[1];
                        pricetotal2 = price[1] * eksemplartotal2;
                    } else {
                        if (isbnpembanding.equals(isbn[2])) {
                            price[2] = Double.parseDouble(input.nextLine());
                            eksemplar[2] = Integer.parseInt(input.nextLine());
                            eksemplartotal3 = eksemplartotal3 + eksemplar[2];
                            pricetotal3 = price[2] * eksemplartotal3;
                        } else {
                            price[n] = Double.parseDouble(input.nextLine());
                            eksemplar[n] = Integer.parseInt(input.nextLine());
                            if (n == 0) {
                                isbn[n] = isbnpembanding;
                                eksemplartotal1 = eksemplartotal1 + eksemplar[0];
                                pricetotal1 = price[0] * eksemplartotal1;
                                n = 1;
                            } else {
                                if (n == 1) {
                                    isbn[n] = isbnpembanding;
                                    eksemplartotal2 = eksemplartotal2 + eksemplar[1];
                                    pricetotal2 = price[1] * eksemplartotal2;
                                    n = 2;
                                } else {
                                    isbn[n] = isbnpembanding;
                                    eksemplartotal3 = eksemplartotal3 + eksemplar[2];
                                    pricetotal3 = price[2] * eksemplartotal3;
                                }
                            }
                        }
                    }
                }
            }
        } while (!isbnpembanding.equals("---"));
        if (eksemplartotal1 >= 5 && eksemplartotal1 < 10) {
            hargatotal1 = pricetotal1 - pricetotal1 * 0.02;
        } else {
            if (eksemplartotal1 >= 10 && eksemplartotal1 < 20) {
                hargatotal1 = pricetotal1 - pricetotal1 * 0.05;
            } else {
                if (eksemplartotal1 >= 20) {
                    hargatotal1 = pricetotal1 - pricetotal1 * 0.12;
                } else {
                    hargatotal1 = pricetotal1;
                }
            }
        }
        if (eksemplartotal2 >= 5 && eksemplartotal2 < 10) {
            hargatotal2 = pricetotal2 - pricetotal2 * 0.02;
        } else {
            if (eksemplartotal2 >= 10 && eksemplartotal2 < 20) {
                hargatotal2 = pricetotal2 - pricetotal2 * 0.05;
            } else {
                if (eksemplartotal2 >= 20) {
                    hargatotal2 = pricetotal2 - pricetotal2 * 0.12;
                } else {
                    hargatotal2 = pricetotal2;
                }
            }
        }
        if (eksemplartotal3 >= 5 && eksemplartotal3 < 10) {
            hargatotal3 = pricetotal3 - pricetotal3 * 0.02;
        } else {
            if (eksemplartotal3 >= 10 && eksemplartotal3 < 20) {
                hargatotal3 = pricetotal3 - pricetotal3 * 0.05;
            } else {
                hargatotal3 = pricetotal3;
            }
        }
        hargatotal = hargatotal1 + hargatotal2 + hargatotal3;
        System.out.println(toFixed(hargatotal,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] isbn = new String[3];
        double[] price = new double[3];
        int[] eksemplar = new int[3];
        int n, i;

        for (i = 0; i <= 2; i++) {
            isbn[i] = "0";
            price[i] = 0;
            eksemplar[i] = 0;
        }
        n = 0;
        int eksemplartotal1, eksemplartotal2, eksemplartotal3;
        double pricetotal1, pricetotal2, pricetotal3;
        double hargatotal1, hargatotal2, hargatotal3;

        eksemplartotal1 = 0;
        eksemplartotal2 = 0;
        eksemplartotal3 = 0;
        pricetotal1 = 0;
        pricetotal2 = 0;
        pricetotal3 = 0;
        hargatotal1 = 0;
        hargatotal2 = 0;
        hargatotal3 = 0;
        double hargatotal;
        String isbnpembanding;

        do {
            isbnpembanding = input.nextLine();
            if (isbnpembanding.equals("---")) {
            } else {
                if (isbnpembanding.equals(isbn[0])) {
                    price[0] = Double.parseDouble(input.nextLine());
                    eksemplar[0] = Integer.parseInt(input.nextLine());
                    eksemplartotal1 = eksemplartotal1 + eksemplar[0];
                    pricetotal1 = price[0] * eksemplartotal1;
                } else {
                    if (isbnpembanding.equals(isbn[1])) {
                        price[1] = Double.parseDouble(input.nextLine());
                        eksemplar[1] = Integer.parseInt(input.nextLine());
                        eksemplartotal2 = eksemplartotal2 + eksemplar[1];
                        pricetotal2 = price[1] * eksemplartotal2;
                    } else {
                        if (isbnpembanding.equals(isbn[2])) {
                            price[2] = Double.parseDouble(input.nextLine());
                            eksemplar[2] = Integer.parseInt(input.nextLine());
                            eksemplartotal3 = eksemplartotal3 + eksemplar[2];
                            pricetotal3 = price[2] * eksemplartotal3;
                        } else {
                            price[n] = Double.parseDouble(input.nextLine());
                            eksemplar[n] = Integer.parseInt(input.nextLine());
                            if (n == 0) {
                                isbn[n] = isbnpembanding;
                                eksemplartotal1 = eksemplartotal1 + eksemplar[0];
                                pricetotal1 = price[0] * eksemplartotal1;
                                n = 1;
                            } else {
                                if (n == 1) {
                                    isbn[n] = isbnpembanding;
                                    eksemplartotal2 = eksemplartotal2 + eksemplar[1];
                                    pricetotal2 = price[1] * eksemplartotal2;
                                    n = 2;
                                } else {
                                    isbn[n] = isbnpembanding;
                                    eksemplartotal3 = eksemplartotal3 + eksemplar[2];
                                    pricetotal3 = price[2] * eksemplartotal3;
                                }
                            }
                        }
                    }
                }
            }
        } while (!isbnpembanding.equals("---"));
        if (eksemplartotal1 >= 5 && eksemplartotal1 < 10) {
            hargatotal1 = pricetotal1 - pricetotal1 * 0.02;
        } else {
            if (eksemplartotal1 >= 10 && eksemplartotal1 < 20) {
                hargatotal1 = pricetotal1 - pricetotal1 * 0.05;
            } else {
                if (eksemplartotal1 >= 20) {
                    hargatotal1 = pricetotal1 - pricetotal1 * 0.12;
                } else {
                    hargatotal1 = pricetotal1;
                }
            }
        }
        if (eksemplartotal2 >= 5 && eksemplartotal2 < 10) {
            hargatotal2 = pricetotal2 - pricetotal2 * 0.02;
        } else {
            if (eksemplartotal2 >= 10 && eksemplartotal2 < 20) {
                hargatotal2 = pricetotal2 - pricetotal2 * 0.05;
            } else {
                if (eksemplartotal2 >= 20) {
                    hargatotal2 = pricetotal2 - pricetotal2 * 0.12;
                } else {
                    hargatotal2 = pricetotal2;
                }
            }
        }
        if (eksemplartotal3 >= 5 && eksemplartotal3 < 10) {
            hargatotal3 = pricetotal3 - pricetotal3 * 0.02;
        } else {
            if (eksemplartotal3 >= 10 && eksemplartotal3 < 20) {
                hargatotal3 = pricetotal3 - pricetotal3 * 0.05;
            } else {
                hargatotal3 = pricetotal3;
            }
        }
        hargatotal = hargatotal1 + hargatotal2 + hargatotal3;
        System.out.println(toFixed(hargatotal,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}

