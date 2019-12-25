# Code assignment Java developer
I think **Animal** should be Abstract Class. It's just a blue-print to define actions of animal.
So every Concrete Animal should extend Animal and define their own actions.
<br/>
Each action in Animal should be return String for easy testing. And return null if they don't have to do that action

<br/>
**1. Can you implement the sing() method for the bird?**
<br/>
a. How did you unit test it?<br/>
- Action should be return String or NULL(if animal can't do this action) for easy testing<br/>
b. How did you optimize the code for maintainability?<br/>
- Animal should be abstract class<br/>
- Concrete should implement their own action based on Animal blue-print<br/>


**2. Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you implement them to make their own special sound?**
<br/>
- Animal class has default method swim(). It will return NULL (default animal can't swim)<br/>
- Duck can swim. So Duck must Override a swim() method<br/>

**3. Now how would you model a rooster?**
<br/>
- Rooter has all of Chicken features. And He can Crow. So I will create interface AdultAction with crow() method.<br/>
- Rooster can Crow. So we need to implement AdultAction.<br/>

**4. Can you model a parrot? We are specifically interested in three parrots, one that lived in a house with dogs one in a house with cats, the other lived on a farm next to the rooster.**
<br/>
- Parrot can have friend or not. And His friend is any Animal. So Parrot need to have Animal friend property.<br/>
- His friend can or can not says. So we need to check if his friend can not says then he just say by their own language.<br/>