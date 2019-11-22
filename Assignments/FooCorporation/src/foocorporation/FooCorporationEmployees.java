
package foocorporation;

public class FooCorporationEmployees {
    String name;
    double BasePay;
    int HoursWorked;
    double total;

    public FooCorporationEmployees(String name, double BasePay, int HoursWorked) {
        this.name = name;
        this.BasePay = BasePay;
        this.HoursWorked = HoursWorked;
    }



    void totalPay(double BasePay, int HoursWorked)
    {
        if(HoursWorked<=40 && BasePay>=8.00)
        {
            total=HoursWorked*BasePay;
            System.out.println("Total pay is:"+total);
        }
        else if(HoursWorked>40 && HoursWorked<=60 && BasePay>=8.00)
        {

            total=(40*BasePay)+((HoursWorked-40) * 1.5);
            System.out.println("Total pay is:"+total);
        }
        else if(BasePay<8.00)
        {
            System.out.println("Base pay will not be less than 8.00");
        }
        else if(HoursWorked>60)
        {
            System.out.println("Hours Worked  will not be greater than 60");
        }
    }



}
