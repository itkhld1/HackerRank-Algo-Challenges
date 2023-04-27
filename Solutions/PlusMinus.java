 public static void plusMinus(List<Integer> arr) {
    
    float positive = 0;
    float negative = 0;
    float zero = 0;
    
   //TWO SOLUTIONS 
   
    /* for (int i = 0; i<arr.size(); i++){
        if (arr.get(i) > 0){
            positive += 1;
        }
        else if (arr.get(i) < 0){
            negative += 1;
        }
        else if (arr.get(i) == 0){
            zero += 1;
        }
    }
    positive = positive / arr.size();
    negative = negative / arr.size();
    zero = zero / arr.size();
    
    System.out.println(positive);
    System.out.println(negative);
    System.out.println(zero);
    } */
    
    for (int num : arr){
        if (num > 0){
            positive++;
        }
        else if (num < 0){
            negative++;
        }
        else {
            zero++;
        }
    }
    System.out.printf("%.6f\n", (double) positive / arr.size());
    System.out.printf("%.6f\n", (double) negative / arr.size());
    System.out.printf("%.6f\n", (double) zero / arr.size());
    
} 
