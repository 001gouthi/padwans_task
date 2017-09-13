import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;
/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	ArrayList<Student> studentlist;
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
		studentlist = new ArrayList<Student>(Arrays.asList(this.students));
	}

	@Override
	public Student[] getStudents() {
		return studentlist.toArray(new Student(studentlist.size()));
		// Add your implementation here
		//return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if(studentlist.isEmpty()){
			throw new IllegalArgumentException();
		}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index>=0 && index < studentlist.size()){
			throw new IllegalArgumentException();
		}
		else{
			return studentlist.get(index);
		}
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if((index>0 && index < studentlist.size()) && studentlist.isEmpty()){
			throw new IllegalArgumentException();
		}
		else{
			studentlist.set(index,student);
		}
	}

	@Override
	public void addFirst(Student student) {
		if(studentlist.isEmpty()){
			throw new IllegalArgumentException();
		}
		else{
			studentlist.add(0,student);
		}
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		if(studentlist.isEmpty()){
			throw new IllegalArgumentException();
		}
		else{
			studentlist.add(studentlist.size(),student);
		}
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		if(studentlist.isEmpty() && ((index > 0 ) && (index < students.length())))
		{
			throw new IllegalArgumentException();
		}
		else{
			studentlist.add(index,student);
		}
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		if(studentlist.isEmpty() && ((index > 0 ) && (index < students.length())))
		{
			throw new IllegalArgumentException();
		}
		else{
			studentlist.remove(index);
		}
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		int i=0;
		for(Student sl:studentlist){
			if(student.id==sl.id){studentlist.remove(i);}
				i++;
		}
		if(i==studentlist.size()){throw new IllegalArgumentException("Student not exist");}
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		int i;
		if(studentlist.isEmpty() && ((index > 0 ) && (index < students.length())))
		{
			throw new IllegalArgumentException();
		}
		else{
			for(i=index+1;i<studentlist.size();i++)
			studentlist.remove(i);
		}
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		int i;
		if(studentlist.isEmpty())
		{
			throw new IllegalArgumentException();
		}
		else{
		for(Student sl:studentlist){
			if(student.id==sl.id){for(int j=i;j<studentlist.size();j++){studentlist.remove(j);}break;}
				i++;
		}
	}
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		int i;
		if(studentlist.isEmpty() && ((index > 0 ) && (index < students.length())))
		{
			throw new IllegalArgumentException();
		}
		else{
			for(i=0;i<index;i++)
			studentlist.remove(i);
		}
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		int i;
		if(studentlist.isEmpty())
		{
			throw new IllegalArgumentException();
		}
		else{
		for(Student sl:studentlist){
			if(student.id==sl.id){for(int j=0;j<i;j++){studentlist.remove(j);}break;}
				i++;
		}
	}
	}
	public int compareTo(Student z) 
  {
      int res=0;
        if (avgMark > z.avgMark) {res=-1;  }
        if (avgMark < z.avgMark){res=1;}
      return res;
  }

	@Override
	public void bubbleSort() {
		 Student temp;
        if (studentlist.size()>1) // check if the number of orders is larger than 1
        {
            for (int x=0; x<studentlist.size(); x++) // bubble sort outer loop
            {
                for (int i=0; i < studentlist.size()-x-1; i++) {
                    if (studentlist.get(i).compareTo(studentlist.get(i+1)) > 0)
                    {
                        temp = studentlist.get(i);
                        list.set(i,studentlist.get(i+1) );
                        list.set(i+1, temp);
                    }
                }
            }
        }
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		if(date==null){
		throw new IllegalArgumentException();
	}
	else{
		ArrayList<Student> Bday=new ArrayList<Student>();
			for(Student s:studentlist){
				if(s.date==date){Bday.add(s);}
			}
			return Bday.toArray(new Student[toArray.size()]);

	}
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		if(firstdate==null || lastDate==null){
		throw new IllegalArgumentException();
	}
	else{
		ArrayList<Student> Bday=new ArrayList<Student>();
			for(Student s:studentlist){
				if(s.date>=firstdate && s.date<=lastdate){Bday.add(s);}
			}
			return Bday.toArray(new Student[toArray.size()]);

	}	
		// Add your implementation here
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		if(indexOfStudent==0){new throw IllegalArgumentException();return(1);}
		int year = Calendar.getInstance().get(Calendar.YEAR);
		Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    int birthyear = cal.get(Calendar.YEAR);
		// Add your implementation here
		return (birthyear-year);
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		if(age<0){
		throw new IllegalArgumentException();
	}
	else{
		int year = Calendar.getInstance().get(Calendar.YEAR);
		Calendar cal = Calendar.getInstance();
		ArrayList<Student> Bday=new ArrayList<Student>();
			for(Student s:studentlist){
				cal.setTime(s.date);
    int birthyear = cal.get(Calendar.YEAR);
    	cal_age (birthyear-year);
				if(cal_age==age){Bday.add(s);}
			}
			return Bday.toArray(new Student[toArray.size()]);

	}
		// Add your implementation here
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		if(studentlist.isEmpty())
		{
			throw new IllegalArgumentException();
		}
		else{
			bubbleSort();
			int max=studentlist.get(0).avgMark;
			ArrayList<Student> Bday=new ArrayList<Student>();
			for(Student s:studentlist){
				if(s.avgMark==max){Bday.add(s);}
			}
			return Bday.toArray(new Student[toArray.size()]);

	}	
		}

//		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		int i;
		if(studentlist.isEmpty()){new throw IllegalArgumentException();return(1);}
		else{
		for(Student sl:studentlist){
			if(student.id==sl.id){break;}
				i++;
		}
		return(studentlist.get(i));
	}
		// Add your implementation here
	}
}
