public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        
    int pointa = 0;
    int pointb = 0;
    List<Integer> answer = new ArrayList<>();
    
    for (int i = 0; i < 3; i ++){
        if(a.get(i) > b.get(i)) pointa += 1;
        if(a.get(i) < b.get(i)) pointb += 1;
     }
     answer.add(0, pointa);
     answer.add(1, pointb);
        
        
     return answer;
}
