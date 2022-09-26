static class Student
{
    String name;
    int eng;
    int maths;
    int hindi;
}
static Student[] createStudentArray(int n)
    {
       Student[] st = new Student[n];
       for(int i = 0; i < n; i++)
       {
           Student stdt = new Student();
           stdt.name = sc.next();
           stdt.eng = sc.nextInt();
           stdt.maths = sc.nextInt();
           stdt.hindi = sc.nextInt();
           st[i] = stdt;
        } 
        return st;
    }
    
    static int engAverage(Student st[], int n)
    {
        int total = 0;
        for(int i=0;i<n;i++)
        {
            total += st[i].eng;
        }
        return total / n;
    }
    
    static int avgPercentageOfClass(Student st[], int n)
    {
        int total = 0;
        for(int i=0;i<n;i++)
        {
            int allSubject = 0;
            allSubject += st[i].eng + st[i].maths + st[i].hindi;
            allSubject /= 3;
            total += allSubject; 
        }
        return (total/n);
    }
