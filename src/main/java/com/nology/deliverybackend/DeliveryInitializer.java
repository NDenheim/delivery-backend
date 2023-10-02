//package com.nology.deliverybackend;
//
//import org.apache.tomcat.util.json.JSONParser;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.core.io.Resource;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//import java.io.FileReader;
//import java.time.LocalDate;
//
//@Component
//public class DeliveryInitializer {
//    private final DeliveryRepository deliveryRepository;
//
//    @Value("classpath:greetings.json")
//    private Resource resourceFile;
//
//    @Autowired // We don't have to worry about creating greetingRepository -> Spring does that for us
//    public DeliveryInitializer(DeliveryRepository greetingsRepository) {
//        this.deliveryRepository = greetingsRepository;
//    }
//
//    @PostConstruct
//    public void init() {
//        JSONParser jsonParser = new JSONParser();
//        try (FileReader reader = new FileReader(resourceFile.getFile())) {
//            Object obj = jsonParser.parse(reader);
//
//            JSONArray jsonArray = (JSONArray) obj;
//
//            for (Object greeting : jsonArray) {
//                JSONObject greetingJSON = (JSONObject) greeting;
//
//                long id = (long) greetingJSON.get("id");
//                String createdBy = (String) greetingJSON.get("created_by");
//                String greetingStr = (String) greetingJSON.get("greeting");
//                String originCountry = (String) greetingJSON.get("origin_country");
//                String nationality = (String) greetingJSON.get("nationality");
//                LocalDate dateCreated = LocalDate.parse((String) greetingJSON.get("date_created"));
//
//                // HOW CAN WE USE THIS DATA?
//                // Pass in all of the above info as parameters for addGreeting method
//                greetingsRepository.addGreeting(new Greeting(id, createdBy, greetingStr, originCountry, nationality, dateCreated));
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}