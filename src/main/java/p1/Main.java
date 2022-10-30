package p1;
import java.util.Scanner;

// 
// Decompiled by Procyon v0.5.36
// 

public class Main
{
    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        System.out.println("1. Test f1()");
        System.out.println("2. Test f2()");
        System.out.print("Enter TC (1 or 2): ");
        final int tc = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a string: ");
        final String st = sc.nextLine();
        final IString t = (IString)new MyString();
        System.out.println("OUTPUT:");
        switch (tc) {
            case 1: {
                final int k1 = t.f1(st);
                System.out.printf("%d\r\n", k1);
                break;
            }
            case 2: {
                final String v2 = t.f2(st);
                System.out.printf("%s\r\n", v2);
                break;
            }
            default: {
                return;
            }
        }
        System.out.println();
    }
}