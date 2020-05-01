package Task_6;

import util.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DynamicCalculator {
    private Knapsack knapsack = new Knapsack();
    private Item[] availableItems;
    private int[] values;
    private int[] weights;

    public void initialise() {

        try(BufferedReader reader = Input.getReader()) {
            System.out.println( "Введите грузоподьемность рюкзака:" );
            int capacityOfKnapsack = Integer.parseInt( reader.readLine() );
            knapsack.setCapacity( capacityOfKnapsack );
            System.out.println( "Введите доступное число вещей:" );
            int numberOfThings = Integer.parseInt( reader.readLine() );
            availableItems = new Item[ numberOfThings ];
            values =  new int[ numberOfThings ];
            weights =  new int[ numberOfThings ];
                for (int i = 0; i < numberOfThings; i++) {
                    System.out.println( "Введите вес вещи " + i );
                    int weight = Integer.parseInt( reader.readLine() );
                    weights[ i ] = weight;
                    System.out.println( "Введите ценность вещи " + i );
                    int value = Integer.parseInt( reader.readLine() );
                    values[ i ] = value;
                Item item = new Item( weight, value );
                availableItems[ i ] = item;

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void fillKnapsackAndPrintValue(){
        int maximisedValue = knapsackDP( weights, values, availableItems.length, knapsack.getCapacity() );
        System.out.println("Максимальная возможная общая ценность вещей для данного рюкзака: "+maximisedValue);
    }
    public int knapsackDP ( int[] totalWeights, int[] totalValues, int itemNum, int maxWeight){
            if (itemNum <= 0 || maxWeight <= 0) {
                return 0;
            }

            int[][] matrix = new int[ itemNum + 1 ][ maxWeight + 1 ];
            for (int j = 0; j <= maxWeight; j++) {
                matrix[ 0 ][ j ] = 0;
            }

            for (int i = 1; i <= itemNum; i++) {
                for (int j = 1; j <= maxWeight; j++) {
                    if (totalWeights[ i - 1 ] > j) {
                        matrix[ i ][ j ] = matrix[ i - 1 ][ j ];
                    } else {
                        matrix[ i ][ j ] = Math.max(
                                matrix[ i - 1 ][ j ],
                                matrix[ i - 1 ][ j - totalWeights[ i - 1 ] ] + totalValues[ i - 1 ] );
                    }
                }
            }
            return matrix[ itemNum ][ maxWeight ];
        }

}
