# Code assignment Java developer
I think **Animal** should be Abstract Class. It's just a blue-print to define actions of animal.
So every Concrete Animal should extend Animal and define their own actions.
<br/>
Each action in Animal should be return String for easy testing. And return null if they don't have to do that action

<br/>
**1. Can you implement the sing() method for the bird?**
a. How did you unit test it?
- Action should be return String or NULL(if animal can't do this action) for easy testing
b. How did you optimize the code for maintainability?
- Animal should be abstract class
- Concrete should implement their own action based on Animal blue-print
