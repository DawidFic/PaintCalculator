import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    protected static int get_number_of_surfaces()
    {
        System.out.println("Enter number of Surfaces");
        return scanner.nextInt();
    }
    protected static double calculate_single_area()
    {
        System.out.println("Enter length of surface");
        double length_of_surface = scanner.nextFloat();
        System.out.println("Enter height of surface");
        double height_of_surface = scanner.nextFloat();

        return length_of_surface*height_of_surface;
    }
    protected static double calculate_total_area(ArrayList<Double> area_of_surface)
    {
        double total_area = 0;
        for (double i : area_of_surface)
        {
            total_area += i;
        }
        System.out.println("Total Area = "+total_area);
        return total_area;
    }
    protected static double calculate_number_of_paint_cans_required(double number_of_paint_cans_required)
    {
        if(number_of_paint_cans_required-((int)number_of_paint_cans_required)!=0)
        {
            number_of_paint_cans_required=((int)number_of_paint_cans_required+1);
            System.out.println("Total number of paint cans required = "+number_of_paint_cans_required);
        }
        else
        {
            System.out.println("Total number of paint cans required = "+number_of_paint_cans_required);
        }

        return number_of_paint_cans_required;
    }
    protected static void calc_total_cost(double number_of_cans_required, double cost_per_paint_can)
    {
        double total_cost = (number_of_cans_required*cost_per_paint_can);
        System.out.println("Total cost of paint = "+(Math.round(total_cost)));
    }

    public static void main(String[] args)
    {
        ArrayList<Double> area_of_surface = new ArrayList<>();

        int no_of_surfaces = get_number_of_surfaces();

        for(int i=0; i<no_of_surfaces; i++)
        {
            area_of_surface.add(calculate_single_area());
        }

        System.out.println("Enter paint coverage (m^2)");
        double paint_coverage = scanner.nextFloat();

        System.out.println("Enter cost per pain can");
        double cost_per_paint_can = scanner.nextFloat();

        calc_total_cost((calculate_number_of_paint_cans_required((calculate_total_area(area_of_surface)/paint_coverage))), cost_per_paint_can);
    }
}