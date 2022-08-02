#include <iostream>
#include <thread>
#include "logger.hpp"
using namespace std;

void user1(){
    Logger *logger1 = Logger::getLogger();
    logger1->Log("This msg is from user1");
}

void user2(){
    Logger *logger2 = Logger::getLogger();
    logger2->Log("This msg is from user2");
}

int main(){
    thread t1(user1);
    thread t2(user2);
    t1.join();
    t2.join();
    return 0;
}

//command to execute for thread safe in Linux --> g++ -o singletonDP *.cpp -pthread

//without thread --> g++ -o singletonDP *.cpp 