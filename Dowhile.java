public class Dowhile{

    public static void main(String[] args) {
        String nim []= {"2","1","4","1","7","6","2","0","2","4"};        
        int i = 1;  
do{
    int j =i;
do{
    if (j == nim.length){
        break;
    }

    System.out.println(" ");
    j++;
    
}while (j <= (nim.length-1));
   int k = 0;

do{
    System.out.println(nim[i-1]);
     k++;
    }while(k <= (i*2) - 2);
    System.out.println(" ");
    i++;
    }while (i <= nim.length);

    }
}