package day5task;

interface myinterdemo{
void test();
}

interface myinterdemo1{
void test1();
}

interface interchild extends myinterdemo,myinterdemo1{
void abc();
}

public class InterDemo2 implements interchild{


public static void main(String[] args) {
}

@Override
public void test() {
// TODO Auto-generated method stub

}

@Override
public void test1() {
// TODO Auto-generated method stub

}

@Override
public void abc() {
// TODO Auto-generated method stub

}
}