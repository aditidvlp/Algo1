package scratches;

class Scratch {
    public static void main(String[] args) {

        int amigo = 2;
        int bye = 1;
        int ciao;

        System.out.println("Before swap");
        System.out.println("first number = " + amigo);
        System.out.println("second number = " + bye);

            ciao = amigo;
            amigo = bye;
            bye = ciao;
            System.out.println("After swap");
            System.out.println("first number = " +amigo);
            System.out.println("second number = " +bye);


        }
    }
