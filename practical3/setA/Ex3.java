package practical3.setA;
/* 
    c) Define an interface Operation which has methods area(),volume().Define a 
    constant PI having a value 3.142.Create a class cylinder which implements this 
    interface (members – radius, height) Create one object and calculate the area 
    and volume
*/
interface Operation
{
    final float PI = 3.142f;
    public void area();
    public void volume();

}
class Cylinder implements Operation 
{
    float radius,height;
    Cylinder()
    {
        this.radius = 0.0f;
        this.height = 0.0f;
    }
    void setRadius(float radius)
    {
        this.radius = radius;
    }
    void setHeight(float height)
    {
        this.height = height;
    }

    public void area()
    {
        float tf_area = 2* PI * this.radius*(this.radius + this.height);
        System.out.println("Total Surface area of Cylinder : " +tf_area + " SqCm") ;
    }
    public void volume()
    {
         float volume =  PI * this.radius*this.radius *this.height;
        System.out.println("Volume of Cylinder : " +volume + " CuCm") ;
    }
}
public class Ex3 {
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder();
        cyl.setRadius(23.4f);
        cyl.setHeight(10.4f);
        cyl.area();
        cyl.volume();

    }
}
