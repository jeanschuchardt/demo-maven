package com.demo.maven.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import com.demo.maven.*;
import com.demo.maven.model.Stock;
import com.demo.maven.service.StockService;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class StockAPITest {
  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private StockService stockService;

  @Test
  public void findAll() throws Exception {
    // given
    Stock stock = new Stock(1L, "Stock 1", new Integer("1"));
    List<Stock> stocks = Arrays.asList(stock);
    given(stockService.findAll()).willReturn(stocks);

    // when + then
    this.mockMvc.perform(get("/api/v1/stocks/findall")).andExpect(status().isOk())
        .andExpect(content().json("[{'id': 1,'name': 'Stock 1';'price': 1}]"));
  }
}
