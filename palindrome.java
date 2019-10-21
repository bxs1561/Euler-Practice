import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class palindrome {
    public static boolean isPrime(long num) {
        if (num <= 1) {
            return false;
        }
        for (long i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
    isPrime(10);
        int sum = 0;
        for (long i = 2; i < 10; i++) {
            if (isPrime( i) ) {
                //System.out.println(i);
                sum += i;
            }
        }
       // System.out.println(sum);
    }

        public static void main(String[]args){
    //Longest Collatz sequence problem
        long number = 1000000;
        long n;
        int seq=0;
        int start=0;
       // int length=0;
        for(int i=2;i<=number;i++){
             int length=1;
            n=i;
            while(n!=1){
                if(n%2==0){
                    n=n/2;
                }
                else{
                    n=3*n+1;
                }
                length++;
            }
           if(length>seq){
               seq=length;
               start=i;
           }
        }
        System.out.println(start);


    }
    public static String pow(int num) {
        BigInteger result = new BigInteger("2").pow(1000);
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        int sum = 0;



        String num = pow(1000);
        String StringArray[] = num.split("\\B");
        for (int i = 0; i < StringArray.length; i++) {
            sum += Integer.valueOf(StringArray[i]);
           // System.out.println(Integer.valueOf(StringArray[i]));
        }
        System.out.println(sum);

    public static void main(String[]args){
        int sun=0;
        for(int i=1901;i<=2000;i++){
            for(int mon=1;mon<=12;mon++){
                LocalDate date1= LocalDate.of(i,mon,1);
                if(date1.getDayOfWeek()== DayOfWeek.SUNDAY){
                    sun++;
                }

            }
        }
        System.out.println(sun);
    }
    public static BigInteger Factorial(int num){
        int fact=0;
        if(num==0 || num==1){
            return BigInteger.valueOf(1);
        }
        else {
            return num*Factorial(num-1);
        }
        BigInteger result = BigInteger.ONE;
        System.out.println();
        for (long i = 2; i <= num; i++)
            result = result.multiply(BigInteger.valueOf(i));

        return result;
    }
    public static void main(String[]args){
        int sum=0;
        String num= String.valueOf(Factorial(100));
        String StringArray[] = num.split("\\B");
        for(int i=0;i<StringArray.length;i++){
            sum+=Integer.valueOf(StringArray[i]);
        }
        System.out.println(sum);

    }

    public static int divisible(int number) {
        int num = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    num += i;
                }



        }
        return num;
    }

    public static void fileReader(String file) throws IOException {
        BufferedReader br =new BufferedReader(new FileReader(file));
        ArrayList<String>list=new ArrayList<>();
        try{
            String line=br.readLine();
            StringBuilder sb = new StringBuilder();

            while(line!=null){
                sb.append(line);

                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            list.add(everything);


            System.out.println(list

        } catch (IOException e) {
            e.printStackTrace();
        }
        br.close();
    }

    public static void main(String[] args) throws IOException {
        fileReader("C:\\Users\\Bik\\IdeaProjects\\skills\\name.txt");
        //divisible(220);
        //help(220);



    }
   public static int isAbundant(int number){
       //A number n is called deficient if the sum of its
       // proper divisors is less than n and it is called abundant if this sum exceeds n.
       int sum=0;
       for(int i=1;i<number;i++){
           if(number%i==0){
               sum+=i;
           }
       }
       return sum;
       if(sum>number){
           return true;
       }
       return false;
public static int addFib(int limit){
    if (limit < 2)
        return 0;
    long ef1 = 0, ef2 = 2;
    long sum = ef1 + ef2;


    while (ef2 <= limit)
    {

        long ef3 = 4 * ef2 + ef1;
        if (ef3 > limit)
            break;
        ef1 = ef2;
        ef2 = ef3;
        sum += ef2;
    }

    return(int) sum;
}







public static BigInteger fibonachi(int num){
    BigInteger a = BigInteger.valueOf(0);
    BigInteger b = BigInteger.valueOf(1);
    BigInteger c = BigInteger.valueOf(1);
    for(int j=2;j<=num;j++){
        c=a.add(b);
        a=b;
        b=c;

    }
    return a;

}
public static void main(String[]args){
    System.out.println(addFib((4000000)));
}

        public static boolean isPrime(long num) {
        if (num <= 1) {
            return false;
        }
        for (long i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main (String[]args){
            int number = 3;
            int ans = 0;
            int count = 1;
            while(count<10001){
                if(isPrime(number)){
                    count++;
                    ans=number;
                }
                number++;
            }
        System.out.println(ans);
    }
    public static int getAdj(String val1,int adjacent){
        int num=0;
        for(int i=0;i< val1.length();i++){
           val1+=val1.substring(i,i+adjacent);
           num = Integer.parseInt(val1);
        }
        return num;
    }
public static void main(String[] args){
    }
}
