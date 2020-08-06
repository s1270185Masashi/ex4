import java.util.*;


class headtailapli{
    public int round;
    public int head;
    public int tail;
    public int judge;
    public String scan_name;
    headtailapli(int r) {
        round = r;
    }

    public void start() {
        System.out.println("Tossing a coin...");
        final Random r = new Random();
        for (int i = 1; i <= round; i++) {
            this.pri_round(i);
            judge = r.nextInt(5) % 2;
            if (0 == judge) {
                head++;
                this.pri_head();
            } else {
                tail++;
                this.pri_tail();
            }
        }
    }

    public void pri_round(final int num) {
        System.out.print("Round " + num + ": ");
    }

    public void pri_head() {
        System.out.println("Heads");
    }

    public void pri_tail() {
        System.out.println("Tails");
    }

    public void pri_result() {
        System.out.println("Heads: " + head + ", Tails: " + tail);
    }














}

class headtail {
    public static void main(String[] args) {
        headtailapli hd = new headtailapli(3);
        hd.start();
        hd.pri_result();
  


    }
}