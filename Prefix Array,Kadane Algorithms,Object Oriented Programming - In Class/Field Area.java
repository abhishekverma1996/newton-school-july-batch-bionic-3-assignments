import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class FieldArea{
    double width;
    double height;
    FieldArea(){

    }
    FieldArea(double w,double h){
        if(w<0){
            this.width=0;
        }else{
            this.width=w;
        }
        if(h<0){
            this.height=0;
        }else{
            this.height=h;
        }
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double w){
        if(w<0){
            this.width=0;
        }else{
            this.width=w;
        }
    }
    public void setHeight(double h){
       if(h<0){
            this.height=0;
        }else{
            this.height=h;
        } 
    }
    public double getArea(){
        return width*height;
    }
}
