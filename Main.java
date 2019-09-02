
/**
 * 여기에 Main 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Main
{
    public static void main(String[] args){
        Shape[] list = new Shape[3];
        list[0] = new Circle(10);
        list[1] = new Oval(20, 30);
        list[2] = new Rect(10, 40);
        
        for(int i = 0; i < list.length; i++){
            list[i].redraw();
        }
        for(int i = 0; i < list.length; i++){
            System.out.println("면적은 " + list[i].getArea());
        }
    }
}
