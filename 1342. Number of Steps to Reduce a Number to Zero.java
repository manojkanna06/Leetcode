class Solution {
    public int numberOfSteps(int num) {
        int count=0;

        while(num!=0){ //for(;num!=0;){

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
//TC O(log n)  SC O(1)
/*PF: error 
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
  for-each loop, then you cannot directly use it for this problem.

A Java for-each loop is used to go through elements of an array/collection:

for (int x : arr) {
    System.out.println(x);
}
numberOfSteps(int num)

you have one integer, not an array or collection.

So this is not possible:

for (int x : num)   
num is not iterable
  */
