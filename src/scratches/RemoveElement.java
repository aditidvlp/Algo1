package scratches;

class RemoveElement {

    int count = 0;
    int i;

    public int removeElement(int[] nums, int val) {

        int x = val;
        int flag = 0;
        for(i = 0; i < nums.length; i++){

            if (nums[i] == x){
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if (flag == 1){
            System.out.println("We found the element");

        }
        else {
            nums[count] = nums[i];
            count++;
            count++;

        }
        return count;
    }

}





 
