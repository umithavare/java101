package Giris;
import java.util.Scanner;
/** @umithavare patika.dev linkim: https://app.patika.dev/umith **/

/**
 * Koç Burcu : 21 Mart - 20 Nisan
 *
 * Boğa Burcu : 21 Nisan - 21 Mayıs
 *
 * İkizler Burcu : 22 Mayıs - 22 Haziran
 *
 * Yengeç Burcu : 23 Haziran - 22 Temmuz
 *
 * Aslan Burcu : 23 Temmuz - 22 Ağustos
 *
 * Başak Burcu : 23 Ağustos - 22 Eylül
 *
 * Terazi Burcu : 23 Eylül - 22 Ekim
 *
 * Akrep Burcu : 23 Ekim - 21 Kasım
 *
 * Yay Burcu : 22 Kasım - 21 Aralık
 *
 * Oğlak Burcu : 22 Aralık - 21 Ocak
 *
 * Kova Burcu : 22 Ocak - 19 Şubat
 *
 * Balık Burcu : 20 Şubat - 20 Mart
 * Ödev
 *
 * Aynı örneği switch-case kullanmadan yapınız.
 */
public class BurcBulanProgram {
    public static void main(String[] args) {
        int ay, gun;
        boolean isError = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Doğduğunuz ay Sırasını giriniz ''örnek : Ocak = 1'' ");
        ay = input.nextInt();
        System.out.println("Lütfen Doğduğunuz Günü Giriniz");
        gun = input.nextInt();
        if (ay == 1) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 21) {
                    System.out.println("Oğlak burcusunuz");
                } else {
                    System.out.println("Kova Burcusunuz");
                }
            }
            else {
                    isError = true;
                }
            }
        if (ay == 2) {
            if (gun >= 1 && gun <= 28) {
                if (gun <= 19) {
                    System.out.println("Kova burcusunuz");
                } else {
                    System.out.println("Balık Burcusunuz");
                }
            }
            else {
                isError = true;
            }
        }
        if (ay == 3) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 20) {
                    System.out.println("Balık burcusunuz");
                } else {
                    System.out.println("Koç Burcusunuz");
                }
            }
            else {
                isError = true;
            }
        }
        if (ay == 4) {
            if (gun >= 1 && gun <= 30) {
                if (gun <= 20) {
                    System.out.println("Koç burcusunuz");
                } else {
                    System.out.println("Boğa Burcusunuz");
                }
            }
            else {
                isError = true;
            }
        }
        if (ay == 5) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 21) {
                    System.out.println("Boğa burcusunuz");
                } else {
                    System.out.println("İkizler Burcusunuz");
                }
            }
            else {
                isError = true;
            }
        }
        if (ay == 6) {
            if (gun >= 1 && gun <= 30) {
                if (gun <= 22) {
                    System.out.println("İkizler burcusunuz");
                } else {
                    System.out.println("Yengeç Burcusunuz");
                }
            }
            else {
                isError = true;
            }
        }
        if (ay == 7) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 22) {
                    System.out.println("Yengeç burcusunuz");
                } else {
                    System.out.println("Aslan Burcusunuz");
                }
            }
            else {
                isError = true;
            }
        }
        if (ay == 8) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 22) {
                    System.out.println("Aslan burcusunuz");
                } else {
                    System.out.println("Başak Burcusunuz");
                }
            }
            else {
                isError = true;
            }
        }
        if (ay == 9) {
            if (gun >= 1 && gun <= 30) {
                if (gun <= 22) {
                    System.out.println("Başak burcusunuz");
                } else {
                    System.out.println("Terazi Burcusunuz");
                }
            }
            else {
                isError = true;
            }
        }
        if (ay == 10) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 22) {
                    System.out.println("Terazi burcusunuz");
                } else {
                    System.out.println("Akrep Burcusunuz");
                }
            }
            else {
                isError = true;
            }
        }
        if (ay == 11) {
            if (gun >= 1 && gun <= 30) {
                if (gun <= 21) {
                    System.out.println("Akrep burcusunuz");
                } else {
                    System.out.println("Yay Burcusunuz");
                }
            }
            else {
                isError = true;
            }
        }
        if (ay == 12) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 21) {
                    System.out.println("Yay burcusunuz");
                } else {
                    System.out.println("Oğlak Burcusunuz");
                }
            }
            else {
                isError = true;
            }
        }

        }
    }

