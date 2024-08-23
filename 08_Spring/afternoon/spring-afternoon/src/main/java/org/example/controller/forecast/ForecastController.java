package org.example.controller.forecast;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.domain.forecast.ForecastDTO;
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
@RequestMapping("/weather/forecast")
public class ForecastController {
    @Value("${forecast.url}")
    private String URL;
    @Value("${weather.api_key}")
    private String API_KEY;


    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/{cityname}")
    public ResponseEntity<ForecastDTO> getForecast(@PathVariable("cityname") String city) {

        String url = UriComponentsBuilder.fromHttpUrl(URL)
                .queryParam("q", city)
                .queryParam("units", "metric")
                .queryParam("APPID", API_KEY)
                .queryParam("lang", "kr")
                .toUriString();

        log.info("Forecast API 호출 URL: " + url);

        ForecastDTO forecast = restTemplate.getForObject(url, ForecastDTO.class);

        log.info("5일간 예보 불러오기 성공!");
        return ResponseEntity.ok(forecast);
    }
}
