package leetcodedaily;

public class NuofLaserBeams {
    public static void main(String[] args) {
        String[] bank = new String[] {"011001","000000","010100","001000"};
        System.out.println(numberOfBeams(bank));
    }

    static int numberOfBeams(String[] bank) {
        int[] arr = new int[bank.length];
        int arrindex = 0;
        for(int i = 0; i < bank.length ; i++) {
            int count = 0;
            for(int j = 0; j < bank[0].length() ; j++) {
                if(bank[i].charAt(j) == '1') {
                    count++;
                }
            }
            if(count != 0) {
                arr[arrindex] = count;
                arrindex++;
            }
        }
        int result = 0;
        if(arrindex == 0) {
            return 0;
        }
        for(int i = 0; i < arrindex - 1; i++) {
            result = result + (arr[i] * arr[i + 1]);
        }

        return result;
    }


}
