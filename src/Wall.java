public class Wall {
double width;
double height;


public Wall(double width,double height){
    this.height=height;
    this.width=width;

    }
    public double getWidth(){
    return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public double setWidth(double width){
    width=width<0 ? 0:width;
       return  this.width=width;
    }
    public double setHeight(double height){
        height=height<0 ? 0:height;
        return  this.height=height;
    }
    public double getArea(){
    return this.width*this.height;
    }

}
