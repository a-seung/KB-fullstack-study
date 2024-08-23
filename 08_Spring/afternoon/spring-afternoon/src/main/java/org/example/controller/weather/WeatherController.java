package org.example.controller.weather;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.domain.weather.WeatherDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@Slf4j
@RequiredArgsConstructor
@Transactional
@CrossOrigin(origins = "*")
@RequestMapping("/weather")
public class WeatherController {
    @Value("${weather.url}")
    private String URL;
    @Value("${weather.api_key}")
    private String API_KEY;


    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/{cityname}")
    public ResponseEntity<WeatherDTO> getWeather(@PathVariable("cityname") String city) {

        String url = UriComponentsBuilder.fromHttpUrl(URL)
                .queryParam("q", city)
                .queryParam("units", "metric")
                .queryParam("APPID", API_KEY)
                .queryParam("lang", "kr")
                .toUriString();

        log.info("Weather API 호출 URL: " + url);

        WeatherDTO weather = restTemplate.getForObject(url, WeatherDTO.class);

        log.info("오늘의 날씨: " + weather);
        return ResponseEntity.ok(weather);
    }
}
