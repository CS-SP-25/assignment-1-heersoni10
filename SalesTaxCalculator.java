public class SalesTaxCalculator {
    public static void main(String[] args) {
        if (args.length != 2) { // Check if the correct number of arguments is provided
            System.out.println("java SalesTaxCalculator <State> <SaleAmount>");
            return;
        }

        String stateName = args[0];// Get the state name from command-line arguments
        double saleAmount;

        try {
            saleAmount = Double.parseDouble(args[1]); // Converting sale amount argument to a double
        } catch (NumberFormatException e) {
            System.out.println("Error: Sale amount must be a numeric value.");
            return;//exit
        }

        // Determine the correct state object
        State state = null;
        if (stateName.equalsIgnoreCase("Alaska")) {
            state = new Alaska(); //assign Alaska
        } else if (stateName.equalsIgnoreCase("Indiana")) {
            state = new Indiana(); //assign Indiana
        }
        else if (stateName.equalsIgnoreCase("Hawaii")) {
            state = new Hawaii(); }//assign Hawaii
        else {
            System.out.println("Error: Invalid state. Use 'Alaska' or 'Indiana'.");
            return; //exit if state is not recognized
        }
        state.showTax(saleAmount);
        // Call the showTax method to compute and display the sales tax

    }
}
