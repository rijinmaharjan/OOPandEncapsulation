import java.util.Scanner;
public class SimpleInterest1 {
    private int principal;
    private int time;
    private int rate;
    public void setPrincipal(int principal){
        this.principal = principal;
    }
    public int getPrincipal(){
        return principal;
    }
    public void setTime(int time){
        this.time = time;
    }
    public int getTime(){
        return time;
    }
    public void setRate(int rate){
        this.rate = rate;
    }
    public int getRate(){
        return rate;
    }
    public int calculateSI(){
        return (principal * time * rate) / 100;
    }
}
class SimpleInterestDriver2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        SimpleInterest1 si = new SimpleInterest1();
        System.out.print("Enter Principal:");
        si.setPrincipal(input.nextInt());
        System.out.print("Enter Time:");
        si.setTime(input.nextInt());
        System.out.print("Enter Rate:");
        si.setRate(input.nextInt());
        System.out.println("Principal: " + si.getPrincipal());
        System.out.println("Time: " + si.getTime());
        System.out.println("Rate: " + si.getRate());
        System.out.println("Simple Interest: " + si.calculateSI());
    }
}

