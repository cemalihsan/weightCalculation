import java.util.ArrayList;
import java.util.Scanner;

public class weightCalculation {

    private static <Integer> ArrayList<Integer> removeDuplicate(ArrayList<Integer> arrayList){  //removing duplicates from the list 

            ArrayList<Integer> nonDupArray = new ArrayList<Integer>();

            for(int i = 0; i < arrayList.size(); i++){
                if(!nonDupArray.contains(arrayList.get(i))){
                    nonDupArray.add(arrayList.get(i));
                }
            }
            return nonDupArray;
    }

    public static void main(String[] args){

        ArrayList<Integer> temp = new ArrayList<Integer>();
        ArrayList<Integer> resultArray;
        ArrayList<Integer> weightArray = new ArrayList<Integer>();
        System.out.println("Please enter 2 numbers!!!\n");
        Scanner input = new Scanner(System.in);			
        int balancedSub = 0, rightSub = 0, leftSub = 0, totalSub = 0;

        for(int i = 0; i < 2; i++){

            System.out.println("Number " + (i+1) + ":");
            int value = input.nextInt();// Input from user
            weightArray.add(value); //Added input to an array list
        }
        System.out.println("----------------Output----------------");

        leftSub = weightArray.get(0);
        temp.add(leftSub);

        rightSub = weightArray.get(1);
        temp.add(rightSub);

        totalSub = weightArray.get(0) + weightArray.get(1);
        temp.add(totalSub);

		//checking for which side is bigger than the other
        if (weightArray.get(0) < weightArray.get(1)) {
            balancedSub = weightArray.get(1) - weightArray.get(0);
            temp.add(balancedSub);
            // System.out.println(balancedSub);
        } else if (weightArray.get(0) > weightArray.get(1)) {
            balancedSub = weightArray.get(0) - weightArray.get(1);
            temp.add(balancedSub);
            // System.out.println(balancedSub);
        } else {
            balancedSub = 0;
            //System.out.println(balancedSub);
            temp.add(balancedSub);
        }

       /* for(int i=0; i< temp.size(); i++){
            System.out.println(temp.get(i));
        }*/

        resultArray = removeDuplicate(temp);

        System.out.println("Calculation of Weights: " + resultArray);

    }
}
