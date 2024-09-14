package Theory;

public class FTP {
	
	public static boolean transferDTCFile(String dtcFileName) {
		System.out.println("DTC--->trying to upload file on DTC server...");
		boolean fileTransfer = false;
		String host = PropertyHandler.getInstance().getValue("dtc_host");
		int port = Integer.parseInt(PropertyHandler.getInstance().getValue("dtc_port"));
		String username = PropertyHandler.getInstance().getValue("dtc_username");
		String password = PropertyHandler.getInstance().getValue("dtc_password");
		String localFolderPath = PropertyHandler.getInstance().getValue("dtcReportFilePath") + dtcFileName;
		String remoteFolderPath = PropertyHandler.getInstance().getValue("dtc_remoteFolderPath") + dtcFileName;
		FTPSClient ftpsClient = new FTPSClient("TLS", true);
		ftpsClient.setTrustManager(TrustManagerUtils.getAcceptAllTrustManager());
		try {
//			ftpsClient.addProtocolCommandListener(new PrintCommandListener(new PrintWriter(System.out, true)));
			ftpsClient.connect(host, port);
			if (ftpsClient.login(username, password)) {
				ftpsClient.setFileType(FTP.BINARY_FILE_TYPE);
				ftpsClient.execPROT("P");
				ftpsClient.enterLocalPassiveMode();
				fileTransfer = ftpsClient.storeFile(remoteFolderPath, new FileInputStream(localFolderPath));
				logger.info("DTC--->fileTransfer====>" + fileTransfer);
				int reply = ftpsClient.getReplyCode();
				logger.info("DTC--->server reply code====>" + reply);
				ftpsClient.logout();
				ftpsClient.disconnect();
				logger.info("DTC--->File uploaded successfully!");
			} else {
				logger.info("DTC--->Login failed.");
			}
		} catch (IOException exception) {
			logger.info("DTC--->Login failed--c");
			//logger.error(exception + Arrays.asList(exception.getStackTrace()).stream().map(Objects::toString).collect(Collectors.joining("\n")));
		}
		return fileTransfer;
	}

}
