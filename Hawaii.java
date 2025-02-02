public class Hawaii extends State{
    public Hawaii (){

        super.setName("Hawaii");
        super.taxBehavior = new fourPointFivePercent(); //tax is 4.5%

        //calling super to initailize the name and tax %

    }
}
