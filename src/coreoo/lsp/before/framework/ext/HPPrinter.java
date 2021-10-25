package coreoo.lsp.before.framework.ext;

import coreoo.lsp.before.framework.Printer;

public class HPPrinter extends Printer {

	@Override
	public void on() {
		int inputVolts = 251;

		if (inputVolts > 250 || inputVolts < 150) {
			return;
		}
	}

	@Override
	public void print(String filePath) {

		// print it in hp specific way

	}

}
