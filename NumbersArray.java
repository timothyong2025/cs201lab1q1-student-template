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


    public static Integer[] findDuplicates(Integer[] input){
        //if invalid input
        if(input == null || input.length == 0){
            return null;
        }

        //track current array
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new LinkedHashSet<>();

        //look through array for each element and check if there's a dupe
        for (int num : input){
            if(!seen.add(num)){
                duplicates.add(num);
            }
        }

        return duplicates.toArray(new Integer[0]); 

    }

    public static Integer[] findUnique(Integer[] input){
        //if invalid input
        if(input == null || input.length == 0){
            return null;
        }

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : input){
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        
        ArrayList<Integer> output = new ArrayList<>();
        for (int num : input){
            if(!duplicates.contains(num)){
                output.add(num);
            }
        }
        //if this works im genuinely goijg  tyo lose my mind
        return output.toArray(new Integer[0]);


    }

    
}



    
