/*
This is a JAVA program for Encryption & Decryption
without making use of any algorithm.
 */


package com.company;
import java.util.*;

class encryptdecrypt {
    public static void main(String[] args) {
        String str;
        StringBuilder wordforencryp = new StringBuilder(" ");
        Scanner in = new Scanner(System.in);
        try {

            System.out.println("Welcome to Encryption and Decryption");
            System.out.println("What do you want to do, Encrypt or Decrypt ?");
            String enc = in.nextLine();
            if((enc.equals("Encrypt")) || enc.equals("encrypt"))  {
                System.out.print("Enter the String to Encrypt:\t ");

                str = in.nextLine();
                for (int i = 0; i < str.length(); i++) {
                    char ch = Character.toLowerCase(str.charAt(i));
                    switch (ch) {
                        case 'a':
                            wordforencryp.append("{");
                            break;
                        case 'b':
                            wordforencryp.append("}");
                            break;
                        case 'c':
                            wordforencryp.append("#");
                            break;
                        case 'd':
                            wordforencryp.append("~");
                            break;
                        case 'e':
                            wordforencryp.append("+");
                            break;
                        case 'f':
                            wordforencryp.append("-");
                            break;
                        case 'g':
                            wordforencryp.append("*");
                            break;
                        case 'h':
                            wordforencryp.append("@");
                            break;
                        case 'i':
                            wordforencryp.append("/");
                            break;
                        case 'j':
                            wordforencryp.append("\\");
                            break;
                        case 'k':
                            wordforencryp.append("?");
                            break;
                        case 'l':
                            wordforencryp.append("$");
                            break;
                        case 'm':
                            wordforencryp.append("!");
                            break;
                        case 'n':
                            wordforencryp.append("^");
                            break;
                        case 'o':
                            wordforencryp.append("(");
                            break;
                        case 'p':
                            wordforencryp.append(")");
                            break;
                        case 'q':
                            wordforencryp.append("<");
                            break;
                        case 'r':
                            wordforencryp.append(">");
                            break;
                        case 's':
                            wordforencryp.append("=");
                            break;
                        case 't':
                            wordforencryp.append(";");
                            break;
                        case 'u':
                            wordforencryp.append(",");
                            break;
                        case 'v':
                            wordforencryp.append("_");
                            break;
                        case 'w':
                            wordforencryp.append("[");
                            break;
                        case 'x':
                            wordforencryp.append("]");
                            break;
                        case 'y':
                            wordforencryp.append(":");
                            break;
                        case 'z':
                            wordforencryp.append("\"");
                            break;
                        case ' ':
                            wordforencryp.append(" ");
                            break;
                        case '.':
                            wordforencryp.append('3');
                            break;
                        case ',':
                            wordforencryp.append("1");
                            break;
                        case '(':
                            wordforencryp.append('4');
                            break;
                        case '\"':
                            wordforencryp.append('5');
                            break;
                        case ')':
                            wordforencryp.append("7");
                            break;
                        case '?':
                            wordforencryp.append("2");
                            break;
                        case '!':
                            wordforencryp.append("8");
                            break;
                        case '-':
                            wordforencryp.append("6");
                            break;
                        case '%':
                            wordforencryp.append("9");
                            break;
                        case '1':
                            wordforencryp.append("r");
                            break;
                        case '2':
                            wordforencryp.append("k");
                            break;
                        case '3':
                            wordforencryp.append("b");
                            break;
                        case '4':
                            wordforencryp.append("e");
                            break;
                        case '5':
                            wordforencryp.append("q");
                            break;
                        case '6':
                            wordforencryp.append("h");
                            break;
                        case '7':
                            wordforencryp.append("u");
                            break;
                        case '8':
                            wordforencryp.append("y");
                            break;
                        case '9':
                            wordforencryp.append("w");
                            break;
                        case '0':
                            wordforencryp.append("z");
                            break;
                        default:
                            wordforencryp.append("0");
                            break;
                    }
                }
                System.out.println("The encrypted string is: \n" + wordforencryp);
            } else {
                StringBuilder wordfordecryp = new StringBuilder(" ");
                System.out.print("Enter the String you want to Decrypt: ");
                try {

                    str = in.nextLine();
                    for (int i = 0; i < str.length(); i++) {
                        char ch = Character.toLowerCase(str.charAt(i));
                        switch (ch) {
                            case '{':
                                wordfordecryp.append("A");
                                break;
                            case '}':
                                wordfordecryp.append("B");
                                break;
                            case '#':
                                wordfordecryp.append("C");
                                break;
                            case '~':
                                wordfordecryp.append("D");
                                break;
                            case '+':
                                wordfordecryp.append("E");
                                break;
                            case '-':
                                wordfordecryp.append("F");
                                break;
                            case '*':
                                wordfordecryp.append("G");
                                break;
                            case '@':
                                wordfordecryp.append("H");
                                break;
                            case '/':
                                wordfordecryp.append("I");
                                break;
                            case '\\':
                                wordfordecryp.append("J");
                                break;
                            case '?':
                                wordfordecryp.append("K");
                                break;
                            case '$':
                                wordfordecryp.append("L");
                                break;
                            case '!':
                                wordfordecryp.append("M");
                                break;
                            case '^':
                                wordfordecryp.append("N");
                                break;
                            case '(':
                                wordfordecryp.append("O");
                                break;
                            case ')':
                                wordfordecryp.append("P");
                                break;
                            case '<':
                                wordfordecryp.append("Q");
                                break;
                            case '>':
                                wordfordecryp.append("R");
                                break;
                            case '=':
                                wordfordecryp.append("S");
                                break;
                            case ';':
                                wordfordecryp.append("T");
                                break;
                            case ',':
                                wordfordecryp.append("U");
                                break;
                            case '_':
                                wordfordecryp.append("V");
                                break;
                            case '[':
                                wordfordecryp.append("W");
                                break;
                            case ']':
                                wordfordecryp.append("X");
                                break;
                            case ':':
                                wordfordecryp.append("Y");
                                break;
                            case '\"':
                                wordfordecryp.append("Z");
                                break;
                            case '1':
                                wordfordecryp.append("r");
                                break;
                            case '2':
                                wordfordecryp.append("k");
                                break;
                            case '3':
                                wordfordecryp.append("b");
                                break;
                            case '4':
                                wordfordecryp.append("e");
                                break;
                            case '5':
                                wordfordecryp.append("q");
                                break;
                            case '6':
                                wordfordecryp.append("h");
                                break;
                            case '7':
                                wordfordecryp.append("u");
                                break;
                            case '8':
                                wordfordecryp.append("y");
                                break;
                            case '9':
                                wordfordecryp.append("w");
                                break;
                            case '0':
                                wordfordecryp.append("z");
                                break;
                            default:
                                wordfordecryp.append(" ");
                                break;
                        }
                    }
                    System.out.println("The decrypted string is: " + wordfordecryp);
                } catch (Exception ioe) {
                    ioe.printStackTrace();
                }


            }
        } catch (Exception ioe) {
            ioe.printStackTrace();
        }
    }
}

