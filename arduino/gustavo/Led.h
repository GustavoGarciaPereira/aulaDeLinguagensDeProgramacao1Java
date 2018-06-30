#ifndef Led_h
#define Led_h

class Led{
	public:
		Led(int pino);
		void ligar();
		void desligar();
		void piscar(int tempo);
	private:
		int _pino;
};
#endif