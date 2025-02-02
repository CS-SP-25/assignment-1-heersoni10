public class NoTax implements SalesTaxBehavior{

    @Override
    public Double compute(Double value) {
        return 0.0; //zero tax or no tax
    }
}
