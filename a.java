import java.util.Scanner;
import java.util.Arrays;

class MostFreq {
private static void mostFreq3(int a[], int n, int b[]) {

int count=1,k=0;
  int temp[]=new int[n];
  int index[]=new int[10000];  
  Arrays.sort(a);
    for(int i=1;i<n;i++)
    {
      if(a[i]==a[i-1])
      {
        count++;
		//System.out.println(temp[k]+" "+index[count]);          
        if(i==n-1)
        {
           temp[k]=count;
           index[count]=i-1;
         // System.out.println("last"+temp[k]+" "+index[count]);          
		  count=1;
           
        
        }
      }
      else
      {
        temp[k]=count;
        index[count]=i-1;
        //System.out.println(temp[k]+" "+index[count]);          
		count=1;
        k++;
        if(i==n-1)
        {
          temp[k]=1;
          index[count]=i;
          count=1;
         // System.out.println("last"+temp[k]+" "+index[count]);          
        }  
        
      }
    }
  
    Arrays.sort(temp);
	
	 
     b[0]=a[index[temp[n-1]]];
     b[1]=a[index[temp[n-2]]];
     b[2]=a[index[temp[n-3]]];
    



}

public static void main(String[] args) {
	int n;
	int b[] = new int[3];
	int i=0;

	Scanner scan = new Scanner(System.in);
	n = scan.nextInt();
	int a[] = new int[n];
	for(i=0;i<n;i++) 
		a[i] = scan.nextInt();

	mostFreq3(a,n,b);

	for(i=0;i<3;i++)
		System.out.print(b[i] + " ");
}
}
