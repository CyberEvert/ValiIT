package dayfive;

import java.util.*;

public class Exercisesss {
    public static void main(String[] args) {

      //  findUniqueWords();
        // removeWovels();
       // quessTheNumber();


 /*       boolean isTrue = true;
        System.out.println(isTrue);
        //== - võrdub
   */     //!= - ei võrdu




    }

    private static void quessTheNumber() {
        Random ran = new Random();
        Set<Integer> uniqueNumbers = new HashSet<>();
        int attempts = 0;

        while (attempts < 5) {
            int r = ran.nextInt(50) + 1;
            System.out.println(r);
            uniqueNumbers.add(r);
            attempts++;
            {
                if (r == 1) {
                    System.out.println("õige arv: " + r);
                    break;
                } else {
                    System.out.println("arv: " + r);
                }
            }
        }
    }

    private static void removeWovels() {
        Set<Character> alphabet = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.add(c);
        }
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        alphabet.removeAll(vowels);

        System.out.println("Alphabet set without vowels: " + alphabet);
    }

    private static void findUniqueWords() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new sentence here: ");
        String sentence = sc.nextLine();
        System.out.println(sentence);

        String[] words = sentence.split("\\s+");
        System.out.println(Arrays.toString(words));

        Set<String> wordSet = new HashSet<>(Arrays.asList(words));
        wordSet.retainAll(Arrays.asList(words));
        System.out.println("set" + wordSet);
    }
}