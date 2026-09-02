import java.util.*;


public class NumbersArray {
    public static void main(String[] args) {
        Integer[] input = {1,2,3,4,1,5};

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input)));       
        
        System.out.println();

        input = new Integer[] {1,2,3,4,1,2,5,3};

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input))); 
    }

    // Write your methods here
    public static int findMax(Integer[] input){
        //if array is not sorted
        if(input == null || input.length == 0){
            return 0;
        }
        int biggest = input[0];
        for (int num : input){
            if(num > biggest){
                biggest = num;
            }
        }
        return biggest;
    }


    public static int[] findDuplicates(Integer[] input){
        //if invalid input
        if(input == null || input.length == 0){
            return null;
        }

        //track current array
        ArrayList<Integer> seen = new ArrayList<>();
        ArrayList<Integer> output = new ArrayList<>();

        //look through array for each element and check if there's a dupe
        for (int num : input){
            if(seen.contains(num)){
                output.add(num);
            }
            if(!seen.contains(num)){
                seen.add(num);
            }
        }

        int[] output2 = output.stream().mapToInt(Integer::intValue).toArray();
        return output2;

    }

    public static int[] findUnique(Integer[] input){
        //if invalid input
        if(input == null || input.length == 0){
            return null;
        }

        //track current array
        ArrayList<Integer> seen = new ArrayList<>();
        ArrayList<Integer> dupe = new ArrayList<>();
        ArrayList<Integer> output = new ArrayList<>();

        //look through array for each element and check if there's a dupe
        for (int num : input){
            if(seen.contains(num)){
                dupe.add(num);
            }
            if(!seen.contains(num)){
                seen.add(num);
            }
        }
        
        for (int num : input){
            if(!dupe.contains(num)){
                output.add(num);
            }
            
        }



        int[] output2 = output.stream().mapToInt(Integer::intValue).toArray();
        return output2;

    }


}
    
