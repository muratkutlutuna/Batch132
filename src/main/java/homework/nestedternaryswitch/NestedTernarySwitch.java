package homework.nestedternaryswitch;

public class NestedTernarySwitch {
    public static void main(String[] args) {
        int i = 1;
        int j = 0;
        switch (i) {
            case 2 :
                j += 6;
            case 4 :
                j += 1;
            case 1 :
                j += 4;
//                break;
            default :
                j += 2;
        }
        System.out.println("j = " + j); //6

    }
}
