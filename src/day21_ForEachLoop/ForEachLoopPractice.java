package day21_ForEachLoop;

public class ForEachLoopPractice {
    public static void main(String[] args) {
        
        String[] words={"Java programming", "Cydeo School","Wooden Spoon","Early Birds", "Angry Birds"};
        for (String each : words) {
            System.out.println(each.charAt(0)+""+each.charAt(each.length()-1));
            
        }
        String anything="그녀가 사랑에 빠졌다";
        System.out.println(anything.charAt(0)+""+anything.charAt(anything.length()-1));
 }
}
