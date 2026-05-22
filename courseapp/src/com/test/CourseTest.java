package com.test;

import java.util.Scanner;

import com.entity.OfflineCourse;
import com.entity.OnlineCourse;
import com.service.CourseService;

public class CourseTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CourseService service = new CourseService();
		
		while(true) {
			System.out.println("Menu");
			System.out.println("1 Add course");
			System.out.println("2 Remove Course");
			System.out.println("3 Update fees");
			System.out.println("4 Activate/Deactivate");
			System.out.println("5 Enroll");
			System.out.println("6 Display all");
			System.out.println("7 Display by type");
			System.out.println("8 Fees less than");
			System.out.println("9 Sort by duration");
			System.out.println("10 Search by name");
			System.out.println("11 Exit");
			
			int ch = sc.nextInt();
			

            switch (ch) {
                case 1:
                    System.out.println("1 Online  2 Offline");
                    int type = sc.nextInt();

                    System.out.print("Id: "); int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: "); 
                    String name = sc.nextLine();
                    System.out.print("Duration: "); 
                    int d = sc.nextInt();
                    System.out.print("Fees: "); 
                    double f = sc.nextDouble();

                    if (type == 1) {
                        sc.nextLine();
                        System.out.print("Platform: "); 
                        String p = sc.nextLine();
                        System.out.print("Instructor: "); 
                        String i = sc.nextLine();

                        service.addCourse(
                                new OnlineCourse(id, name, d, f, "Active", p, i));
                    } else {
                        sc.nextLine();
                        System.out.print("Room: "); 
                        String r = sc.nextLine();
                        System.out.print("Location: "); 
                        String l = sc.nextLine();

                        service.addCourse(
                                new OfflineCourse(id, name, d, f, "Active", r, l));
                    }
                    break;
                case 2:
                	service.removeCourse(sc.nextInt());
                	break;
                	
                case 3:
                	service.updateFees(sc.nextInt(), sc.nextDouble());
                	break;
                	
                case 4:
                	service.changeStatus(sc.nextInt());
                	break;
                
                case 5:
                	System.out.println("Type :");
                	String t = sc.nextLine();
                	System.out.println("Max Duration :");
                	int md = sc.nextInt();
                	service.entroll(t, md);
                	break;
                	
                case 6:
                	service.displayAll();
                	break;
                	
                case 7:
                	sc.nextLine();
                	service.displayByType(sc.nextLine());
                	break;
                	
                case 8:
                	service.feesLessThan(sc.nextDouble());
                	break;
                	
                case 9:
                	service.sortByDuration();
                	break;
                	
                case 10:
                	service.searchByName(sc.nextLine());
                	break;
                	
                case 11:
                	System.exit(0);
            }
			
		  }
				
			
		}
	
		
	}


