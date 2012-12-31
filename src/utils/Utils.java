package utils;

/**
 * User: shoubhik Date: 21/12/12 Time: 4:28 PM
 */
public class Utils {
    private Utils(){}

    public static String printArraySingleLine(int arr[]){
        StringBuilder sb = new StringBuilder();
        for(int i =0;i < arr.length;i++) sb.append(arr[i] + " ");
        return sb.toString();
    }

    public static String printArraySingleLineWithRotation(int arr[],
                                                          int startIdx,
                                                          int endIdx) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(i == startIdx)
                sb.append("| ");
            sb.append(arr[i] + " ");
            if(i == endIdx)
                sb.append("| ");

        }
        return sb.toString();

    }
}
