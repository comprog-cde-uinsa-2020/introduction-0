
public class LibFib {
 
    int n1=0,n2=1,n3=0;
 
    public void printFibonacci(int count){  
    
        if(count>0){  
            n3 = n1 + n2;  
            n1 = n2;  
            n2 = n3;  
            System.out.print(" "+n3); 
            printFibonacci(count-1);  
        }  
    }  
}

