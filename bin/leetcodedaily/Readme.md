# My DSA Journey

Hello there! 👋 I've embarked on a journey to master Data Structures and Algorithms (DSA) because many companies require a strong grasp of DSA before hiring. I'm determined to solve LeetCode daily problems to sharpen my skills. 

- Some days, I find the solutions easily.
- Some days, I struggle a bit.
- But one thing is for sure, I'm committed to giving my best effort every single day.

Let's embrace this challenge and make daily progress towards becoming a DSA expert! 💪📈


## Nov 2, 2023

- **Problem:** [Count Nodes Equal to Average of Subtree](https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree/description/)
- **Approach:** Parent needs child to calculate the average. So go deep to child which have no child return [child.value, 1] and come to parent add parents [parent.value,1 ] to array return by child and return the same array to the parent of this parent.
