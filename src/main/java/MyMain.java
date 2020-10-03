public class MyMain {

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        int trials = 10000;
        int exp = 0;
        for (int i = 0; i < trials; i++) {
            boolean success = false;
            for (int roll = 0; roll < 6; roll++){
                if ((int)(Math.random() * 6) + 1 == 1) {
                    success = true;
                }
            }
            if (success) {
                exp++;
            }
        }
        return (double)exp/100;
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int trials = 10000;
        int exp = 0;
        for (int i = 0; i < trials; i++){
            int sum = 0;
            for (int roll = 0; roll < 12; roll++){
                if ((int)(Math.random() * 6) + 1 == 1){
                    sum++;
                }
            }
            if (sum >= 2){
                exp++;
            }
        }
        return (double)exp/100;
    }

    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        int trials = 10000;
        int exp = 0;
        for (int i = 0; i < trials; i++){
            int sum = 0;
            for (int roll = 0; roll < 18; roll++){
                if ((int)(Math.random() * 6) + 1 == 1){
                    sum++;
                }
            }
            if (sum >= 3){
                exp++;
            }
        }
        return (double)exp/100;
    }


    public static void main(String[] args) {
        System.out.println(probabilityOneSix());
        System.out.println(probabilityTwoSixes());
        System.out.println(probabilityThreeSixes());
    }
}
