package college;

public class dsaP1 {
    public static void main(String[] args) {
        int noofeggs = 1342;
        int dozen , gross , left ;
        gross=noofeggs/144;
        dozen=(noofeggs%144) /12;
        left=(noofeggs%144)%12;

        System.out.println("Gross=> "+gross);
        System.out.println("Dozen=> "+dozen);
        System.out.println("Left=> "+left);
    }
}
