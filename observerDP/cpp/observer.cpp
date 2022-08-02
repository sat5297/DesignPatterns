#include <iostream>
using namespace std;
#include <list>

class ISubscriber{
    public:
        virtual void notify(string msg) = 0;
};

class User : public ISubscriber{
    private:
        int userID;
    
    public:
        User(int userID){
            this->userID = userID;
        }
        void notify(string msg){
            cout << "User " << this->userID << " UserID " << msg << endl;
        }
};

class Group {
    private:
        list < ISubscriber *> Users;
    public:
        void subscribe(ISubscriber *user){
            Users.push_back(user);
        }

        void unsubscribe(ISubscriber *user){
            Users.remove(user);
        }

        void notify(string msg){
            for(auto user : Users){
                user->notify(msg);
            }
        }
};

int main(){
    Group *group = new Group();
    User *user1 = new User(1);
    User *user2 = new User(2);
    User *user3 = new User(3);

    group->subscribe(user1);
    group->subscribe(user2);
    group->subscribe(user3);

    group->notify("Subscription Added\n");
    group->unsubscribe(user2);
    group->notify("Subscription updated\n");
    return 0;
}


//Steps to execute:

// g++ -c observer.cpp
// g++ -o client *.o
// ./client