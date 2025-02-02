public class Alaska extends State{

    public Alaska(){
       super.setName("Alaska");
        super.taxBehavior = new NoTax(); //there is no tax
    }
    //calling super to initailize the name and tax %


}
