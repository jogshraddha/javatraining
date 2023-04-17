#include <iostream>

class A
{
    public:
 A()
 {
     std::cout<<"Inside A constructor\n";
 }
 ~A()
 {
     std::cout<<"Inside A distructor\n";
 }
};

class B : public A
{
    public:
 B()
 {
     std::cout<<"Inside B constructor\n";
 }
 ~B()
 {
     std::cout<<"Inside B distructor\n";
 }
};

class C : public A
{
    public:
 C()
 {
     std::cout<<"Inside C constructor\n";
 }
 ~C()
 {
     std::cout<<"Inside C distructor\n";
 }
};

class D : public B
{
    public:
 D()
 {
     std::cout<<"Inside D constructor\n";
 }
 ~D()
 {
     std::cout<<"Inside D distructor\n";
 }
};

class E : public B
{
    public:
 E()
 {
     std::cout<<"Inside E constructor\n";
 }
 ~E()
 {
     std::cout<<"Inside E distructor\n";
 }
};  


class F : public C
{
    public:
 F()
 {
     std::cout<<"Inside F constructor\n";
 }
 ~F()
 {
     std::cout<<"Inside F distructor\n";
 }
};  


class G : public C
{
    public:
 G()
 {
     std::cout<<"Inside G constructor\n";
 }
 ~G()
 {
     std::cout<<"Inside G distructor\n";
 }
};  

class H : public D,public E
{
    public:
 H()
 {
     std::cout<<"Inside H constructor\n";
 }
 ~H()
 {
     std::cout<<"Inside H distructor\n";
 }
};  

class I : public F,public G
{
    public:
 I()
 {
     std::cout<<"Inside I constructor\n";
 }
 ~I()
 {
     std::cout<<"Inside I distructor\n";
 }
};  

class J : public H,public I
{
    public:
 J()
 {
     std::cout<<"Inside J constructor\n";
 }
 ~J()
 {
     std::cout<<"Inside J distructor\n";
 }
};  


int main() {
    // Write C++ code here
    //std::cout << "Hello world!";
 J j;
    //return 0;
}