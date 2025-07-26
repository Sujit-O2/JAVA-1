import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code
 class Checker implements Comparator<Student>{
    public int compare(Student s1,Student s2){
       
        if(s1.getCgpa()==s2.getCgpa()){
            return s1.getId()-s2.getId();
        }
        return 1;
        
    }
    
} 
public class anothercomparator
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
        Checker cc=new Checker();
        for(int j =0;j<studentList.size()-1;j++ )
        for(int i=j+1;i<studentList.size();i++ ){
            if(studentList.get(j).getCgpa()<studentList.get(i).getCgpa()){
                Student ss=studentList.get(i);
                studentList.set(i, studentList.get(j));
                studentList.set(j,ss);
                
            }
            
            
        }
        Collections.sort(studentList,cc);
        
      	for(Student st: studentList){
            
			System.out.println(st.getFname()+"   "+st.getCgpa());
		}
	}
}



