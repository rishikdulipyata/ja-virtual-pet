import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int select;

        Scanner input = new Scanner(System.in);
        System.out.println("Greetings, young one... welcome to the world. By what name shall your friends call you?");
        String petName = input.nextLine();

        PetNeeds pet = new PetNeeds(petName);
        
        birthMenu(pet);
    }

    public static void birthMenu (PetNeeds newPet) {
        System.out.println(
            "It's a pleasure to meet you, " + newPet.getName() + "! I hope you will care for yourself during your time in this place...\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" 
        );

    }
}
