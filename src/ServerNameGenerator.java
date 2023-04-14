import util.Utils;
public class ServerNameGenerator {
    static String[] adjectives = {"Energetic",
            "Enchanting",
            "Majestic",
            "Vibrant",
            "Serene",
            "Radiant",
            "Luminous",
            "Intriguing",
            "Exquisite",
            "Alluring"};
    static String[] noun = {"Energetic",
            "Enchanting",
            "Majestic",
            "Vibrant",
            "Serene",
            "Radiant",
            "Luminous",
            "Intriguing",
            "Exquisite",
            "Alluring",
            "Elephant",
            "Sunset",
            "Guitar",
            "Ocean"};

    public static void main(String[] args) {
        System.out.printf("Here is your server name: %s-%s", getRandElement(noun), getRandElement(adjectives));
    }
    public static String getRandElement(String[] arr){
        Utils utils = new Utils();
        int randNum = utils.getRandomInt();
        return arr[randNum];
    }
}
