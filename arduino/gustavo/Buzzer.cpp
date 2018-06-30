#include "Arduino.h"
#include "Buzzer.h"

Buzzer::Buzzer(int pino){
    _pino = pino;
}
Buzzer::play(){
    tone(_pino,1500);
    delay(1000);
    noTone(_pino);
    delay(1000);
}