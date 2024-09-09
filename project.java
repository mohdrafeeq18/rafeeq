package project;
import java.util.Scanner;
public class project {

	public static void main(String[] args) {
		System.out.println("Hello This is pizza hut ");
        System.out.println("how many pizza do you like to have?");
        Scanner em=new Scanner(System.in);
        int n=em.nextInt();
        System.out.println("How many veg pizza do you need?");
        int numveg=em.nextInt();
        System.out.println("How many non veg pizza do you need?");
        int numnonveg=em.nextInt();
        pizza[] basic=new pizza[n];
        System.out.println("1.Extra cheese\n2.Pepperoni\n3.Fresh garlic\n4.Black olives\n5.Green pepper\nplease type the number(if no please enter 0):");
        for(int i=0;i<n;i++)
        {
            System.out.println("-----------------------------------------------------");
            System.out.println("Do you like to add more toppings  for pizza "+(i+1));
            
            Scanner in2=new Scanner(System.in);
            int topping=in2.nextInt();
            
            basic[i]=new pizza(numveg,numnonveg);
            basic[i].set_toppings(topping);
         }
        
        for(int i=0;i<n;i++)
        {
            basic[i].display();
           
        }
        pizza.total();
    }
}
class pizza
{   
    static int veg=0;

	static int	non=0;
    
    int price=0;
    pizza(int typeveg,int typenon)
    {
    	veg=typeveg;
    	non=typenon;
    	price=typeveg*250;
        price=typenon*300;
    }
    public void set_toppings(int toppings)
    {
        switch(toppings)
        {
            case 1:
                price+=150;
                break;
            case 2:
                price+=125;
                break;
            case 3:
                price+=140;
                break;
            case 4:
                price+=190;
                break;
            case 5:
                price+=160;
                break;
            case 0:
                price+=0;
                break;
            default:
                System.out.println("Please enter a valid input");
                break;
        }
    }
    static int sum=0;
    public void display()
    {     
        sum+=price;
    }
    public static void total()
    {
    	System.out.println("**************************************************************************");
    	System.out.println("                               BILL                               ");
    	
    	System.out.println("Veg pizza     * "+veg +"   =   $"+ (veg*250));
    	
    	System.out.println("Non veg pizza * "+non+"   =   $"+(non*300));
    	double gst=sum*.25;
    	
    	System.out.println("GST   =   $"+gst);
    	double total =sum+gst;
    	System.out.println("Total :  =   $"+total);
    	
    	
    	
    }


}


