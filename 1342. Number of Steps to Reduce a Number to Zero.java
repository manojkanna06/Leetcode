class Solution {
    public int numberOfSteps(int num) {
        int count=0;

        while(num!=0){

            if(num%2==0){
                num=num/2;
                count++;
            }

            else{
                num=num-1;
                count++;
            }
        }
        //System.out.println(count);
        return count;
    }
}
/* error 
  class Solution {
    public int numberOfSteps(int num) {
        int count=0;

        while(num!=0){

            if(num%2==0){
                num=num/2;
                count++;
            }

            else{
                num=num-1;
                count++;
            }
        }
        System.out.println(count);
    }
}
error:compile error due to no return statement 
  as numberOfSteps(method) declared as int ,it should return int
  println() only prints the value. It does not return it.
  */
