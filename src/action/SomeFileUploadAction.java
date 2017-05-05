package action;

import java.io.*;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SomeFileUploadAction extends ActionSupport {
	//设置上传文件的属性
	private File uploadFile[];
	private String uploadFileContentType[];
	private String uploadFileFileName[];
	private String savePath;
	//get and set
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		File[] files = getUploadFile();
		for(int i=0;i<files.length;i++)
		{
			InputStream is=new FileInputStream(files[i]);
			//设置文件上传目录
			String uploadPath = ServletActionContext.getServletContext().getRealPath(getSavePath());
			File toFile = new File(uploadPath,this.getUploadFileFileName()[i]);
			OutputStream os = new FileOutputStream(toFile);
			byte[] buffer = new byte[1024];
			int length = 0;
			while((length=is.read(buffer))>0){
				os.write(buffer, 0, length);
			}
			is.close();
			os.close();
		}
		return SUCCESS;
	}

	public File[] getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(File[] uploadFile) {
		this.uploadFile = uploadFile;
	}

	public String[] getUploadFileContentType() {
		return uploadFileContentType;
	}

	public void setUploadFileContentType(String[] uploadFileContentType) {
		this.uploadFileContentType = uploadFileContentType;
	}

	public String[] getUploadFileFileName() {
		return uploadFileFileName;
	}

	public void setUploadFileFileName(String[] uploadFileFileName) {
		this.uploadFileFileName = uploadFileFileName;
	}

	public String getSavePath() {
		return savePath;
	}

	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}

	
}
