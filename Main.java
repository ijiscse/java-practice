abstract class Animal{
abstract void eat();
abstract void speak();
}
class Cat extends Animal{
void eat(){
System.out.println("Cat eats mouse");
}
void speak(){
System.out.println("Cat mouse");
}}
class Dog extends Animal{
void eat(){
System.out.println("Dog eats meat");
}
void speak(){
System.out.println("Dog baarks");
}}
class Main{
public static void main(String[]args){
Animal c=new Cat();
Animal d=new Dog();
c.eat();
c.speak();
d.eat();
d.speak();
}}