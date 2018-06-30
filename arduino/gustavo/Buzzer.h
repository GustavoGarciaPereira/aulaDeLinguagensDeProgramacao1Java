#ifndef Buzzer_h
#define Buzzer_h

class Buzzer{
	public:
		Buzzer(unsigned char pino);
		void beep(int frequencia, long timeInMill);
	private:
		unsigned char _pino;
};
#endif