package net.ethanpark.flight.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.ethanpark.flight.contract.DetailRequestType;
import net.ethanpark.flight.contract.SearchRequestType;
import net.ethanpark.flight.contract.SearchResponseType;

/**
 * Created by baiyp on 2016/8/25.
 */
@RestController
@RequestMapping("/intlflightsearch")
public class FlightController {

   @RequestMapping("/Search")
   public SearchResponseType search(@RequestBody SearchRequestType request) {
      return new SearchResponseType();
   }

   @RequestMapping("/DetailSearch")
   public SearchResponseType detailSearch(
         @RequestBody DetailRequestType request) {
      return new SearchResponseType();
   }
}
