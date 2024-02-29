package it.letscode.Scrape;

import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.bidi.browsingcontext.BrowsingContext;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LoggingPreferences;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
public class ScrapperService {

    public void run() {

        ChromeOptions chromeOptions = new ChromeOptions();

        chromeOptions.setBrowserVersion("113");

        ChromeDriver driver = new ChromeDriver(chromeOptions);

        DevTools devTools = driver.getDevTools();
        devTools.createSession();

//        BrowsingContext browsingContext = new BrowsingContext(driver, WindowType.WINDOW);
//
//        System.out.println(browsingContext.getId());


        // Konfiguracja preferencji logowania
//        LoggingPreferences logPrefs = new LoggingPreferences();
//        logPrefs.enable("performance", Level.ALL);
//
//        ChromeOptions options = new ChromeOptions();
//        options.setCapability("goog:loggingPrefs", logPrefs);
//
//        // Utworzenie instancji ChromeDriver z opcjami
//        ChromeDriver driver = new ChromeDriver(options);

        // Otwarcie strony
        driver.get("https://www.laczynaspilka.pl/rozgrywki?season=2023%2F2024&leagueGroup=63e0b91e-f2cc-4149-813b-ea9a77919385&leagueId=20505afb-3cb6-4e59-9bb1-ed56e8201bb8&subLeague=733f5b9c-9ade-4011-84c4-b08d35d170b3&enumType=ZpnAndLeagueAndPlay&group=da03855e-6763-4671-b8ed-9b4aa7b10f0f&voivodeship=cd81a30b-c8a3-44e0-abd6-8b5772d3137c&isAdvanceMode=false&genderType=Male");

        // Pobranie logów wydajności
//        LogEntries logEntries = driver.manage().logs().get("performance");
//
//        // Przetwarzanie i filtrowanie logów
//        List<?> networkEvents = logEntries.getAll().stream()
//                .filter(entry -> entry.getMessage())
//                .map(data -> data.getMessage())
//                .collect(Collectors.toList());
//
//        // Wyświetlenie przetworzonych logów
//        networkEvents.forEach(entry -> {
//            System.out.println(entry);
//        });


//        ChromeDriver driver = new ChromeDriver();
//
//


////        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
////        devTools.addListener(Network.requestWillBeSent(), requestWillBeSent -> {
////            Request request = requestWillBeSent.getRequest();
////            System.out.println(request.getUrl());
////        });
//
//
//        driver.get("https://www.laczynaspilka.pl/rozgrywki?season=2023%2F2024&leagueGroup=63e0b91e-f2cc-4149-813b-ea9a77919385&leagueId=20505afb-3cb6-4e59-9bb1-ed56e8201bb8&subLeague=733f5b9c-9ade-4011-84c4-b08d35d170b3&enumType=ZpnAndLeagueAndPlay&group=da03855e-6763-4671-b8ed-9b4aa7b10f0f&voivodeship=cd81a30b-c8a3-44e0-abd6-8b5772d3137c&isAdvanceMode=false&genderType=Male");





        //driver.quit();
    }
}
