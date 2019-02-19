package xust;

/*
788. 旋转数字
 我们称一个数 X 为好数, 如果它的每位数字逐个地被旋转 180 度后，我们仍可以得到一个有效的，且和 X 不同的数。要求每位数字都要被旋转。
如果一个数的每位数字被旋转以后仍然还是一个数字， 则这个数是有效的。0, 1, 和 8 被旋转后仍然是它们自己；2 和 5 可以互相旋转成对方；
6 和 9 同理，除了这些以外其他的数字旋转以后都不再是有效的数字。
现在我们有一个正整数 N, 计算从 1 到 N 中有多少个数 X 是好数？

示例:
输入: 10
输出: 4
解释: 
在[1, 10]中有四个好数： 2, 5, 6, 9。
注意 1 和 10 不是好数, 因为他们在旋转之后不变。
注意:
N 的取值范围是 [1, 10000]。
 */
/*
 * 分析：
 * 当一个数为好数时，它的每位数字中至少有2,5,6,9中的一个，否则旋转以后会是本身，都必须是0,1,2,5,6,8,9中的一个。
 * count计数算出[1,N]中好数的个数。
 */
//public class Test_0219 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		int N = 10;
//		System.out.println(So.rotatedDigits(N));
//	}
//}
//class Solution {
//    public int rotatedDigits(int N) {
//    	int count = 0;
//        for(int i=1; i<=N; i++){
//        	if(isGoodnum(i))
//        		count++;
//        }
//        return count;
//    }
//    private boolean isGoodnum(int num){
//    	int flag = 0;
//    	while(num!=0){
//    		if(num %10==3 || num %10==4 || num %10==7)
//    			return false;
//    		if(flag == 0 && (num %10==2 || num %10==5 || num %10==6 || num %10==9))
//    			flag = 1;
//    		num = num/10;
//    	}
//    	return flag == 1;
//    }
//}
/*
796. 旋转字符串
给定两个字符串, A 和 B。A 的旋转操作就是将 A 最左边的字符移动到最右边。
 例如, 若 A = 'abcde'，在移动一次之后结果就是'bcdea' 。如果在若干次旋转操作之后，A 能变成B，那么返回True。

示例 1:
输入: A = 'abcde', B = 'cdeab'
输出: true

示例 2:
输入: A = 'abcde', B = 'abced'
输出: false
注意：
A 和 B 长度不超过 100。
 */
/*
 * 分析：
 * 当A的长度等于B的长度且A在B+B中时，说明A旋转操作后会得到B。
 */
//public class Test_0219 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		String A = "abcde";
//		String B = "abced";
//		System.out.println(So.rotateString(A, B));
//	}
//}
//class Solution {
//    public boolean rotateString(String A, String B) {    	
//        if(A.length() == B.length()){
//        	if(A.length() == 0)
//        		return true;
//        	B += B;
//        	for(int i=0; i<B.length(); i++){
//        		if(B.charAt(i) == A.charAt(0)){
//        			int k = i+1;
//        			for(int j=1; j<A.length() && k<B.length(); j++){
//        				if(A.charAt(j) != B.charAt(k))
//        					break;
//        				k++;
//        			}
//        			if(k == i+A.length())
//        				return true;
//        		}
//        	}
//        }
//        return false;
//    }
//}
/*
806. 写字符串需要的行数
我们要把给定的字符串 S 从左到右写到每一行上，每一行的最大宽度为100个单位，如果我们在写某个字母的时候会使这行超过了100 个单位，
那么我们应该把这个字母写到下一行。我们给定了一个数组 widths ，这个数组 widths[0] 代表 'a' 需要的单位， 
widths[1] 代表 'b' 需要的单位，...， widths[25] 代表 'z' 需要的单位。
现在回答两个问题：至少多少行能放下S，以及最后一行使用的宽度是多少个单位？将你的答案作为长度为2的整数列表返回。

示例 1:
输入: 
widths = [10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10]
S = "abcdefghijklmnopqrstuvwxyz"
输出: [3, 60]
解释: 
所有的字符拥有相同的占用单位10。所以书写所有的26个字母，
我们需要2个整行和占用60个单位的一行。

示例 2:
输入: 
widths = [4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10]
S = "bbbcccdddaaa"
输出: [2, 4]
解释: 
除去字母'a'所有的字符都是相同的单位10，并且字符串 "bbbcccdddaa" 将会覆盖 9 * 10 + 2 * 4 = 98 个单位.
最后一个字母 'a' 将会被写到第二行，因为第一行只剩下2个单位了。
所以，这个答案是2行，第二行有4个单位宽度。

注:
字符串 S 的长度在 [1, 1000] 的范围。
S 只包含小写字母。
widths 是长度为 26的数组。
widths[i] 值的范围在 [2, 10]。
 */
/*
 * 分析：
 * 创建数组res,长度为2,遍历字符串S，将此时字符所占的单位累加到res[1]中，累加过程中若res[1]超过或等于100，则需要换行，
 * 若res[1]等于100，res[0]加一，res[1]清零，若res[1]大于100，res[0]加一，res[1]为当前字符所占的单位（由于此行已写不上，因此要换行写），
 * 遍历完毕，若res[1]等于0，说明上一行刚好写完，最后一行应为100，将res[1]改为100，若res[1]不等于0，则还要加上此行，res[0]加一。
 */
public class Test_0219 {
	public static void main(String[] args) {
		Solution So = new Solution();
		int[] widths = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		String S = "bbbcccdddaaa";
		int[] res = So.numberOfLines(widths, S);
		System.out.println(res[0]+" "+res[1]);
	}
}
class Solution {
    public int[] numberOfLines(int[] widths, String S) {
    	int[] res = new int[2];
    	for(int i=0; i<S.length(); i++){
    		res[1] += widths[S.charAt(i)-97];
    		if(res[1] >= 100){
    			res[0]++;
    			res[1] = res[1]==100 ? 0 : widths[S.charAt(i)-97];
    		}
    	}
    	if(res[1] == 0){
    		res[1] = 100;
    	}
    	else{
    		res[0]++;
    	}
    	return res;
    }
}