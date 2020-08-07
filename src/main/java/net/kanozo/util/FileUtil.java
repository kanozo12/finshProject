package net.kanozo.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.UUID;

import javax.imageio.ImageIO;

import org.imgscalr.Scalr;
import org.springframework.util.FileCopyUtils;

public class FileUtil {
	private static String makeThumbnail(String uploadPath, String filename) throws Exception {
		// 원본 파일을 읽어오고
		BufferedImage sourceImage = ImageIO.read(new File(uploadPath, filename));

		// 이미지 비율 유지하고 높이 128에 맞추어 리사이징
		BufferedImage destImage = Scalr.resize(sourceImage, Scalr.Method.AUTOMATIC, Scalr.Mode.FIT_TO_HEIGHT, 128);
		String thumbnailName = uploadPath + File.separator + "s_" + filename;
		File newFile = new File(thumbnailName);
		String extension = filename.substring(filename.lastIndexOf(".") + 1); // 확장자
		ImageIO.write(destImage, extension.toUpperCase(), newFile); // 새로운 파일에 해당 확장자로 다시 써줌

		// 경로 구분자를 /로 치환하여 윈도우에서도 잘 동작하도록 함
		return "s_" + filename;
	}

	public static String uploadFile(String uploadPath, String originalName, byte[] fileData) throws Exception {
		UUID uid = UUID.randomUUID(); // 파일 고유 이름을 만들기 위해
		String saveName = uid.toString() + "_" + originalName;

		File upDir = new File(uploadPath);
		if (!upDir.exists()) {
			upDir.mkdir(); // 업로드 경로가 없다면 생성함
		}

		File target = new File(uploadPath, saveName); // 업로드 경로에 랜덤으로 생성한 파일 파일명으로 저장

		FileCopyUtils.copy(fileData, target); // 파일 카피 유틸리티로 넘어온 데이터를 target으로 복사.

		String extention = originalName.substring(originalName.lastIndexOf(".") + 1); // 확장자 알아내고

		String uploadFileName = null;
		if (MediaUtil.getMediaType(extention) != null) { // 만약 이미지 파일이 업로드 된거라면
			uploadFileName = makeThumbnail(uploadPath, saveName);
		} else {
			uploadFileName = saveName;
		}

		return uploadFileName; // 저장된 파일명을 보내줌.(이미지면)
	}
}