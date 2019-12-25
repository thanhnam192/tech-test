# Code assignment Java developer
I think **Animal** should be Abstract Class. It's just a blue-print to define actions of animal.
So every Concrete Animal should extend Animal and define their own actions. <br/>
I think they must implement their own action because they have their **STYLE** to walk, sing... They are not same.<br/>
<br/>
Each action in Animal should be return String for easy testing. And return null if they don't have to do that action
<br/>
**A. Let’s start with the basics**
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

**B. Model fish as well as other swimming animals**
<br/>
**1. In addition to the birds, can you model a fish?**
<br/>
- Fish just extends Animal and implement actions they have.<br/>
**2. Can you specialize the fish as a Shark and as a Clownfish?**
<br/>
- Shark and Clownfish have characteristics feature. So I will create interface FisFeature and they can implement based on their feature<br/>

**3. Dolphins are not exactly fish, yet, they are good swimmers**
<br/>
- Dolphin is a mammal and have some fish characteristics. I think he must extends Animal and implement FisFeature.<br/>

**D. Model animals that change their behaviour over time**
<br/>
**1. Can you model a butterfly?**
<br/>
**2. Can you optimize your model to account for the metamorphosis from caterpillar to butterfly?**
<br/>
- Caterpillar must extends Animal and Butterfly extend Caterpillar.<br/>
- We can see that Butterfly have some feature of Caterpillar and he have some new feature because he's metamorphosis<br/>

**E. Counting animals**
<br/>
- I see Frog is not defined yet. So I will create a Frog class. He can Wald & Sing. <br/>
Animals can fly : 4 , they are : Bird , Duck , Parrot , Butterfly <br/>
Animals can walk : 8 , they are : Bird , Duck , Chicken , Rooster , Parrot , Frog , Dog , Cat  <br/>
Animals can sing : 8 , they are : Bird , Duck , Chicken , Rooster , Parrot , Frog , Dog , Cat  <br/>
Animals can swim : 5 , they are : Duck , Fish , Shark , Clownfish , Dolphin  <br/>

**BONUS**
<br/>
**1. Can you add a second language (if you know a language other than English) Use the
rooster as a PoC for demonstrating this. For example, this is how the Rooster sounds
differently depending on language. Please add the rooster sound in your native
tongue.**
<br/>
- I will add singCms for rooster.<br/>
- If we don't pass any param for rooster. He will sing by default language<br/>

**2. Can you design a RESTFUL API for querying these animals?**
<br/>
- I think we can query these animal by their type.<br/>
GET **/animal?type=dog**
<br/>
Then we can loop through the List Animal and get an Animal have type DOG <br/>






