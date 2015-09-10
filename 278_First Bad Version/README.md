# First Bad Version #

[https://leetcode.com/problems/first-bad-version/](https://leetcode.com/problems/first-bad-version/ "URL")

You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have `n` versions `[1, 2, ..., n]` and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API `bool isBadVersion(version)` which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

# 出现的问题 #
## 问题一 ##

异常：

	2126753390 versions, 1702766719 is the first bad version.

原因：
	
	int centerPos = (first + end) / 2;

	first + end 之后值太大，超出int类型限制

# 总结 #
-	在使用数字的时候，需要考虑0，Integet.max，等边界情况


