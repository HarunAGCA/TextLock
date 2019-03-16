package com.agca.annuncements.textlock;

import java.math.BigInteger;
import java.util.Random;

public class EncryptMethods {


    public static BigInteger stringtoBigInteger(char c) {

        BigInteger k = null;


        switch (c) {
            case 'a':
                k = BigInteger.valueOf(1);
                break;
            case 'b':
                k = BigInteger.valueOf(2);
                break;
            case 'c':
                k = BigInteger.valueOf(3);
                break;
            case 'ç':
                k = BigInteger.valueOf(4);
                break;
            case 'd':
                k = BigInteger.valueOf(5);
                break;
            case 'e':
                k = BigInteger.valueOf(6);
                break;
            case 'f':
                k = BigInteger.valueOf(7);
                break;
            case 'g':
                k = BigInteger.valueOf(8);
                break;
            case 'ğ':
                k = BigInteger.valueOf(9);
                break;
            case 'h':
                k = BigInteger.valueOf(10);
                break;
            case 'ı':
                k = BigInteger.valueOf(11);
                break;
            case 'i':
                k = BigInteger.valueOf(12);
                break;
            case 'j':
                k = BigInteger.valueOf(13);
                break;
            case 'k':
                k = BigInteger.valueOf(14);
                break;
            case 'l':
                k = BigInteger.valueOf(15);
                break;
            case 'm':
                k = BigInteger.valueOf(16);
                break;
            case 'n':
                k = BigInteger.valueOf(17);
                break;
            case 'o':
                k = BigInteger.valueOf(18);
                break;
            case 'ö':
                k = BigInteger.valueOf(19);
                break;
            case 'p':
                k = BigInteger.valueOf(20);
                break;
            case 'q':
                k = BigInteger.valueOf(21);
                break;
            case 'r':
                k = BigInteger.valueOf(22);
                break;
            case 's':
                k = BigInteger.valueOf(23);
                break;
            case 'ş':
                k = BigInteger.valueOf(24);
                break;
            case 't':
                k = BigInteger.valueOf(25);
                break;
            case 'u':
                k = BigInteger.valueOf(26);
                break;
            case 'ü':
                k = BigInteger.valueOf(27);
                break;
            case 'v':
                k = BigInteger.valueOf(28);
                break;
            case 'w':
                k = BigInteger.valueOf(29);
                break;
            case 'x':
                k = BigInteger.valueOf(30);
                break;
            case 'y':
                k = BigInteger.valueOf(31);
                break;
            case 'z':
                k = BigInteger.valueOf(32);
                break;
            case 'A':
                k = BigInteger.valueOf(33);
                break;
            case 'B':
                k = BigInteger.valueOf(34);
                break;
            case 'C':
                k = BigInteger.valueOf(35);
                break;
            case 'Ç':
                k = BigInteger.valueOf(36);
                break;
            case 'D':
                k = BigInteger.valueOf(37);
                break;
            case 'E':
                k = BigInteger.valueOf(38);
                break;
            case 'F':
                k = BigInteger.valueOf(39);
                break;
            case 'G':
                k = BigInteger.valueOf(40);
                break;
            case 'Ğ':
                k = BigInteger.valueOf(41);
                break;
            case 'H':
                k = BigInteger.valueOf(42);
                break;
            case 'I':
                k = BigInteger.valueOf(43);
                break;
            case 'İ':
                k = BigInteger.valueOf(44);
                break;
            case 'J':
                k = BigInteger.valueOf(45);
                break;
            case 'K':
                k = BigInteger.valueOf(46);
                break;
            case 'L':
                k = BigInteger.valueOf(47);
                break;
            case 'M':
                k = BigInteger.valueOf(48);
                break;
            case 'N':
                k = BigInteger.valueOf(49);
                break;
            case 'O':
                k = BigInteger.valueOf(50);
                break;
            case 'Ö':
                k = BigInteger.valueOf(51);
                break;
            case 'P':
                k = BigInteger.valueOf(52);
                break;
            case 'Q':
                k = BigInteger.valueOf(53);
                break;
            case 'R':
                k = BigInteger.valueOf(54);
                break;
            case 'S':
                k = BigInteger.valueOf(55);
                break;
            case 'Ş':
                k = BigInteger.valueOf(56);
                break;
            case 'T':
                k = BigInteger.valueOf(57);
                break;
            case 'U':
                k = BigInteger.valueOf(58);
                break;
            case 'Ü':
                k = BigInteger.valueOf(59);
                break;
            case 'V':
                k = BigInteger.valueOf(60);
                break;
            case 'W':
                k = BigInteger.valueOf(61);
                break;
            case 'X':
                k = BigInteger.valueOf(62);
                break;
            case 'Y':
                k = BigInteger.valueOf(63);
                break;
            case 'Z':
                k = BigInteger.valueOf(64);
                break;
            case '0':
                k = BigInteger.valueOf(65);
                break;
            case '1':
                k = BigInteger.valueOf(66);
                break;
            case '2':
                k = BigInteger.valueOf(67);
                break;
            case '3':
                k = BigInteger.valueOf(68);
                break;
            case '4':
                k = BigInteger.valueOf(69);
                break;
            case '5':
                k = BigInteger.valueOf(70);
                break;
            case '6':
                k = BigInteger.valueOf(71);
                break;
            case '7':
                k = BigInteger.valueOf(72);
                break;
            case '8':
                k = BigInteger.valueOf(73);
                break;
            case '9':
                k = BigInteger.valueOf(74);
                break;
            case ' ':
                k = BigInteger.valueOf(75);
                break;
            case '.':
                k = BigInteger.valueOf(76);
                break;
            case ',':
                k = BigInteger.valueOf(77);
                break;
            case ':':
                k = BigInteger.valueOf(78);
                break;
            case ';':
                k = BigInteger.valueOf(79);
                break;
            case '@':
                k = BigInteger.valueOf(80);
                break;
            case '?':
                k = BigInteger.valueOf(81);
                break;
            case '+':
                k = BigInteger.valueOf(82);
                break;
            case '-':
                k = BigInteger.valueOf(83);
                break;
            case '*':
                k = BigInteger.valueOf(84);
                break;
            case '/':
                k = BigInteger.valueOf(85);
                break;
            case '=':
                k = BigInteger.valueOf(86);
                break;
            case '"':
                k = BigInteger.valueOf(87);
                break;
            case '!':
                k = BigInteger.valueOf(88);
                break;
            case '(':
                k = BigInteger.valueOf(89);
                break;
            case ')':
                k = BigInteger.valueOf(90);
                break;


        }

        return k;


    }


    public static String generatePrimeNumber() {

        Random myRandom = new Random();
        int randomNumber = 5 + myRandom.nextInt(100);

        if (isPrime(randomNumber)) {
            EncryptActivity.primeNumber = randomNumber;
        } else {
            generatePrimeNumber();
        }
        return EncryptActivity.primeNumber + "";
    }


    public static boolean isPrime(int x) {

        for (double i = 2.0; i <= Math.sqrt(x); i += 1.0) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static String eAsal() {
        Random eRandom = new Random();
        int ranNumber = 5 + eRandom.nextInt(EncryptActivity.n.intValue());

        if (isPrime(ranNumber) == true && (ranNumber > 1 && (ranNumber < EncryptActivity.n.intValue()))) {
            EncryptActivity.ePrimeNumber = ranNumber;
        } else {
            eAsal();
        }
        return EncryptActivity.ePrimeNumber + "";

    }


}
