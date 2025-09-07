
class Computer {

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    // public void playMusic() {
    //     System.out.println("music playing ");
    // }

    // public String getmePen(int cost) {
    //     if (cost >= 10) {
    //         return "pen";

    //     } else {
    //         return "nothing";
    //     }
    // }
}

public class Class {

    public static void main(String[] args) {

        Computer comp = new Computer();

        // String msg = comp.getmePen(2);
        // System.out.println(msg);
        // // comp.playMusic();

        int res2 = comp.add(1, 2);
        int results3 = comp.add(1, 2,3);
        
        System.out.println(res2);
        System.out.println(results3);

    }

}
