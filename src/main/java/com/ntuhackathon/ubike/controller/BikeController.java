package com.ntuhackathon.ubike.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.ntuhackathon.ubike.model.BikeEntity;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.apache.commons.codec.binary.Base64;
import com.ntuhackathon.ubike.model.api.TextResponse;
import com.ntuhackathon.ubike.model.error.ErrorResult;
import com.ntuhackathon.ubike.repository.BikeRepository;
import com.ntuhackathon.ubike.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Date;
import java.util.List;


@Controller
public class BikeController {
	
	@Autowired
	BikeService bikeService;

	@Autowired
	BikeRepository bikeRepository;

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/getAllBikes", method = RequestMethod.GET,produces = "application/json")
	@ResponseBody
	public String getCountries(Model model,@RequestParam(value = "page", required = false)Integer page,@RequestParam(value = "size", required = false)Integer size) {

		//PageRequest pageRequest=new PageRequest(page,size);
		List<BikeEntity> listOfBikes = bikeService.getAllBikes();
		ObjectMapper mapper = new ObjectMapper();
		model.addAttribute("bikeEntity", new BikeEntity());
		model.addAttribute("listOfBikes", listOfBikes);
		for(BikeEntity bikeEntity:listOfBikes){
			System.out.println(bikeEntity.getBikeName());
		}
		try {
			String json=mapper.writeValueAsString(listOfBikes);
			return json;
		} catch (Exception e) {
			e.printStackTrace();
			ErrorResult errorResult=new ErrorResult();
			errorResult.setErrorCode("400");
			errorResult.setErrorMsg(e.getMessage());
			return "countryDetails";
		}

	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/getBike/{id}", method = RequestMethod.GET,produces = "application/json")
	@ResponseBody
	public String getBikeById(@PathVariable int id) {
		BikeEntity bikeEntity=bikeService.getBike(id);
		ObjectMapper mapper = new ObjectMapper();
		try {
			String json=mapper.writeValueAsString(bikeEntity);
			return json;
		} catch (Exception e) {
			e.printStackTrace();
			ErrorResult errorResult=new ErrorResult();
			errorResult.setErrorCode("400");
			errorResult.setErrorMsg(e.getMessage());
			return "{\"status\":\"error\"}";
		}
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/avgBike", method = RequestMethod.GET,produces = "application/json")
	@ResponseBody
	public String getAvgScoreByName(@RequestParam(value = "bikeName",required = false) String bikeName) {
		Double bikeScore=bikeRepository.avgScore(bikeName+"Ubike");
		ObjectMapper mapper = new ObjectMapper();
		try {
			JsonNode childNode1 = mapper.createObjectNode();
			((ObjectNode) childNode1).put("scoreBike", String.valueOf(bikeScore));
			String json=mapper.writeValueAsString(childNode1);
			return json;
		} catch (Exception e) {
			e.printStackTrace();
			ErrorResult errorResult=new ErrorResult();
			errorResult.setErrorCode("400");
			errorResult.setErrorMsg(e.getMessage());
			return "{\"status\":\"error\"}";
		}
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/addBike", method = RequestMethod.POST,produces = "application/json")
	@ResponseBody
	public String addBike(@RequestParam(value = "file", required = false)MultipartFile file) {
		BikeEntity bikeEntity=new BikeEntity();
		try {
			String base64Png= Base64.encodeBase64String(file.getBytes());
			// System.out.println(base64Png);

			OkHttpClient client = new OkHttpClient();

			MediaType mediaType = MediaType.parse("application/json");
			com.squareup.okhttp.RequestBody body = com.squareup.okhttp.RequestBody.create(mediaType, "{\n  " +
					"\"requests\": [\n    " +
					"{\n      \"image\": {\n        \"content\": \""+base64Png+"\"     },\n     " +
					" \"features\": [\n        {\n         " +
					" \"type\": \"DOCUMENT_TEXT_DETECTION\"\n        " +
					"}\n     " +
					" ]\n   " +
					" }\n  " +
					"]\n}");
			Request request = new Request.Builder()
					.url("https://vision.googleapis.com/v1/images:annotate?key=AIzaSyCF0oh0dPvdTbgCs-Nrlc0J8cKqCC72cA4")
					.post(body)
					.addHeader("content-type", "application/json")
					.addHeader("cache-control", "no-cache")
					.addHeader("postman-token", "2987f722-ce7e-d33e-1769-db6219e968a6")
					.build();

			Response response = client.newCall(request).execute();
			ObjectMapper mapper = new ObjectMapper();
			TextResponse textResponse= mapper.readValue(response.body().string(), TextResponse.class);
			String bikeName=textResponse.getResponses().get(0).getTextAnnotations().get(0).getDescription();
			System.out.println(bikeName);
			bikeEntity.setBikeName(bikeName.replaceAll("\\n",""));
			bikeEntity.setCreateDate(new Date());
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(bikeEntity==null || bikeEntity.getId()==0)
		{
			bikeService.addBike(bikeEntity);
		}
		else
		{	
			bikeService.updateBike(bikeEntity);
		}
		BikeEntity bikeEntity1=bikeService.getBike(bikeEntity.getId());
		ObjectMapper mapper = new ObjectMapper();
		try {
			String json=mapper.writeValueAsString(bikeEntity1);
			return json;
		} catch (Exception e) {
			e.printStackTrace();
			ErrorResult errorResult=new ErrorResult();
			errorResult.setErrorCode("400");
			errorResult.setErrorMsg(e.getMessage());
			return "{\"status\":\"error\"}";
		}
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/updateBike/{id}", method = RequestMethod.GET,produces = "application/json")
	@ResponseBody
	public String updateBike(@PathVariable("id") Integer id,Model model,
							 @RequestParam(value = "score", required = false)Integer score) {
		BikeEntity bikeEntity1=bikeService.getBike(id);
		ObjectMapper mapper = new ObjectMapper();
		try {
			bikeEntity1.setScoreBike(score);
			bikeService.updateBike(bikeEntity1);
			String json=mapper.writeValueAsString(bikeEntity1);
			return json;
		} catch (Exception e) {
			e.printStackTrace();
			ErrorResult errorResult=new ErrorResult();
			errorResult.setErrorCode("400");
			errorResult.setErrorMsg(e.getMessage());
			return "{\"status\":\"error\"}";
		}
	}

	@RequestMapping(value = "/deleteBike/{id}", method = RequestMethod.GET,produces = "application/json")
	@ResponseBody
	public String deleteBike(@PathVariable("id") int id) {
		bikeService.deleteBike(id);
		 return "{\"status\": \"ok\"}";

	}	
}
