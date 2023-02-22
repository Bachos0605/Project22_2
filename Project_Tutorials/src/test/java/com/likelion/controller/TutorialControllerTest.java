package com.likelion.controller;

import com.likelion.entity.Tutorial;
import com.likelion.service.TutorialService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(TutorialController.class)
class TutorialControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private TutorialService tutorialService;

//    @Test
//    void getAllTutorials() {
//    }
//
//    @Test
//    void getTutorialsById() {
//    }


    @Test
    void createTutorial() throws Exception {
        Tutorial tutorial = new Tutorial(null, "Test case 1", "For test case 1", true);
        Tutorial savedTutorial = new Tutorial(1l, "Test case 1", "For test case 1", true);
        when(tutorialService.saveTutorial(tutorial)).thenReturn(savedTutorial);

        mockMvc.perform(post("/api/tutorials")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"title\":\"Test case 1\",\"description\":\"For test case 1\",\"published\":true}"))
                .andExpect(status().isCreated());
    }
//
//
////    @Test
////    void updateTutorial() {
////    }
////
////    @Test
////    void deleteTutorial() {
////    }
////
////    @Test
////    void deleteAllTutorials() {
////    }
////
////    @Test
////    void findByPublished() {
////    }
////
}