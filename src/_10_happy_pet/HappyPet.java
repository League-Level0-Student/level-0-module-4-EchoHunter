package _10_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String pet = JOptionPane.showInputDialog("What pet do you want, a rock, a dog, a platypus, or Barack Obama");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
if( pet .equals("Barack Obama") ) {
	JOptionPane.showMessageDialog(null, "No");
for (int i = 0; i < 100; i++) {
			
			
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do with your pet?", "Pet time", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "feed", "water", "walk","pet" ,"Vibe Check It" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
		System.out.println(task);
			if(task == (4)) {
				VIBECheck();
			break;
			}
			if(task == (3)) {
				HappinessNoise();
			}
			if(task == (2)) {
				EXERCISE();
			}
			if(task == (1)) {
				HappinessNoise();
			}
			if(task == (0)) {
				MUNCH();
			}
			
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if(happinessLevel == (15)) {
				JOptionPane.showMessageDialog(null, "Your pet became so happy they died");
				break;
			}
		}
	}
	}

	 // 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
static void HappinessNoise(){
happinessLevel++;
JOptionPane.showMessageDialog(null, "your pet makes a happy noise");
JOptionPane.showMessageDialog(null, "your happiness level increased to "+ happinessLevel);
}
static void MUNCH() {
	happinessLevel++;
	JOptionPane.showMessageDialog(null, "your pet commits MUNCH");
	JOptionPane.showMessageDialog(null, "your happiness level increased to "+ happinessLevel);
}
static void EXERCISE() {
	happinessLevel++;
	JOptionPane.showMessageDialog(null, "your pet moves 3 inches");
	JOptionPane.showMessageDialog(null, "your happiness level increased to "+ happinessLevel);
	
	
}

static void VIBECheck() {
	JOptionPane.showMessageDialog(null, "you're pet failed the VibeCheck");
}






}
