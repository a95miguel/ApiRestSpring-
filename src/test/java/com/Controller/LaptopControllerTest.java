package com.Controller;

import com.Etities.Lapto;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class LaptopControllerTest {
    private TestRestTemplate testRestTemplate;
    @Autowired
    private RestTemplateBuilder restTemplateBuilder;
    @LocalServerPort
    private int port;
    /*
    @BeforeEach
    void setup(){
        restTemplateBuilder = restTemplateBuilder.rootUri("http://localhost:"+port);
        testRestTemplate = new TestRestTemplate(restTemplateBuilder);
    }
    
    @Test
    public void testSaludo() {
        ResponseEntity<String> response = testRestTemplate.getForEntity("/saludoPostman",String.class);
        assertEquals(HttpStatus.OK,response.getStatusCode());
    }
    
    @Test
    public void testFindAll() {
        ResponseEntity<Lapto[]> response = testRestTemplate.getForEntity("/api/laptop", Lapto[].class);
        assertEquals(HttpStatus.OK,response.getStatusCode());       
    }

    @Test
    public void testFindOneById() {
        ResponseEntity<String> response = testRestTemplate.getForEntity("/api/laptop/1",String.class);
        assertEquals(HttpStatus.NOT_FOUND,response.getStatusCode());
    }

    @Test
    public void testCreate() {
        HttpHeaders header = new HttpHeaders();
        header.setContentType(MediaType.APPLICATION_JSON);
        header.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        String json = """
                      {                      
                      "nombre":" Medel 16",
                      "precio":500.0,
                      "memoriaRam":16,
                      "procesador":"AMD Ryzen 5 5600H ",
                      "discoDuro":512
                      ,"pantalla":16
                      }
                      """;
        HttpEntity<String> request = new HttpEntity<>(json,header);
        ResponseEntity<Lapto> reponse = testRestTemplate.exchange("/api/laptop", HttpMethod.POST,request,Lapto.class);
        assertEquals(HttpStatus.OK,reponse.getStatusCode());        
    }
    
    @Test
    public void testDeleteAll() {
        ResponseEntity<Lapto> reponse = testRestTemplate.exchange("/api/laptop", HttpMethod.DELETE,HttpEntity.EMPTY,Lapto.class);
        assertEquals(HttpStatus.NO_CONTENT,reponse.getStatusCode());
    }*/
    
}
