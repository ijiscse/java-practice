import java.util.*;
class TwoD{
	public static void main(String[]args){
		try{

Scanner mn= new Scanner(System.in);
System.out.println("enter the row of matrix:");
int a=mn.nextInt();
System.out.println("enter the column of matrix:");
int b=mn.nextInt();
int arr[][]=new int[a][b];
for(int i=0;i<a;i++){
for(int j=0;j<b;j++){
	arr[i][j]=(int)mn.nextInt();
	//System.out.print(arr[i][j]+"  ");
}






}
System.out.println("here is the array:");
for(int i=0;i<a;i++){
for(int j=0;j<b;j++){
	//arr[i][j]=(int)mn.nextInt();
	
	System.out.print(arr[i][j]+"  ");
}

	System.out.println();
	System.out.println();
}




	}
	catch(ArrayStoreException e){
		System.out.println("mathecal error");
	}
}
}