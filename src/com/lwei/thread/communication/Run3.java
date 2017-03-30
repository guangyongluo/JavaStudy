package com.lwei.thread.communication;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class Run3 {

	public static void main(String[] args) {

		try {
			WriteData2 writeData = new WriteData2();
			ReadData2 readData = new ReadData2();

			PipedReader inputStream = new PipedReader();
			PipedWriter outputStream = new PipedWriter();

			// inputStream.connect(outputStream);
			outputStream.connect(inputStream);

			ThreadRead2 threadRead = new ThreadRead2(readData, inputStream);
			threadRead.start();

			Thread.sleep(2000);

			ThreadWrite2 threadWrite = new ThreadWrite2(writeData, outputStream);
			threadWrite.start();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
