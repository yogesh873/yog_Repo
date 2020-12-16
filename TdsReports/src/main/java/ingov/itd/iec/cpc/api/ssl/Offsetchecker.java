package ingov.itd.iec.cpc.api.ssl;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;

import org.springframework.stereotype.Component;

import com.jcraft.jsch.*;

@Component
public class Offsetchecker {

	
	private JSch jschSSHChannel;
	  private String strUserName;
	  private String strConnectionIP;
	  private int intConnectionPort;
	  private String strPassword;
	  private static Session session;
	  private int intTimeOut;
	private static  ChannelExec channel = null;

public static void runCommand(String usrnm,String pwd,String host,int port,String command) throws Exception
{
	try {
session = new JSch().getSession(usrnm, host,port);
session.setPassword(pwd);
session.setConfig("StrictHostKeyChecking", "no");
session.connect();
channel = (ChannelExec) session.openChannel("exec");
channel.setCommand("./offsetchecker.sh");

ByteArrayOutputStream responseStream = new ByteArrayOutputStream();
channel.setOutputStream(responseStream);

channel.connect();

while (channel.isConnected()) {
    Thread.sleep(10000);
}
File file = new File("offsetoutput");
boolean b = file.createNewFile();
FileWriter fw = new FileWriter(file);
String responseString = new String(responseStream.toByteArray());
fw.write(responseString);
fw.close();
System.out.println(responseString);
} finally {
if (session != null) {
    session.disconnect();
}
if (channel != null) {
    channel.disconnect();
}
}
}

}
