public static long aVeryBigSum(List<Long> ar) {

    long sum= 0;// intitilazing sum variable that store long sum
    for(int i=0;i<ar.size();i++){
        sum+=ar.get(i);
    }
    return sum;
    }
