#ifndef logger_h
#define logger_h
#include <mutex>
#include <string.h>
using namespace std;

class Logger
{
    static int ctr;
    static Logger *loggerInstance;
    static mutex mtx;
    Logger();

    public:
    static Logger* getLogger();
    void Log(string msg);
};

#endif
