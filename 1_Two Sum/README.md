# Two Sum #

[https://leetcode.com/problems/two-sum/](https://leetcode.com/problems/two-sum/ "Two Sum")

Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution.

Input: `numbers={2, 7, 11, 15}, target=9`
Output: index1=1, index2=2

# 思路 #
## 简单实现 ##
	
	numbers={2, 7, 11, 15}, target=26

	过程如下：

	2
		+ 7	= 26 ?
		+ 11 = 26 ?
		+ 15 = 26 ?

	7
		+ 11 = 26 ?
		+ 15 = 26 ?

	11
		+ 15 = 26 ？	等于并退出



## 优化 ##

# 出现的问题 #
## 问题一 ##

异常：


原因：
	


# 总结 #
-	第一次没有考虑到数组中


