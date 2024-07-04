package Notes;

JAVA


--Selenum latest version-4.21
Pre- requestsites
==HTML Basics
==Loactors
==Core java

- What are the challenge to manual testing
=Retesting
=Regression   

- Wjat is object based programming language(Javascript, VB)
=object
=class

- What is OO programming language (c++, java, C#, Python)
= object, class, polymorphism, inharitance, abstraction, encapsulation

-Java features
=pateform independent
=case sensitive

-Java Components
=JDK (Java development  kit)
=JRE (JAva Runtime environment)
=JVM (java virtual Machine)

-Enviroment Setup
=JDK/Java
=IDE (Eclipse, IntelliJ)

- Java Verision
=Java8 - Sun microsystem
=Java 9 -oracle
=java 11 (latest version)

-once intallation done, will set the path
-Install the eclipse 

1. Create a new java project (file-> New-> Java Project)
2. Create new java package( right click on src-> new-> package)
3. Create a new class(right click on package-> new-> class)


Control statments

Type of data type
=primetive data type
=dynamic data type


Sorting an d searching
-------------------------

-Linear search(seach the element)
-find largest number
-find missing element
-find loast number


String methods
------------------
length()- returns length of the srting(number of srting)
cancat()-joining the strings (s1.cancate(s2))
trim()- remove spaces right and left side (s="    welcome   ")//s.trim()
charAt()- return a character form a string based on index
contains()- returns true/false case-sensitive
equals()- case sensitive 
equalsIgnorecase()- ignore case sensitivity
replace()- replace single or multiple  sequence of charecter in a string [ s.replace('e','X')] or [s.replace("selenium","playweight")]
substing()- extract substring from the main string [ starting index -index number, ending index-index+1]
(s.substring(1,5)) String- selenium // elen
toUpperCase()- convert to uppercase
to LowerCase()- convert tp lowercase
split()- spilt the string into multiple part based on delimeter or separater [String a[]=s.split("@")]// return the array 
StingBuffer()- immutable
StringBuffer s= new StringBuffer("Selenium")

StringBuilder
-------------------------
String immutable- not changeable
Stringbuilder and buffer mutable- changeable

------------
Sting comparision
-----------
1. == (to compare the object) 
equals() (to compare values of the object)
2. string s="welcom"
String s = new String()

--------------------
Program
------------
1. Palindrom or not
2. remove junk or special characters in string
3. remove the whilte spaces in a string
4. count occurence of the charecter in a string
5. count words in a string


----------------
void print(){
sop(sid+name+grad)
}
void setData(int id, String name,char gr){
sid=id;
sname=name;
grad=gr;
}

Studetent stu=new Student();
stu.setData(101,"Neha",'A');
stu.print();
------------
In polymorphism:-Method overloading(same method name with difftent number of parameters)
rules for mathod overloading
-method name should ne same
-number pf parameter should be diffrent
-Data type of parameters should be different (if number of parameters are same)
-Order of the parameters should be different (if number of parameters are same)

--------------------
Encapsulation:-
-All variables should be private
-for every variable there should be 2 method(get&set)
-Variables can be operated only through method

- we can overload the main() method in java

----------------------
this  keywords

-class variables
-local variables

------------------
Static

Static variable and methods
-Static method and variable can call directly without creating any object
-Static methods access non static methods though object.
-Non ststic method can access everything directly

------------------
Inharitance
-reusablility
-avoid duplicationk

Type of inheritance using keyword extends
--------
-single
-multi level
-heraichy
-

Inhertance-MethodOverriding
Same method with different functionlity or change the functionality of the perentclass method with same parameter representation

Diffrenace b/w method overloading and method overriding
MethodOverriding-
-possible in only in multiple classes
- we should not change the signature of the method but body we should change
-method name are same
-blegons to inheritance

MethodOverloading-
-possible in single and multiple classes(inhertance)
-we should change thesignature of the method(perameters)
-method name are same
-belogss to polymorphisim


final-
variables, methods,class
-Veriable- we canot change the value of the variable( constant)
-Method-we cannot overrider those methods in child classes
-class- we cannot extends the class

super- part of overriding concept 
-super keywork will be to invoke immediate parent class variable.
-super keywork will be to invoke immediate parent class method.


Wrapper classes
--------------------
every primitive type (int, char,double, flote, boolean,short) and pre-define class that is call wrapper classes


Scenario 1- int, double,boolean, char --->' String"

Interger.parseInt(String)

Scenario 2. String to ----> int double boolean char

String.valueof(variable)


Packeges
------------

Userdefine packeges

build in packeges

Access modifier
--------------
public
protected
default
private

Exception Handling
---------------------
Exception is an event which will cause program termination

Errors are develoer mistakes 
------
1. syntax
2. logical

Exception is user mistake 

Types of exceptions
----------------------
1. Checked exceptions
the exceptions which are are identified by java compiler eg. interuptedexeptions, fileNot Find, IOEx

2. Un- checked exceptions
like- 
ArithmeticalException
ArrayIndexOutOfBoundException
NumberFormatException
NullPointerException

Checked Exceptions
------------------------
using
try-catch
throws

program to find second largest number 
program to find permutations and combinations for given string
401 api error code
revese a string in sunch a way that the  position of the number remains the same
how would you count the number of similor words in a long string 



media plan







Ov23licm9lymPZTfoB7a
e718764198c858b41b6a86682f6e5d450b168df4

Auth code=fff9a5c53c7e58c04433



