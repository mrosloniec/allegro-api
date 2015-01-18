package com.nuta.allegro;

import AllegroWebApi.AllegroWebApiService;
import AllegroWebApi.AllegroWebApiServiceLocator;
import com.nuta.allegro.service.ImageService;
import com.nuta.allegro.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.rpc.ServiceException;
import javax.xml.rpc.holders.LongHolder;
import javax.xml.rpc.holders.StringHolder;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class MainController {

	@Autowired
	private TemplateService templateService;

	@Autowired
	private ImageService imageService;

	@RequestMapping(method = RequestMethod.GET)
	public String main() {
		AllegroWebApiService allegro = new AllegroWebApiServiceLocator();
		String login = "hidden";
		String password = "hidden";
		int countryCode = 1;
		String webapiKey = "hidden";
		long localVersion = 1;
		StringHolder sessionHandlePart = new StringHolder();
		LongHolder userId = new LongHolder();
		LongHolder serverTime = new LongHolder();
		try {
			allegro.getAllegroWebApiPort().doQueryAllSysStatus(countryCode, webapiKey);
//			allegro.getAllegroWebApiPort().doLogin(login, password, countryCode, webapiKey, localVersion, sessionHandlePart, userId, serverTime);
			long value = userId.value;
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		}

		return "main";
	}

	@RequestMapping(value = "/generateAuction", method = RequestMethod.GET)
	public ModelAndView redirectToMain() {
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/generateAuction", method = RequestMethod.POST)
	public String uploadFile(FormParams formParams, ModelMap modelMap) throws IOException {

		List<String> imagesLinks = new ArrayList<String>();
		getImagesLinks(formParams.getFile1(), formParams.getFile2(), formParams.getFile3(), formParams.getFile4(), formParams.getFile5(), imagesLinks);
		String template = templateService.initTemplate(imagesLinks, formParams);

		modelMap.put("generatedHtml", template);

		return "generatedContent";
	}

	private void getImagesLinks(MultipartFile uploadFile1, MultipartFile uploadFile2, MultipartFile uploadFile3, MultipartFile uploadFile4, MultipartFile uploadFile5, List<String> imagesLinks) throws IOException {
		if (uploadFile1.getSize() > 0) {
			imagesLinks.add(imageService.getImageLink(uploadFile1.getOriginalFilename(), uploadFile1.getBytes()));
		}
		if (uploadFile2.getSize() > 0) {
			imagesLinks.add(imageService.getImageLink(uploadFile2.getOriginalFilename(), uploadFile2.getBytes()));
		}
		if (uploadFile3.getSize() > 0) {
			imagesLinks.add(imageService.getImageLink(uploadFile3.getOriginalFilename(), uploadFile3.getBytes()));
		}
		if (uploadFile4.getSize() > 0) {
			imagesLinks.add(imageService.getImageLink(uploadFile4.getOriginalFilename(), uploadFile4.getBytes()));
		}
		if (uploadFile5.getSize() > 0) {
			imagesLinks.add(imageService.getImageLink(uploadFile5.getOriginalFilename(), uploadFile5.getBytes()));
		}
	}

}
