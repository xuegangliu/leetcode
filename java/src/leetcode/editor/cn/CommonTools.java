package leetcode.editor.cn;

/**
 * CommonTools
 * <p>
 * This is description
 * </p>
 *
 * @author xuegangliu 2019/10/25
 * @since 1.8
 **/
public class CommonTools {

    private final static StringBuilder sb=new StringBuilder();

    public static void arrayPring(int[] nums,int len){
        for (int i = 0; i < len; i++) {
            sb.append(nums[i]).append(" ");
        }
        System.out.println(sb.toString());
    }


}
