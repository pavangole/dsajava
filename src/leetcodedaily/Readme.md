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
- **Problem:** [Build an Array With Stack Operations](https://leetcode.com/problems/build-an-array-with-stack-operations/description/)
- **Approach:** Size of Stack will be equal to size of array. Number given from 1 to n if number present in array push and increment number and array index otherwise push pop because we have push number that is comming
- **Code File:** [BuildArrayWithStackOp.java](BuildArrayWithStackOp.java)

## Nov 4, 2023

- **Problem:** [Last Moment Before All Ants Fall Out of a Plank](https://leetcode.com/problems/last-moment-before-all-ants-fall-out-of-a-plank/description/)
- **Approach:** Read the comment that collisions doesn't matter so I return the max among the two given arrays
- **Code File:** [AntsFalling.java](AntsFalling.java)

## Nov 5, 2023

- **Problem:** [Find the Winner of an Array Game](https://leetcode.com/problems/find-the-winner-of-an-array-game/description/)
- **Approach:** Not an optimal solution only beats 19% users.Used Hashmap to store the how many elements are smaller to right of the element in array.If we reach the end and don't get k then return the max element. As after some iterations max gonna come at zeroth position.
- **Code File:** [FindWinnerArray.java](FindWinnerArray.java)

## Nov 6, 2023

- **Problem:** [Seat Manager Reservation](https://leetcode.com/problems/seat-reservation-manager/)
- **Approach:** Use simply priority queue to store unreserved seats.
- **Code File:** [SeatReservation.java](SeatReservation.java)

## Nov 7, 2023

- **Problem:** [Eliminate Maximum Number of Monsters](https://leetcode.com/problems/eliminate-maximum-number-of-monsters/description/)
- **Approach:** The science which we learnt in 6th standard and polish it 10th standard helped to solve the problem. Give distance and speed what is remaining time.Speed = Distance / Time. Find Time sort it and kill the monsters.
- **Code File:** [EliminateMonster.java](EliminateMonster.java)
