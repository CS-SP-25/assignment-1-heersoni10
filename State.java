import java.text.DecimalFormat;

public class State {
    private String name;
    SalesTaxBehavior taxBehavior;


    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name =name;
    }

    public void showTax(Double value){
        double tax = taxBehavior.compute(value);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("The sales tax on $" + df.format(value) + " in " + name + " is $" + df.format(tax) + ".");
    }

}
