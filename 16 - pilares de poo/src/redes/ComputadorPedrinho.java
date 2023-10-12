/*
 * Simulação do uso da classe MSNMessenger
 */

import apps.MSNMessenger;
import apps.Telegram;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		//abrindo MSN Messenger

        MSNMessenger tlg = new MSNMessenger();
        tlg.enviarMensagem();
        tlg.receberMensagem();
	}
}