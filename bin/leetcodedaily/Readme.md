# My DSA Journey

Hello there! 👋 I've embarked on a journey to master Data Structures and Algorithms (DSA) because many companies require a strong grasp of DSA before hiring. I'm determined to solve LeetCode daily problems to sharpen my skills. 

- Some days, I find the solutions easily.
- Some days, I struggle a bit.
- But one thing is for sure, I'm committed to giving my best effort every single day.

Let's embrace this challenge and make daily progress towards becoming a DSA expert! 💪📈


## Nov 2, 2023

- **Problem:** [Count Nodes Equal to Average of Subtree](https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree/description/)
- **Approach:** Parent needs child to calculate the average. So go deep to child which have no child return [child.value, 1] and come to parent add parents [parent.value,1 ] to array return by child and return the same array to the parent of this parent.
- **Code File:** [CountNodeEaveSubtree.java](CountNodeEaveSubtree.java)

## Nov 3, 2023

- **Problem:** [Build an Array With Stack Operations
](https://leetcode.com/problems/build-an-array-with-stack-operations/description/)
- **Approach:** Stack size = Array Size. If  integer is present in  target push
If not present in target then push & pop.Increment arr pointer and stream of integers by 1 if push and only increase stream of integer by 1 if not present in target.
- **Code File:** [BuildArrayWithStackOp.java](BuildArrayWithStackOp.java)