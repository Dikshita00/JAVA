package com.day4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StudentService {
    static StudentNew[] studarr;
    static int cnt;

    static {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            studarr = new StudentNew[100];
            studarr[0] = new StudentNew(12, "Rajan", 98, 97, sdf.parse("11/11/2000"));
            studarr[1] = new StudentNew(13, "Atharva", 95, 92, sdf.parse("11/11/1997"));
            studarr[2] = new StudentNew(14, "Ashu", 89, 90, sdf.parse("11/11/1997"));
            cnt = 3;
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static boolean addNewStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID:");
        int sid = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.println("Enter Name:");
        String nm = sc.nextLine();

        System.out.println("Enter Marks1:");
        float m1 = sc.nextFloat();

        System.out.println("Enter Marks2:");
        float m2 = sc.nextFloat();

        System.out.println("Enter Birth Date (dd/MM/yyyy):");
        String dt = sc.next();

        // Convert string to java.util.Date
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date bdt = null;
        try {
            bdt = sdf.parse(dt);
        } catch (ParseException e) {
            System.out.println("Invalid date format!");
            return false;
        }

        StudentNew s = new StudentNew(sid, nm, m1, m2, bdt);
        if (cnt == studarr.length) {
            return false; // array full
        } else {
            studarr[cnt] = s;
            cnt++;
            return true;
        }
    }

    public static void displayAll() {
        for (int i = 0; i < cnt; i++) {
            System.out.println(studarr[i]);
        }
    }
}
