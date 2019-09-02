
/**
 * 여기에 Circle 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
abstract public class Circle implements Shape
{
    private int radius;

    public Circle(int radius)
    {
        this.radius = radius;
    }
    
    public double getArea()
    {
        return radius*radius*PI;
    }
}
