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




    public void won_or_lost(){
        if(head>tail){
            System.out.println(scan_name+" won!");
        }
        else{
            System.out.println(scan_name+" lost!");
        }
    
    public void name() {
        System.out.println("Who are you?");
        System.out.print(">");
        Scanner scan = new Scanner(System.in);
        scan_name = scan.next();
        System.out.println("Hello, "+scan_name+"!");
    }
















}

class headtail {
    public static void main(String[] args) {
        headtailapli hd = new headtailapli(3);
        hd.name();/*add*/
        hd.start();
        hd.pri_result();
        hd.won_or_lost();
  


    }
}