
package runningerrands.view;
/**
 *
 * @author brittanyhuntington
 */
public class CheckGasTankView extends View {

   CheckGasTankView() {
        super ( "\n"
        + "*********************************************************************************\n"
        + "Check Gas Tank\n"
        + "*********************************************************************************\n"
        + "C - Check how much gas is in tank\n"
        + "G - Check how many gallons the tank can hold\n"
        + "H - How to obtain more gas\n"
        + "Q - Quit \n"    
        + "*********************************************************************************\n");
   }
  @Override
  
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch(choice) {
            
            case "C": 
                this.checkGasInTank();
                break;
            case "G":
                this.checkGallonsAllowed();
                break;
            case "H": 
                this.displayGettingGas();
                break;
            default:
                System.out.println("Invalid Selection. Try Again.");
                break;
      
        }
        return false; 
        
}
private void checkGasInTank() {
       System.out.println("Check Gas In Tank stub function called");
    } 
private void checkGallonsAllowed() {
       System.out.println("Check Gallons Allowed stub function called");
    } 
private void displayGettingGas() {
       System.out.println("Display Getting Gas stub function called");
    } 

}
