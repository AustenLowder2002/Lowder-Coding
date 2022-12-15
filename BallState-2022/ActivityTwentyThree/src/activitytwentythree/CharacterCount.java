package activitytwentythree;

public class CharacterCount {
    int count = 0;
    Character[] array = {'a','b','a'};
    public CharacterCount(){
        for(int i = 0; i <array.length; i ++){
            System.out.println(array[i]);
            if( array[i] == 'a'){
                ++count;

            }
        }
        System.out.println("There are " + count + " matching characters");
    }
}
