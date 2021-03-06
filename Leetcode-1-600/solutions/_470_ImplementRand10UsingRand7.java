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
public class _470_ImplementRand10UsingRand7 {

    /**
     * Given a function rand7 which generates a uniform random integer in the range 1 to 7,
     * write a function rand10 which generates a uniform random integer in the range 1 to 10.

     Do NOT use system's Math.random().

     Example 1:

     Input: 1
     Output: [7]
     Example 2:

     Input: 2
     Output: [8,4]
     Example 3:

     Input: 3
     Output: [8,1,10]

     * 拒绝采样Rejection Sampling
     * time : O(1)
     * space : O(1)
     * @return
     */
    public int rand10() {
        int res = 40;
        while (res >= 40) {
            res = 7 * (rand7() - 1) + rand7() - 1;
        }
        return res % 10 + 1;
    }

    private int rand7() {
        return 0;
    }
}
