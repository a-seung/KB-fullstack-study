package org.example.domain.forecast;

import java.util.List;
import lombok.Data;

@Data
public class ForecastDTO{
	private City city;
	private int cnt;
	private String cod;
	private int message;
	private List<ListItem> list;
}