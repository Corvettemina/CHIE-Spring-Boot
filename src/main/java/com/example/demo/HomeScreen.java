package com.example.demo;

import java.util.ArrayList;
import java.util.Calendar;

import api.CrDateTime;
import api.CurrentSeasonInterpreter;
import api.OccasionEvaluatorTest;
import api.SesasonEvaluatorTest;

public class HomeScreen {

    private final String copticDate;
    private final String Season;

    public HomeScreen() {
        Calendar cal = Calendar.getInstance();
        CrDateTime cr = new CrDateTime(cal);
        OccasionEvaluatorTest oet = new OccasionEvaluatorTest(cr);
        SesasonEvaluatorTest set = new SesasonEvaluatorTest(oet);
        CurrentSeasonInterpreter current = new CurrentSeasonInterpreter(set, oet);

        this.Season = current.Season;
        this.copticDate = cr.asCopticDate().toCopticString();

    }

    public String getSeason() {
        return Season;
    }

    public String getCopticDate() {
        return copticDate;
    }

}
