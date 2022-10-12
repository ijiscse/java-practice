public class Sort{  
    static void bubbleSort(int[] arrr) {  
        int n = arrr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arrr[j-1] < arrr[j]){  
                                 //swap elements  
                                 temp = arrr[j-1];  
                                 arrr[j-1] = arrr[j];  
                                 arrr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
    public static void main(String[] args) {  
                int arr[] ={3,60,35,2,45,320,5,78,67};  
                 
                System.out.println("Array Before Bubble Sort");  
                for(int i=0; i < arr.length; i++){ 
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();
                System.out.println("array length:"+arr.length);
                 System.out.println();
                  
                bubbleSort(arr);//sorting array elements using bubble sort  
                 
                System.out.println("Array After Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");
                }  
   
        }  
}  