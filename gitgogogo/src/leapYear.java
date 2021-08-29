
public class leapYear {
    public int y;
    public leapYear(int w) {
        y = w;
    }
    public void testyear(){
        if(y%4 == 0){
            if (y%100 != 0){
                System.out.println("leap year!");
            }else {
                System.out.println("4 is not the only prerequisite");
            }
        }else {
            System.out.println("not gap year");
        }
    }

}
