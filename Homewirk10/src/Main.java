import java.util.Random;

public class Main {


    public static void main(String[] args) {
        Random random = new Random();
        int a = 0;

        char x;
        String block1;
        String block2;
        String block3;
        String block4;
        String block5;
        String finalBlock;
        String zBlok;


        StringBuilder sb = new StringBuilder();

        sb.append(random.nextInt(9));
        sb.append(random.nextInt(9));
        sb.append(random.nextInt(9));
        sb.append(random.nextInt(9));
        block1 = sb.toString();


        StringBuilder sb1 = new StringBuilder();
        x = (char) (random.nextInt(26) + 'a');
        sb1.append(x);
        x = (char) (random.nextInt(26) + 'a');
        sb1.append(x);
        x = (char) (random.nextInt(26) + 'a');
        sb1.append(x);
        block2 = sb1.toString();


        StringBuilder sb2 = new StringBuilder();
        sb2.append(random.nextInt(9));
        sb2.append(random.nextInt(9));
        sb2.append(random.nextInt(9));
        sb2.append(random.nextInt(9));
        block3 = sb2.toString();


        StringBuilder sb3 = new StringBuilder();
        x = (char) (random.nextInt(26) + 'a');
        sb3.append(x);
        x = (char) (random.nextInt(26) + 'a');
        sb3.append(x);
        x = (char) (random.nextInt(26) + 'a');
        sb3.append(x);
        block4 = sb3.toString();


        StringBuilder sb4 = new StringBuilder();
        a = random.nextInt(9);
        sb4.append(a);
        x = (char) (random.nextInt(26) + 'a');
        sb4.append(x);
        a = random.nextInt(9);
        sb4.append(a);
        x = (char) (random.nextInt(26) + 'a');
        sb4.append(x);
        block5 = sb4.toString();

        StringBuilder sb5 = new StringBuilder();
        sb5.append(block1 + "-" + block2 + "-" + block3 + "-" + block4 + "-" + block5);
        finalBlock = sb5.toString();

        StringBuilder sb6 = new StringBuilder();
        
        char[] characterArray = finalBlock.toCharArray();
//        finalBlock  [6] = "*";


//        finalBlock.replace((char) ((char) random.nextInt(26) + 'a'), '*');
        zBlok = sb6.toString();


        System.out.println(finalBlock);

        System.out.println(block1 + " и " + block3);

        System.out.println(zBlok);


    }
}
