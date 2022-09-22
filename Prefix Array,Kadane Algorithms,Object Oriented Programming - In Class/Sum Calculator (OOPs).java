// create class here and its methods as well
class SumCalculator{
    int num1;
    int num2;
    SumCalculator(int a,int b){
        this.num1=a;
        this.num2=b;
    }
    public int sum(){
        return num1+num2;
    }
    public int sum2(int a,int b){
        return a+b;
    }
    public int fromObject(SumCalculator obj1,SumCalculator obj2){
        int sum1=obj1.sum();
        int sum2=obj2.sum();
        return sum1+sum2;
    }
}
