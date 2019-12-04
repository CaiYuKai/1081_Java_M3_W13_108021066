import java.util.Random;
public class Main01{

    public static void main(String[] args) {
        Random rand = new Random();
        rand.setSeed(23323456);
        int date[]=new  int[6];
        int i=0;
        boolean flag;
        while (i<6){
            flag=true;
            date[i]=rand.nextInt(42)+1;
            for (int j=0;j<i;j++){
                if (date[i]==date[j]){
                    flag=false;break;
                }
            }
            if (flag){
                i++;
            }
        }
        for (int v1:date){
            System.out.print(v1+"\t");
        }
        System.out.println();
    }
}