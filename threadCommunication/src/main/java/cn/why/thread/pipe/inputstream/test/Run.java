package cn.why.thread.pipe.inputstream.test;


import cn.why.thread.pipe.inputstream.extthread.ThreadRead;
import cn.why.thread.pipe.inputstream.extthread.ThreadWrite;
import cn.why.thread.pipe.inputstream.service.ReadData;
import cn.why.thread.pipe.inputstream.service.WriteData;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Run {

	public static void main(String[] args) {

		try {
			WriteData writeData = new WriteData();
			ReadData readData = new ReadData();

			PipedInputStream inputStream = new PipedInputStream();
			PipedOutputStream outputStream = new PipedOutputStream();

			// inputStream.connect(outputStream);
			outputStream.connect(inputStream);


			ThreadWrite threadWrite = new ThreadWrite(writeData, outputStream);
			threadWrite.start();
			Thread.sleep(2000);
			ThreadRead threadRead = new ThreadRead(readData, inputStream);
			threadRead.start();


		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
