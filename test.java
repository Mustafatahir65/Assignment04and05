public class test{
public test()
{
	agebasedhumanclassification(-1);
	agebasedhumanclassification(5);
	agebasedhumanclassification(16);
	agebasedhumanclassification(25);
	agebasedhumanclassification(90);
}
	public int agebasedhumanclassification(int age){ 
       if(age<0){ 
            System.out.print("age must me positive number");             
return 0; 
        } 
  
 else if(age >0&&age<=12) { 
            System.out.print("Child");             
return 0; 
        } 
        else if(age > 12 && age<=18){ 
            System.out.print("Adolescence");
             return 0; 
        }         
else if(age >= 19 && age<60){ 
            System.out.print("Adult");
             return 0; 
        }
         
else if(age > 60){ 
            System.out.print("Senior Adult");
             return 0; 
        }         
return 0;
    } 
 public static void main(String s[])  
    {  
        new test();  
	}
}