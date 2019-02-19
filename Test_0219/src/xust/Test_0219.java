package xust;

/*
788. ��ת����
 ���ǳ�һ���� X Ϊ����, �������ÿλ��������ر���ת 180 �Ⱥ������Կ��Եõ�һ����Ч�ģ��Һ� X ��ͬ������Ҫ��ÿλ���ֶ�Ҫ����ת��
���һ������ÿλ���ֱ���ת�Ժ���Ȼ����һ�����֣� �����������Ч�ġ�0, 1, �� 8 ����ת����Ȼ�������Լ���2 �� 5 ���Ի�����ת�ɶԷ���
6 �� 9 ͬ��������Щ����������������ת�Ժ󶼲�������Ч�����֡�
����������һ�������� N, ����� 1 �� N ���ж��ٸ��� X �Ǻ�����

ʾ��:
����: 10
���: 4
����: 
��[1, 10]�����ĸ������� 2, 5, 6, 9��
ע�� 1 �� 10 ���Ǻ���, ��Ϊ��������ת֮�󲻱䡣
ע��:
N ��ȡֵ��Χ�� [1, 10000]��
 */
/*
 * ������
 * ��һ����Ϊ����ʱ������ÿλ������������2,5,6,9�е�һ����������ת�Ժ���Ǳ�����������0,1,2,5,6,8,9�е�һ����
 * count�������[1,N]�к����ĸ�����
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
796. ��ת�ַ���
���������ַ���, A �� B��A ����ת�������ǽ� A ����ߵ��ַ��ƶ������ұߡ�
 ����, �� A = 'abcde'�����ƶ�һ��֮��������'bcdea' ����������ɴ���ת����֮��A �ܱ��B����ô����True��

ʾ�� 1:
����: A = 'abcde', B = 'cdeab'
���: true

ʾ�� 2:
����: A = 'abcde', B = 'abced'
���: false
ע�⣺
A �� B ���Ȳ����� 100��
 */
/*
 * ������
 * ��A�ĳ��ȵ���B�ĳ�����A��B+B��ʱ��˵��A��ת�������õ�B��
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
806. д�ַ�����Ҫ������
����Ҫ�Ѹ������ַ��� S ������д��ÿһ���ϣ�ÿһ�е������Ϊ100����λ�����������дĳ����ĸ��ʱ���ʹ���г�����100 ����λ��
��ô����Ӧ�ð������ĸд����һ�С����Ǹ�����һ������ widths ��������� widths[0] ���� 'a' ��Ҫ�ĵ�λ�� 
widths[1] ���� 'b' ��Ҫ�ĵ�λ��...�� widths[25] ���� 'z' ��Ҫ�ĵ�λ��
���ڻش��������⣺���ٶ������ܷ���S���Լ����һ��ʹ�õĿ���Ƕ��ٸ���λ������Ĵ���Ϊ����Ϊ2�������б��ء�

ʾ�� 1:
����: 
widths = [10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10]
S = "abcdefghijklmnopqrstuvwxyz"
���: [3, 60]
����: 
���е��ַ�ӵ����ͬ��ռ�õ�λ10��������д���е�26����ĸ��
������Ҫ2�����к�ռ��60����λ��һ�С�

ʾ�� 2:
����: 
widths = [4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10]
S = "bbbcccdddaaa"
���: [2, 4]
����: 
��ȥ��ĸ'a'���е��ַ�������ͬ�ĵ�λ10�������ַ��� "bbbcccdddaa" ���Ḳ�� 9 * 10 + 2 * 4 = 98 ����λ.
���һ����ĸ 'a' ���ᱻд���ڶ��У���Ϊ��һ��ֻʣ��2����λ�ˡ�
���ԣ��������2�У��ڶ�����4����λ��ȡ�

ע:
�ַ��� S �ĳ����� [1, 1000] �ķ�Χ��
S ֻ����Сд��ĸ��
widths �ǳ���Ϊ 26�����顣
widths[i] ֵ�ķ�Χ�� [2, 10]��
 */
/*
 * ������
 * ��������res,����Ϊ2,�����ַ���S������ʱ�ַ���ռ�ĵ�λ�ۼӵ�res[1]�У��ۼӹ�������res[1]���������100������Ҫ���У�
 * ��res[1]����100��res[0]��һ��res[1]���㣬��res[1]����100��res[0]��һ��res[1]Ϊ��ǰ�ַ���ռ�ĵ�λ�����ڴ�����д���ϣ����Ҫ����д����
 * ������ϣ���res[1]����0��˵����һ�иպ�д�꣬���һ��ӦΪ100����res[1]��Ϊ100����res[1]������0����Ҫ���ϴ��У�res[0]��һ��
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