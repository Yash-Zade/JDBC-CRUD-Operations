package MyP;
import java.sql.SQLException;
import java.util.*;

public class App{
	public static void main(String[] args) throws SQLException{
		System.out.println("Enter 1: Insert  2: delete  3: print  4: update");		
		Scanner sc=new Scanner(System.in);
		int key = sc.nextInt();
		switch (key) {
		case 1: {
			System.out.println("Enter Roll no., Name");
			int rollNo = sc.nextInt();
			String name= sc.next();
			Student st = new Student(rollNo,name);
			StudentDAO.insert(st);
			break;
		}
		case 2: {
			System.out.println("Enter Roll no.");
			int rollNo =sc.nextInt() ;
			String name="";
			Student st = new Student(rollNo,name);
			StudentDAO.delete(st);
			break;
		}
		case 3: {
			StudentDAO.print();
			break;
		}
		case 4: {
			System.out.println("Enter Roll no.");
			int rollNo =sc.nextInt() ;
			String name=sc.next();
			Student st = new Student(rollNo,name);
			StudentDAO.update(st);
			break;
		}
		default:
			System.out.println("enter a valid parimeter");
		}
		
		sc.close();
	}
	
}