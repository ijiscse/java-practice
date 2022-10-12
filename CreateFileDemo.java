import java.io.*; 
  
public class CreateFileDemo 
{ 
    public static void main(String[] args) 
    { 
        File file = new File("C:\\file.txt"); 
          
        if(file.delete()) 
        { 
            System.out.println("File deleted successfully"); 
        } 
        else
        { 
            System.out.println("Failed to delete the file"); 
        } 
    } 
} 