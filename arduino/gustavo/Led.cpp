#include "Arduino.h"
#include "Led.h"

Led::Led(int pino){
    _pino = pino;
    pinMode(_pino,OUTPUT);
}
void Led::ligar(){
    digitalWrite(_pino,HIGH);
}
void Led::desligar(){
    digitalWrite(_pino,LOW);
}
void Led::piscar(int tempo){
    ligar();
    delay(tempo);
    desligar();
    delay(tempo);
}
