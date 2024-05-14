class AbsoluteDiff {
    public int differenceOfSum(int[] nums) {
        int esum = 0;
        int dsum = 0;

        for(int i=0; i<nums.length; i++){
            int a = nums[i];
            esum += a;

            while(a > 0){
                dsum += a%10;
                a /= 10;
            }
        }
        return Math.abs(dsum-esum);
    }
}
