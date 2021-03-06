package solutions;

/**
 * 本代码来自 Cspiration，由 @Cspiration 提供
 * 题目来源：http://leetcode.com
 * - Cspiration 致力于在 CS 领域内帮助中国人找到工作，让更多海外国人受益
 * - 现有课程：Leetcode Java 版本视频讲解（1-900题）（上）（中）（下）三部
 * - 算法基础知识（上）（下）两部；题型技巧讲解（上）（下）两部
 * - 节省刷题时间，效率提高2-3倍，初学者轻松一天10题，入门者轻松一天20题
 * - 讲师：Edward Shi
 * - 官方网站：https://cspiration.com
 * - 版权所有，转发请注明出处
 */
public class _389_FindtheDifference {
    /**
     * 389. Find the Difference
     * Given two strings s and t which consist of only lowercase letters.

     String t is generated by random shuffling string s and then add one more letter at a random position.

     Find the letter that was added in t
     Input:
     s = "abcd"
     t = "abcde"

     Output:
     e

     Explanation:
     'e' is the letter that was added.

     异或:  ^ (相同为零，不同为一)

     0 0 0
     0 1 1
     1 0 1
     1 1 0

     4 : 0100
     6 : 0110
         0010
     4 ：0100
         0110 ->6

     time: O(n);
     space: O(1);
     * @param s
     * @param t
     * @return
     */
    public char findTheDifference(String s, String t) {
        char c = t.charAt(t.length() - 1);
        for (int i = 0; i < s.length(); i++) {
            c ^= s.charAt(i);
            c ^= t.charAt(i);
        }
        return c;
    }
}
