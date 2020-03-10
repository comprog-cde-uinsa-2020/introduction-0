#include <stdio.h>
#include <time.h>

void deepoch() {
    time_t   now;
    struct tm ts;
    char buf[80];

    time(&now);

    ts = *localtime(&now);
    strftime(buf, sizeof(buf), "default epoch: %a %Y-%m-%d %H:%M:%S %Z", &ts);
    printf("%s\n", buf);
}

void cuepoch() {
    time_t rawtime = 1262304000;
    struct tm ts;
    char buf[80];

    ts = *localtime(&rawtime);
    strftime(buf, sizeof(buf), "custom epoch: %a %Y-%m-%d %H:%M:%S %Z", &ts);
    printf("%s\n", buf);
}

void cuhuepoch() {
    struct tm t;
    time_t t_of_day;

    t.tm_year = 2019-1900;
    t.tm_mon = 7;
    t.tm_mday = 8;
    t.tm_hour = 16;
    t.tm_min = 11;
    t.tm_sec = 42;
    t.tm_isdst = -1;
    t_of_day = mktime(&t);
    
    printf("seconds since the Epoch: %d\n", (long) t_of_day);
}

time_t convert_epoch(char rawtime) {
    time_t c;
    c = strtoul(rawtime, NULL, 0 );
    return c;
}

// char* convert_date(time_t rawtime) {
//     struct tm ts;
//     char buff[80];

//     ts = *localtime(&rawtime);

//     char *str = malloc(3);
//     str = &ts;
//     return str;
// }
int main(void) {

    deepoch();
    cuepoch();
    cuhuepoch();

    printf("epoch: %a %Y-%m-%d %H:%M:%S %Z", &convert_epoch("1360440555"));

    return 0;
}