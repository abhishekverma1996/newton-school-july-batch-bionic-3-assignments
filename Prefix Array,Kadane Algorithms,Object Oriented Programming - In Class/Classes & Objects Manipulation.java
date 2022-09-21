static class Student {
	// your class code goes here
	String name;
	int rollNumber;
}

public static Student myFunction (String name, int rollNumber){
	// your function code goes here
	Student obj = new Student();
	obj.name= name;
	obj.rollNumber= rollNumber;
	return obj;
}
