import java.util.*;
public class nwcm
{
    static void filler (int array[], int element)
    {
        //int n = array.size();
        for (int index = 0; index < array.length; index++)
        {
            array[index] = element;
        }
    }

    static void array_printer (int array[])
    {
        for (int index = 0; index < array.length; index++)
        {
            System.out.print(array[index] + ", ");
        }
        System.out.println();
    }

    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);

        int supply, demand;
        System.out.print("Enter the number of supply : ");
        supply = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the number of demand : ");
        demand = sc.nextInt();
        sc.nextLine();

        int supply_array[] = new int [supply];
        int demand_array[] = new int [demand];

        filler(supply_array, 0);
        filler(demand_array, 0);

        array_printer(supply_array);
        array_printer(demand_array);

        int matrix[supply][demand];

        int row_position = 0, col_position = 0;
        int current = matrix[row_position][col_position];
    }
}