package inquerro.web;

import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;
import inquerro.model.Catogories;
import inquerro.model.QuestionsStats;
import inquerro.service.CatagoriesService;
import inquerro.service.FirebaseService;
import inquerro.service.QuestionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
public class MainController {

    QuestionService questionService;
    CatagoriesService catagoriesService;
    Logger logger = LoggerFactory.getLogger(MainController.class);
    
  
    


    public MainController(QuestionService questionService, CatagoriesService catagoriesService) {
        this.questionService = questionService;
        this.catagoriesService = catagoriesService;
    }

    @GetMapping("/mainPage")
    public String mainPage(){
        return "index";
    }

    @GetMapping("/")
    public String root(Model model) {

        List<QuestionsStats> questionsStatsList = catagoriesService.getQuestionStats();
        logger.info("Questions stats  :" + questionsStatsList);
        model.addAttribute("questionsStatsList", questionsStatsList);
        return "topics";
    }
    
    @GetMapping("/publicPageTopics")
    public String publicPage(Model model) {

        List<QuestionsStats> questionsStatsList = catagoriesService.getQuestionStats();
        logger.info("Questions stats  :" + questionsStatsList);
        model.addAttribute("questionsStatsList", questionsStatsList);
        return "topics";
    }

    @GetMapping("/publicPageQuestion")
    public String publicPageQuestions(Model model) {

        return "publicPage1";
    }

    @GetMapping("/login")
    public String login(Model model, HttpServletRequest request) {
    	logger.info("Into login getMapping");
        Authentication existingAuth = SecurityContextHolder.getContext().getAuthentication();
        if (!existingAuth.isAuthenticated())
            return "login";
        else
            System.out.println(request.getRequestURI());
        return "login";

    }

    @GetMapping("/user")
    public String userIndex() {
        return "user/index";
    }
}
